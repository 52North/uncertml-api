/*
 * An XML document type.
 * Localname: WishartDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.WishartDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one WishartDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class WishartDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.WishartDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public WishartDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WISHARTDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "WishartDistribution");
    
    
    /**
     * Gets the "WishartDistribution" element
     */
    public org.uncertml.x20.WishartDistributionDocument.WishartDistribution getWishartDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.WishartDistributionDocument.WishartDistribution target = null;
            target = (org.uncertml.x20.WishartDistributionDocument.WishartDistribution)get_store().find_element_user(WISHARTDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WishartDistribution" element
     */
    public void setWishartDistribution(org.uncertml.x20.WishartDistributionDocument.WishartDistribution wishartDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.WishartDistributionDocument.WishartDistribution target = null;
            target = (org.uncertml.x20.WishartDistributionDocument.WishartDistribution)get_store().find_element_user(WISHARTDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.WishartDistributionDocument.WishartDistribution)get_store().add_element_user(WISHARTDISTRIBUTION$0);
            }
            target.set(wishartDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "WishartDistribution" element
     */
    public org.uncertml.x20.WishartDistributionDocument.WishartDistribution addNewWishartDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.WishartDistributionDocument.WishartDistribution target = null;
            target = (org.uncertml.x20.WishartDistributionDocument.WishartDistribution)get_store().add_element_user(WISHARTDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML WishartDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class WishartDistributionImpl extends org.uncertml.x20.impl.WishartDistributionTypeImpl implements org.uncertml.x20.WishartDistributionDocument.WishartDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public WishartDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
