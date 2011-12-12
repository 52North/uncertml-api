/*
 * XML Type:  LogNormalDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.LogNormalDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML LogNormalDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class LogNormalDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.LogNormalDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public LogNormalDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOGSCALE$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "logScale");
    private static final javax.xml.namespace.QName SHAPE$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "shape");
    
    
    /**
     * Gets the "logScale" element
     */
    public org.uncertml.x20.ContinuousValuesType getLogScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(LOGSCALE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "logScale" element
     */
    public void setLogScale(org.uncertml.x20.ContinuousValuesType logScale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(LOGSCALE$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(LOGSCALE$0);
            }
            target.set(logScale);
        }
    }
    
    /**
     * Appends and returns a new empty "logScale" element
     */
    public org.uncertml.x20.ContinuousValuesType addNewLogScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(LOGSCALE$0);
            return target;
        }
    }
    
    /**
     * Gets the "shape" element
     */
    public org.uncertml.x20.PositiveRealValuesType getShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(SHAPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "shape" element
     */
    public void setShape(org.uncertml.x20.PositiveRealValuesType shape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(SHAPE$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(SHAPE$2);
            }
            target.set(shape);
        }
    }
    
    /**
     * Appends and returns a new empty "shape" element
     */
    public org.uncertml.x20.PositiveRealValuesType addNewShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(SHAPE$2);
            return target;
        }
    }
}
