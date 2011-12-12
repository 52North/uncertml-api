/*
 * An XML document type.
 * Localname: WeibullDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.WeibullDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one WeibullDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class WeibullDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.WeibullDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public WeibullDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEIBULLDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "WeibullDistribution");
    
    
    /**
     * Gets the "WeibullDistribution" element
     */
    public org.uncertml.x20.WeibullDistributionDocument.WeibullDistribution getWeibullDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.WeibullDistributionDocument.WeibullDistribution target = null;
            target = (org.uncertml.x20.WeibullDistributionDocument.WeibullDistribution)get_store().find_element_user(WEIBULLDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WeibullDistribution" element
     */
    public void setWeibullDistribution(org.uncertml.x20.WeibullDistributionDocument.WeibullDistribution weibullDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.WeibullDistributionDocument.WeibullDistribution target = null;
            target = (org.uncertml.x20.WeibullDistributionDocument.WeibullDistribution)get_store().find_element_user(WEIBULLDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.WeibullDistributionDocument.WeibullDistribution)get_store().add_element_user(WEIBULLDISTRIBUTION$0);
            }
            target.set(weibullDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "WeibullDistribution" element
     */
    public org.uncertml.x20.WeibullDistributionDocument.WeibullDistribution addNewWeibullDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.WeibullDistributionDocument.WeibullDistribution target = null;
            target = (org.uncertml.x20.WeibullDistributionDocument.WeibullDistribution)get_store().add_element_user(WEIBULLDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML WeibullDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class WeibullDistributionImpl extends org.uncertml.x20.impl.WeibullDistributionTypeImpl implements org.uncertml.x20.WeibullDistributionDocument.WeibullDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public WeibullDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
