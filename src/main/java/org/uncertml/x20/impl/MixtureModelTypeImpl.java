/*
 * XML Type:  MixtureModelType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.MixtureModelType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML MixtureModelType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class MixtureModelTypeImpl extends org.uncertml.x20.impl.AbstractDistributionTypeImpl implements org.uncertml.x20.MixtureModelType
{
    private static final long serialVersionUID = 1L;
    
    public MixtureModelTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENT$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "component");
    
    
    /**
     * Gets array of all "component" elements
     */
    public org.uncertml.x20.MixtureModelType.Component[] getComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPONENT$0, targetList);
            org.uncertml.x20.MixtureModelType.Component[] result = new org.uncertml.x20.MixtureModelType.Component[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "component" element
     */
    public org.uncertml.x20.MixtureModelType.Component getComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MixtureModelType.Component target = null;
            target = (org.uncertml.x20.MixtureModelType.Component)get_store().find_element_user(COMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "component" element
     */
    public int sizeOfComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENT$0);
        }
    }
    
    /**
     * Sets array of all "component" element
     */
    public void setComponentArray(org.uncertml.x20.MixtureModelType.Component[] componentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(componentArray, COMPONENT$0);
        }
    }
    
    /**
     * Sets ith "component" element
     */
    public void setComponentArray(int i, org.uncertml.x20.MixtureModelType.Component component)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MixtureModelType.Component target = null;
            target = (org.uncertml.x20.MixtureModelType.Component)get_store().find_element_user(COMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(component);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "component" element
     */
    public org.uncertml.x20.MixtureModelType.Component insertNewComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MixtureModelType.Component target = null;
            target = (org.uncertml.x20.MixtureModelType.Component)get_store().insert_element_user(COMPONENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "component" element
     */
    public org.uncertml.x20.MixtureModelType.Component addNewComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MixtureModelType.Component target = null;
            target = (org.uncertml.x20.MixtureModelType.Component)get_store().add_element_user(COMPONENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "component" element
     */
    public void removeComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENT$0, i);
        }
    }
    /**
     * An XML component(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class ComponentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uncertml.x20.MixtureModelType.Component
    {
        private static final long serialVersionUID = 1L;
        
        public ComponentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ABSTRACTDISTRIBUTION$0 = 
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "AbstractDistribution");
        private static final org.apache.xmlbeans.QNameSet ABSTRACTDISTRIBUTION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "WeibullDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "BetaDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "MultivariateStudentTDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "DirichletDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "BernoulliDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "HypergeometricDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "MultivariateNormalDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "UniformDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "ChiSquareDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "StudentTDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "NegativeBinomialDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "LogNormalDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "PoissonDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "LaplaceDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "MixtureModel"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "InverseGammaDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "WishartDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "GammaDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "CauchyDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "NormalInverseGammaDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "GeometricDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "ParetoDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "NormalDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "AbstractDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "ExponentialDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "MultinomialDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "FDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "BinomialDistribution"),
            new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "LogisticDistribution"),
        });
        private static final javax.xml.namespace.QName WEIGHT$2 = 
            new javax.xml.namespace.QName("", "weight");
        
        
        /**
         * Gets the "AbstractDistribution" element
         */
        public org.uncertml.x20.AbstractDistributionType getAbstractDistribution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uncertml.x20.AbstractDistributionType target = null;
                target = (org.uncertml.x20.AbstractDistributionType)get_store().find_element_user(ABSTRACTDISTRIBUTION$1, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "AbstractDistribution" element
         */
        public void setAbstractDistribution(org.uncertml.x20.AbstractDistributionType abstractDistribution)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uncertml.x20.AbstractDistributionType target = null;
                target = (org.uncertml.x20.AbstractDistributionType)get_store().find_element_user(ABSTRACTDISTRIBUTION$1, 0);
                if (target == null)
                {
                    target = (org.uncertml.x20.AbstractDistributionType)get_store().add_element_user(ABSTRACTDISTRIBUTION$0);
                }
                target.set(abstractDistribution);
            }
        }
        
        /**
         * Appends and returns a new empty "AbstractDistribution" element
         */
        public org.uncertml.x20.AbstractDistributionType addNewAbstractDistribution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uncertml.x20.AbstractDistributionType target = null;
                target = (org.uncertml.x20.AbstractDistributionType)get_store().add_element_user(ABSTRACTDISTRIBUTION$0);
                return target;
            }
        }
        
        /**
         * Gets the "weight" attribute
         */
        public double getWeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEIGHT$2);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "weight" attribute
         */
        public org.uncertml.x20.Probability xgetWeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uncertml.x20.Probability target = null;
                target = (org.uncertml.x20.Probability)get_store().find_attribute_user(WEIGHT$2);
                return target;
            }
        }
        
        /**
         * Sets the "weight" attribute
         */
        public void setWeight(double weight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEIGHT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WEIGHT$2);
                }
                target.setDoubleValue(weight);
            }
        }
        
        /**
         * Sets (as xml) the "weight" attribute
         */
        public void xsetWeight(org.uncertml.x20.Probability weight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uncertml.x20.Probability target = null;
                target = (org.uncertml.x20.Probability)get_store().find_attribute_user(WEIGHT$2);
                if (target == null)
                {
                    target = (org.uncertml.x20.Probability)get_store().add_attribute_user(WEIGHT$2);
                }
                target.set(weight);
            }
        }
    }
}
