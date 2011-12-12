/*
 * An XML document type.
 * Localname: Mode
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.ModeDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one Mode(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class ModeDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.ModeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ModeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODE$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Mode");
    
    
    /**
     * Gets the "Mode" element
     */
    public org.uncertml.x20.ModeDocument.Mode getMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ModeDocument.Mode target = null;
            target = (org.uncertml.x20.ModeDocument.Mode)get_store().find_element_user(MODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Mode" element
     */
    public void setMode(org.uncertml.x20.ModeDocument.Mode mode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ModeDocument.Mode target = null;
            target = (org.uncertml.x20.ModeDocument.Mode)get_store().find_element_user(MODE$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ModeDocument.Mode)get_store().add_element_user(MODE$0);
            }
            target.set(mode);
        }
    }
    
    /**
     * Appends and returns a new empty "Mode" element
     */
    public org.uncertml.x20.ModeDocument.Mode addNewMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ModeDocument.Mode target = null;
            target = (org.uncertml.x20.ModeDocument.Mode)get_store().add_element_user(MODE$0);
            return target;
        }
    }
    /**
     * An XML Mode(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class ModeImpl extends org.uncertml.x20.impl.ModeTypeImpl implements org.uncertml.x20.ModeDocument.Mode
    {
        private static final long serialVersionUID = 1L;
        
        public ModeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
