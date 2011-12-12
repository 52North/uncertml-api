/*
 * XML Type:  BernoulliDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.BernoulliDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML BernoulliDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class BernoulliDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.BernoulliDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public BernoulliDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROBABILITIES$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "probabilities");
    
    
    /**
     * Gets the "probabilities" element
     */
    public org.uncertml.x20.ProbabilityValuesType getProbabilities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ProbabilityValuesType target = null;
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().find_element_user(PROBABILITIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "probabilities" element
     */
    public void setProbabilities(org.uncertml.x20.ProbabilityValuesType probabilities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ProbabilityValuesType target = null;
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().find_element_user(PROBABILITIES$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ProbabilityValuesType)get_store().add_element_user(PROBABILITIES$0);
            }
            target.set(probabilities);
        }
    }
    
    /**
     * Appends and returns a new empty "probabilities" element
     */
    public org.uncertml.x20.ProbabilityValuesType addNewProbabilities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ProbabilityValuesType target = null;
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().add_element_user(PROBABILITIES$0);
            return target;
        }
    }
}
