/*
 * An XML document type.
 * Localname: LogNormalDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.LogNormalDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one LogNormalDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class LogNormalDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.LogNormalDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public LogNormalDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOGNORMALDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "LogNormalDistribution");
    
    
    /**
     * Gets the "LogNormalDistribution" element
     */
    public org.uncertml.x20.LogNormalDistributionDocument.LogNormalDistribution getLogNormalDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.LogNormalDistributionDocument.LogNormalDistribution target = null;
            target = (org.uncertml.x20.LogNormalDistributionDocument.LogNormalDistribution)get_store().find_element_user(LOGNORMALDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LogNormalDistribution" element
     */
    public void setLogNormalDistribution(org.uncertml.x20.LogNormalDistributionDocument.LogNormalDistribution logNormalDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.LogNormalDistributionDocument.LogNormalDistribution target = null;
            target = (org.uncertml.x20.LogNormalDistributionDocument.LogNormalDistribution)get_store().find_element_user(LOGNORMALDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.LogNormalDistributionDocument.LogNormalDistribution)get_store().add_element_user(LOGNORMALDISTRIBUTION$0);
            }
            target.set(logNormalDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "LogNormalDistribution" element
     */
    public org.uncertml.x20.LogNormalDistributionDocument.LogNormalDistribution addNewLogNormalDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.LogNormalDistributionDocument.LogNormalDistribution target = null;
            target = (org.uncertml.x20.LogNormalDistributionDocument.LogNormalDistribution)get_store().add_element_user(LOGNORMALDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML LogNormalDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class LogNormalDistributionImpl extends org.uncertml.x20.impl.LogNormalDistributionTypeImpl implements org.uncertml.x20.LogNormalDistributionDocument.LogNormalDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public LogNormalDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
