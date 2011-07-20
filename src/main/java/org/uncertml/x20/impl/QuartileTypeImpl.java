/*
 * XML Type:  QuartileType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.QuartileType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML QuartileType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class QuartileTypeImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticTypeImpl implements org.uncertml.x20.QuartileType
{
    private static final long serialVersionUID = 1L;
    
    public QuartileTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUES$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "values");
    private static final javax.xml.namespace.QName LEVEL$2 = 
        new javax.xml.namespace.QName("", "level");
    
    
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
     * Gets the "level" attribute
     */
    public double getLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$2);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "level" attribute
     */
    public org.uncertml.x20.QuartileType.Level xgetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.QuartileType.Level target = null;
            target = (org.uncertml.x20.QuartileType.Level)get_store().find_attribute_user(LEVEL$2);
            return target;
        }
    }
    
    /**
     * Sets the "level" attribute
     */
    public void setLevel(double level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVEL$2);
            }
            target.setDoubleValue(level);
        }
    }
    
    /**
     * Sets (as xml) the "level" attribute
     */
    public void xsetLevel(org.uncertml.x20.QuartileType.Level level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.QuartileType.Level target = null;
            target = (org.uncertml.x20.QuartileType.Level)get_store().find_attribute_user(LEVEL$2);
            if (target == null)
            {
                target = (org.uncertml.x20.QuartileType.Level)get_store().add_attribute_user(LEVEL$2);
            }
            target.set(level);
        }
    }
    /**
     * An XML level(@).
     *
     * This is an atomic type that is a restriction of org.uncertml.x20.QuartileType$Level.
     */
    public static class LevelImpl extends org.apache.xmlbeans.impl.values.JavaDoubleHolderEx implements org.uncertml.x20.QuartileType.Level
    {
        private static final long serialVersionUID = 1L;
        
        public LevelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected LevelImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
