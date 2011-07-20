/*
 * An XML document type.
 * Localname: DirichletDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.DirichletDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one DirichletDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class DirichletDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.DirichletDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirichletDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRICHLETDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "DirichletDistribution");
    
    
    /**
     * Gets the "DirichletDistribution" element
     */
    public org.uncertml.x20.DirichletDistributionDocument.DirichletDistribution getDirichletDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.DirichletDistributionDocument.DirichletDistribution target = null;
            target = (org.uncertml.x20.DirichletDistributionDocument.DirichletDistribution)get_store().find_element_user(DIRICHLETDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DirichletDistribution" element
     */
    public void setDirichletDistribution(org.uncertml.x20.DirichletDistributionDocument.DirichletDistribution dirichletDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.DirichletDistributionDocument.DirichletDistribution target = null;
            target = (org.uncertml.x20.DirichletDistributionDocument.DirichletDistribution)get_store().find_element_user(DIRICHLETDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.DirichletDistributionDocument.DirichletDistribution)get_store().add_element_user(DIRICHLETDISTRIBUTION$0);
            }
            target.set(dirichletDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "DirichletDistribution" element
     */
    public org.uncertml.x20.DirichletDistributionDocument.DirichletDistribution addNewDirichletDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.DirichletDistributionDocument.DirichletDistribution target = null;
            target = (org.uncertml.x20.DirichletDistributionDocument.DirichletDistribution)get_store().add_element_user(DIRICHLETDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML DirichletDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class DirichletDistributionImpl extends org.uncertml.x20.impl.DirichletDistributionTypeImpl implements org.uncertml.x20.DirichletDistributionDocument.DirichletDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public DirichletDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
