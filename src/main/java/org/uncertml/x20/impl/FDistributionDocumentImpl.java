/*
 * An XML document type.
 * Localname: FDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.FDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one FDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class FDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.FDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public FDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "FDistribution");
    
    
    /**
     * Gets the "FDistribution" element
     */
    public org.uncertml.x20.FDistributionDocument.FDistribution getFDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.FDistributionDocument.FDistribution target = null;
            target = (org.uncertml.x20.FDistributionDocument.FDistribution)get_store().find_element_user(FDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FDistribution" element
     */
    public void setFDistribution(org.uncertml.x20.FDistributionDocument.FDistribution fDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.FDistributionDocument.FDistribution target = null;
            target = (org.uncertml.x20.FDistributionDocument.FDistribution)get_store().find_element_user(FDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.FDistributionDocument.FDistribution)get_store().add_element_user(FDISTRIBUTION$0);
            }
            target.set(fDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "FDistribution" element
     */
    public org.uncertml.x20.FDistributionDocument.FDistribution addNewFDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.FDistributionDocument.FDistribution target = null;
            target = (org.uncertml.x20.FDistributionDocument.FDistribution)get_store().add_element_user(FDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML FDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class FDistributionImpl extends org.uncertml.x20.impl.FDistributionTypeImpl implements org.uncertml.x20.FDistributionDocument.FDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public FDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
