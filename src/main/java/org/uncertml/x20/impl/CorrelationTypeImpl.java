/*
 * XML Type:  CorrelationType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.CorrelationType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML CorrelationType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class CorrelationTypeImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticTypeImpl implements org.uncertml.x20.CorrelationType
{
    private static final long serialVersionUID = 1L;
    
    public CorrelationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUES$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "values");
    
    
    /**
     * Gets the "values" element
     */
    public org.uncertml.x20.NormalisedValuesType getValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NormalisedValuesType target = null;
            target = (org.uncertml.x20.NormalisedValuesType)get_store().find_element_user(VALUES$0, 0);
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
    public void setValues(org.uncertml.x20.NormalisedValuesType values)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NormalisedValuesType target = null;
            target = (org.uncertml.x20.NormalisedValuesType)get_store().find_element_user(VALUES$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.NormalisedValuesType)get_store().add_element_user(VALUES$0);
            }
            target.set(values);
        }
    }
    
    /**
     * Appends and returns a new empty "values" element
     */
    public org.uncertml.x20.NormalisedValuesType addNewValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NormalisedValuesType target = null;
            target = (org.uncertml.x20.NormalisedValuesType)get_store().add_element_user(VALUES$0);
            return target;
        }
    }
}
