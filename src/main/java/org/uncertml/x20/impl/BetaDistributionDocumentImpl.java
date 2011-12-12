/*
 * An XML document type.
 * Localname: BetaDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.BetaDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one BetaDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class BetaDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.BetaDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public BetaDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BETADISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "BetaDistribution");
    
    
    /**
     * Gets the "BetaDistribution" element
     */
    public org.uncertml.x20.BetaDistributionDocument.BetaDistribution getBetaDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.BetaDistributionDocument.BetaDistribution target = null;
            target = (org.uncertml.x20.BetaDistributionDocument.BetaDistribution)get_store().find_element_user(BETADISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BetaDistribution" element
     */
    public void setBetaDistribution(org.uncertml.x20.BetaDistributionDocument.BetaDistribution betaDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.BetaDistributionDocument.BetaDistribution target = null;
            target = (org.uncertml.x20.BetaDistributionDocument.BetaDistribution)get_store().find_element_user(BETADISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.BetaDistributionDocument.BetaDistribution)get_store().add_element_user(BETADISTRIBUTION$0);
            }
            target.set(betaDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "BetaDistribution" element
     */
    public org.uncertml.x20.BetaDistributionDocument.BetaDistribution addNewBetaDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.BetaDistributionDocument.BetaDistribution target = null;
            target = (org.uncertml.x20.BetaDistributionDocument.BetaDistribution)get_store().add_element_user(BETADISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML BetaDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class BetaDistributionImpl extends org.uncertml.x20.impl.BetaDistributionTypeImpl implements org.uncertml.x20.BetaDistributionDocument.BetaDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public BetaDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
