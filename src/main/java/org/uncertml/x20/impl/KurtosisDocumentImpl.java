/*
 * An XML document type.
 * Localname: Kurtosis
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.KurtosisDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one Kurtosis(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class KurtosisDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.KurtosisDocument
{
    private static final long serialVersionUID = 1L;
    
    public KurtosisDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KURTOSIS$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Kurtosis");
    
    
    /**
     * Gets the "Kurtosis" element
     */
    public org.uncertml.x20.KurtosisDocument.Kurtosis getKurtosis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.KurtosisDocument.Kurtosis target = null;
            target = (org.uncertml.x20.KurtosisDocument.Kurtosis)get_store().find_element_user(KURTOSIS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Kurtosis" element
     */
    public void setKurtosis(org.uncertml.x20.KurtosisDocument.Kurtosis kurtosis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.KurtosisDocument.Kurtosis target = null;
            target = (org.uncertml.x20.KurtosisDocument.Kurtosis)get_store().find_element_user(KURTOSIS$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.KurtosisDocument.Kurtosis)get_store().add_element_user(KURTOSIS$0);
            }
            target.set(kurtosis);
        }
    }
    
    /**
     * Appends and returns a new empty "Kurtosis" element
     */
    public org.uncertml.x20.KurtosisDocument.Kurtosis addNewKurtosis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.KurtosisDocument.Kurtosis target = null;
            target = (org.uncertml.x20.KurtosisDocument.Kurtosis)get_store().add_element_user(KURTOSIS$0);
            return target;
        }
    }
    /**
     * An XML Kurtosis(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class KurtosisImpl extends org.uncertml.x20.impl.KurtosisTypeImpl implements org.uncertml.x20.KurtosisDocument.Kurtosis
    {
        private static final long serialVersionUID = 1L;
        
        public KurtosisImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
