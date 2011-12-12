/*
 * An XML document type.
 * Localname: Decile
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.DecileDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one Decile(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class DecileDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.DecileDocument
{
    private static final long serialVersionUID = 1L;
    
    public DecileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECILE$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Decile");
    
    
    /**
     * Gets the "Decile" element
     */
    public org.uncertml.x20.DecileDocument.Decile getDecile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.DecileDocument.Decile target = null;
            target = (org.uncertml.x20.DecileDocument.Decile)get_store().find_element_user(DECILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Decile" element
     */
    public void setDecile(org.uncertml.x20.DecileDocument.Decile decile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.DecileDocument.Decile target = null;
            target = (org.uncertml.x20.DecileDocument.Decile)get_store().find_element_user(DECILE$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.DecileDocument.Decile)get_store().add_element_user(DECILE$0);
            }
            target.set(decile);
        }
    }
    
    /**
     * Appends and returns a new empty "Decile" element
     */
    public org.uncertml.x20.DecileDocument.Decile addNewDecile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.DecileDocument.Decile target = null;
            target = (org.uncertml.x20.DecileDocument.Decile)get_store().add_element_user(DECILE$0);
            return target;
        }
    }
    /**
     * An XML Decile(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class DecileImpl extends org.uncertml.x20.impl.DecileTypeImpl implements org.uncertml.x20.DecileDocument.Decile
    {
        private static final long serialVersionUID = 1L;
        
        public DecileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
