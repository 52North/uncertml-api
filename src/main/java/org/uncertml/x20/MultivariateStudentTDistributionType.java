/*
 * XML Type:  MultivariateStudentTDistributionType
 * Namespace: http://www.uncertml.org/2.0
 * Java type: org.uncertml.x20.MultivariateStudentTDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.uncertml.x20;


/**
 * An XML MultivariateStudentTDistributionType(@http://www.uncertml.org/2.0).
 *
 * This is a complex type.
 */
public interface MultivariateStudentTDistributionType extends org.uncertml.x20.AbstractDistributionType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MultivariateStudentTDistributionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s05A405BC14F7072A77DBB1861811F2C7").resolveHandle("multivariatestudenttdistributiontypea8b7type");
    
    /**
     * Gets the "mean" element
     */
    org.uncertml.x20.ContinuousValuesType getMean();
    
    /**
     * Sets the "mean" element
     */
    void setMean(org.uncertml.x20.ContinuousValuesType mean);
    
    /**
     * Appends and returns a new empty "mean" element
     */
    org.uncertml.x20.ContinuousValuesType addNewMean();
    
    /**
     * Gets the "covarianceMatrix" element
     */
    org.uncertml.x20.CovarianceMatrixType getCovarianceMatrix();
    
    /**
     * Sets the "covarianceMatrix" element
     */
    void setCovarianceMatrix(org.uncertml.x20.CovarianceMatrixType covarianceMatrix);
    
    /**
     * Appends and returns a new empty "covarianceMatrix" element
     */
    org.uncertml.x20.CovarianceMatrixType addNewCovarianceMatrix();
    
    /**
     * Gets the "degreesOfFreedom" element
     */
    org.uncertml.x20.PositiveNaturalNumbersType getDegreesOfFreedom();
    
    /**
     * Sets the "degreesOfFreedom" element
     */
    void setDegreesOfFreedom(org.uncertml.x20.PositiveNaturalNumbersType degreesOfFreedom);
    
    /**
     * Appends and returns a new empty "degreesOfFreedom" element
     */
    org.uncertml.x20.PositiveNaturalNumbersType addNewDegreesOfFreedom();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uncertml.x20.MultivariateStudentTDistributionType newInstance() {
          return (org.uncertml.x20.MultivariateStudentTDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uncertml.x20.MultivariateStudentTDistributionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uncertml.x20.MultivariateStudentTDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uncertml.x20.MultivariateStudentTDistributionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uncertml.x20.MultivariateStudentTDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uncertml.x20.MultivariateStudentTDistributionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uncertml.x20.MultivariateStudentTDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uncertml.x20.MultivariateStudentTDistributionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uncertml.x20.MultivariateStudentTDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uncertml.x20.MultivariateStudentTDistributionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uncertml.x20.MultivariateStudentTDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uncertml.x20.MultivariateStudentTDistributionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uncertml.x20.MultivariateStudentTDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uncertml.x20.MultivariateStudentTDistributionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uncertml.x20.MultivariateStudentTDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uncertml.x20.MultivariateStudentTDistributionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uncertml.x20.MultivariateStudentTDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uncertml.x20.MultivariateStudentTDistributionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uncertml.x20.MultivariateStudentTDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uncertml.x20.MultivariateStudentTDistributionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uncertml.x20.MultivariateStudentTDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uncertml.x20.MultivariateStudentTDistributionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uncertml.x20.MultivariateStudentTDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uncertml.x20.MultivariateStudentTDistributionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uncertml.x20.MultivariateStudentTDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uncertml.x20.MultivariateStudentTDistributionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uncertml.x20.MultivariateStudentTDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uncertml.x20.MultivariateStudentTDistributionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uncertml.x20.MultivariateStudentTDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uncertml.x20.MultivariateStudentTDistributionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uncertml.x20.MultivariateStudentTDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uncertml.x20.MultivariateStudentTDistributionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uncertml.x20.MultivariateStudentTDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uncertml.x20.MultivariateStudentTDistributionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uncertml.x20.MultivariateStudentTDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
