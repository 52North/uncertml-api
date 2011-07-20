/*
 * XML Type:  MomentType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.MomentType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML MomentType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class MomentTypeImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticTypeImpl implements org.uncertml.x20.MomentType
{
    private static final long serialVersionUID = 1L;
    
    public MomentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUES$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "values");
    private static final javax.xml.namespace.QName ORDER$2 = 
        new javax.xml.namespace.QName("", "order");
    
    
    /**
     * Gets the "values" element
     */
    public org.uncertml.x20.ContinuousValuesType getValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(VALUES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "values" element
     */
    public void setValues(org.uncertml.x20.ContinuousValuesType values)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(VALUES$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(VALUES$0);
            }
            target.set(values);
        }
    }
    
    /**
     * Appends and returns a new empty "values" element
     */
    public org.uncertml.x20.ContinuousValuesType addNewValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(VALUES$0);
            return target;
        }
    }
    
    /**
     * Gets the "order" attribute
     */
    public java.math.BigInteger getOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDER$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "order" attribute
     */
    public org.uncertml.x20.NaturalNumber xgetOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumber target = null;
            target = (org.uncertml.x20.NaturalNumber)get_store().find_attribute_user(ORDER$2);
            return target;
        }
    }
    
    /**
     * Sets the "order" attribute
     */
    public void setOrder(java.math.BigInteger order)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORDER$2);
            }
            target.setBigIntegerValue(order);
        }
    }
    
    /**
     * Sets (as xml) the "order" attribute
     */
    public void xsetOrder(org.uncertml.x20.NaturalNumber order)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumber target = null;
            target = (org.uncertml.x20.NaturalNumber)get_store().find_attribute_user(ORDER$2);
            if (target == null)
            {
                target = (org.uncertml.x20.NaturalNumber)get_store().add_attribute_user(ORDER$2);
            }
            target.set(order);
        }
    }
}
