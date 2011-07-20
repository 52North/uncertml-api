/*
 * XML Type:  ExponentialDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.ExponentialDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML ExponentialDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class ExponentialDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.ExponentialDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public ExponentialDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RATE$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "rate");
    
    
    /**
     * Gets the "rate" element
     */
    public org.uncertml.x20.PositiveRealValuesType getRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(RATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rate" element
     */
    public void setRate(org.uncertml.x20.PositiveRealValuesType rate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(RATE$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(RATE$0);
            }
            target.set(rate);
        }
    }
    
    /**
     * Appends and returns a new empty "rate" element
     */
    public org.uncertml.x20.PositiveRealValuesType addNewRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(RATE$0);
            return target;
        }
    }
}
