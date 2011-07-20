/*
 * An XML document type.
 * Localname: Probability
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.ProbabilityDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one Probability(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class ProbabilityDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.ProbabilityDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProbabilityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROBABILITY$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Probability");
    
    
    /**
     * Gets the "Probability" element
     */
    public org.uncertml.x20.ProbabilityDocument.Probability getProbability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ProbabilityDocument.Probability target = null;
            target = (org.uncertml.x20.ProbabilityDocument.Probability)get_store().find_element_user(PROBABILITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Probability" element
     */
    public void setProbability(org.uncertml.x20.ProbabilityDocument.Probability probability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ProbabilityDocument.Probability target = null;
            target = (org.uncertml.x20.ProbabilityDocument.Probability)get_store().find_element_user(PROBABILITY$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ProbabilityDocument.Probability)get_store().add_element_user(PROBABILITY$0);
            }
            target.set(probability);
        }
    }
    
    /**
     * Appends and returns a new empty "Probability" element
     */
    public org.uncertml.x20.ProbabilityDocument.Probability addNewProbability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ProbabilityDocument.Probability target = null;
            target = (org.uncertml.x20.ProbabilityDocument.Probability)get_store().add_element_user(PROBABILITY$0);
            return target;
        }
    }
    /**
     * An XML Probability(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class ProbabilityImpl extends org.uncertml.x20.impl.ProbabilityTypeImpl implements org.uncertml.x20.ProbabilityDocument.Probability
    {
        private static final long serialVersionUID = 1L;
        
        public ProbabilityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
