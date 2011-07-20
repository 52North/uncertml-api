/*
 * XML Type:  ModeType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.ModeType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML ModeType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class ModeTypeImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticTypeImpl implements org.uncertml.x20.ModeType
{
    private static final long serialVersionUID = 1L;
    
    public ModeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUES$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "values");
    private static final javax.xml.namespace.QName CATEGORIES$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "categories");
    
    
    /**
     * Gets the "values" element
     */
    public org.uncertml.x20.ContinuousValuesType getValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(VALUES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "values" element
     */
    public boolean isSetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUES$0) != 0;
        }
    }
    
    /**
     * Sets the "values" element
     */
    public void setValues(org.uncertml.x20.ContinuousValuesType values)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(VALUES$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(VALUES$0);
            }
            target.set(values);
        }
    }
    
    /**
     * Appends and returns a new empty "values" element
     */
    public org.uncertml.x20.ContinuousValuesType addNewValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(VALUES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "values" element
     */
    public void unsetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUES$0, 0);
        }
    }
    
    /**
     * Gets the "categories" element
     */
    public org.uncertml.x20.CategoricalValuesType getCategories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CategoricalValuesType target = null;
            target = (org.uncertml.x20.CategoricalValuesType)get_store().find_element_user(CATEGORIES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "categories" element
     */
    public boolean isSetCategories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORIES$2) != 0;
        }
    }
    
    /**
     * Sets the "categories" element
     */
    public void setCategories(org.uncertml.x20.CategoricalValuesType categories)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CategoricalValuesType target = null;
            target = (org.uncertml.x20.CategoricalValuesType)get_store().find_element_user(CATEGORIES$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.CategoricalValuesType)get_store().add_element_user(CATEGORIES$2);
            }
            target.set(categories);
        }
    }
    
    /**
     * Appends and returns a new empty "categories" element
     */
    public org.uncertml.x20.CategoricalValuesType addNewCategories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CategoricalValuesType target = null;
            target = (org.uncertml.x20.CategoricalValuesType)get_store().add_element_user(CATEGORIES$2);
            return target;
        }
    }
    
    /**
     * Unsets the "categories" element
     */
    public void unsetCategories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORIES$2, 0);
        }
    }
}
