/*
 * XML Type:  MultinomialDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.MultinomialDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML MultinomialDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class MultinomialDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.MultinomialDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public MultinomialDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBEROFTRIALS$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "numberOfTrials");
    private static final javax.xml.namespace.QName PROBABILITIES$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "probabilities");
    
    
    /**
     * Gets the "numberOfTrials" element
     */
    public java.math.BigInteger getNumberOfTrials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFTRIALS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "numberOfTrials" element
     */
    public org.uncertml.x20.PositiveNaturalNumber xgetNumberOfTrials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveNaturalNumber target = null;
            target = (org.uncertml.x20.PositiveNaturalNumber)get_store().find_element_user(NUMBEROFTRIALS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "numberOfTrials" element
     */
    public void setNumberOfTrials(java.math.BigInteger numberOfTrials)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFTRIALS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFTRIALS$0);
            }
            target.setBigIntegerValue(numberOfTrials);
        }
    }
    
    /**
     * Sets (as xml) the "numberOfTrials" element
     */
    public void xsetNumberOfTrials(org.uncertml.x20.PositiveNaturalNumber numberOfTrials)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveNaturalNumber target = null;
            target = (org.uncertml.x20.PositiveNaturalNumber)get_store().find_element_user(NUMBEROFTRIALS$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveNaturalNumber)get_store().add_element_user(NUMBEROFTRIALS$0);
            }
            target.set(numberOfTrials);
        }
    }
    
    /**
     * Gets the "probabilities" element
     */
    public org.uncertml.x20.ProbabilityValuesType getProbabilities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ProbabilityValuesType target = null;
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().find_element_user(PROBABILITIES$2, 0);
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
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().find_element_user(PROBABILITIES$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ProbabilityValuesType)get_store().add_element_user(PROBABILITIES$2);
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
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().add_element_user(PROBABILITIES$2);
            return target;
        }
    }
}
