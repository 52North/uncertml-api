/*
 * An XML document type.
 * Localname: PoissonDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.PoissonDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one PoissonDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class PoissonDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.PoissonDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public PoissonDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POISSONDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "PoissonDistribution");
    
    
    /**
     * Gets the "PoissonDistribution" element
     */
    public org.uncertml.x20.PoissonDistributionDocument.PoissonDistribution getPoissonDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PoissonDistributionDocument.PoissonDistribution target = null;
            target = (org.uncertml.x20.PoissonDistributionDocument.PoissonDistribution)get_store().find_element_user(POISSONDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PoissonDistribution" element
     */
    public void setPoissonDistribution(org.uncertml.x20.PoissonDistributionDocument.PoissonDistribution poissonDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PoissonDistributionDocument.PoissonDistribution target = null;
            target = (org.uncertml.x20.PoissonDistributionDocument.PoissonDistribution)get_store().find_element_user(POISSONDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PoissonDistributionDocument.PoissonDistribution)get_store().add_element_user(POISSONDISTRIBUTION$0);
            }
            target.set(poissonDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "PoissonDistribution" element
     */
    public org.uncertml.x20.PoissonDistributionDocument.PoissonDistribution addNewPoissonDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PoissonDistributionDocument.PoissonDistribution target = null;
            target = (org.uncertml.x20.PoissonDistributionDocument.PoissonDistribution)get_store().add_element_user(POISSONDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML PoissonDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class PoissonDistributionImpl extends org.uncertml.x20.impl.PoissonDistributionTypeImpl implements org.uncertml.x20.PoissonDistributionDocument.PoissonDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public PoissonDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
