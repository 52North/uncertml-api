/*
 * An XML document type.
 * Localname: StudentTDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.StudentTDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one StudentTDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class StudentTDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.StudentTDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public StudentTDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STUDENTTDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "StudentTDistribution");
    
    
    /**
     * Gets the "StudentTDistribution" element
     */
    public org.uncertml.x20.StudentTDistributionDocument.StudentTDistribution getStudentTDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.StudentTDistributionDocument.StudentTDistribution target = null;
            target = (org.uncertml.x20.StudentTDistributionDocument.StudentTDistribution)get_store().find_element_user(STUDENTTDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StudentTDistribution" element
     */
    public void setStudentTDistribution(org.uncertml.x20.StudentTDistributionDocument.StudentTDistribution studentTDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.StudentTDistributionDocument.StudentTDistribution target = null;
            target = (org.uncertml.x20.StudentTDistributionDocument.StudentTDistribution)get_store().find_element_user(STUDENTTDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.StudentTDistributionDocument.StudentTDistribution)get_store().add_element_user(STUDENTTDISTRIBUTION$0);
            }
            target.set(studentTDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "StudentTDistribution" element
     */
    public org.uncertml.x20.StudentTDistributionDocument.StudentTDistribution addNewStudentTDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.StudentTDistributionDocument.StudentTDistribution target = null;
            target = (org.uncertml.x20.StudentTDistributionDocument.StudentTDistribution)get_store().add_element_user(STUDENTTDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML StudentTDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class StudentTDistributionImpl extends org.uncertml.x20.impl.StudentTDistributionTypeImpl implements org.uncertml.x20.StudentTDistributionDocument.StudentTDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public StudentTDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
