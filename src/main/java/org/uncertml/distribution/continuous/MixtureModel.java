/**
 * Copyright 2014 52°North Initiative for Geospatial Open Source Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.uncertml.distribution.continuous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.uncertml.distribution.IDistribution;
import org.uncertml.distribution.WeightedDistribution;
import org.uncertml.util.Validate;

/**
 * Class representing a mixture model. A mixture model is constructed with a number
 * of <code>WeightedDistribution</code>s. This implements the iterable and list 
 * interfaces.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/MixtureModel}
 * 
 * @see WeightedDistribution
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class MixtureModel implements IContinuousDistribution, Iterable<WeightedDistribution>, List<WeightedDistribution> {

    // precision used to ensure the weights sum to 1.
    private final double EPSILON = 0.00001;
    // a list of <code>WeightedDistribution</code> objects.
    private List<WeightedDistribution> components;

    /**
     * Constructor that takes an array of <code>WeightedDistribution</code> objects.
     * Each component has an underlying <code>IDistribution</code> type and an
     * associated weight. The weights should sum to 1.
     * 
     * @param components an array of <code>WeightedDistribution</code> objects 
     * representing the weighted components of a mixture model.
     */
    public MixtureModel(WeightedDistribution[] components) {
        this(Arrays.asList(components));
    }

    /**
     * Constructor that takes a list of <code>WeightedDistribution</code> objects.
     * Each component has an underlying <code>IDistribution</code> type and an
     * associated weight. The weights should sum to 1.
     * 
     * @param components an array of <code>WeightedDistribution</code> objects 
     * representing the weighted components of a mixture model.
     */
    public MixtureModel(List<WeightedDistribution> components) {
        double sum = 0;
        for (WeightedDistribution w : components) {
            sum += w.getWeight();
        }
        Validate.isTrue((sum == 1.0) ? true : Math.abs(sum - 1.0) < EPSILON, "The sum of the weights must be 1.0. Found: ", sum);
        this.components = new ArrayList<WeightedDistribution>(components);
    }

    /**
     * 
     * @return a list of <code>IDistribution</code> objects that describe the mixture
     * model. These are returned without the attached weight.
     */
    public List<IDistribution> getDistributions() {
        ArrayList<IDistribution> results = new ArrayList<IDistribution>();

        for (WeightedDistribution w : this.components) {
            results.add(w.getDistribution());
        }

        return results;
    }

    /**
     * 
     * @return a list of doubles representing the weights of the constituent 
     * distributions.
     */
    public List<Double> getWeights() {
        ArrayList<Double> results = new ArrayList<Double>();

        for (WeightedDistribution w : this.components) {
            results.add(w.getWeight());
        }

        return results;
    }

    /**
     * 
     * @return a list of <code>WeightedDistribution</code> objects that fully
     * describe the mixture model.
     */
    public List<WeightedDistribution> getComponents() {
        return components;
    }

    @Override
    public Iterator<WeightedDistribution> iterator() {
        return components.iterator();
    }

    @Override
    public boolean add(WeightedDistribution e) {
        return components.add(e);
    }

    @Override
    public void add(int index, WeightedDistribution element) {
        components.add(index, element);
    }

    @Override
    public boolean addAll(Collection<? extends WeightedDistribution> c) {
        return components.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends WeightedDistribution> c) {
        return components.addAll(index, c);
    }

    @Override
    public void clear() {
        components.clear();
    }

    @Override
    public boolean contains(Object o) {
        return components.contains((WeightedDistribution) o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return components.containsAll(c);
    }

    @Override
    public WeightedDistribution get(int index) {
        return components.get(index);
    }

    @Override
    public int indexOf(Object o) {
        return components.indexOf(o);
    }

    @Override
    public boolean isEmpty() {
        return components.isEmpty();
    }

    @Override
    public int lastIndexOf(Object o) {
        return components.lastIndexOf(o);
    }

    @Override
    public ListIterator<WeightedDistribution> listIterator() {
        return components.listIterator();
    }

    @Override
    public ListIterator<WeightedDistribution> listIterator(int index) {
        return components.listIterator(index);
    }

    @Override
    public boolean remove(Object o) {
        return components.remove((WeightedDistribution) o);
    }

    @Override
    public WeightedDistribution remove(int index) {
        return components.remove(index);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return components.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return components.retainAll(c);
    }

    @Override
    public WeightedDistribution set(int index, WeightedDistribution element) {
        return components.set(index, element);
    }

    @Override
    public int size() {
        return components.size();
    }

    @Override
    public List<WeightedDistribution> subList(int fromIndex, int toIndex) {
        return components.subList(fromIndex, toIndex);
    }

    @Override
    public Object[] toArray() {
        return components.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return components.toArray(a);
    }

}
