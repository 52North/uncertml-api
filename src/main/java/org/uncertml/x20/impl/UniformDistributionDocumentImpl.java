/*
 * An XML document type.
 * Localname: UniformDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.UniformDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one UniformDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class UniformDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.UniformDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public UniformDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNIFORMDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "UniformDistribution");
    
    
    /**
     * Gets the "UniformDistribution" element
     */
    public org.uncertml.x20.UniformDistributionDocument.UniformDistribution getUniformDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.UniformDistributionDocument.UniformDistribution target = null;
            target = (org.uncertml.x20.UniformDistributionDocument.UniformDistribution)get_store().find_element_user(UNIFORMDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UniformDistribution" element
     */
    public void setUniformDistribution(org.uncertml.x20.UniformDistributionDocument.UniformDistribution uniformDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.UniformDistributionDocument.UniformDistribution target = null;
            target = (org.uncertml.x20.UniformDistributionDocument.UniformDistribution)get_store().find_element_user(UNIFORMDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.UniformDistributionDocument.UniformDistribution)get_store().add_element_user(UNIFORMDISTRIBUTION$0);
            }
            target.set(uniformDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "UniformDistribution" element
     */
    public org.uncertml.x20.UniformDistributionDocument.UniformDistribution addNewUniformDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.UniformDistributionDocument.UniformDistribution target = null;
            target = (org.uncertml.x20.UniformDistributionDocument.UniformDistribution)get_store().add_element_user(UNIFORMDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML UniformDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class UniformDistributionImpl extends org.uncertml.x20.impl.UniformDistributionTypeImpl implements org.uncertml.x20.UniformDistributionDocument.UniformDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public UniformDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
