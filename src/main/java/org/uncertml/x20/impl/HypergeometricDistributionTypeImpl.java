/*
 * XML Type:  HypergeometricDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.HypergeometricDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML HypergeometricDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class HypergeometricDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.HypergeometricDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public HypergeometricDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBEROFSUCCESSES$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "numberOfSuccesses");
    private static final javax.xml.namespace.QName NUMBEROFTRIALS$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "numberOfTrials");
    private static final javax.xml.namespace.QName POPULATIONSIZE$4 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "populationSize");
    
    
    /**
     * Gets the "numberOfSuccesses" element
     */
    public org.uncertml.x20.NaturalNumbersType getNumberOfSuccesses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().find_element_user(NUMBEROFSUCCESSES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "numberOfSuccesses" element
     */
    public void setNumberOfSuccesses(org.uncertml.x20.NaturalNumbersType numberOfSuccesses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().find_element_user(NUMBEROFSUCCESSES$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.NaturalNumbersType)get_store().add_element_user(NUMBEROFSUCCESSES$0);
            }
            target.set(numberOfSuccesses);
        }
    }
    
    /**
     * Appends and returns a new empty "numberOfSuccesses" element
     */
    public org.uncertml.x20.NaturalNumbersType addNewNumberOfSuccesses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().add_element_user(NUMBEROFSUCCESSES$0);
            return target;
        }
    }
    
    /**
     * Gets the "numberOfTrials" element
     */
    public org.uncertml.x20.NaturalNumbersType getNumberOfTrials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().find_element_user(NUMBEROFTRIALS$2, 0);
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
            target = (org.uncertml.x20.NaturalNumbersType)get_store().find_element_user(NUMBEROFTRIALS$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.NaturalNumbersType)get_store().add_element_user(NUMBEROFTRIALS$2);
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
            target = (org.uncertml.x20.NaturalNumbersType)get_store().add_element_user(NUMBEROFTRIALS$2);
            return target;
        }
    }
    
    /**
     * Gets the "populationSize" element
     */
    public org.uncertml.x20.NaturalNumbersType getPopulationSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().find_element_user(POPULATIONSIZE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "populationSize" element
     */
    public void setPopulationSize(org.uncertml.x20.NaturalNumbersType populationSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().find_element_user(POPULATIONSIZE$4, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.NaturalNumbersType)get_store().add_element_user(POPULATIONSIZE$4);
            }
            target.set(populationSize);
        }
    }
    
    /**
     * Appends and returns a new empty "populationSize" element
     */
    public org.uncertml.x20.NaturalNumbersType addNewPopulationSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.NaturalNumbersType target = null;
            target = (org.uncertml.x20.NaturalNumbersType)get_store().add_element_user(POPULATIONSIZE$4);
            return target;
        }
    }
}
