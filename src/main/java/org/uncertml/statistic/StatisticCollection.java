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
package org.uncertml.statistic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
public class StatisticCollection extends ArrayList<IStatistic> implements IStatistic {

	private static final long serialVersionUID = 2279873169041081170L;

	/**
     * Constructs an empty statistics collection.
     */
    public StatisticCollection() {
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
    	super(members);
        Validate.notNull(members);
        Validate.noNullElements(members);
    }

    /**
     * 
     * @return the list of <code>IStatistic</code> members of this statistics collection.
     */
    public List<IStatistic> getMembers() {
        return this;
    }
}
