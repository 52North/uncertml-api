/*
 * An XML document type.
 * Localname: Variance
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.VarianceDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one Variance(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class VarianceDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.VarianceDocument
{
    private static final long serialVersionUID = 1L;
    
    public VarianceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VARIANCE$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Variance");
    
    
    /**
     * Gets the "Variance" element
     */
    public org.uncertml.x20.VarianceDocument.Variance getVariance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.VarianceDocument.Variance target = null;
            target = (org.uncertml.x20.VarianceDocument.Variance)get_store().find_element_user(VARIANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Variance" element
     */
    public void setVariance(org.uncertml.x20.VarianceDocument.Variance variance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.VarianceDocument.Variance target = null;
            target = (org.uncertml.x20.VarianceDocument.Variance)get_store().find_element_user(VARIANCE$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.VarianceDocument.Variance)get_store().add_element_user(VARIANCE$0);
            }
            target.set(variance);
        }
    }
    
    /**
     * Appends and returns a new empty "Variance" element
     */
    public org.uncertml.x20.VarianceDocument.Variance addNewVariance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.VarianceDocument.Variance target = null;
            target = (org.uncertml.x20.VarianceDocument.Variance)get_store().add_element_user(VARIANCE$0);
            return target;
        }
    }
    /**
     * An XML Variance(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class VarianceImpl extends org.uncertml.x20.impl.VarianceTypeImpl implements org.uncertml.x20.VarianceDocument.Variance
    {
        private static final long serialVersionUID = 1L;
        
        public VarianceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
