/*
 * An XML document type.
 * Localname: LaplaceDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.LaplaceDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one LaplaceDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class LaplaceDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.LaplaceDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public LaplaceDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAPLACEDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "LaplaceDistribution");
    
    
    /**
     * Gets the "LaplaceDistribution" element
     */
    public org.uncertml.x20.LaplaceDistributionDocument.LaplaceDistribution getLaplaceDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.LaplaceDistributionDocument.LaplaceDistribution target = null;
            target = (org.uncertml.x20.LaplaceDistributionDocument.LaplaceDistribution)get_store().find_element_user(LAPLACEDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LaplaceDistribution" element
     */
    public void setLaplaceDistribution(org.uncertml.x20.LaplaceDistributionDocument.LaplaceDistribution laplaceDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.LaplaceDistributionDocument.LaplaceDistribution target = null;
            target = (org.uncertml.x20.LaplaceDistributionDocument.LaplaceDistribution)get_store().find_element_user(LAPLACEDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.LaplaceDistributionDocument.LaplaceDistribution)get_store().add_element_user(LAPLACEDISTRIBUTION$0);
            }
            target.set(laplaceDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "LaplaceDistribution" element
     */
    public org.uncertml.x20.LaplaceDistributionDocument.LaplaceDistribution addNewLaplaceDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.LaplaceDistributionDocument.LaplaceDistribution target = null;
            target = (org.uncertml.x20.LaplaceDistributionDocument.LaplaceDistribution)get_store().add_element_user(LAPLACEDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML LaplaceDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class LaplaceDistributionImpl extends org.uncertml.x20.impl.LaplaceDistributionTypeImpl implements org.uncertml.x20.LaplaceDistributionDocument.LaplaceDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public LaplaceDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
