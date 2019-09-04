package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFeedUploadExchangeInputModelFeedUploadExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQInternalPublicationExchangeInputModel
 */
public class BQInternalPublicationExchangeInputModel   {
  private String informationFeedSwitchoperatingSessionInstanceReference = null;

  private String internalPublicationInstanceReference = null;

  private Object internalPublicationExchangeActionTaskRecord = null;

  private BQFeedUploadExchangeInputModelFeedUploadExchangeActionRequest internalPublicationExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Information Feed Switch operating Session instance 
   * @return informationFeedSwitchoperatingSessionInstanceReference
  **/

  public String getInformationFeedSwitchoperatingSessionInstanceReference() {
    return informationFeedSwitchoperatingSessionInstanceReference;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceReference(String informationFeedSwitchoperatingSessionInstanceReference) {
    this.informationFeedSwitchoperatingSessionInstanceReference = informationFeedSwitchoperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Internal Publication instance 
   * @return internalPublicationInstanceReference
  **/

  public String getInternalPublicationInstanceReference() {
    return internalPublicationInstanceReference;
  }

  public void setInternalPublicationInstanceReference(String internalPublicationInstanceReference) {
    this.internalPublicationInstanceReference = internalPublicationInstanceReference;
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
   * Get internalPublicationExchangeActionRequest
   * @return internalPublicationExchangeActionRequest
  **/

  public BQFeedUploadExchangeInputModelFeedUploadExchangeActionRequest getInternalPublicationExchangeActionRequest() {
    return internalPublicationExchangeActionRequest;
  }

  public void setInternalPublicationExchangeActionRequest(BQFeedUploadExchangeInputModelFeedUploadExchangeActionRequest internalPublicationExchangeActionRequest) {
    this.internalPublicationExchangeActionRequest = internalPublicationExchangeActionRequest;
  }


}

