/*
 * XML Type:  NegativeBinomialDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.NegativeBinomialDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML NegativeBinomialDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class NegativeBinomialDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.NegativeBinomialDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public NegativeBinomialDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBEROFFAILURES$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "numberOfFailures");
    private static final javax.xml.namespace.QName PROBABILITY$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "probability");
    
    
    /**
     * Gets the "numberOfFailures" element
     */
    public org.uncertml.x20.NaturalNumbersType getNumberOfFailures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().find_element_user(NUMBEROFFAILURES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "numberOfFailures" element
     */
    public void setNumberOfFailures(org.uncertml.x20.NaturalNumbersType numberOfFailures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().find_element_user(NUMBEROFFAILURES$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.NaturalNumbersType)get_store().add_element_user(NUMBEROFFAILURES$0);
            }
            target.set(numberOfFailures);
        }
    }
    
    /**
     * Appends and returns a new empty "numberOfFailures" element
     */
    public org.uncertml.x20.NaturalNumbersType addNewNumberOfFailures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().add_element_user(NUMBEROFFAILURES$0);
            return target;
        }
    }
    
    /**
     * Gets the "probability" element
     */
    public org.uncertml.x20.ProbabilityValuesType getProbability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ProbabilityValuesType target = null;
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().find_element_user(PROBABILITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "probability" element
     */
    public void setProbability(org.uncertml.x20.ProbabilityValuesType probability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ProbabilityValuesType target = null;
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().find_element_user(PROBABILITY$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ProbabilityValuesType)get_store().add_element_user(PROBABILITY$2);
            }
            target.set(probability);
        }
    }
    
    /**
     * Appends and returns a new empty "probability" element
     */
    public org.uncertml.x20.ProbabilityValuesType addNewProbability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ProbabilityValuesType target = null;
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().add_element_user(PROBABILITY$2);
            return target;
        }
    }
}
