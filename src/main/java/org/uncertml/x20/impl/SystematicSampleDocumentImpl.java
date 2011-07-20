/*
 * An XML document type.
 * Localname: SystematicSample
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.SystematicSampleDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one SystematicSample(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class SystematicSampleDocumentImpl extends org.uncertml.x20.impl.AbstractSampleDocumentImpl implements org.uncertml.x20.SystematicSampleDocument
{
    private static final long serialVersionUID = 1L;
    
    public SystematicSampleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEMATICSAMPLE$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "SystematicSample");
    
    
    /**
     * Gets the "SystematicSample" element
     */
    public org.uncertml.x20.SystematicSampleDocument.SystematicSample getSystematicSample()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.SystematicSampleDocument.SystematicSample target = null;
            target = (org.uncertml.x20.SystematicSampleDocument.SystematicSample)get_store().find_element_user(SYSTEMATICSAMPLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SystematicSample" element
     */
    public void setSystematicSample(org.uncertml.x20.SystematicSampleDocument.SystematicSample systematicSample)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.SystematicSampleDocument.SystematicSample target = null;
            target = (org.uncertml.x20.SystematicSampleDocument.SystematicSample)get_store().find_element_user(SYSTEMATICSAMPLE$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.SystematicSampleDocument.SystematicSample)get_store().add_element_user(SYSTEMATICSAMPLE$0);
            }
            target.set(systematicSample);
        }
    }
    
    /**
     * Appends and returns a new empty "SystematicSample" element
     */
    public org.uncertml.x20.SystematicSampleDocument.SystematicSample addNewSystematicSample()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.SystematicSampleDocument.SystematicSample target = null;
            target = (org.uncertml.x20.SystematicSampleDocument.SystematicSample)get_store().add_element_user(SYSTEMATICSAMPLE$0);
            return target;
        }
    }
    /**
     * An XML SystematicSample(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class SystematicSampleImpl extends org.uncertml.x20.impl.SystematicSampleTypeImpl implements org.uncertml.x20.SystematicSampleDocument.SystematicSample
    {
        private static final long serialVersionUID = 1L;
        
        public SystematicSampleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
