/*
 * An XML document type.
 * Localname: Correlation
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.CorrelationDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one Correlation(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class CorrelationDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.CorrelationDocument
{
    private static final long serialVersionUID = 1L;
    
    public CorrelationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRELATION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Correlation");
    
    
    /**
     * Gets the "Correlation" element
     */
    public org.uncertml.x20.CorrelationDocument.Correlation getCorrelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CorrelationDocument.Correlation target = null;
            target = (org.uncertml.x20.CorrelationDocument.Correlation)get_store().find_element_user(CORRELATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Correlation" element
     */
    public void setCorrelation(org.uncertml.x20.CorrelationDocument.Correlation correlation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CorrelationDocument.Correlation target = null;
            target = (org.uncertml.x20.CorrelationDocument.Correlation)get_store().find_element_user(CORRELATION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.CorrelationDocument.Correlation)get_store().add_element_user(CORRELATION$0);
            }
            target.set(correlation);
        }
    }
    
    /**
     * Appends and returns a new empty "Correlation" element
     */
    public org.uncertml.x20.CorrelationDocument.Correlation addNewCorrelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CorrelationDocument.Correlation target = null;
            target = (org.uncertml.x20.CorrelationDocument.Correlation)get_store().add_element_user(CORRELATION$0);
            return target;
        }
    }
    /**
     * An XML Correlation(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class CorrelationImpl extends org.uncertml.x20.impl.CorrelationTypeImpl implements org.uncertml.x20.CorrelationDocument.Correlation
    {
        private static final long serialVersionUID = 1L;
        
        public CorrelationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
