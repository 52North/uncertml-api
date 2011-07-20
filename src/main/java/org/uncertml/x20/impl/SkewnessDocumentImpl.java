/*
 * An XML document type.
 * Localname: Skewness
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.SkewnessDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one Skewness(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class SkewnessDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.SkewnessDocument
{
    private static final long serialVersionUID = 1L;
    
    public SkewnessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SKEWNESS$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Skewness");
    
    
    /**
     * Gets the "Skewness" element
     */
    public org.uncertml.x20.SkewnessDocument.Skewness getSkewness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.SkewnessDocument.Skewness target = null;
            target = (org.uncertml.x20.SkewnessDocument.Skewness)get_store().find_element_user(SKEWNESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Skewness" element
     */
    public void setSkewness(org.uncertml.x20.SkewnessDocument.Skewness skewness)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.SkewnessDocument.Skewness target = null;
            target = (org.uncertml.x20.SkewnessDocument.Skewness)get_store().find_element_user(SKEWNESS$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.SkewnessDocument.Skewness)get_store().add_element_user(SKEWNESS$0);
            }
            target.set(skewness);
        }
    }
    
    /**
     * Appends and returns a new empty "Skewness" element
     */
    public org.uncertml.x20.SkewnessDocument.Skewness addNewSkewness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.SkewnessDocument.Skewness target = null;
            target = (org.uncertml.x20.SkewnessDocument.Skewness)get_store().add_element_user(SKEWNESS$0);
            return target;
        }
    }
    /**
     * An XML Skewness(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class SkewnessImpl extends org.uncertml.x20.impl.SkewnessTypeImpl implements org.uncertml.x20.SkewnessDocument.Skewness
    {
        private static final long serialVersionUID = 1L;
        
        public SkewnessImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
