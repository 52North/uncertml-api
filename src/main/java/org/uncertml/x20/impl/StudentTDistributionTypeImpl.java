/*
 * XML Type:  StudentTDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.StudentTDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML StudentTDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class StudentTDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.StudentTDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public StudentTDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "location");
    private static final javax.xml.namespace.QName SCALE$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "scale");
    private static final javax.xml.namespace.QName DEGREESOFFREEDOM$4 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "degreesOfFreedom");
    
    
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
    
    /**
     * Gets the "degreesOfFreedom" element
     */
    public org.uncertml.x20.PositiveNaturalNumbersType getDegreesOfFreedom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveNaturalNumbersType target = null;
            target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().find_element_user(DEGREESOFFREEDOM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "degreesOfFreedom" element
     */
    public void setDegreesOfFreedom(org.uncertml.x20.PositiveNaturalNumbersType degreesOfFreedom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveNaturalNumbersType target = null;
            target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().find_element_user(DEGREESOFFREEDOM$4, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().add_element_user(DEGREESOFFREEDOM$4);
            }
            target.set(degreesOfFreedom);
        }
    }
    
    /**
     * Appends and returns a new empty "degreesOfFreedom" element
     */
    public org.uncertml.x20.PositiveNaturalNumbersType addNewDegreesOfFreedom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveNaturalNumbersType target = null;
            target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().add_element_user(DEGREESOFFREEDOM$4);
            return target;
        }
    }
}
