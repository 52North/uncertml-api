/*
 * An XML document type.
 * Localname: AbstractSummaryStatistic
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.AbstractSummaryStatisticDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one AbstractSummaryStatistic(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class AbstractSummaryStatisticDocumentImpl extends org.uncertml.x20.impl.AbstractUncertaintyDocumentImpl implements org.uncertml.x20.AbstractSummaryStatisticDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractSummaryStatisticDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "InterquartileRange"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Moment"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "CoefficientOfVariation"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Kurtosis"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "StandardDeviation"),
    });
    
    
    /**
     * Gets the "AbstractSummaryStatistic" element
     */
    public org.uncertml.x20.AbstractSummaryStatisticType getAbstractSummaryStatistic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.AbstractSummaryStatisticType target = null;
            target = (org.uncertml.x20.AbstractSummaryStatisticType)get_store().find_element_user(ABSTRACTSUMMARYSTATISTIC$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractSummaryStatistic" element
     */
    public void setAbstractSummaryStatistic(org.uncertml.x20.AbstractSummaryStatisticType abstractSummaryStatistic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.AbstractSummaryStatisticType target = null;
            target = (org.uncertml.x20.AbstractSummaryStatisticType)get_store().find_element_user(ABSTRACTSUMMARYSTATISTIC$1, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.AbstractSummaryStatisticType)get_store().add_element_user(ABSTRACTSUMMARYSTATISTIC$0);
            }
            target.set(abstractSummaryStatistic);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractSummaryStatistic" element
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
}
