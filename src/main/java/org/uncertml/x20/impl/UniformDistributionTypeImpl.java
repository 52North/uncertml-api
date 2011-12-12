/*
 * XML Type:  UniformDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.UniformDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML UniformDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class UniformDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.UniformDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public UniformDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINIMUM$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "minimum");
    private static final javax.xml.namespace.QName MAXIMUM$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "maximum");
    private static final javax.xml.namespace.QName NUMBEROFCLASSES$4 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "numberOfClasses");
    
    
    /**
     * Gets the "minimum" element
     */
    public org.uncertml.x20.ContinuousValuesType getMinimum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(MINIMUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "minimum" element
     */
    public boolean isSetMinimum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINIMUM$0) != 0;
        }
    }
    
    /**
     * Sets the "minimum" element
     */
    public void setMinimum(org.uncertml.x20.ContinuousValuesType minimum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(MINIMUM$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(MINIMUM$0);
            }
            target.set(minimum);
        }
    }
    
    /**
     * Appends and returns a new empty "minimum" element
     */
    public org.uncertml.x20.ContinuousValuesType addNewMinimum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(MINIMUM$0);
            return target;
        }
    }
    
    /**
     * Unsets the "minimum" element
     */
    public void unsetMinimum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINIMUM$0, 0);
        }
    }
    
    /**
     * Gets the "maximum" element
     */
    public org.uncertml.x20.ContinuousValuesType getMaximum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(MAXIMUM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "maximum" element
     */
    public boolean isSetMaximum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXIMUM$2) != 0;
        }
    }
    
    /**
     * Sets the "maximum" element
     */
    public void setMaximum(org.uncertml.x20.ContinuousValuesType maximum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(MAXIMUM$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(MAXIMUM$2);
            }
            target.set(maximum);
        }
    }
    
    /**
     * Appends and returns a new empty "maximum" element
     */
    public org.uncertml.x20.ContinuousValuesType addNewMaximum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(MAXIMUM$2);
            return target;
        }
    }
    
    /**
     * Unsets the "maximum" element
     */
    public void unsetMaximum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXIMUM$2, 0);
        }
    }
    
    /**
     * Gets the "numberOfClasses" element
     */
    public org.uncertml.x20.PositiveNaturalNumbersType getNumberOfClasses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveNaturalNumbersType target = null;
            target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().find_element_user(NUMBEROFCLASSES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "numberOfClasses" element
     */
    public boolean isSetNumberOfClasses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFCLASSES$4) != 0;
        }
    }
    
    /**
     * Sets the "numberOfClasses" element
     */
    public void setNumberOfClasses(org.uncertml.x20.PositiveNaturalNumbersType numberOfClasses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveNaturalNumbersType target = null;
            target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().find_element_user(NUMBEROFCLASSES$4, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().add_element_user(NUMBEROFCLASSES$4);
            }
            target.set(numberOfClasses);
        }
    }
    
    /**
     * Appends and returns a new empty "numberOfClasses" element
     */
    public org.uncertml.x20.PositiveNaturalNumbersType addNewNumberOfClasses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveNaturalNumbersType target = null;
            target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().add_element_user(NUMBEROFCLASSES$4);
            return target;
        }
    }
    
    /**
     * Unsets the "numberOfClasses" element
     */
    public void unsetNumberOfClasses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFCLASSES$4, 0);
        }
    }
}
