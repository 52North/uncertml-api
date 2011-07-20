/*
 * An XML document type.
 * Localname: CoefficientOfVariation
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.CoefficientOfVariationDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one CoefficientOfVariation(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class CoefficientOfVariationDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.CoefficientOfVariationDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoefficientOfVariationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COEFFICIENTOFVARIATION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "CoefficientOfVariation");
    
    
    /**
     * Gets the "CoefficientOfVariation" element
     */
    public org.uncertml.x20.CoefficientOfVariationDocument.CoefficientOfVariation getCoefficientOfVariation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CoefficientOfVariationDocument.CoefficientOfVariation target = null;
            target = (org.uncertml.x20.CoefficientOfVariationDocument.CoefficientOfVariation)get_store().find_element_user(COEFFICIENTOFVARIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CoefficientOfVariation" element
     */
    public void setCoefficientOfVariation(org.uncertml.x20.CoefficientOfVariationDocument.CoefficientOfVariation coefficientOfVariation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CoefficientOfVariationDocument.CoefficientOfVariation target = null;
            target = (org.uncertml.x20.CoefficientOfVariationDocument.CoefficientOfVariation)get_store().find_element_user(COEFFICIENTOFVARIATION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.CoefficientOfVariationDocument.CoefficientOfVariation)get_store().add_element_user(COEFFICIENTOFVARIATION$0);
            }
            target.set(coefficientOfVariation);
        }
    }
    
    /**
     * Appends and returns a new empty "CoefficientOfVariation" element
     */
    public org.uncertml.x20.CoefficientOfVariationDocument.CoefficientOfVariation addNewCoefficientOfVariation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CoefficientOfVariationDocument.CoefficientOfVariation target = null;
            target = (org.uncertml.x20.CoefficientOfVariationDocument.CoefficientOfVariation)get_store().add_element_user(COEFFICIENTOFVARIATION$0);
            return target;
        }
    }
    /**
     * An XML CoefficientOfVariation(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class CoefficientOfVariationImpl extends org.uncertml.x20.impl.CoefficientOfVariationTypeImpl implements org.uncertml.x20.CoefficientOfVariationDocument.CoefficientOfVariation
    {
        private static final long serialVersionUID = 1L;
        
        public CoefficientOfVariationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
