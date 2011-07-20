/*
 * An XML document type.
 * Localname: AbstractDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.AbstractDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one AbstractDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class AbstractDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractUncertaintyDocumentImpl implements org.uncertml.x20.AbstractDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "LaplaceDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "MixtureModel"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "PoissonDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "LogNormalDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "InverseGammaDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "CauchyDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "GammaDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "WishartDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "NormalInverseGammaDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "GeometricDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "ParetoDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "AbstractDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "NormalDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "ExponentialDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "MultinomialDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "FDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "BinomialDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "LogisticDistribution"),
    });
    
    
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
}
