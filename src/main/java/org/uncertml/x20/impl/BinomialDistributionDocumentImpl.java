/*
 * An XML document type.
 * Localname: BinomialDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.BinomialDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one BinomialDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class BinomialDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.BinomialDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public BinomialDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BINOMIALDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "BinomialDistribution");
    
    
    /**
     * Gets the "BinomialDistribution" element
     */
    public org.uncertml.x20.BinomialDistributionDocument.BinomialDistribution getBinomialDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.BinomialDistributionDocument.BinomialDistribution target = null;
            target = (org.uncertml.x20.BinomialDistributionDocument.BinomialDistribution)get_store().find_element_user(BINOMIALDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BinomialDistribution" element
     */
    public void setBinomialDistribution(org.uncertml.x20.BinomialDistributionDocument.BinomialDistribution binomialDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.BinomialDistributionDocument.BinomialDistribution target = null;
            target = (org.uncertml.x20.BinomialDistributionDocument.BinomialDistribution)get_store().find_element_user(BINOMIALDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.BinomialDistributionDocument.BinomialDistribution)get_store().add_element_user(BINOMIALDISTRIBUTION$0);
            }
            target.set(binomialDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "BinomialDistribution" element
     */
    public org.uncertml.x20.BinomialDistributionDocument.BinomialDistribution addNewBinomialDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.BinomialDistributionDocument.BinomialDistribution target = null;
            target = (org.uncertml.x20.BinomialDistributionDocument.BinomialDistribution)get_store().add_element_user(BINOMIALDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML BinomialDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class BinomialDistributionImpl extends org.uncertml.x20.impl.BinomialDistributionTypeImpl implements org.uncertml.x20.BinomialDistributionDocument.BinomialDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public BinomialDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
