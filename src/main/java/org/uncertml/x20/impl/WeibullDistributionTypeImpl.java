/*
 * XML Type:  WeibullDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.WeibullDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML WeibullDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class WeibullDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.WeibullDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public WeibullDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCALE$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "scale");
    private static final javax.xml.namespace.QName SHAPE$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "shape");
    
    
    /**
     * Gets the "scale" element
     */
    public org.uncertml.x20.PositiveRealValuesType getScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(SCALE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "scale" element
     */
    public void setScale(org.uncertml.x20.PositiveRealValuesType scale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(SCALE$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(SCALE$0);
            }
            target.set(scale);
        }
    }
    
    /**
     * Appends and returns a new empty "scale" element
     */
    public org.uncertml.x20.PositiveRealValuesType addNewScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(SCALE$0);
            return target;
        }
    }
    
    /**
     * Gets the "shape" element
     */
    public org.uncertml.x20.PositiveRealValuesType getShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(SHAPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "shape" element
     */
    public void setShape(org.uncertml.x20.PositiveRealValuesType shape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(SHAPE$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(SHAPE$2);
            }
            target.set(shape);
        }
    }
    
    /**
     * Appends and returns a new empty "shape" element
     */
    public org.uncertml.x20.PositiveRealValuesType addNewShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(SHAPE$2);
            return target;
        }
    }
}
