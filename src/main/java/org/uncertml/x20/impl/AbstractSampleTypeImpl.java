/*
 * XML Type:  AbstractSampleType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.AbstractSampleType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML AbstractSampleType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class AbstractSampleTypeImpl extends org.uncertml.x20.impl.AbstractUncertaintyTypeImpl implements org.uncertml.x20.AbstractSampleType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractSampleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAMPLINGMETHODDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "samplingMethodDescription");
    
    
    /**
     * Gets the "samplingMethodDescription" element
     */
    public java.lang.String getSamplingMethodDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAMPLINGMETHODDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "samplingMethodDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetSamplingMethodDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAMPLINGMETHODDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "samplingMethodDescription" element
     */
    public boolean isSetSamplingMethodDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAMPLINGMETHODDESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "samplingMethodDescription" element
     */
    public void setSamplingMethodDescription(java.lang.String samplingMethodDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAMPLINGMETHODDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAMPLINGMETHODDESCRIPTION$0);
            }
            target.setStringValue(samplingMethodDescription);
        }
    }
    
    /**
     * Sets (as xml) the "samplingMethodDescription" element
     */
    public void xsetSamplingMethodDescription(org.apache.xmlbeans.XmlString samplingMethodDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAMPLINGMETHODDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SAMPLINGMETHODDESCRIPTION$0);
            }
            target.set(samplingMethodDescription);
        }
    }
    
    /**
     * Unsets the "samplingMethodDescription" element
     */
    public void unsetSamplingMethodDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAMPLINGMETHODDESCRIPTION$0, 0);
        }
    }
}
