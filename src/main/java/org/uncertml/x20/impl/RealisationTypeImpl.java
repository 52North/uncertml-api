/*
 * XML Type:  RealisationType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.RealisationType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML RealisationType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class RealisationTypeImpl extends org.uncertml.x20.impl.AbstractUncertaintyTypeImpl implements org.uncertml.x20.RealisationType
{
    private static final long serialVersionUID = 1L;
    
    public RealisationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEIGHT$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "weight");
    private static final javax.xml.namespace.QName VALUES$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "values");
    private static final javax.xml.namespace.QName CATEGORIES$4 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "categories");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "weight" element
     */
    public double getWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEIGHT$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "weight" element
     */
    public org.apache.xmlbeans.XmlDouble xgetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(WEIGHT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "weight" element
     */
    public boolean isSetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEIGHT$0) != 0;
        }
    }
    
    /**
     * Sets the "weight" element
     */
    public void setWeight(double weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEIGHT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEIGHT$0);
            }
            target.setDoubleValue(weight);
        }
    }
    
    /**
     * Sets (as xml) the "weight" element
     */
    public void xsetWeight(org.apache.xmlbeans.XmlDouble weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(WEIGHT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(WEIGHT$0);
            }
            target.set(weight);
        }
    }
    
    /**
     * Unsets the "weight" element
     */
    public void unsetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEIGHT$0, 0);
        }
    }
    
    /**
     * Gets the "values" element
     */
    public org.uncertml.x20.ContinuousValuesType getValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(VALUES$2, 0);
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
            return get_store().count_elements(VALUES$2) != 0;
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
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(VALUES$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(VALUES$2);
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
            target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(VALUES$2);
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
            get_store().remove_element(VALUES$2, 0);
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
            target = (org.uncertml.x20.CategoricalValuesType)get_store().find_element_user(CATEGORIES$4, 0);
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
            return get_store().count_elements(CATEGORIES$4) != 0;
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
            target = (org.uncertml.x20.CategoricalValuesType)get_store().find_element_user(CATEGORIES$4, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.CategoricalValuesType)get_store().add_element_user(CATEGORIES$4);
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
            target = (org.uncertml.x20.CategoricalValuesType)get_store().add_element_user(CATEGORIES$4);
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
            get_store().remove_element(CATEGORIES$4, 0);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$6) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$6);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$6);
        }
    }
}
