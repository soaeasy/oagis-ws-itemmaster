
package org.soaeasy.ws.oagis.itemmaster._10;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import org.openapplications.oagis._10.GetItemMasterType;
import org.openapplications.oagis._10.ObjectFactory;
import org.openapplications.oagis._10.ShowItemMasterType;
import org.openapplications.oagis._10.SyncItemMasterType;
import org.openapplications.oagis._10.SyncResponseItemMasterType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ItemMasterPortType", targetNamespace = "http://www.soaeasy.org/ws/oagis/itemmaster/10")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ItemMasterPortType {


    /**
     * 
     * @param getItemMaster
     * @return
     *     returns org.openapplications.oagis._10.ShowItemMasterType
     */
    @WebMethod(operationName = "GetItemMaster")
    @WebResult(name = "ShowItemMaster", targetNamespace = "http://www.openapplications.org/oagis/10", partName = "ShowItemMaster")
    public ShowItemMasterType getItemMaster(
        @WebParam(name = "GetItemMaster", targetNamespace = "http://www.openapplications.org/oagis/10", partName = "GetItemMaster")
        GetItemMasterType getItemMaster);

    /**
     * 
     * @param syncItemMaster
     * @return
     *     returns org.openapplications.oagis._10.SyncResponseItemMasterType
     */
    @WebMethod(operationName = "SyncItemMaster")
    @WebResult(name = "SyncResponseItemMaster", targetNamespace = "http://www.openapplications.org/oagis/10", partName = "SyncResponseItemMaster")
    public SyncResponseItemMasterType syncItemMaster(
        @WebParam(name = "SyncItemMaster", targetNamespace = "http://www.openapplications.org/oagis/10", partName = "SyncItemMaster")
        SyncItemMasterType syncItemMaster);

}
