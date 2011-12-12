/*
 * An XML document type.
 * Localname: Range
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.RangeDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one Range(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class RangeDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.RangeDocument
{
    private static final long serialVersionUID = 1L;
    
    public RangeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RANGE$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Range");
    
    
    /**
     * Gets the "Range" element
     */
    public org.uncertml.x20.RangeDocument.Range getRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.RangeDocument.Range target = null;
            target = (org.uncertml.x20.RangeDocument.Range)get_store().find_element_user(RANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Range" element
     */
    public void setRange(org.uncertml.x20.RangeDocument.Range range)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.RangeDocument.Range target = null;
            target = (org.uncertml.x20.RangeDocument.Range)get_store().find_element_user(RANGE$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.RangeDocument.Range)get_store().add_element_user(RANGE$0);
            }
            target.set(range);
        }
    }
    
    /**
     * Appends and returns a new empty "Range" element
     */
    public org.uncertml.x20.RangeDocument.Range addNewRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.RangeDocument.Range target = null;
            target = (org.uncertml.x20.RangeDocument.Range)get_store().add_element_user(RANGE$0);
            return target;
        }
    }
    /**
     * An XML Range(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class RangeImpl extends org.uncertml.x20.impl.RangeTypeImpl implements org.uncertml.x20.RangeDocument.Range
    {
        private static final long serialVersionUID = 1L;
        
        public RangeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
