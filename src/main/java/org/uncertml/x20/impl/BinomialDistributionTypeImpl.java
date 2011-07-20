/*
 * XML Type:  BinomialDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.BinomialDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML BinomialDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class BinomialDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.BinomialDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public BinomialDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBEROFTRIALS$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "numberOfTrials");
    private static final javax.xml.namespace.QName PROBABILITYOFSUCCESS$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "probabilityOfSuccess");
    
    
    /**
     * Gets the "numberOfTrials" element
     */
    public org.uncertml.x20.NaturalNumbersType getNumberOfTrials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().find_element_user(NUMBEROFTRIALS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "numberOfTrials" element
     */
    public void setNumberOfTrials(org.uncertml.x20.NaturalNumbersType numberOfTrials)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().find_element_user(NUMBEROFTRIALS$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.NaturalNumbersType)get_store().add_element_user(NUMBEROFTRIALS$0);
            }
            target.set(numberOfTrials);
        }
    }
    
    /**
     * Appends and returns a new empty "numberOfTrials" element
     */
    public org.uncertml.x20.NaturalNumbersType addNewNumberOfTrials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().add_element_user(NUMBEROFTRIALS$0);
            return target;
        }
    }
    
    /**
     * Gets the "probabilityOfSuccess" element
     */
    public org.uncertml.x20.ProbabilityValuesType getProbabilityOfSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ProbabilityValuesType target = null;
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().find_element_user(PROBABILITYOFSUCCESS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "probabilityOfSuccess" element
     */
    public void setProbabilityOfSuccess(org.uncertml.x20.ProbabilityValuesType probabilityOfSuccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ProbabilityValuesType target = null;
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().find_element_user(PROBABILITYOFSUCCESS$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ProbabilityValuesType)get_store().add_element_user(PROBABILITYOFSUCCESS$2);
            }
            target.set(probabilityOfSuccess);
        }
    }
    
    /**
     * Appends and returns a new empty "probabilityOfSuccess" element
     */
    public org.uncertml.x20.ProbabilityValuesType addNewProbabilityOfSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ProbabilityValuesType target = null;
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().add_element_user(PROBABILITYOFSUCCESS$2);
            return target;
        }
    }
}
