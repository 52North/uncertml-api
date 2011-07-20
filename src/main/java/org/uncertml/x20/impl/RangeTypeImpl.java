/*
 * XML Type:  RangeType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.RangeType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML RangeType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class RangeTypeImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticTypeImpl implements org.uncertml.x20.RangeType
{
    private static final long serialVersionUID = 1L;
    
    public RangeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOWER$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "lower");
    private static final javax.xml.namespace.QName UPPER$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "upper");
    
    
    /**
     * Gets the "lower" element
     */
    public org.uncertml.x20.ContinuousValuesType getLower()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(LOWER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lower" element
     */
    public void setLower(org.uncertml.x20.ContinuousValuesType lower)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(LOWER$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(LOWER$0);
            }
            target.set(lower);
        }
    }
    
    /**
     * Appends and returns a new empty "lower" element
     */
    public org.uncertml.x20.ContinuousValuesType addNewLower()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(LOWER$0);
            return target;
        }
    }
    
    /**
     * Gets the "upper" element
     */
    public org.uncertml.x20.ContinuousValuesType getUpper()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(UPPER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "upper" element
     */
    public void setUpper(org.uncertml.x20.ContinuousValuesType upper)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(UPPER$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(UPPER$2);
            }
            target.set(upper);
        }
    }
    
    /**
     * Appends and returns a new empty "upper" element
     */
    public org.uncertml.x20.ContinuousValuesType addNewUpper()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(UPPER$2);
            return target;
        }
    }
}
