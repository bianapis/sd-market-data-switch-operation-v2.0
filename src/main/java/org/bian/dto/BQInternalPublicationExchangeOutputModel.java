package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInternalPublicationExchangeOutputModel
 */
public class BQInternalPublicationExchangeOutputModel   {
  private String internalPublicationExchangeActionTaskReference = null;

  private Object internalPublicationExchangeActionTaskRecord = null;

  private String internalPublicationExchangeActionResponse = null;

  private String internalPublicationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Internal Publication instance exchange service call 
   * @return internalPublicationExchangeActionTaskReference
  **/

  public String getInternalPublicationExchangeActionTaskReference() {
    return internalPublicationExchangeActionTaskReference;
  }

  public void setInternalPublicationExchangeActionTaskReference(String internalPublicationExchangeActionTaskReference) {
    this.internalPublicationExchangeActionTaskReference = internalPublicationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return internalPublicationExchangeActionTaskRecord
  **/

  public Object getInternalPublicationExchangeActionTaskRecord() {
    return internalPublicationExchangeActionTaskRecord;
  }

  public void setInternalPublicationExchangeActionTaskRecord(Object internalPublicationExchangeActionTaskRecord) {
    this.internalPublicationExchangeActionTaskRecord = internalPublicationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return internalPublicationExchangeActionResponse
  **/

  public String getInternalPublicationExchangeActionResponse() {
    return internalPublicationExchangeActionResponse;
  }

  public void setInternalPublicationExchangeActionResponse(String internalPublicationExchangeActionResponse) {
    this.internalPublicationExchangeActionResponse = internalPublicationExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Internal Publication instance (e.g. accepted, rejected, verified) 
   * @return internalPublicationInstanceStatus
  **/

  public String getInternalPublicationInstanceStatus() {
    return internalPublicationInstanceStatus;
  }

  public void setInternalPublicationInstanceStatus(String internalPublicationInstanceStatus) {
    this.internalPublicationInstanceStatus = internalPublicationInstanceStatus;
  }


}

