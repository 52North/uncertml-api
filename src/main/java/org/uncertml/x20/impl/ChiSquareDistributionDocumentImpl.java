/*
 * An XML document type.
 * Localname: ChiSquareDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.ChiSquareDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one ChiSquareDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class ChiSquareDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.ChiSquareDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ChiSquareDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHISQUAREDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "ChiSquareDistribution");
    
    
    /**
     * Gets the "ChiSquareDistribution" element
     */
    public org.uncertml.x20.ChiSquareDistributionDocument.ChiSquareDistribution getChiSquareDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ChiSquareDistributionDocument.ChiSquareDistribution target = null;
            target = (org.uncertml.x20.ChiSquareDistributionDocument.ChiSquareDistribution)get_store().find_element_user(CHISQUAREDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ChiSquareDistribution" element
     */
    public void setChiSquareDistribution(org.uncertml.x20.ChiSquareDistributionDocument.ChiSquareDistribution chiSquareDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ChiSquareDistributionDocument.ChiSquareDistribution target = null;
            target = (org.uncertml.x20.ChiSquareDistributionDocument.ChiSquareDistribution)get_store().find_element_user(CHISQUAREDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ChiSquareDistributionDocument.ChiSquareDistribution)get_store().add_element_user(CHISQUAREDISTRIBUTION$0);
            }
            target.set(chiSquareDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "ChiSquareDistribution" element
     */
    public org.uncertml.x20.ChiSquareDistributionDocument.ChiSquareDistribution addNewChiSquareDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ChiSquareDistributionDocument.ChiSquareDistribution target = null;
            target = (org.uncertml.x20.ChiSquareDistributionDocument.ChiSquareDistribution)get_store().add_element_user(CHISQUAREDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML ChiSquareDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class ChiSquareDistributionImpl extends org.uncertml.x20.impl.ChiSquareDistributionTypeImpl implements org.uncertml.x20.ChiSquareDistributionDocument.ChiSquareDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public ChiSquareDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
