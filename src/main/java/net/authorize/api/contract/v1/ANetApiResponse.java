//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.26 at 11:27:57 AM PDT 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ANetApiResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ANetApiResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="messages" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}messagesType"/>
 *         &lt;/sequence>
 *         &lt;element name="sessionToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ANetApiResponse", propOrder = {
    "refId",
    "messages",
    "sessionToken"
})
@XmlSeeAlso({
    MobileDeviceLoginResponse.class,
    AuthenticateTestResponse.class,
    GetBatchStatisticsResponse.class,
    GetCustomerShippingAddressResponse.class,
    ARBGetSubscriptionStatusResponse.class,
    DecryptPaymentDataResponse.class,
    ARBCancelSubscriptionResponse.class,
    CreateCustomerPaymentProfileResponse.class,
    ValidateCustomerPaymentProfileResponse.class,
    UpdateCustomerProfileResponse.class,
    ARBGetSubscriptionListResponse.class,
    GetCustomerProfileIdsResponse.class,
    SendCustomerTransactionReceiptResponse.class,
    MobileDeviceRegistrationResponse.class,
    ARBUpdateSubscriptionResponse.class,
    GetUnsettledTransactionListResponse.class,
    GetTransactionListResponse.class,
    DeleteCustomerPaymentProfileResponse.class,
    DeleteCustomerProfileResponse.class,
    DeleteCustomerShippingAddressResponse.class,
    ARBCreateSubscriptionResponse.class,
    GetSettledBatchListResponse.class,
    UpdateSplitTenderGroupResponse.class,
    GetHostedProfilePageResponse.class,
    CreateCustomerProfileResponse.class,
    UpdateCustomerShippingAddressResponse.class,
    UpdateCustomerPaymentProfileResponse.class,
    GetCustomerPaymentProfileResponse.class,
    IsAliveResponse.class,
    CreateCustomerShippingAddressResponse.class,
    CreateTransactionResponse.class,
    GetCustomerProfileResponse.class,
    LogoutResponse.class,
    GetTransactionDetailsResponse.class,
    CreateCustomerProfileTransactionResponse.class
})
public class ANetApiResponse implements java.io.Serializable {

    protected String refId;
    @XmlElement(required = true)
    protected MessagesType messages;
    protected String sessionToken;

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link MessagesType }
     *     
     */
    public MessagesType getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagesType }
     *     
     */
    public void setMessages(MessagesType value) {
        this.messages = value;
    }

    /**
     * Gets the value of the sessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionToken() {
        return sessionToken;
    }

    /**
     * Sets the value of the sessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionToken(String value) {
        this.sessionToken = value;
    }

}
