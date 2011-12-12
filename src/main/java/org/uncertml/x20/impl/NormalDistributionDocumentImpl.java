/*
 * An XML document type.
 * Localname: NormalDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.NormalDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one NormalDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class NormalDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.NormalDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public NormalDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NORMALDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "NormalDistribution");
    
    
    /**
     * Gets the "NormalDistribution" element
     */
    public org.uncertml.x20.NormalDistributionDocument.NormalDistribution getNormalDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NormalDistributionDocument.NormalDistribution target = null;
            target = (org.uncertml.x20.NormalDistributionDocument.NormalDistribution)get_store().find_element_user(NORMALDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NormalDistribution" element
     */
    public void setNormalDistribution(org.uncertml.x20.NormalDistributionDocument.NormalDistribution normalDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NormalDistributionDocument.NormalDistribution target = null;
            target = (org.uncertml.x20.NormalDistributionDocument.NormalDistribution)get_store().find_element_user(NORMALDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.NormalDistributionDocument.NormalDistribution)get_store().add_element_user(NORMALDISTRIBUTION$0);
            }
            target.set(normalDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "NormalDistribution" element
     */
    public org.uncertml.x20.NormalDistributionDocument.NormalDistribution addNewNormalDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NormalDistributionDocument.NormalDistribution target = null;
            target = (org.uncertml.x20.NormalDistributionDocument.NormalDistribution)get_store().add_element_user(NORMALDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML NormalDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class NormalDistributionImpl extends org.uncertml.x20.impl.NormalDistributionTypeImpl implements org.uncertml.x20.NormalDistributionDocument.NormalDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public NormalDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
