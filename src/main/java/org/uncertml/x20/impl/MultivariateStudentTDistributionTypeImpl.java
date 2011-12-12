/*
 * XML Type:  MultivariateStudentTDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.MultivariateStudentTDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML MultivariateStudentTDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class MultivariateStudentTDistributionTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.MultivariateStudentTDistributionType
{
    private static final long serialVersionUID = 1L;
    
    public MultivariateStudentTDistributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEAN$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "mean");
    private static final javax.xml.namespace.QName COVARIANCEMATRIX$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "covarianceMatrix");
    private static final javax.xml.namespace.QName DEGREESOFFREEDOM$4 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "degreesOfFreedom");
    
    
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
     * Gets the "covarianceMatrix" element
     */
    public org.uncertml.x20.CovarianceMatrixType getCovarianceMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CovarianceMatrixType target = null;
            target = (org.uncertml.x20.CovarianceMatrixType)get_store().find_element_user(COVARIANCEMATRIX$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "covarianceMatrix" element
     */
    public void setCovarianceMatrix(org.uncertml.x20.CovarianceMatrixType covarianceMatrix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CovarianceMatrixType target = null;
            target = (org.uncertml.x20.CovarianceMatrixType)get_store().find_element_user(COVARIANCEMATRIX$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.CovarianceMatrixType)get_store().add_element_user(COVARIANCEMATRIX$2);
            }
            target.set(covarianceMatrix);
        }
    }
    
    /**
     * Appends and returns a new empty "covarianceMatrix" element
     */
    public org.uncertml.x20.CovarianceMatrixType addNewCovarianceMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CovarianceMatrixType target = null;
            target = (org.uncertml.x20.CovarianceMatrixType)get_store().add_element_user(COVARIANCEMATRIX$2);
            return target;
        }
    }
    
    /**
     * Gets the "degreesOfFreedom" element
     */
    public org.uncertml.x20.PositiveNaturalNumbersType getDegreesOfFreedom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveNaturalNumbersType target = null;
            target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().find_element_user(DEGREESOFFREEDOM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "degreesOfFreedom" element
     */
    public void setDegreesOfFreedom(org.uncertml.x20.PositiveNaturalNumbersType degreesOfFreedom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveNaturalNumbersType target = null;
            target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().find_element_user(DEGREESOFFREEDOM$4, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().add_element_user(DEGREESOFFREEDOM$4);
            }
            target.set(degreesOfFreedom);
        }
    }
    
    /**
     * Appends and returns a new empty "degreesOfFreedom" element
     */
    public org.uncertml.x20.PositiveNaturalNumbersType addNewDegreesOfFreedom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveNaturalNumbersType target = null;
            target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().add_element_user(DEGREESOFFREEDOM$4);
            return target;
        }
    }
}
