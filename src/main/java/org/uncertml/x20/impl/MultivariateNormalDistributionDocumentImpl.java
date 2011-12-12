/*
 * An XML document type.
 * Localname: MultivariateNormalDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.MultivariateNormalDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one MultivariateNormalDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class MultivariateNormalDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.MultivariateNormalDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultivariateNormalDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIVARIATENORMALDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "MultivariateNormalDistribution");
    
    
    /**
     * Gets the "MultivariateNormalDistribution" element
     */
    public org.uncertml.x20.MultivariateNormalDistributionDocument.MultivariateNormalDistribution getMultivariateNormalDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MultivariateNormalDistributionDocument.MultivariateNormalDistribution target = null;
            target = (org.uncertml.x20.MultivariateNormalDistributionDocument.MultivariateNormalDistribution)get_store().find_element_user(MULTIVARIATENORMALDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultivariateNormalDistribution" element
     */
    public void setMultivariateNormalDistribution(org.uncertml.x20.MultivariateNormalDistributionDocument.MultivariateNormalDistribution multivariateNormalDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MultivariateNormalDistributionDocument.MultivariateNormalDistribution target = null;
            target = (org.uncertml.x20.MultivariateNormalDistributionDocument.MultivariateNormalDistribution)get_store().find_element_user(MULTIVARIATENORMALDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.MultivariateNormalDistributionDocument.MultivariateNormalDistribution)get_store().add_element_user(MULTIVARIATENORMALDISTRIBUTION$0);
            }
            target.set(multivariateNormalDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "MultivariateNormalDistribution" element
     */
    public org.uncertml.x20.MultivariateNormalDistributionDocument.MultivariateNormalDistribution addNewMultivariateNormalDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MultivariateNormalDistributionDocument.MultivariateNormalDistribution target = null;
            target = (org.uncertml.x20.MultivariateNormalDistributionDocument.MultivariateNormalDistribution)get_store().add_element_user(MULTIVARIATENORMALDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML MultivariateNormalDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class MultivariateNormalDistributionImpl extends org.uncertml.x20.impl.MultivariateNormalDistributionTypeImpl implements org.uncertml.x20.MultivariateNormalDistributionDocument.MultivariateNormalDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public MultivariateNormalDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
