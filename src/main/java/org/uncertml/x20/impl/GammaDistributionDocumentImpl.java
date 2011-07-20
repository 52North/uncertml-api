/*
 * An XML document type.
 * Localname: GammaDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.GammaDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one GammaDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class GammaDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.GammaDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public GammaDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GAMMADISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "GammaDistribution");
    
    
    /**
     * Gets the "GammaDistribution" element
     */
    public org.uncertml.x20.GammaDistributionDocument.GammaDistribution getGammaDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.GammaDistributionDocument.GammaDistribution target = null;
            target = (org.uncertml.x20.GammaDistributionDocument.GammaDistribution)get_store().find_element_user(GAMMADISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GammaDistribution" element
     */
    public void setGammaDistribution(org.uncertml.x20.GammaDistributionDocument.GammaDistribution gammaDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.GammaDistributionDocument.GammaDistribution target = null;
            target = (org.uncertml.x20.GammaDistributionDocument.GammaDistribution)get_store().find_element_user(GAMMADISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.GammaDistributionDocument.GammaDistribution)get_store().add_element_user(GAMMADISTRIBUTION$0);
            }
            target.set(gammaDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "GammaDistribution" element
     */
    public org.uncertml.x20.GammaDistributionDocument.GammaDistribution addNewGammaDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.GammaDistributionDocument.GammaDistribution target = null;
            target = (org.uncertml.x20.GammaDistributionDocument.GammaDistribution)get_store().add_element_user(GAMMADISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML GammaDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class GammaDistributionImpl extends org.uncertml.x20.impl.GammaDistributionTypeImpl implements org.uncertml.x20.GammaDistributionDocument.GammaDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public GammaDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
