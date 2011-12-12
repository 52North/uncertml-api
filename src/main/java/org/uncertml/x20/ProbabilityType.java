/*
 * XML Type:  ProbabilityType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.ProbabilityType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20;


/**
 * An XML ProbabilityType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public interface ProbabilityType extends org.uncertml.x20.AbstractSummaryStatisticType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProbabilityType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s05A405BC14F7072A77DBB1861811F2C7").resolveHandle("probabilitytype5526type");
    
    /**
     * Gets the "probabilities" element
     */
    org.uncertml.x20.ProbabilityValuesType getProbabilities();
    
    /**
     * Sets the "probabilities" element
     */
    void setProbabilities(org.uncertml.x20.ProbabilityValuesType probabilities);
    
    /**
     * Appends and returns a new empty "probabilities" element
     */
    org.uncertml.x20.ProbabilityValuesType addNewProbabilities();
    
    /**
     * Gets the "gt" attribute
     */
    double getGt();
    
    /**
     * Gets (as xml) the "gt" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetGt();
    
    /**
     * True if has "gt" attribute
     */
    boolean isSetGt();
    
    /**
     * Sets the "gt" attribute
     */
    void setGt(double gt);
    
    /**
     * Sets (as xml) the "gt" attribute
     */
    void xsetGt(org.apache.xmlbeans.XmlDouble gt);
    
    /**
     * Unsets the "gt" attribute
     */
    void unsetGt();
    
    /**
     * Gets the "lt" attribute
     */
    double getLt();
    
    /**
     * Gets (as xml) the "lt" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetLt();
    
    /**
     * True if has "lt" attribute
     */
    boolean isSetLt();
    
    /**
     * Sets the "lt" attribute
     */
    void setLt(double lt);
    
    /**
     * Sets (as xml) the "lt" attribute
     */
    void xsetLt(org.apache.xmlbeans.XmlDouble lt);
    
    /**
     * Unsets the "lt" attribute
     */
    void unsetLt();
    
    /**
     * Gets the "ge" attribute
     */
    double getGe();
    
    /**
     * Gets (as xml) the "ge" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetGe();
    
    /**
     * True if has "ge" attribute
     */
    boolean isSetGe();
    
    /**
     * Sets the "ge" attribute
     */
    void setGe(double ge);
    
    /**
     * Sets (as xml) the "ge" attribute
     */
    void xsetGe(org.apache.xmlbeans.XmlDouble ge);
    
    /**
     * Unsets the "ge" attribute
     */
    void unsetGe();
    
    /**
     * Gets the "le" attribute
     */
    double getLe();
    
    /**
     * Gets (as xml) the "le" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetLe();
    
    /**
     * True if has "le" attribute
     */
    boolean isSetLe();
    
    /**
     * Sets the "le" attribute
     */
    void setLe(double le);
    
    /**
     * Sets (as xml) the "le" attribute
     */
    void xsetLe(org.apache.xmlbeans.XmlDouble le);
    
    /**
     * Unsets the "le" attribute
     */
    void unsetLe();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uncertml.x20.ProbabilityType newInstance() {
          return (org.uncertml.x20.ProbabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uncertml.x20.ProbabilityType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uncertml.x20.ProbabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uncertml.x20.ProbabilityType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uncertml.x20.ProbabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uncertml.x20.ProbabilityType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uncertml.x20.ProbabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uncertml.x20.ProbabilityType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uncertml.x20.ProbabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uncertml.x20.ProbabilityType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uncertml.x20.ProbabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uncertml.x20.ProbabilityType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uncertml.x20.ProbabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uncertml.x20.ProbabilityType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uncertml.x20.ProbabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uncertml.x20.ProbabilityType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uncertml.x20.ProbabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uncertml.x20.ProbabilityType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uncertml.x20.ProbabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uncertml.x20.ProbabilityType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uncertml.x20.ProbabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uncertml.x20.ProbabilityType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uncertml.x20.ProbabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uncertml.x20.ProbabilityType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uncertml.x20.ProbabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uncertml.x20.ProbabilityType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uncertml.x20.ProbabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uncertml.x20.ProbabilityType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uncertml.x20.ProbabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uncertml.x20.ProbabilityType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uncertml.x20.ProbabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uncertml.x20.ProbabilityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uncertml.x20.ProbabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uncertml.x20.ProbabilityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uncertml.x20.ProbabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
