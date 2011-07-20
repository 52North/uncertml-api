/*
 * XML Type:  DiscreteProbabilityType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.DiscreteProbabilityType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML DiscreteProbabilityType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class DiscreteProbabilityTypeImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticTypeImpl implements org.uncertml.x20.DiscreteProbabilityType
{
    private static final long serialVersionUID = 1L;
    
    public DiscreteProbabilityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORIES$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "categories");
    private static final javax.xml.namespace.QName PROBABILITIES$2 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "probabilities");
    
    
    /**
     * Gets the "categories" element
     */
    public org.uncertml.x20.DiscreteProbabilityType.Categories getCategories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.DiscreteProbabilityType.Categories target = null;
            target = (org.uncertml.x20.DiscreteProbabilityType.Categories)get_store().find_element_user(CATEGORIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "categories" element
     */
    public void setCategories(org.uncertml.x20.DiscreteProbabilityType.Categories categories)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.DiscreteProbabilityType.Categories target = null;
            target = (org.uncertml.x20.DiscreteProbabilityType.Categories)get_store().find_element_user(CATEGORIES$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.DiscreteProbabilityType.Categories)get_store().add_element_user(CATEGORIES$0);
            }
            target.set(categories);
        }
    }
    
    /**
     * Appends and returns a new empty "categories" element
     */
    public org.uncertml.x20.DiscreteProbabilityType.Categories addNewCategories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.DiscreteProbabilityType.Categories target = null;
            target = (org.uncertml.x20.DiscreteProbabilityType.Categories)get_store().add_element_user(CATEGORIES$0);
            return target;
        }
    }
    
    /**
     * Gets the "probabilities" element
     */
    public org.uncertml.x20.ProbabilityValuesType getProbabilities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ProbabilityValuesType target = null;
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().find_element_user(PROBABILITIES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "probabilities" element
     */
    public void setProbabilities(org.uncertml.x20.ProbabilityValuesType probabilities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ProbabilityValuesType target = null;
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().find_element_user(PROBABILITIES$2, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ProbabilityValuesType)get_store().add_element_user(PROBABILITIES$2);
            }
            target.set(probabilities);
        }
    }
    
    /**
     * Appends and returns a new empty "probabilities" element
     */
    public org.uncertml.x20.ProbabilityValuesType addNewProbabilities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ProbabilityValuesType target = null;
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().add_element_user(PROBABILITIES$2);
            return target;
        }
    }
    /**
     * An XML categories(@http://www.uncertml.org/2.0).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlString.
     */
    public static class CategoriesImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.uncertml.x20.DiscreteProbabilityType.Categories
    {
        private static final long serialVersionUID = 1L;
        
        public CategoriesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected CategoriesImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName HREF$0 = 
            new javax.xml.namespace.QName("", "href");
        private static final javax.xml.namespace.QName MIMETYPE$2 = 
            new javax.xml.namespace.QName("", "mimeType");
        
        
        /**
         * Gets the "href" attribute
         */
        public java.lang.String getHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "href" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$0);
                return target;
            }
        }
        
        /**
         * True if has "href" attribute
         */
        public boolean isSetHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HREF$0) != null;
            }
        }
        
        /**
         * Sets the "href" attribute
         */
        public void setHref(java.lang.String href)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$0);
                }
                target.setStringValue(href);
            }
        }
        
        /**
         * Sets (as xml) the "href" attribute
         */
        public void xsetHref(org.apache.xmlbeans.XmlAnyURI href)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(HREF$0);
                }
                target.set(href);
            }
        }
        
        /**
         * Unsets the "href" attribute
         */
        public void unsetHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HREF$0);
            }
        }
        
        /**
         * Gets the "mimeType" attribute
         */
        public java.lang.String getMimeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIMETYPE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mimeType" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMimeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MIMETYPE$2);
                return target;
            }
        }
        
        /**
         * True if has "mimeType" attribute
         */
        public boolean isSetMimeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MIMETYPE$2) != null;
            }
        }
        
        /**
         * Sets the "mimeType" attribute
         */
        public void setMimeType(java.lang.String mimeType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIMETYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIMETYPE$2);
                }
                target.setStringValue(mimeType);
            }
        }
        
        /**
         * Sets (as xml) the "mimeType" attribute
         */
        public void xsetMimeType(org.apache.xmlbeans.XmlString mimeType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MIMETYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MIMETYPE$2);
                }
                target.set(mimeType);
            }
        }
        
        /**
         * Unsets the "mimeType" attribute
         */
        public void unsetMimeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MIMETYPE$2);
            }
        }
    }
}
