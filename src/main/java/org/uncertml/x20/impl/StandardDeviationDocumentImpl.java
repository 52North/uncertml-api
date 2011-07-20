/*
 * An XML document type.
 * Localname: StandardDeviation
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.StandardDeviationDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one StandardDeviation(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class StandardDeviationDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.StandardDeviationDocument
{
    private static final long serialVersionUID = 1L;
    
    public StandardDeviationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STANDARDDEVIATION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "StandardDeviation");
    
    
    /**
     * Gets the "StandardDeviation" element
     */
    public org.uncertml.x20.StandardDeviationDocument.StandardDeviation getStandardDeviation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.StandardDeviationDocument.StandardDeviation target = null;
            target = (org.uncertml.x20.StandardDeviationDocument.StandardDeviation)get_store().find_element_user(STANDARDDEVIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StandardDeviation" element
     */
    public void setStandardDeviation(org.uncertml.x20.StandardDeviationDocument.StandardDeviation standardDeviation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.StandardDeviationDocument.StandardDeviation target = null;
            target = (org.uncertml.x20.StandardDeviationDocument.StandardDeviation)get_store().find_element_user(STANDARDDEVIATION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.StandardDeviationDocument.StandardDeviation)get_store().add_element_user(STANDARDDEVIATION$0);
            }
            target.set(standardDeviation);
        }
    }
    
    /**
     * Appends and returns a new empty "StandardDeviation" element
     */
    public org.uncertml.x20.StandardDeviationDocument.StandardDeviation addNewStandardDeviation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.StandardDeviationDocument.StandardDeviation target = null;
            target = (org.uncertml.x20.StandardDeviationDocument.StandardDeviation)get_store().add_element_user(STANDARDDEVIATION$0);
            return target;
        }
    }
    /**
     * An XML StandardDeviation(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class StandardDeviationImpl extends org.uncertml.x20.impl.StandardDeviationTypeImpl implements org.uncertml.x20.StandardDeviationDocument.StandardDeviation
    {
        private static final long serialVersionUID = 1L;
        
        public StandardDeviationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
