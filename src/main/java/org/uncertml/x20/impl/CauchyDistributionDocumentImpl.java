/*
 * An XML document type.
 * Localname: CauchyDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.CauchyDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one CauchyDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class CauchyDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.CauchyDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public CauchyDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAUCHYDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "CauchyDistribution");
    
    
    /**
     * Gets the "CauchyDistribution" element
     */
    public org.uncertml.x20.CauchyDistributionDocument.CauchyDistribution getCauchyDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CauchyDistributionDocument.CauchyDistribution target = null;
            target = (org.uncertml.x20.CauchyDistributionDocument.CauchyDistribution)get_store().find_element_user(CAUCHYDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CauchyDistribution" element
     */
    public void setCauchyDistribution(org.uncertml.x20.CauchyDistributionDocument.CauchyDistribution cauchyDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CauchyDistributionDocument.CauchyDistribution target = null;
            target = (org.uncertml.x20.CauchyDistributionDocument.CauchyDistribution)get_store().find_element_user(CAUCHYDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.CauchyDistributionDocument.CauchyDistribution)get_store().add_element_user(CAUCHYDISTRIBUTION$0);
            }
            target.set(cauchyDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "CauchyDistribution" element
     */
    public org.uncertml.x20.CauchyDistributionDocument.CauchyDistribution addNewCauchyDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CauchyDistributionDocument.CauchyDistribution target = null;
            target = (org.uncertml.x20.CauchyDistributionDocument.CauchyDistribution)get_store().add_element_user(CAUCHYDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML CauchyDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class CauchyDistributionImpl extends org.uncertml.x20.impl.CauchyDistributionTypeImpl implements org.uncertml.x20.CauchyDistributionDocument.CauchyDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public CauchyDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
