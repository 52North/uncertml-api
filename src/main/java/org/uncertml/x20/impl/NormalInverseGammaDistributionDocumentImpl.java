/*
 * An XML document type.
 * Localname: NormalInverseGammaDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.NormalInverseGammaDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one NormalInverseGammaDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class NormalInverseGammaDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.NormalInverseGammaDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public NormalInverseGammaDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NORMALINVERSEGAMMADISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "NormalInverseGammaDistribution");
    
    
    /**
     * Gets the "NormalInverseGammaDistribution" element
     */
    public org.uncertml.x20.NormalInverseGammaDistributionDocument.NormalInverseGammaDistribution getNormalInverseGammaDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NormalInverseGammaDistributionDocument.NormalInverseGammaDistribution target = null;
            target = (org.uncertml.x20.NormalInverseGammaDistributionDocument.NormalInverseGammaDistribution)get_store().find_element_user(NORMALINVERSEGAMMADISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NormalInverseGammaDistribution" element
     */
    public void setNormalInverseGammaDistribution(org.uncertml.x20.NormalInverseGammaDistributionDocument.NormalInverseGammaDistribution normalInverseGammaDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NormalInverseGammaDistributionDocument.NormalInverseGammaDistribution target = null;
            target = (org.uncertml.x20.NormalInverseGammaDistributionDocument.NormalInverseGammaDistribution)get_store().find_element_user(NORMALINVERSEGAMMADISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.NormalInverseGammaDistributionDocument.NormalInverseGammaDistribution)get_store().add_element_user(NORMALINVERSEGAMMADISTRIBUTION$0);
            }
            target.set(normalInverseGammaDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "NormalInverseGammaDistribution" element
     */
    public org.uncertml.x20.NormalInverseGammaDistributionDocument.NormalInverseGammaDistribution addNewNormalInverseGammaDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NormalInverseGammaDistributionDocument.NormalInverseGammaDistribution target = null;
            target = (org.uncertml.x20.NormalInverseGammaDistributionDocument.NormalInverseGammaDistribution)get_store().add_element_user(NORMALINVERSEGAMMADISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML NormalInverseGammaDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class NormalInverseGammaDistributionImpl extends org.uncertml.x20.impl.NormalInverseGammaDistributionTypeImpl implements org.uncertml.x20.NormalInverseGammaDistributionDocument.NormalInverseGammaDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public NormalInverseGammaDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
