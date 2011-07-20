/*
 * An XML document type.
 * Localname: Percentile
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.PercentileDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one Percentile(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class PercentileDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.PercentileDocument
{
    private static final long serialVersionUID = 1L;
    
    public PercentileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERCENTILE$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Percentile");
    
    
    /**
     * Gets the "Percentile" element
     */
    public org.uncertml.x20.PercentileDocument.Percentile getPercentile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PercentileDocument.Percentile target = null;
            target = (org.uncertml.x20.PercentileDocument.Percentile)get_store().find_element_user(PERCENTILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Percentile" element
     */
    public void setPercentile(org.uncertml.x20.PercentileDocument.Percentile percentile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PercentileDocument.Percentile target = null;
            target = (org.uncertml.x20.PercentileDocument.Percentile)get_store().find_element_user(PERCENTILE$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PercentileDocument.Percentile)get_store().add_element_user(PERCENTILE$0);
            }
            target.set(percentile);
        }
    }
    
    /**
     * Appends and returns a new empty "Percentile" element
     */
    public org.uncertml.x20.PercentileDocument.Percentile addNewPercentile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PercentileDocument.Percentile target = null;
            target = (org.uncertml.x20.PercentileDocument.Percentile)get_store().add_element_user(PERCENTILE$0);
            return target;
        }
    }
    /**
     * An XML Percentile(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class PercentileImpl extends org.uncertml.x20.impl.PercentileTypeImpl implements org.uncertml.x20.PercentileDocument.Percentile
    {
        private static final long serialVersionUID = 1L;
        
        public PercentileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
