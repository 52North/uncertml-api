/*
 * XML Type:  FDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.FDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML FDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class FDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.FDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public FDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DENOMINATOR$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "denominator");
    private static final javax.xml.namespace.QName NUMERATOR$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "numerator");
    
    
    /**
     * Gets the "denominator" element
     */
    public org.uncertml.x20.NaturalNumbersType getDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().find_element_user(DENOMINATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "denominator" element
     */
    public void setDenominator(org.uncertml.x20.NaturalNumbersType denominator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().find_element_user(DENOMINATOR$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.NaturalNumbersType)get_store().add_element_user(DENOMINATOR$0);
            }
            target.set(denominator);
        }
    }
    
    /**
     * Appends and returns a new empty "denominator" element
     */
    public org.uncertml.x20.NaturalNumbersType addNewDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().add_element_user(DENOMINATOR$0);
            return target;
        }
    }
    
    /**
     * Gets the "numerator" element
     */
    public org.uncertml.x20.NaturalNumbersType getNumerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().find_element_user(NUMERATOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "numerator" element
     */
    public void setNumerator(org.uncertml.x20.NaturalNumbersType numerator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().find_element_user(NUMERATOR$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.NaturalNumbersType)get_store().add_element_user(NUMERATOR$2);
            }
            target.set(numerator);
        }
    }
    
    /**
     * Appends and returns a new empty "numerator" element
     */
    public org.uncertml.x20.NaturalNumbersType addNewNumerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().add_element_user(NUMERATOR$2);
            return target;
        }
    }
}
