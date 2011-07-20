/*
 * An XML document type.
 * Localname: MixtureModel
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.MixtureModelDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one MixtureModel(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class MixtureModelDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.MixtureModelDocument
{
    private static final long serialVersionUID = 1L;
    
    public MixtureModelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIXTUREMODEL$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "MixtureModel");
    
    
    /**
     * Gets the "MixtureModel" element
     */
    public org.uncertml.x20.MixtureModelDocument.MixtureModel getMixtureModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MixtureModelDocument.MixtureModel target = null;
            target = (org.uncertml.x20.MixtureModelDocument.MixtureModel)get_store().find_element_user(MIXTUREMODEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MixtureModel" element
     */
    public void setMixtureModel(org.uncertml.x20.MixtureModelDocument.MixtureModel mixtureModel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MixtureModelDocument.MixtureModel target = null;
            target = (org.uncertml.x20.MixtureModelDocument.MixtureModel)get_store().find_element_user(MIXTUREMODEL$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.MixtureModelDocument.MixtureModel)get_store().add_element_user(MIXTUREMODEL$0);
            }
            target.set(mixtureModel);
        }
    }
    
    /**
     * Appends and returns a new empty "MixtureModel" element
     */
    public org.uncertml.x20.MixtureModelDocument.MixtureModel addNewMixtureModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.MixtureModelDocument.MixtureModel target = null;
            target = (org.uncertml.x20.MixtureModelDocument.MixtureModel)get_store().add_element_user(MIXTUREMODEL$0);
            return target;
        }
    }
    /**
     * An XML MixtureModel(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class MixtureModelImpl extends org.uncertml.x20.impl.MixtureModelTypeImpl implements org.uncertml.x20.MixtureModelDocument.MixtureModel
    {
        private static final long serialVersionUID = 1L;
        
        public MixtureModelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
