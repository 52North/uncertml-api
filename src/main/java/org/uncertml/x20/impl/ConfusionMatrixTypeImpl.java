/*
 * XML Type:  ConfusionMatrixType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.ConfusionMatrixType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML ConfusionMatrixType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class ConfusionMatrixTypeImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticTypeImpl implements org.uncertml.x20.ConfusionMatrixType
{
    private static final long serialVersionUID = 1L;
    
    public ConfusionMatrixTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCECATEGORIES$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "sourceCategories");
    private static final javax.xml.namespace.QName TARGETCATEGORIES$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "targetCategories");
    private static final javax.xml.namespace.QName COUNTS$4 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "counts");
    
    
    /**
     * Gets the "sourceCategories" element
     */
    public org.uncertml.x20.CategoricalValuesType getSourceCategories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CategoricalValuesType target = null;
            target = (org.uncertml.x20.CategoricalValuesType)get_store().find_element_user(SOURCECATEGORIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sourceCategories" element
     */
    public void setSourceCategories(org.uncertml.x20.CategoricalValuesType sourceCategories)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CategoricalValuesType target = null;
            target = (org.uncertml.x20.CategoricalValuesType)get_store().find_element_user(SOURCECATEGORIES$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.CategoricalValuesType)get_store().add_element_user(SOURCECATEGORIES$0);
            }
            target.set(sourceCategories);
        }
    }
    
    /**
     * Appends and returns a new empty "sourceCategories" element
     */
    public org.uncertml.x20.CategoricalValuesType addNewSourceCategories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CategoricalValuesType target = null;
            target = (org.uncertml.x20.CategoricalValuesType)get_store().add_element_user(SOURCECATEGORIES$0);
            return target;
        }
    }
    
    /**
     * Gets the "targetCategories" element
     */
    public org.uncertml.x20.CategoricalValuesType getTargetCategories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CategoricalValuesType target = null;
            target = (org.uncertml.x20.CategoricalValuesType)get_store().find_element_user(TARGETCATEGORIES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "targetCategories" element
     */
    public void setTargetCategories(org.uncertml.x20.CategoricalValuesType targetCategories)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CategoricalValuesType target = null;
            target = (org.uncertml.x20.CategoricalValuesType)get_store().find_element_user(TARGETCATEGORIES$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.CategoricalValuesType)get_store().add_element_user(TARGETCATEGORIES$2);
            }
            target.set(targetCategories);
        }
    }
    
    /**
     * Appends and returns a new empty "targetCategories" element
     */
    public org.uncertml.x20.CategoricalValuesType addNewTargetCategories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CategoricalValuesType target = null;
            target = (org.uncertml.x20.CategoricalValuesType)get_store().add_element_user(TARGETCATEGORIES$2);
            return target;
        }
    }
    
    /**
     * Gets the "counts" element
     */
    public org.uncertml.x20.PositiveNaturalNumbersType getCounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveNaturalNumbersType target = null;
            target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().find_element_user(COUNTS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "counts" element
     */
    public void setCounts(org.uncertml.x20.PositiveNaturalNumbersType counts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveNaturalNumbersType target = null;
            target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().find_element_user(COUNTS$4, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().add_element_user(COUNTS$4);
            }
            target.set(counts);
        }
    }
    
    /**
     * Appends and returns a new empty "counts" element
     */
    public org.uncertml.x20.PositiveNaturalNumbersType addNewCounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.PositiveNaturalNumbersType target = null;
            target = (org.uncertml.x20.PositiveNaturalNumbersType)get_store().add_element_user(COUNTS$4);
            return target;
        }
    }
}
