/*
 * XML Type:  SystematicSampleType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.SystematicSampleType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML SystematicSampleType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class SystematicSampleTypeImpl extends org.uncertml.x20.impl.AbstractSampleTypeImpl implements org.uncertml.x20.SystematicSampleType
{
    private static final long serialVersionUID = 1L;
    
    public SystematicSampleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REALISATION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "Realisation");
    
    
    /**
     * Gets array of all "Realisation" elements
     */
    public org.uncertml.x20.RealisationDocument.Realisation[] getRealisationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REALISATION$0, targetList);
            org.uncertml.x20.RealisationDocument.Realisation[] result = new org.uncertml.x20.RealisationDocument.Realisation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Realisation" element
     */
    public org.uncertml.x20.RealisationDocument.Realisation getRealisationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.RealisationDocument.Realisation target = null;
            target = (org.uncertml.x20.RealisationDocument.Realisation)get_store().find_element_user(REALISATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Realisation" element
     */
    public int sizeOfRealisationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REALISATION$0);
        }
    }
    
    /**
     * Sets array of all "Realisation" element
     */
    public void setRealisationArray(org.uncertml.x20.RealisationDocument.Realisation[] realisationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(realisationArray, REALISATION$0);
        }
    }
    
    /**
     * Sets ith "Realisation" element
     */
    public void setRealisationArray(int i, org.uncertml.x20.RealisationDocument.Realisation realisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.RealisationDocument.Realisation target = null;
            target = (org.uncertml.x20.RealisationDocument.Realisation)get_store().find_element_user(REALISATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(realisation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Realisation" element
     */
    public org.uncertml.x20.RealisationDocument.Realisation insertNewRealisation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.RealisationDocument.Realisation target = null;
            target = (org.uncertml.x20.RealisationDocument.Realisation)get_store().insert_element_user(REALISATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Realisation" element
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
     * Removes the ith "Realisation" element
     */
    public void removeRealisation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REALISATION$0, i);
        }
    }
}
