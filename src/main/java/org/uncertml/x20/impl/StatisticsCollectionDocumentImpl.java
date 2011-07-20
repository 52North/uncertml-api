/*
 * An XML document type.
 * Localname: StatisticsCollection
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.StatisticsCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * A document containing one StatisticsCollection(@http://www.uncertml.org/2.0) element.
 *
 * This is a complex type.
 */
public class StatisticsCollectionDocumentImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticDocumentImpl implements org.uncertml.x20.StatisticsCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatisticsCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATISTICSCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "StatisticsCollection");
    
    
    /**
     * Gets the "StatisticsCollection" element
     */
    public org.uncertml.x20.StatisticsCollectionDocument.StatisticsCollection getStatisticsCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.StatisticsCollectionDocument.StatisticsCollection target = null;
            target = (org.uncertml.x20.StatisticsCollectionDocument.StatisticsCollection)get_store().find_element_user(STATISTICSCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StatisticsCollection" element
     */
    public void setStatisticsCollection(org.uncertml.x20.StatisticsCollectionDocument.StatisticsCollection statisticsCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.StatisticsCollectionDocument.StatisticsCollection target = null;
            target = (org.uncertml.x20.StatisticsCollectionDocument.StatisticsCollection)get_store().find_element_user(STATISTICSCOLLECTION$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.StatisticsCollectionDocument.StatisticsCollection)get_store().add_element_user(STATISTICSCOLLECTION$0);
            }
            target.set(statisticsCollection);
        }
    }
    
    /**
     * Appends and returns a new empty "StatisticsCollection" element
     */
    public org.uncertml.x20.StatisticsCollectionDocument.StatisticsCollection addNewStatisticsCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.StatisticsCollectionDocument.StatisticsCollection target = null;
            target = (org.uncertml.x20.StatisticsCollectionDocument.StatisticsCollection)get_store().add_element_user(STATISTICSCOLLECTION$0);
            return target;
        }
    }
    /**
     * An XML StatisticsCollection(@http://www.uncertml.org/2.0).
     *
     * This is a complex type.
     */
    public static class StatisticsCollectionImpl extends org.uncertml.x20.impl.StatisticsCollectionTypeImpl implements org.uncertml.x20.StatisticsCollectionDocument.StatisticsCollection
    {
        private static final long serialVersionUID = 1L;
        
        public StatisticsCollectionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
