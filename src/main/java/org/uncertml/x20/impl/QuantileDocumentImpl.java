/*
 * An XML document type.
 * Localname: Quantile
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.QuantileDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one Quantile(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class QuantileDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.QuantileDocument
{
    private static final long serialVersionUID = 1L;
    
    public QuantileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUANTILE$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Quantile");
    
    
    /**
     * Gets the "Quantile" element
     */
    public org.uncertml.x20.QuantileDocument.Quantile getQuantile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.QuantileDocument.Quantile target = null;
            target = (org.uncertml.x20.QuantileDocument.Quantile)get_store().find_element_user(QUANTILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Quantile" element
     */
    public void setQuantile(org.uncertml.x20.QuantileDocument.Quantile quantile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.QuantileDocument.Quantile target = null;
            target = (org.uncertml.x20.QuantileDocument.Quantile)get_store().find_element_user(QUANTILE$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.QuantileDocument.Quantile)get_store().add_element_user(QUANTILE$0);
            }
            target.set(quantile);
        }
    }
    
    /**
     * Appends and returns a new empty "Quantile" element
     */
    public org.uncertml.x20.QuantileDocument.Quantile addNewQuantile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.QuantileDocument.Quantile target = null;
            target = (org.uncertml.x20.QuantileDocument.Quantile)get_store().add_element_user(QUANTILE$0);
            return target;
        }
    }
    /**
     * An XML Quantile(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class QuantileImpl extends org.uncertml.x20.impl.QuantileTypeImpl implements org.uncertml.x20.QuantileDocument.Quantile
    {
        private static final long serialVersionUID = 1L;
        
        public QuantileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
