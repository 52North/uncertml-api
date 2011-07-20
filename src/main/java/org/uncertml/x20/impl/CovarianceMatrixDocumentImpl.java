/*
 * An XML document type.
 * Localname: CovarianceMatrix
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.CovarianceMatrixDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one CovarianceMatrix(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class CovarianceMatrixDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.CovarianceMatrixDocument
{
    private static final long serialVersionUID = 1L;
    
    public CovarianceMatrixDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COVARIANCEMATRIX$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "CovarianceMatrix");
    
    
    /**
     * Gets the "CovarianceMatrix" element
     */
    public org.uncertml.x20.CovarianceMatrixDocument.CovarianceMatrix getCovarianceMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CovarianceMatrixDocument.CovarianceMatrix target = null;
            target = (org.uncertml.x20.CovarianceMatrixDocument.CovarianceMatrix)get_store().find_element_user(COVARIANCEMATRIX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CovarianceMatrix" element
     */
    public void setCovarianceMatrix(org.uncertml.x20.CovarianceMatrixDocument.CovarianceMatrix covarianceMatrix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CovarianceMatrixDocument.CovarianceMatrix target = null;
            target = (org.uncertml.x20.CovarianceMatrixDocument.CovarianceMatrix)get_store().find_element_user(COVARIANCEMATRIX$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.CovarianceMatrixDocument.CovarianceMatrix)get_store().add_element_user(COVARIANCEMATRIX$0);
            }
            target.set(covarianceMatrix);
        }
    }
    
    /**
     * Appends and returns a new empty "CovarianceMatrix" element
     */
    public org.uncertml.x20.CovarianceMatrixDocument.CovarianceMatrix addNewCovarianceMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CovarianceMatrixDocument.CovarianceMatrix target = null;
            target = (org.uncertml.x20.CovarianceMatrixDocument.CovarianceMatrix)get_store().add_element_user(COVARIANCEMATRIX$0);
            return target;
        }
    }
    /**
     * An XML CovarianceMatrix(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class CovarianceMatrixImpl extends org.uncertml.x20.impl.CovarianceMatrixTypeImpl implements org.uncertml.x20.CovarianceMatrixDocument.CovarianceMatrix
    {
        private static final long serialVersionUID = 1L;
        
        public CovarianceMatrixImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
