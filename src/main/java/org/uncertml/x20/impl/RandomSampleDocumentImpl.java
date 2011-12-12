/*
 * An XML document type.
 * Localname: RandomSample
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.RandomSampleDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one RandomSample(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class RandomSampleDocumentImpl extends org.uncertml.x20.impl.AbstractSampleDocumentImpl implements org.uncertml.x20.RandomSampleDocument
{
    private static final long serialVersionUID = 1L;
    
    public RandomSampleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RANDOMSAMPLE$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "RandomSample");
    
    
    /**
     * Gets the "RandomSample" element
     */
    public org.uncertml.x20.RandomSampleDocument.RandomSample getRandomSample()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.RandomSampleDocument.RandomSample target = null;
            target = (org.uncertml.x20.RandomSampleDocument.RandomSample)get_store().find_element_user(RANDOMSAMPLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RandomSample" element
     */
    public void setRandomSample(org.uncertml.x20.RandomSampleDocument.RandomSample randomSample)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.RandomSampleDocument.RandomSample target = null;
            target = (org.uncertml.x20.RandomSampleDocument.RandomSample)get_store().find_element_user(RANDOMSAMPLE$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.RandomSampleDocument.RandomSample)get_store().add_element_user(RANDOMSAMPLE$0);
            }
            target.set(randomSample);
        }
    }
    
    /**
     * Appends and returns a new empty "RandomSample" element
     */
    public org.uncertml.x20.RandomSampleDocument.RandomSample addNewRandomSample()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.RandomSampleDocument.RandomSample target = null;
            target = (org.uncertml.x20.RandomSampleDocument.RandomSample)get_store().add_element_user(RANDOMSAMPLE$0);
            return target;
        }
    }
    /**
     * An XML RandomSample(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class RandomSampleImpl extends org.uncertml.x20.impl.RandomSampleTypeImpl implements org.uncertml.x20.RandomSampleDocument.RandomSample
    {
        private static final long serialVersionUID = 1L;
        
        public RandomSampleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
