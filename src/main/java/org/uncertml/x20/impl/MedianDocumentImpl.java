/*
 * An XML document type.
 * Localname: Median
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.MedianDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one Median(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class MedianDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.MedianDocument
{
    private static final long serialVersionUID = 1L;
    
    public MedianDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIAN$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Median");
    
    
    /**
     * Gets the "Median" element
     */
    public org.uncertml.x20.MedianDocument.Median getMedian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MedianDocument.Median target = null;
            target = (org.uncertml.x20.MedianDocument.Median)get_store().find_element_user(MEDIAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Median" element
     */
    public void setMedian(org.uncertml.x20.MedianDocument.Median median)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MedianDocument.Median target = null;
            target = (org.uncertml.x20.MedianDocument.Median)get_store().find_element_user(MEDIAN$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.MedianDocument.Median)get_store().add_element_user(MEDIAN$0);
            }
            target.set(median);
        }
    }
    
    /**
     * Appends and returns a new empty "Median" element
     */
    public org.uncertml.x20.MedianDocument.Median addNewMedian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MedianDocument.Median target = null;
            target = (org.uncertml.x20.MedianDocument.Median)get_store().add_element_user(MEDIAN$0);
            return target;
        }
    }
    /**
     * An XML Median(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class MedianImpl extends org.uncertml.x20.impl.MedianTypeImpl implements org.uncertml.x20.MedianDocument.Median
    {
        private static final long serialVersionUID = 1L;
        
        public MedianImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
