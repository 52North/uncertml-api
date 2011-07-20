/*
 * An XML document type.
 * Localname: ConfidenceInterval
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.ConfidenceIntervalDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one ConfidenceInterval(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class ConfidenceIntervalDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.ConfidenceIntervalDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConfidenceIntervalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIDENCEINTERVAL$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "ConfidenceInterval");
    
    
    /**
     * Gets the "ConfidenceInterval" element
     */
    public org.uncertml.x20.ConfidenceIntervalDocument.ConfidenceInterval getConfidenceInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ConfidenceIntervalDocument.ConfidenceInterval target = null;
            target = (org.uncertml.x20.ConfidenceIntervalDocument.ConfidenceInterval)get_store().find_element_user(CONFIDENCEINTERVAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConfidenceInterval" element
     */
    public void setConfidenceInterval(org.uncertml.x20.ConfidenceIntervalDocument.ConfidenceInterval confidenceInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ConfidenceIntervalDocument.ConfidenceInterval target = null;
            target = (org.uncertml.x20.ConfidenceIntervalDocument.ConfidenceInterval)get_store().find_element_user(CONFIDENCEINTERVAL$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ConfidenceIntervalDocument.ConfidenceInterval)get_store().add_element_user(CONFIDENCEINTERVAL$0);
            }
            target.set(confidenceInterval);
        }
    }
    
    /**
     * Appends and returns a new empty "ConfidenceInterval" element
     */
    public org.uncertml.x20.ConfidenceIntervalDocument.ConfidenceInterval addNewConfidenceInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ConfidenceIntervalDocument.ConfidenceInterval target = null;
            target = (org.uncertml.x20.ConfidenceIntervalDocument.ConfidenceInterval)get_store().add_element_user(CONFIDENCEINTERVAL$0);
            return target;
        }
    }
    /**
     * An XML ConfidenceInterval(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class ConfidenceIntervalImpl extends org.uncertml.x20.impl.ConfidenceIntervalTypeImpl implements org.uncertml.x20.ConfidenceIntervalDocument.ConfidenceInterval
    {
        private static final long serialVersionUID = 1L;
        
        public ConfidenceIntervalImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
