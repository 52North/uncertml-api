/*
 * An XML document type.
 * Localname: InverseGammaDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.InverseGammaDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one InverseGammaDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class InverseGammaDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.InverseGammaDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public InverseGammaDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVERSEGAMMADISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "InverseGammaDistribution");
    
    
    /**
     * Gets the "InverseGammaDistribution" element
     */
    public org.uncertml.x20.InverseGammaDistributionDocument.InverseGammaDistribution getInverseGammaDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.InverseGammaDistributionDocument.InverseGammaDistribution target = null;
            target = (org.uncertml.x20.InverseGammaDistributionDocument.InverseGammaDistribution)get_store().find_element_user(INVERSEGAMMADISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InverseGammaDistribution" element
     */
    public void setInverseGammaDistribution(org.uncertml.x20.InverseGammaDistributionDocument.InverseGammaDistribution inverseGammaDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.InverseGammaDistributionDocument.InverseGammaDistribution target = null;
            target = (org.uncertml.x20.InverseGammaDistributionDocument.InverseGammaDistribution)get_store().find_element_user(INVERSEGAMMADISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.InverseGammaDistributionDocument.InverseGammaDistribution)get_store().add_element_user(INVERSEGAMMADISTRIBUTION$0);
            }
            target.set(inverseGammaDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "InverseGammaDistribution" element
     */
    public org.uncertml.x20.InverseGammaDistributionDocument.InverseGammaDistribution addNewInverseGammaDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.InverseGammaDistributionDocument.InverseGammaDistribution target = null;
            target = (org.uncertml.x20.InverseGammaDistributionDocument.InverseGammaDistribution)get_store().add_element_user(INVERSEGAMMADISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML InverseGammaDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class InverseGammaDistributionImpl extends org.uncertml.x20.impl.InverseGammaDistributionTypeImpl implements org.uncertml.x20.InverseGammaDistributionDocument.InverseGammaDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public InverseGammaDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
