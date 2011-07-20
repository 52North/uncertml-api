/*
 * An XML document type.
 * Localname: AbstractUncertainty
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.AbstractUncertaintyDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one AbstractUncertainty(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class AbstractUncertaintyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uncertml.x20.AbstractUncertaintyDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractUncertaintyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTUNCERTAINTY$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "AbstractUncertainty");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTUNCERTAINTY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "BetaDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Skewness"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Mode"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "ConfusionMatrix"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "BernoulliDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "SystematicSample"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "CredibleInterval"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "MultivariateNormalDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "UniformDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "DiscreteProbability"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Quantile"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Decile"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "ConfidenceInterval"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "LaplaceDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Correlation"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "WishartDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "NormalInverseGammaDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "AbstractSummaryStatistic"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Probability"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "ParetoDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "AbstractDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Realisation"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "ExponentialDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "MultinomialDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Kurtosis"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "FDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "BinomialDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "WeibullDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "CovarianceMatrix"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "MultivariateStudentTDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "DirichletDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Range"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "RandomSample"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "HypergeometricDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "AbstractUncertainty"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "ChiSquareDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "StudentTDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "StatisticsCollection"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Mean"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "NegativeBinomialDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Median"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "MixtureModel"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "LogNormalDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "PoissonDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "InverseGammaDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "CauchyDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "GammaDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Percentile"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "CentredMoment"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "GeometricDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Quartile"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Variance"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "AbstractSample"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "NormalDistribution"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "InterquartileRange"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Moment"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "UnknownSample"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "CoefficientOfVariation"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "StandardDeviation"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "LogisticDistribution"),
    });
    
    
    /**
     * Gets the "AbstractUncertainty" element
     */
    public org.uncertml.x20.AbstractUncertaintyType getAbstractUncertainty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.AbstractUncertaintyType target = null;
            target = (org.uncertml.x20.AbstractUncertaintyType)get_store().find_element_user(ABSTRACTUNCERTAINTY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractUncertainty" element
     */
    public void setAbstractUncertainty(org.uncertml.x20.AbstractUncertaintyType abstractUncertainty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.AbstractUncertaintyType target = null;
            target = (org.uncertml.x20.AbstractUncertaintyType)get_store().find_element_user(ABSTRACTUNCERTAINTY$1, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.AbstractUncertaintyType)get_store().add_element_user(ABSTRACTUNCERTAINTY$0);
            }
            target.set(abstractUncertainty);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractUncertainty" element
     */
    public org.uncertml.x20.AbstractUncertaintyType addNewAbstractUncertainty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.AbstractUncertaintyType target = null;
            target = (org.uncertml.x20.AbstractUncertaintyType)get_store().add_element_user(ABSTRACTUNCERTAINTY$0);
            return target;
        }
    }
}
