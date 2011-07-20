/*
 * An XML document type.
 * Localname: BernoulliDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.BernoulliDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one BernoulliDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class BernoulliDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.BernoulliDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public BernoulliDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BERNOULLIDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "BernoulliDistribution");
    
    
    /**
     * Gets the "BernoulliDistribution" element
     */
    public org.uncertml.x20.BernoulliDistributionDocument.BernoulliDistribution getBernoulliDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.BernoulliDistributionDocument.BernoulliDistribution target = null;
            target = (org.uncertml.x20.BernoulliDistributionDocument.BernoulliDistribution)get_store().find_element_user(BERNOULLIDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BernoulliDistribution" element
     */
    public void setBernoulliDistribution(org.uncertml.x20.BernoulliDistributionDocument.BernoulliDistribution bernoulliDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.BernoulliDistributionDocument.BernoulliDistribution target = null;
            target = (org.uncertml.x20.BernoulliDistributionDocument.BernoulliDistribution)get_store().find_element_user(BERNOULLIDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.BernoulliDistributionDocument.BernoulliDistribution)get_store().add_element_user(BERNOULLIDISTRIBUTION$0);
            }
            target.set(bernoulliDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "BernoulliDistribution" element
     */
    public org.uncertml.x20.BernoulliDistributionDocument.BernoulliDistribution addNewBernoulliDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.BernoulliDistributionDocument.BernoulliDistribution target = null;
            target = (org.uncertml.x20.BernoulliDistributionDocument.BernoulliDistribution)get_store().add_element_user(BERNOULLIDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML BernoulliDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class BernoulliDistributionImpl extends org.uncertml.x20.impl.BernoulliDistributionTypeImpl implements org.uncertml.x20.BernoulliDistributionDocument.BernoulliDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public BernoulliDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
