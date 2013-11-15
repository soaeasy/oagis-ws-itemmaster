
package org.openapplications.oagis._10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openapplications.oagis._10 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SyncResponseItemMaster_QNAME = new QName("http://www.openapplications.org/oagis/10", "SyncResponseItemMaster");
    private final static QName _ShowItemMaster_QNAME = new QName("http://www.openapplications.org/oagis/10", "ShowItemMaster");
    private final static QName _GetItemMaster_QNAME = new QName("http://www.openapplications.org/oagis/10", "GetItemMaster");
    private final static QName _SyncItemMaster_QNAME = new QName("http://www.openapplications.org/oagis/10", "SyncItemMaster");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openapplications.oagis._10
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetItemMasterType }
     * 
     */
    public GetItemMasterType createGetItemMasterType() {
        return new GetItemMasterType();
    }

    /**
     * Create an instance of {@link ShowItemMasterType }
     * 
     */
    public ShowItemMasterType createShowItemMasterType() {
        return new ShowItemMasterType();
    }

    /**
     * Create an instance of {@link SyncResponseItemMasterType }
     * 
     */
    public SyncResponseItemMasterType createSyncResponseItemMasterType() {
        return new SyncResponseItemMasterType();
    }

    /**
     * Create an instance of {@link SyncItemMasterType }
     * 
     */
    public SyncItemMasterType createSyncItemMasterType() {
        return new SyncItemMasterType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncResponseItemMasterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "SyncResponseItemMaster")
    public JAXBElement<SyncResponseItemMasterType> createSyncResponseItemMaster(SyncResponseItemMasterType value) {
        return new JAXBElement<SyncResponseItemMasterType>(_SyncResponseItemMaster_QNAME, SyncResponseItemMasterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowItemMasterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ShowItemMaster")
    public JAXBElement<ShowItemMasterType> createShowItemMaster(ShowItemMasterType value) {
        return new JAXBElement<ShowItemMasterType>(_ShowItemMaster_QNAME, ShowItemMasterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemMasterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "GetItemMaster")
    public JAXBElement<GetItemMasterType> createGetItemMaster(GetItemMasterType value) {
        return new JAXBElement<GetItemMasterType>(_GetItemMaster_QNAME, GetItemMasterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncItemMasterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "SyncItemMaster")
    public JAXBElement<SyncItemMasterType> createSyncItemMaster(SyncItemMasterType value) {
        return new JAXBElement<SyncItemMasterType>(_SyncItemMaster_QNAME, SyncItemMasterType.class, null, value);
    }

}
