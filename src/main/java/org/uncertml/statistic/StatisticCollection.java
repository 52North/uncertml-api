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
