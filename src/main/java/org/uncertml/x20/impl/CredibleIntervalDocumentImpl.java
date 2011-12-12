/*
 * An XML document type.
 * Localname: CredibleInterval
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.CredibleIntervalDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one CredibleInterval(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class CredibleIntervalDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.CredibleIntervalDocument
{
    private static final long serialVersionUID = 1L;
    
    public CredibleIntervalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREDIBLEINTERVAL$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "CredibleInterval");
    
    
    /**
     * Gets the "CredibleInterval" element
     */
    public org.uncertml.x20.CredibleIntervalDocument.CredibleInterval getCredibleInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CredibleIntervalDocument.CredibleInterval target = null;
            target = (org.uncertml.x20.CredibleIntervalDocument.CredibleInterval)get_store().find_element_user(CREDIBLEINTERVAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CredibleInterval" element
     */
    public void setCredibleInterval(org.uncertml.x20.CredibleIntervalDocument.CredibleInterval credibleInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CredibleIntervalDocument.CredibleInterval target = null;
            target = (org.uncertml.x20.CredibleIntervalDocument.CredibleInterval)get_store().find_element_user(CREDIBLEINTERVAL$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.CredibleIntervalDocument.CredibleInterval)get_store().add_element_user(CREDIBLEINTERVAL$0);
            }
            target.set(credibleInterval);
        }
    }
    
    /**
     * Appends and returns a new empty "CredibleInterval" element
     */
    public org.uncertml.x20.CredibleIntervalDocument.CredibleInterval addNewCredibleInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CredibleIntervalDocument.CredibleInterval target = null;
            target = (org.uncertml.x20.CredibleIntervalDocument.CredibleInterval)get_store().add_element_user(CREDIBLEINTERVAL$0);
            return target;
        }
    }
    /**
     * An XML CredibleInterval(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class CredibleIntervalImpl extends org.uncertml.x20.impl.CredibleIntervalTypeImpl implements org.uncertml.x20.CredibleIntervalDocument.CredibleInterval
    {
        private static final long serialVersionUID = 1L;
        
        public CredibleIntervalImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
