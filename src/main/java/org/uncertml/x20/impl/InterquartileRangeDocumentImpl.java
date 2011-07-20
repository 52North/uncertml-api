/*
 * An XML document type.
 * Localname: InterquartileRange
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.InterquartileRangeDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one InterquartileRange(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class InterquartileRangeDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.InterquartileRangeDocument
{
    private static final long serialVersionUID = 1L;
    
    public InterquartileRangeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERQUARTILERANGE$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "InterquartileRange");
    
    
    /**
     * Gets the "InterquartileRange" element
     */
    public org.uncertml.x20.InterquartileRangeDocument.InterquartileRange getInterquartileRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.InterquartileRangeDocument.InterquartileRange target = null;
            target = (org.uncertml.x20.InterquartileRangeDocument.InterquartileRange)get_store().find_element_user(INTERQUARTILERANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InterquartileRange" element
     */
    public void setInterquartileRange(org.uncertml.x20.InterquartileRangeDocument.InterquartileRange interquartileRange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.InterquartileRangeDocument.InterquartileRange target = null;
            target = (org.uncertml.x20.InterquartileRangeDocument.InterquartileRange)get_store().find_element_user(INTERQUARTILERANGE$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.InterquartileRangeDocument.InterquartileRange)get_store().add_element_user(INTERQUARTILERANGE$0);
            }
            target.set(interquartileRange);
        }
    }
    
    /**
     * Appends and returns a new empty "InterquartileRange" element
     */
    public org.uncertml.x20.InterquartileRangeDocument.InterquartileRange addNewInterquartileRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.InterquartileRangeDocument.InterquartileRange target = null;
            target = (org.uncertml.x20.InterquartileRangeDocument.InterquartileRange)get_store().add_element_user(INTERQUARTILERANGE$0);
            return target;
        }
    }
    /**
     * An XML InterquartileRange(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class InterquartileRangeImpl extends org.uncertml.x20.impl.InterquartileRangeTypeImpl implements org.uncertml.x20.InterquartileRangeDocument.InterquartileRange
    {
        private static final long serialVersionUID = 1L;
        
        public InterquartileRangeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
