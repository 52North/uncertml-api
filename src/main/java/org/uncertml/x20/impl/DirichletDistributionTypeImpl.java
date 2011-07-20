/*
 * XML Type:  DirichletDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.DirichletDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML DirichletDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class DirichletDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.DirichletDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public DirichletDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCENTRATION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "concentration");
    
    
    /**
     * Gets the "concentration" element
     */
    public org.uncertml.x20.PositiveRealValuesType getConcentration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(CONCENTRATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "concentration" element
     */
    public void setConcentration(org.uncertml.x20.PositiveRealValuesType concentration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(CONCENTRATION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(CONCENTRATION$0);
            }
            target.set(concentration);
        }
    }
    
    /**
     * Appends and returns a new empty "concentration" element
     */
    public org.uncertml.x20.PositiveRealValuesType addNewConcentration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(CONCENTRATION$0);
            return target;
        }
    }
}
