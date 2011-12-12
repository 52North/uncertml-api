/*
 * An XML document type.
 * Localname: Moment
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.MomentDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one Moment(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class MomentDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.MomentDocument
{
    private static final long serialVersionUID = 1L;
    
    public MomentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOMENT$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Moment");
    
    
    /**
     * Gets the "Moment" element
     */
    public org.uncertml.x20.MomentDocument.Moment getMoment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MomentDocument.Moment target = null;
            target = (org.uncertml.x20.MomentDocument.Moment)get_store().find_element_user(MOMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Moment" element
     */
    public void setMoment(org.uncertml.x20.MomentDocument.Moment moment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MomentDocument.Moment target = null;
            target = (org.uncertml.x20.MomentDocument.Moment)get_store().find_element_user(MOMENT$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.MomentDocument.Moment)get_store().add_element_user(MOMENT$0);
            }
            target.set(moment);
        }
    }
    
    /**
     * Appends and returns a new empty "Moment" element
     */
    public org.uncertml.x20.MomentDocument.Moment addNewMoment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MomentDocument.Moment target = null;
            target = (org.uncertml.x20.MomentDocument.Moment)get_store().add_element_user(MOMENT$0);
            return target;
        }
    }
    /**
     * An XML Moment(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class MomentImpl extends org.uncertml.x20.impl.MomentTypeImpl implements org.uncertml.x20.MomentDocument.Moment
    {
        private static final long serialVersionUID = 1L;
        
        public MomentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
