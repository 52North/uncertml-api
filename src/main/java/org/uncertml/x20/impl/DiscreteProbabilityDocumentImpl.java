/*
 * An XML document type.
 * Localname: DiscreteProbability
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.DiscreteProbabilityDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one DiscreteProbability(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class DiscreteProbabilityDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.DiscreteProbabilityDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiscreteProbabilityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCRETEPROBABILITY$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "DiscreteProbability");
    
    
    /**
     * Gets the "DiscreteProbability" element
     */
    public org.uncertml.x20.DiscreteProbabilityDocument.DiscreteProbability getDiscreteProbability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.DiscreteProbabilityDocument.DiscreteProbability target = null;
            target = (org.uncertml.x20.DiscreteProbabilityDocument.DiscreteProbability)get_store().find_element_user(DISCRETEPROBABILITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DiscreteProbability" element
     */
    public void setDiscreteProbability(org.uncertml.x20.DiscreteProbabilityDocument.DiscreteProbability discreteProbability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.DiscreteProbabilityDocument.DiscreteProbability target = null;
            target = (org.uncertml.x20.DiscreteProbabilityDocument.DiscreteProbability)get_store().find_element_user(DISCRETEPROBABILITY$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.DiscreteProbabilityDocument.DiscreteProbability)get_store().add_element_user(DISCRETEPROBABILITY$0);
            }
            target.set(discreteProbability);
        }
    }
    
    /**
     * Appends and returns a new empty "DiscreteProbability" element
     */
    public org.uncertml.x20.DiscreteProbabilityDocument.DiscreteProbability addNewDiscreteProbability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.DiscreteProbabilityDocument.DiscreteProbability target = null;
            target = (org.uncertml.x20.DiscreteProbabilityDocument.DiscreteProbability)get_store().add_element_user(DISCRETEPROBABILITY$0);
            return target;
        }
    }
    /**
     * An XML DiscreteProbability(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class DiscreteProbabilityImpl extends org.uncertml.x20.impl.DiscreteProbabilityTypeImpl implements org.uncertml.x20.DiscreteProbabilityDocument.DiscreteProbability
    {
        private static final long serialVersionUID = 1L;
        
        public DiscreteProbabilityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
