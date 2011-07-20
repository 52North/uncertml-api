/*
 * An XML document type.
 * Localname: MultinomialDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.MultinomialDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one MultinomialDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class MultinomialDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.MultinomialDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultinomialDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTINOMIALDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "MultinomialDistribution");
    
    
    /**
     * Gets the "MultinomialDistribution" element
     */
    public org.uncertml.x20.MultinomialDistributionDocument.MultinomialDistribution getMultinomialDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MultinomialDistributionDocument.MultinomialDistribution target = null;
            target = (org.uncertml.x20.MultinomialDistributionDocument.MultinomialDistribution)get_store().find_element_user(MULTINOMIALDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultinomialDistribution" element
     */
    public void setMultinomialDistribution(org.uncertml.x20.MultinomialDistributionDocument.MultinomialDistribution multinomialDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MultinomialDistributionDocument.MultinomialDistribution target = null;
            target = (org.uncertml.x20.MultinomialDistributionDocument.MultinomialDistribution)get_store().find_element_user(MULTINOMIALDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.MultinomialDistributionDocument.MultinomialDistribution)get_store().add_element_user(MULTINOMIALDISTRIBUTION$0);
            }
            target.set(multinomialDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "MultinomialDistribution" element
     */
    public org.uncertml.x20.MultinomialDistributionDocument.MultinomialDistribution addNewMultinomialDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MultinomialDistributionDocument.MultinomialDistribution target = null;
            target = (org.uncertml.x20.MultinomialDistributionDocument.MultinomialDistribution)get_store().add_element_user(MULTINOMIALDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML MultinomialDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class MultinomialDistributionImpl extends org.uncertml.x20.impl.MultinomialDistributionTypeImpl implements org.uncertml.x20.MultinomialDistributionDocument.MultinomialDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public MultinomialDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
