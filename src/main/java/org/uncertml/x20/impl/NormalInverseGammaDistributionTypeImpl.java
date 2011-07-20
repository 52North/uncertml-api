/*
 * XML Type:  NormalInverseGammaDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.NormalInverseGammaDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML NormalInverseGammaDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class NormalInverseGammaDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.NormalInverseGammaDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public NormalInverseGammaDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEAN$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "mean");
    private static final javax.xml.namespace.QName VARIANCESCALING$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "varianceScaling");
    private static final javax.xml.namespace.QName SHAPE$4 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "shape");
    private static final javax.xml.namespace.QName SCALE$6 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "scale");
    
    
    /**
     * Gets the "mean" element
     */
    public org.uncertml.x20.ContinuousValuesType getMean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(MEAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mean" element
     */
    public void setMean(org.uncertml.x20.ContinuousValuesType mean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().find_element_user(MEAN$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(MEAN$0);
            }
            target.set(mean);
        }
    }
    
    /**
     * Appends and returns a new empty "mean" element
     */
    public org.uncertml.x20.ContinuousValuesType addNewMean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ContinuousValuesType target = null;
            target = (org.uncertml.x20.ContinuousValuesType)get_store().add_element_user(MEAN$0);
            return target;
        }
    }
    
    /**
     * Gets the "varianceScaling" element
     */
    public org.uncertml.x20.PositiveRealValuesType getVarianceScaling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(VARIANCESCALING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "varianceScaling" element
     */
    public void setVarianceScaling(org.uncertml.x20.PositiveRealValuesType varianceScaling)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(VARIANCESCALING$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(VARIANCESCALING$2);
            }
            target.set(varianceScaling);
        }
    }
    
    /**
     * Appends and returns a new empty "varianceScaling" element
     */
    public org.uncertml.x20.PositiveRealValuesType addNewVarianceScaling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(VARIANCESCALING$2);
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
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(SHAPE$4, 0);
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
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(SHAPE$4, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(SHAPE$4);
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
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(SHAPE$4);
            return target;
        }
    }
    
    /**
     * Gets the "scale" element
     */
    public org.uncertml.x20.PositiveRealValuesType getScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(SCALE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "scale" element
     */
    public void setScale(org.uncertml.x20.PositiveRealValuesType scale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().find_element_user(SCALE$6, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(SCALE$6);
            }
            target.set(scale);
        }
    }
    
    /**
     * Appends and returns a new empty "scale" element
     */
    public org.uncertml.x20.PositiveRealValuesType addNewScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealValuesType target = null;
            target = (org.uncertml.x20.PositiveRealValuesType)get_store().add_element_user(SCALE$6);
            return target;
        }
    }
}
