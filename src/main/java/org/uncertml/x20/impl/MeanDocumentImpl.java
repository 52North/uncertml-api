/*
 * An XML document type.
 * Localname: Mean
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.MeanDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one Mean(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class MeanDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.MeanDocument
{
    private static final long serialVersionUID = 1L;
    
    public MeanDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEAN$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Mean");
    
    
    /**
     * Gets the "Mean" element
     */
    public org.uncertml.x20.MeanDocument.Mean getMean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MeanDocument.Mean target = null;
            target = (org.uncertml.x20.MeanDocument.Mean)get_store().find_element_user(MEAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Mean" element
     */
    public void setMean(org.uncertml.x20.MeanDocument.Mean mean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MeanDocument.Mean target = null;
            target = (org.uncertml.x20.MeanDocument.Mean)get_store().find_element_user(MEAN$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.MeanDocument.Mean)get_store().add_element_user(MEAN$0);
            }
            target.set(mean);
        }
    }
    
    /**
     * Appends and returns a new empty "Mean" element
     */
    public org.uncertml.x20.MeanDocument.Mean addNewMean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MeanDocument.Mean target = null;
            target = (org.uncertml.x20.MeanDocument.Mean)get_store().add_element_user(MEAN$0);
            return target;
        }
    }
    /**
     * An XML Mean(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class MeanImpl extends org.uncertml.x20.impl.MeanTypeImpl implements org.uncertml.x20.MeanDocument.Mean
    {
        private static final long serialVersionUID = 1L;
        
        public MeanImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
