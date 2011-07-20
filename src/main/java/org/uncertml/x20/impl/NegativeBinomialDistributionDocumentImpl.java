/*
 * An XML document type.
 * Localname: NegativeBinomialDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.NegativeBinomialDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one NegativeBinomialDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class NegativeBinomialDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.NegativeBinomialDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public NegativeBinomialDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NEGATIVEBINOMIALDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "NegativeBinomialDistribution");
    
    
    /**
     * Gets the "NegativeBinomialDistribution" element
     */
    public org.uncertml.x20.NegativeBinomialDistributionDocument.NegativeBinomialDistribution getNegativeBinomialDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NegativeBinomialDistributionDocument.NegativeBinomialDistribution target = null;
            target = (org.uncertml.x20.NegativeBinomialDistributionDocument.NegativeBinomialDistribution)get_store().find_element_user(NEGATIVEBINOMIALDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NegativeBinomialDistribution" element
     */
    public void setNegativeBinomialDistribution(org.uncertml.x20.NegativeBinomialDistributionDocument.NegativeBinomialDistribution negativeBinomialDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NegativeBinomialDistributionDocument.NegativeBinomialDistribution target = null;
            target = (org.uncertml.x20.NegativeBinomialDistributionDocument.NegativeBinomialDistribution)get_store().find_element_user(NEGATIVEBINOMIALDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.NegativeBinomialDistributionDocument.NegativeBinomialDistribution)get_store().add_element_user(NEGATIVEBINOMIALDISTRIBUTION$0);
            }
            target.set(negativeBinomialDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "NegativeBinomialDistribution" element
     */
    public org.uncertml.x20.NegativeBinomialDistributionDocument.NegativeBinomialDistribution addNewNegativeBinomialDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NegativeBinomialDistributionDocument.NegativeBinomialDistribution target = null;
            target = (org.uncertml.x20.NegativeBinomialDistributionDocument.NegativeBinomialDistribution)get_store().add_element_user(NEGATIVEBINOMIALDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML NegativeBinomialDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class NegativeBinomialDistributionImpl extends org.uncertml.x20.impl.NegativeBinomialDistributionTypeImpl implements org.uncertml.x20.NegativeBinomialDistributionDocument.NegativeBinomialDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public NegativeBinomialDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
