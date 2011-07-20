/*
 * An XML document type.
 * Localname: UnknownSample
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.UnknownSampleDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one UnknownSample(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class UnknownSampleDocumentImpl extends org.uncertml.x20.impl.AbstractSampleDocumentImpl implements org.uncertml.x20.UnknownSampleDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnknownSampleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNKNOWNSAMPLE$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "UnknownSample");
    
    
    /**
     * Gets the "UnknownSample" element
     */
    public org.uncertml.x20.UnknownSampleDocument.UnknownSample getUnknownSample()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.UnknownSampleDocument.UnknownSample target = null;
            target = (org.uncertml.x20.UnknownSampleDocument.UnknownSample)get_store().find_element_user(UNKNOWNSAMPLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnknownSample" element
     */
    public void setUnknownSample(org.uncertml.x20.UnknownSampleDocument.UnknownSample unknownSample)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.UnknownSampleDocument.UnknownSample target = null;
            target = (org.uncertml.x20.UnknownSampleDocument.UnknownSample)get_store().find_element_user(UNKNOWNSAMPLE$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.UnknownSampleDocument.UnknownSample)get_store().add_element_user(UNKNOWNSAMPLE$0);
            }
            target.set(unknownSample);
        }
    }
    
    /**
     * Appends and returns a new empty "UnknownSample" element
     */
    public org.uncertml.x20.UnknownSampleDocument.UnknownSample addNewUnknownSample()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.UnknownSampleDocument.UnknownSample target = null;
            target = (org.uncertml.x20.UnknownSampleDocument.UnknownSample)get_store().add_element_user(UNKNOWNSAMPLE$0);
            return target;
        }
    }
    /**
     * An XML UnknownSample(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class UnknownSampleImpl extends org.uncertml.x20.impl.UnknownSampleTypeImpl implements org.uncertml.x20.UnknownSampleDocument.UnknownSample
    {
        private static final long serialVersionUID = 1L;
        
        public UnknownSampleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
