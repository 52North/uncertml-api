/*
 * An XML document type.
 * Localname: ConfusionMatrix
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.ConfusionMatrixDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one ConfusionMatrix(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class ConfusionMatrixDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.ConfusionMatrixDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConfusionMatrixDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFUSIONMATRIX$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "ConfusionMatrix");
    
    
    /**
     * Gets the "ConfusionMatrix" element
     */
    public org.uncertml.x20.ConfusionMatrixDocument.ConfusionMatrix getConfusionMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ConfusionMatrixDocument.ConfusionMatrix target = null;
            target = (org.uncertml.x20.ConfusionMatrixDocument.ConfusionMatrix)get_store().find_element_user(CONFUSIONMATRIX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConfusionMatrix" element
     */
    public void setConfusionMatrix(org.uncertml.x20.ConfusionMatrixDocument.ConfusionMatrix confusionMatrix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ConfusionMatrixDocument.ConfusionMatrix target = null;
            target = (org.uncertml.x20.ConfusionMatrixDocument.ConfusionMatrix)get_store().find_element_user(CONFUSIONMATRIX$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ConfusionMatrixDocument.ConfusionMatrix)get_store().add_element_user(CONFUSIONMATRIX$0);
            }
            target.set(confusionMatrix);
        }
    }
    
    /**
     * Appends and returns a new empty "ConfusionMatrix" element
     */
    public org.uncertml.x20.ConfusionMatrixDocument.ConfusionMatrix addNewConfusionMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ConfusionMatrixDocument.ConfusionMatrix target = null;
            target = (org.uncertml.x20.ConfusionMatrixDocument.ConfusionMatrix)get_store().add_element_user(CONFUSIONMATRIX$0);
            return target;
        }
    }
    /**
     * An XML ConfusionMatrix(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class ConfusionMatrixImpl extends org.uncertml.x20.impl.ConfusionMatrixTypeImpl implements org.uncertml.x20.ConfusionMatrixDocument.ConfusionMatrix
    {
        private static final long serialVersionUID = 1L;
        
        public ConfusionMatrixImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
