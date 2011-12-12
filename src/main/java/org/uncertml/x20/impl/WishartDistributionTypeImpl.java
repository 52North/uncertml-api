/*
 * XML Type:  WishartDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.WishartDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML WishartDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class WishartDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.WishartDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public WishartDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEGREESOFFREEDOM$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "degreesOfFreedom");
    private static final javax.xml.namespace.QName SCALEMATRIX$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "scaleMatrix");
    
    
    /**
     * Gets the "degreesOfFreedom" element
     */
    public double getDegreesOfFreedom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEGREESOFFREEDOM$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "degreesOfFreedom" element
     */
    public org.uncertml.x20.PositiveRealNumber xgetDegreesOfFreedom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealNumber target = null;
            target = (org.uncertml.x20.PositiveRealNumber)get_store().find_element_user(DEGREESOFFREEDOM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "degreesOfFreedom" element
     */
    public void setDegreesOfFreedom(double degreesOfFreedom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEGREESOFFREEDOM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEGREESOFFREEDOM$0);
            }
            target.setDoubleValue(degreesOfFreedom);
        }
    }
    
    /**
     * Sets (as xml) the "degreesOfFreedom" element
     */
    public void xsetDegreesOfFreedom(org.uncertml.x20.PositiveRealNumber degreesOfFreedom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveRealNumber target = null;
            target = (org.uncertml.x20.PositiveRealNumber)get_store().find_element_user(DEGREESOFFREEDOM$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveRealNumber)get_store().add_element_user(DEGREESOFFREEDOM$0);
            }
            target.set(degreesOfFreedom);
        }
    }
    
    /**
     * Gets the "scaleMatrix" element
     */
    public org.uncertml.x20.CovarianceMatrixType getScaleMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CovarianceMatrixType target = null;
            target = (org.uncertml.x20.CovarianceMatrixType)get_store().find_element_user(SCALEMATRIX$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "scaleMatrix" element
     */
    public void setScaleMatrix(org.uncertml.x20.CovarianceMatrixType scaleMatrix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CovarianceMatrixType target = null;
            target = (org.uncertml.x20.CovarianceMatrixType)get_store().find_element_user(SCALEMATRIX$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.CovarianceMatrixType)get_store().add_element_user(SCALEMATRIX$2);
            }
            target.set(scaleMatrix);
        }
    }
    
    /**
     * Appends and returns a new empty "scaleMatrix" element
     */
    public org.uncertml.x20.CovarianceMatrixType addNewScaleMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CovarianceMatrixType target = null;
            target = (org.uncertml.x20.CovarianceMatrixType)get_store().add_element_user(SCALEMATRIX$2);
            return target;
        }
    }
}
