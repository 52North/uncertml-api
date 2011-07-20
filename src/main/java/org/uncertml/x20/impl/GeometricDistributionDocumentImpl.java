/*
 * An XML document type.
 * Localname: GeometricDistribution
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.GeometricDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one GeometricDistribution(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class GeometricDistributionDocumentImpl extends org.uncertml.x20.impl.AbstractDistributionDocumentImpl implements org.uncertml.x20.GeometricDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeometricDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRICDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "GeometricDistribution");
    
    
    /**
     * Gets the "GeometricDistribution" element
     */
    public org.uncertml.x20.GeometricDistributionDocument.GeometricDistribution getGeometricDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.GeometricDistributionDocument.GeometricDistribution target = null;
            target = (org.uncertml.x20.GeometricDistributionDocument.GeometricDistribution)get_store().find_element_user(GEOMETRICDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeometricDistribution" element
     */
    public void setGeometricDistribution(org.uncertml.x20.GeometricDistributionDocument.GeometricDistribution geometricDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.GeometricDistributionDocument.GeometricDistribution target = null;
            target = (org.uncertml.x20.GeometricDistributionDocument.GeometricDistribution)get_store().find_element_user(GEOMETRICDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.GeometricDistributionDocument.GeometricDistribution)get_store().add_element_user(GEOMETRICDISTRIBUTION$0);
            }
            target.set(geometricDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "GeometricDistribution" element
     */
    public org.uncertml.x20.GeometricDistributionDocument.GeometricDistribution addNewGeometricDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.GeometricDistributionDocument.GeometricDistribution target = null;
            target = (org.uncertml.x20.GeometricDistributionDocument.GeometricDistribution)get_store().add_element_user(GEOMETRICDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML GeometricDistribution(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class GeometricDistributionImpl extends org.uncertml.x20.impl.GeometricDistributionTypeImpl implements org.uncertml.x20.GeometricDistributionDocument.GeometricDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public GeometricDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
