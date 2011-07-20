/*
 * An XML document type.
 * Localname: CentredMoment
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.CentredMomentDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one CentredMoment(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class CentredMomentDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.CentredMomentDocument
{
    private static final long serialVersionUID = 1L;
    
    public CentredMomentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CENTREDMOMENT$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "CentredMoment");
    
    
    /**
     * Gets the "CentredMoment" element
     */
    public org.uncertml.x20.CentredMomentDocument.CentredMoment getCentredMoment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CentredMomentDocument.CentredMoment target = null;
            target = (org.uncertml.x20.CentredMomentDocument.CentredMoment)get_store().find_element_user(CENTREDMOMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CentredMoment" element
     */
    public void setCentredMoment(org.uncertml.x20.CentredMomentDocument.CentredMoment centredMoment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CentredMomentDocument.CentredMoment target = null;
            target = (org.uncertml.x20.CentredMomentDocument.CentredMoment)get_store().find_element_user(CENTREDMOMENT$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.CentredMomentDocument.CentredMoment)get_store().add_element_user(CENTREDMOMENT$0);
            }
            target.set(centredMoment);
        }
    }
    
    /**
     * Appends and returns a new empty "CentredMoment" element
     */
    public org.uncertml.x20.CentredMomentDocument.CentredMoment addNewCentredMoment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.CentredMomentDocument.CentredMoment target = null;
            target = (org.uncertml.x20.CentredMomentDocument.CentredMoment)get_store().add_element_user(CENTREDMOMENT$0);
            return target;
        }
    }
    /**
     * An XML CentredMoment(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class CentredMomentImpl extends org.uncertml.x20.impl.CentredMomentTypeImpl implements org.uncertml.x20.CentredMomentDocument.CentredMoment
    {
        private static final long serialVersionUID = 1L;
        
        public CentredMomentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
