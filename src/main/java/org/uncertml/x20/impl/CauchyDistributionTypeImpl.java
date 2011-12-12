/*
 * XML Type:  CauchyDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.CauchyDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML CauchyDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class CauchyDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.CauchyDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public CauchyDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "location");
    private static final javax.xml.namespace.QName SCALE$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "scale");
    
    
    /**
     * Gets the "location" element
     */
    public org.uncertml.x20.ContinuousValuesType getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(org.uncertml.x20.ContinuousValuesType location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(LOCATION$0);
            }
            target.set(location);
        }
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public org.uncertml.x20.ContinuousValuesType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(LOCATION$0);
            return target;
        }
    }
    
    /**
     * Gets the "scale" element
     */
    public org.uncertml.x20.PositiveRealValuesType getScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(SCALE$2, 0);
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
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(SCALE$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(SCALE$2);
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
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(SCALE$2);
            return target;
        }
    }
}
