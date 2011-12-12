/*
 * XML Type:  ProbabilityType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.ProbabilityType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20.impl;
/**
 * An XML ProbabilityType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public class ProbabilityTypeImpl extends org.uncertml.x20.impl.AbstractSummaryStatisticTypeImpl implements org.uncertml.x20.ProbabilityType
{
    private static final long serialVersionUID = 1L;
    
    public ProbabilityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROBABILITIES$0 = 
        new javax.xml.namespace.QName("http://www.uncertml.org/2.0", "probabilities");
    private static final javax.xml.namespace.QName GT$2 = 
        new javax.xml.namespace.QName("", "gt");
    private static final javax.xml.namespace.QName LT$4 = 
        new javax.xml.namespace.QName("", "lt");
    private static final javax.xml.namespace.QName GE$6 = 
        new javax.xml.namespace.QName("", "ge");
    private static final javax.xml.namespace.QName LE$8 = 
        new javax.xml.namespace.QName("", "le");
    
    
    /**
     * Gets the "probabilities" element
     */
    public org.uncertml.x20.ProbabilityValuesType getProbabilities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uncertml.x20.ProbabilityValuesType target = null;
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().find_element_user(PROBABILITIES$0, 0);
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
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().find_element_user(PROBABILITIES$0, 0);
            if (target == null)
            {
                target = (org.uncertml.x20.ProbabilityValuesType)get_store().add_element_user(PROBABILITIES$0);
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
            target = (org.uncertml.x20.ProbabilityValuesType)get_store().add_element_user(PROBABILITIES$0);
            return target;
        }
    }
    
    /**
     * Gets the "gt" attribute
     */
    public double getGt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GT$2);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "gt" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetGt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(GT$2);
            return target;
        }
    }
    
    /**
     * True if has "gt" attribute
     */
    public boolean isSetGt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GT$2) != null;
        }
    }
    
    /**
     * Sets the "gt" attribute
     */
    public void setGt(double gt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GT$2);
            }
            target.setDoubleValue(gt);
        }
    }
    
    /**
     * Sets (as xml) the "gt" attribute
     */
    public void xsetGt(org.apache.xmlbeans.XmlDouble gt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(GT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(GT$2);
            }
            target.set(gt);
        }
    }
    
    /**
     * Unsets the "gt" attribute
     */
    public void unsetGt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GT$2);
        }
    }
    
    /**
     * Gets the "lt" attribute
     */
    public double getLt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LT$4);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "lt" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetLt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LT$4);
            return target;
        }
    }
    
    /**
     * True if has "lt" attribute
     */
    public boolean isSetLt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LT$4) != null;
        }
    }
    
    /**
     * Sets the "lt" attribute
     */
    public void setLt(double lt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LT$4);
            }
            target.setDoubleValue(lt);
        }
    }
    
    /**
     * Sets (as xml) the "lt" attribute
     */
    public void xsetLt(org.apache.xmlbeans.XmlDouble lt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LT$4);
            }
            target.set(lt);
        }
    }
    
    /**
     * Unsets the "lt" attribute
     */
    public void unsetLt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LT$4);
        }
    }
    
    /**
     * Gets the "ge" attribute
     */
    public double getGe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GE$6);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "ge" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetGe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(GE$6);
            return target;
        }
    }
    
    /**
     * True if has "ge" attribute
     */
    public boolean isSetGe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GE$6) != null;
        }
    }
    
    /**
     * Sets the "ge" attribute
     */
    public void setGe(double ge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GE$6);
            }
            target.setDoubleValue(ge);
        }
    }
    
    /**
     * Sets (as xml) the "ge" attribute
     */
    public void xsetGe(org.apache.xmlbeans.XmlDouble ge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(GE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(GE$6);
            }
            target.set(ge);
        }
    }
    
    /**
     * Unsets the "ge" attribute
     */
    public void unsetGe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GE$6);
        }
    }
    
    /**
     * Gets the "le" attribute
     */
    public double getLe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LE$8);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "le" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetLe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LE$8);
            return target;
        }
    }
    
    /**
     * True if has "le" attribute
     */
    public boolean isSetLe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LE$8) != null;
        }
    }
    
    /**
     * Sets the "le" attribute
     */
    public void setLe(double le)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LE$8);
            }
            target.setDoubleValue(le);
        }
    }
    
    /**
     * Sets (as xml) the "le" attribute
     */
    public void xsetLe(org.apache.xmlbeans.XmlDouble le)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LE$8);
            }
            target.set(le);
        }
    }
    
    /**
     * Unsets the "le" attribute
     */
    public void unsetLe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LE$8);
        }
    }
}
