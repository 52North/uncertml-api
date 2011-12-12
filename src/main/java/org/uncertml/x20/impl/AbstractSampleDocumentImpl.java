/*
 * An XML document type.
 * Localname: AbstractSample
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.AbstractSampleDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one AbstractSample(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class AbstractSampleDocumentImpl extends org.uncertml.x20.impl.AbstractUncertaintyDocumentImpl implements org.uncertml.x20.AbstractSampleDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractSampleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTSAMPLE$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "AbstractSample");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTSAMPLE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "UnknownSample"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "RandomSample"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "SystematicSample"),
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "AbstractSample"),
    });
    
    
    /**
     * Gets the "AbstractSample" element
     */
    public org.uncertml.x20.AbstractSampleType getAbstractSample()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.AbstractSampleType target = null;
            target = (org.uncertml.x20.AbstractSampleType)get_store().find_element_user(ABSTRACTSAMPLE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractSample" element
     */
    public void setAbstractSample(org.uncertml.x20.AbstractSampleType abstractSample)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.AbstractSampleType target = null;
            target = (org.uncertml.x20.AbstractSampleType)get_store().find_element_user(ABSTRACTSAMPLE$1, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.AbstractSampleType)get_store().add_element_user(ABSTRACTSAMPLE$0);
            }
            target.set(abstractSample);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractSample" element
     */
    public org.uncertml.x20.AbstractSampleType addNewAbstractSample()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.AbstractSampleType target = null;
            target = (org.uncertml.x20.AbstractSampleType)get_store().add_element_user(ABSTRACTSAMPLE$0);
            return target;
        }
    }
}
