/*
 * An XML document type.
 * Localname: HypergeometricDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.HypergeometricDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one HypergeometricDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class HypergeometricDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.HypergeometricDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public HypergeometricDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HYPERGEOMETRICDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "HypergeometricDistribution");
    
    
    /**
     * Gets the "HypergeometricDistribution" element
     */
    public org.uncertml.x20.HypergeometricDistributionDocument.HypergeometricDistribution getHypergeometricDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.HypergeometricDistributionDocument.HypergeometricDistribution target = null;
            target = (org.uncertml.x20.HypergeometricDistributionDocument.HypergeometricDistribution)get_store().find_element_user(HYPERGEOMETRICDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HypergeometricDistribution" element
     */
    public void setHypergeometricDistribution(org.uncertml.x20.HypergeometricDistributionDocument.HypergeometricDistribution hypergeometricDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.HypergeometricDistributionDocument.HypergeometricDistribution target = null;
            target = (org.uncertml.x20.HypergeometricDistributionDocument.HypergeometricDistribution)get_store().find_element_user(HYPERGEOMETRICDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.HypergeometricDistributionDocument.HypergeometricDistribution)get_store().add_element_user(HYPERGEOMETRICDISTRIBUTION$0);
            }
            target.set(hypergeometricDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "HypergeometricDistribution" element
     */
    public org.uncertml.x20.HypergeometricDistributionDocument.HypergeometricDistribution addNewHypergeometricDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.HypergeometricDistributionDocument.HypergeometricDistribution target = null;
            target = (org.uncertml.x20.HypergeometricDistributionDocument.HypergeometricDistribution)get_store().add_element_user(HYPERGEOMETRICDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML HypergeometricDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class HypergeometricDistributionImpl extends org.uncertml.x20.impl.HypergeometricDistributionTypeImpl implements org.uncertml.x20.HypergeometricDistributionDocument.HypergeometricDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public HypergeometricDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
