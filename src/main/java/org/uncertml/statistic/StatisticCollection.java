package org.uncertml.statistic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.uncertml.util.Validate;

/**
 * Class representing a collection of statistics. Implements the List and Iterable interfaces.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/StatisticsCollection}
 * 
 * @see java.util.List
 * @see java.util.Iterator
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class StatisticCollection implements IStatistic, Iterable<IStatistic>, List<IStatistic> {

    private List<IStatistic> members;

    /**
     * Constructs an empty statistics collection.
     */
    public StatisticCollection() {
        members = new ArrayList<IStatistic>();
    }

    /**
     * Constructs a statistics collection from a single member.
     * 
     * @param member an <code>IStatistic</code> member.
     */
    public StatisticCollection(IStatistic member) {
        this(new IStatistic[]{member});
    }

    /**
     * Constructs a statistics collection from an array of <code>IStatistic</code>
     * members.
     * 
     * @param members an array of <code>IStatistic</code> members.
     */
    public StatisticCollection(IStatistic[] members) {
        this(Arrays.asList(members));
    }

    /**
     * Constructs a statistics collection from a <code>List</code> of <code>IStatistic</code>
     * members.
     * 
     * @param members a <code>List</code> of <code>IStatistic</code> members.
     */
    public StatisticCollection(List<IStatistic> members) {
        Validate.notNull(members);
        Validate.noNullElements(members);

        this.members = new ArrayList<IStatistic>(members);
    }

    @Override
    public Iterator<IStatistic> iterator() {
        return members.iterator();
    }

    @Override
    public boolean add(IStatistic e) {
        return members.add(e);
    }

    @Override
    public void add(int index, IStatistic element) {
        members.add(index, element);
    }

    @Override
    public boolean addAll(Collection<? extends IStatistic> c) {
        return members.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends IStatistic> c) {
        return members.addAll(index, c);
    }

    @Override
    public void clear() {
        members.clear();
    }

    @Override
    public boolean contains(Object o) {
        return members.contains((IStatistic) o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return members.containsAll(c);
    }

    @Override
    public IStatistic get(int index) {
        return members.get(index);
    }

    @Override
    public int indexOf(Object o) {
        return members.indexOf(o);
    }

    @Override
    public boolean isEmpty() {
        return members.isEmpty();
    }

    @Override
    public int lastIndexOf(Object o) {
        return members.lastIndexOf(o);
    }

    @Override
    public ListIterator<IStatistic> listIterator() {
        return members.listIterator();
    }

    @Override
    public ListIterator<IStatistic> listIterator(int index) {
        return members.listIterator(index);
    }

    @Override
    public boolean remove(Object o) {
        return members.remove((IStatistic) o);
    }

    @Override
    public IStatistic remove(int index) {
        return members.remove(index);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return members.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return members.retainAll(c);
    }

    @Override
    public IStatistic set(int index, IStatistic element) {
        return members.set(index, element);
    }

    @Override
    public int size() {
        return members.size();
    }

    @Override
    public List<IStatistic> subList(int fromIndex, int toIndex) {
        return members.subList(fromIndex, toIndex);
    }

    @Override
    public Object[] toArray() {
        return members.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return members.toArray(a);
    }
    
    /**
     * 
     * @return the list of <code>IStatistic</code> members of this statistics collection.
     */
    public List<IStatistic> getMembers() {
        return members;
    }
}
