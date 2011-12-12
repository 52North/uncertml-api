/*
 * XML Type:  NormalDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.NormalDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML NormalDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class NormalDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.NormalDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public NormalDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEAN$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "mean");
    private static final javax.xml.namespace.QName VARIANCE$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "variance");
    
    
    /**
     * Gets the "mean" element
     */
    public org.uncertml.x20.ContinuousValuesType getMean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(MEAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mean" element
     */
    public void setMean(org.uncertml.x20.ContinuousValuesType mean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(MEAN$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(MEAN$0);
            }
            target.set(mean);
        }
    }
    
    /**
     * Appends and returns a new empty "mean" element
     */
    public org.uncertml.x20.ContinuousValuesType addNewMean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(MEAN$0);
            return target;
        }
    }
    
    /**
     * Gets the "variance" element
     */
    public org.uncertml.x20.PositiveRealValuesType getVariance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(VARIANCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "variance" element
     */
    public void setVariance(org.uncertml.x20.PositiveRealValuesType variance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(VARIANCE$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(VARIANCE$2);
            }
            target.set(variance);
        }
    }
    
    /**
     * Appends and returns a new empty "variance" element
     */
    public org.uncertml.x20.PositiveRealValuesType addNewVariance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(VARIANCE$2);
            return target;
        }
    }
}
