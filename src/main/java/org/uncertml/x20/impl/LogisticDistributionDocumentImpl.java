/*
 * An XML document type.
 * Localname: LogisticDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.LogisticDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one LogisticDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class LogisticDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.LogisticDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public LogisticDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOGISTICDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "LogisticDistribution");
    
    
    /**
     * Gets the "LogisticDistribution" element
     */
    public org.uncertml.x20.LogisticDistributionDocument.LogisticDistribution getLogisticDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.LogisticDistributionDocument.LogisticDistribution target = null;
            target = (org.uncertml.x20.LogisticDistributionDocument.LogisticDistribution)get_store().find_element_user(LOGISTICDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LogisticDistribution" element
     */
    public void setLogisticDistribution(org.uncertml.x20.LogisticDistributionDocument.LogisticDistribution logisticDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.LogisticDistributionDocument.LogisticDistribution target = null;
            target = (org.uncertml.x20.LogisticDistributionDocument.LogisticDistribution)get_store().find_element_user(LOGISTICDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.LogisticDistributionDocument.LogisticDistribution)get_store().add_element_user(LOGISTICDISTRIBUTION$0);
            }
            target.set(logisticDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "LogisticDistribution" element
     */
    public org.uncertml.x20.LogisticDistributionDocument.LogisticDistribution addNewLogisticDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.LogisticDistributionDocument.LogisticDistribution target = null;
            target = (org.uncertml.x20.LogisticDistributionDocument.LogisticDistribution)get_store().add_element_user(LOGISTICDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML LogisticDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class LogisticDistributionImpl extends org.uncertml.x20.impl.LogisticDistributionTypeImpl implements org.uncertml.x20.LogisticDistributionDocument.LogisticDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public LogisticDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
