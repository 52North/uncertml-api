/*
 * An XML document type.
 * Localname: Quartile
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.QuartileDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one Quartile(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class QuartileDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.QuartileDocument
{
    private static final long serialVersionUID = 1L;
    
    public QuartileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUARTILE$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Quartile");
    
    
    /**
     * Gets the "Quartile" element
     */
    public org.uncertml.x20.QuartileDocument.Quartile getQuartile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.QuartileDocument.Quartile target = null;
            target = (org.uncertml.x20.QuartileDocument.Quartile)get_store().find_element_user(QUARTILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Quartile" element
     */
    public void setQuartile(org.uncertml.x20.QuartileDocument.Quartile quartile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.QuartileDocument.Quartile target = null;
            target = (org.uncertml.x20.QuartileDocument.Quartile)get_store().find_element_user(QUARTILE$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.QuartileDocument.Quartile)get_store().add_element_user(QUARTILE$0);
            }
            target.set(quartile);
        }
    }
    
    /**
     * Appends and returns a new empty "Quartile" element
     */
    public org.uncertml.x20.QuartileDocument.Quartile addNewQuartile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.QuartileDocument.Quartile target = null;
            target = (org.uncertml.x20.QuartileDocument.Quartile)get_store().add_element_user(QUARTILE$0);
            return target;
        }
    }
    /**
     * An XML Quartile(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class QuartileImpl extends org.uncertml.x20.impl.QuartileTypeImpl implements org.uncertml.x20.QuartileDocument.Quartile
    {
        private static final long serialVersionUID = 1L;
        
        public QuartileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
