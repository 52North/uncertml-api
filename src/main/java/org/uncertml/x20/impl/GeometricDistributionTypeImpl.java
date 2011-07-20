/*
 * XML Type:  GeometricDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.GeometricDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML GeometricDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class GeometricDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.GeometricDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public GeometricDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROBABILITY$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "probability");
    
    
    /**
     * Gets the "probability" element
     */
    public org.uncertml.x20.ProbabilityValuesType getProbability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ProbabilityValuesType target = null;
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().find_element_user(PROBABILITY$0, 0);
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
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().find_element_user(PROBABILITY$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ProbabilityValuesType)get_store().add_element_user(PROBABILITY$0);
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
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().add_element_user(PROBABILITY$0);
            return target;
        }
    }
}
