/*
 * An XML document type.
 * Localname: Realisation
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.RealisationDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one Realisation(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class RealisationDocumentImpl extends org.uncertml.x20.impl.AbstractUncertaintyDocumentImpl implements org.uncertml.x20.RealisationDocument
{
    private static final long serialVersionUID = 1L;
    
    public RealisationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REALISATION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Realisation");
    
    
    /**
     * Gets the "Realisation" element
     */
    public org.uncertml.x20.RealisationDocument.Realisation getRealisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.RealisationDocument.Realisation target = null;
            target = (org.uncertml.x20.RealisationDocument.Realisation)get_store().find_element_user(REALISATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Realisation" element
     */
    public void setRealisation(org.uncertml.x20.RealisationDocument.Realisation realisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.RealisationDocument.Realisation target = null;
            target = (org.uncertml.x20.RealisationDocument.Realisation)get_store().find_element_user(REALISATION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.RealisationDocument.Realisation)get_store().add_element_user(REALISATION$0);
            }
            target.set(realisation);
        }
    }
    
    /**
     * Appends and returns a new empty "Realisation" element
     */
    public org.uncertml.x20.RealisationDocument.Realisation addNewRealisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.RealisationDocument.Realisation target = null;
            target = (org.uncertml.x20.RealisationDocument.Realisation)get_store().add_element_user(REALISATION$0);
            return target;
        }
    }
    /**
     * An XML Realisation(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class RealisationImpl extends org.uncertml.x20.impl.RealisationTypeImpl implements org.uncertml.x20.RealisationDocument.Realisation
    {
        private static final long serialVersionUID = 1L;
        
        public RealisationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
