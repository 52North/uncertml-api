/*
 * An XML document type.
 * Localname: MultivariateStudentTDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.MultivariateStudentTDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one MultivariateStudentTDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class MultivariateStudentTDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.MultivariateStudentTDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultivariateStudentTDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIVARIATESTUDENTTDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "MultivariateStudentTDistribution");
    
    
    /**
     * Gets the "MultivariateStudentTDistribution" element
     */
    public org.uncertml.x20.MultivariateStudentTDistributionDocument.MultivariateStudentTDistribution getMultivariateStudentTDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MultivariateStudentTDistributionDocument.MultivariateStudentTDistribution target = null;
            target = (org.uncertml.x20.MultivariateStudentTDistributionDocument.MultivariateStudentTDistribution)get_store().find_element_user(MULTIVARIATESTUDENTTDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultivariateStudentTDistribution" element
     */
    public void setMultivariateStudentTDistribution(org.uncertml.x20.MultivariateStudentTDistributionDocument.MultivariateStudentTDistribution multivariateStudentTDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MultivariateStudentTDistributionDocument.MultivariateStudentTDistribution target = null;
            target = (org.uncertml.x20.MultivariateStudentTDistributionDocument.MultivariateStudentTDistribution)get_store().find_element_user(MULTIVARIATESTUDENTTDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.MultivariateStudentTDistributionDocument.MultivariateStudentTDistribution)get_store().add_element_user(MULTIVARIATESTUDENTTDISTRIBUTION$0);
            }
            target.set(multivariateStudentTDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "MultivariateStudentTDistribution" element
     */
    public org.uncertml.x20.MultivariateStudentTDistributionDocument.MultivariateStudentTDistribution addNewMultivariateStudentTDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MultivariateStudentTDistributionDocument.MultivariateStudentTDistribution target = null;
            target = (org.uncertml.x20.MultivariateStudentTDistributionDocument.MultivariateStudentTDistribution)get_store().add_element_user(MULTIVARIATESTUDENTTDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML MultivariateStudentTDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class MultivariateStudentTDistributionImpl extends org.uncertml.x20.impl.MultivariateStudentTDistributionTypeImpl implements org.uncertml.x20.MultivariateStudentTDistributionDocument.MultivariateStudentTDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public MultivariateStudentTDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
