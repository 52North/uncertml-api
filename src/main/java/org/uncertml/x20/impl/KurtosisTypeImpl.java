/*
 * XML Type:  KurtosisType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.KurtosisType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML KurtosisType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class KurtosisTypeImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticTypeImpl implements org.uncertml.x20.KurtosisType
{
    private static final long serialVersionUID = 1L;
    
    public KurtosisTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUES$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "values");
    
    
    /**
     * Gets the "values" element
     */
    public org.uncertml.x20.KurtosisValuesType getValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.KurtosisValuesType target = null;
            target = (org.uncertml.x20.KurtosisValuesType)get_store().find_element_user(VALUES$0, 0);
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
    public void setValues(org.uncertml.x20.KurtosisValuesType values)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.KurtosisValuesType target = null;
            target = (org.uncertml.x20.KurtosisValuesType)get_store().find_element_user(VALUES$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.KurtosisValuesType)get_store().add_element_user(VALUES$0);
            }
            target.set(values);
        }
    }
    
    /**
     * Appends and returns a new empty "values" element
     */
    public org.uncertml.x20.KurtosisValuesType addNewValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.KurtosisValuesType target = null;
            target = (org.uncertml.x20.KurtosisValuesType)get_store().add_element_user(VALUES$0);
            return target;
        }
    }
}
