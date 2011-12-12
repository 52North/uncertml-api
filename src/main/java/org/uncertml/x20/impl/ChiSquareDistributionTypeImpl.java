/*
 * XML Type:  ChiSquareDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.ChiSquareDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML ChiSquareDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class ChiSquareDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.ChiSquareDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public ChiSquareDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEGREESOFFREEDOM$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "degreesOfFreedom");
    
    
    /**
     * Gets the "degreesOfFreedom" element
     */
    public org.uncertml.x20.PositiveNaturalNumbersType getDegreesOfFreedom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveNaturalNumbersType target = null;
            target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().find_element_user(DEGREESOFFREEDOM$0, 0);
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
            target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().find_element_user(DEGREESOFFREEDOM$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().add_element_user(DEGREESOFFREEDOM$0);
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
            target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().add_element_user(DEGREESOFFREEDOM$0);
            return target;
        }
    }
}
