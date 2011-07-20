/*
 * An XML document type.
 * Localname: ExponentialDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.ExponentialDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one ExponentialDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class ExponentialDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.ExponentialDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExponentialDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPONENTIALDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "ExponentialDistribution");
    
    
    /**
     * Gets the "ExponentialDistribution" element
     */
    public org.uncertml.x20.ExponentialDistributionDocument.ExponentialDistribution getExponentialDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ExponentialDistributionDocument.ExponentialDistribution target = null;
            target = (org.uncertml.x20.ExponentialDistributionDocument.ExponentialDistribution)get_store().find_element_user(EXPONENTIALDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExponentialDistribution" element
     */
    public void setExponentialDistribution(org.uncertml.x20.ExponentialDistributionDocument.ExponentialDistribution exponentialDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ExponentialDistributionDocument.ExponentialDistribution target = null;
            target = (org.uncertml.x20.ExponentialDistributionDocument.ExponentialDistribution)get_store().find_element_user(EXPONENTIALDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ExponentialDistributionDocument.ExponentialDistribution)get_store().add_element_user(EXPONENTIALDISTRIBUTION$0);
            }
            target.set(exponentialDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "ExponentialDistribution" element
     */
    public org.uncertml.x20.ExponentialDistributionDocument.ExponentialDistribution addNewExponentialDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ExponentialDistributionDocument.ExponentialDistribution target = null;
            target = (org.uncertml.x20.ExponentialDistributionDocument.ExponentialDistribution)get_store().add_element_user(EXPONENTIALDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML ExponentialDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class ExponentialDistributionImpl extends org.uncertml.x20.impl.ExponentialDistributionTypeImpl implements org.uncertml.x20.ExponentialDistributionDocument.ExponentialDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public ExponentialDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
