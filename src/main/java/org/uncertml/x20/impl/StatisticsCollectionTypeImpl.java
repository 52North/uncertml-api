/*
 * XML Type:  StatisticsCollectionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.StatisticsCollectionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML StatisticsCollectionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class StatisticsCollectionTypeImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticTypeImpl implements org.uncertml.x20.StatisticsCollectionType
{
    private static final long serialVersionUID = 1L;
    
    public StatisticsCollectionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTSUMMARYSTATISTIC$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "AbstractSummaryStatistic");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTSUMMARYSTATISTIC$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "CovarianceMatrix"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Mode"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Skewness"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "ConfusionMatrix"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Range"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "CredibleInterval"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "DiscreteProbability"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Decile"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Quantile"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "ConfidenceInterval"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "StatisticsCollection"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Mean"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Median"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Correlation"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Percentile"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "CentredMoment"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "AbstractSummaryStatistic"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Probability"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Quartile"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Variance"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Moment"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "InterquartileRange"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "CoefficientOfVariation"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "StandardDeviation"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Kurtosis"),
    });
    
    
    /**
     * Gets array of all "AbstractSummaryStatistic" elements
     */
    public org.uncertml.x20.AbstractSummaryStatisticType[] getAbstractSummaryStatisticArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTSUMMARYSTATISTIC$1, targetList);
            org.uncertml.x20.AbstractSummaryStatisticType[] result = new org.uncertml.x20.AbstractSummaryStatisticType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AbstractSummaryStatistic" element
     */
    public org.uncertml.x20.AbstractSummaryStatisticType getAbstractSummaryStatisticArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.AbstractSummaryStatisticType target = null;
            target = (org.uncertml.x20.AbstractSummaryStatisticType)get_store().find_element_user(ABSTRACTSUMMARYSTATISTIC$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AbstractSummaryStatistic" element
     */
    public int sizeOfAbstractSummaryStatisticArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTSUMMARYSTATISTIC$1);
        }
    }
    
    /**
     * Sets array of all "AbstractSummaryStatistic" element
     */
    public void setAbstractSummaryStatisticArray(org.uncertml.x20.AbstractSummaryStatisticType[] abstractSummaryStatisticArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(abstractSummaryStatisticArray, ABSTRACTSUMMARYSTATISTIC$0, ABSTRACTSUMMARYSTATISTIC$1);
        }
    }
    
    /**
     * Sets ith "AbstractSummaryStatistic" element
     */
    public void setAbstractSummaryStatisticArray(int i, org.uncertml.x20.AbstractSummaryStatisticType abstractSummaryStatistic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.AbstractSummaryStatisticType target = null;
            target = (org.uncertml.x20.AbstractSummaryStatisticType)get_store().find_element_user(ABSTRACTSUMMARYSTATISTIC$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractSummaryStatistic);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AbstractSummaryStatistic" element
     */
    public org.uncertml.x20.AbstractSummaryStatisticType insertNewAbstractSummaryStatistic(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.AbstractSummaryStatisticType target = null;
            target = (org.uncertml.x20.AbstractSummaryStatisticType)get_store().insert_element_user(ABSTRACTSUMMARYSTATISTIC$1, ABSTRACTSUMMARYSTATISTIC$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AbstractSummaryStatistic" element
     */
    public org.uncertml.x20.AbstractSummaryStatisticType addNewAbstractSummaryStatistic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.AbstractSummaryStatisticType target = null;
            target = (org.uncertml.x20.AbstractSummaryStatisticType)get_store().add_element_user(ABSTRACTSUMMARYSTATISTIC$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AbstractSummaryStatistic" element
     */
    public void removeAbstractSummaryStatistic(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTSUMMARYSTATISTIC$1, i);
        }
    }
}
