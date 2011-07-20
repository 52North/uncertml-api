/*
 * XML Type:  BetaDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.BetaDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML BetaDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class BetaDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.BetaDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public BetaDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALPHA$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "alpha");
    private static final javax.xml.namespace.QName BETA$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "beta");
    
    
    /**
     * Gets the "alpha" element
     */
    public org.uncertml.x20.PositiveRealValuesType getAlpha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(ALPHA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "alpha" element
     */
    public void setAlpha(org.uncertml.x20.PositiveRealValuesType alpha)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(ALPHA$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(ALPHA$0);
            }
            target.set(alpha);
        }
    }
    
    /**
     * Appends and returns a new empty "alpha" element
     */
    public org.uncertml.x20.PositiveRealValuesType addNewAlpha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(ALPHA$0);
            return target;
        }
    }
    
    /**
     * Gets the "beta" element
     */
    public org.uncertml.x20.PositiveRealValuesType getBeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(BETA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "beta" element
     */
    public void setBeta(org.uncertml.x20.PositiveRealValuesType beta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(BETA$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(BETA$2);
            }
            target.set(beta);
        }
    }
    
    /**
     * Appends and returns a new empty "beta" element
     */
    public org.uncertml.x20.PositiveRealValuesType addNewBeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(BETA$2);
            return target;
        }
    }
}
