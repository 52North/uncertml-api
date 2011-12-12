/*
 * An XML document type.
 * Localname: ParetoDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.ParetoDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one ParetoDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class ParetoDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.ParetoDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParetoDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARETODISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "ParetoDistribution");
    
    
    /**
     * Gets the "ParetoDistribution" element
     */
    public org.uncertml.x20.ParetoDistributionDocument.ParetoDistribution getParetoDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ParetoDistributionDocument.ParetoDistribution target = null;
            target = (org.uncertml.x20.ParetoDistributionDocument.ParetoDistribution)get_store().find_element_user(PARETODISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ParetoDistribution" element
     */
    public void setParetoDistribution(org.uncertml.x20.ParetoDistributionDocument.ParetoDistribution paretoDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ParetoDistributionDocument.ParetoDistribution target = null;
            target = (org.uncertml.x20.ParetoDistributionDocument.ParetoDistribution)get_store().find_element_user(PARETODISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ParetoDistributionDocument.ParetoDistribution)get_store().add_element_user(PARETODISTRIBUTION$0);
            }
            target.set(paretoDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "ParetoDistribution" element
     */
    public org.uncertml.x20.ParetoDistributionDocument.ParetoDistribution addNewParetoDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ParetoDistributionDocument.ParetoDistribution target = null;
            target = (org.uncertml.x20.ParetoDistributionDocument.ParetoDistribution)get_store().add_element_user(PARETODISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML ParetoDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class ParetoDistributionImpl extends org.uncertml.x20.impl.ParetoDistributionTypeImpl implements org.uncertml.x20.ParetoDistributionDocument.ParetoDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public ParetoDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
