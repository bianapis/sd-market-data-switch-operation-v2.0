package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFeedUploadExchangeInputModelFeedUploadExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQFeedUploadExchangeInputModel
 */
public class BQFeedUploadExchangeInputModel   {
  private String informationFeedSwitchoperatingSessionInstanceReference = null;

  private String feedUploadInstanceReference = null;

  private Object feedUploadExchangeActionTaskRecord = null;

  private BQFeedUploadExchangeInputModelFeedUploadExchangeActionRequest feedUploadExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Feed Upload instance 
   * @return feedUploadInstanceReference
  **/

  public String getFeedUploadInstanceReference() {
    return feedUploadInstanceReference;
  }

  public void setFeedUploadInstanceReference(String feedUploadInstanceReference) {
    this.feedUploadInstanceReference = feedUploadInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return feedUploadExchangeActionTaskRecord
  **/

  public Object getFeedUploadExchangeActionTaskRecord() {
    return feedUploadExchangeActionTaskRecord;
  }

  public void setFeedUploadExchangeActionTaskRecord(Object feedUploadExchangeActionTaskRecord) {
    this.feedUploadExchangeActionTaskRecord = feedUploadExchangeActionTaskRecord;
  }


  /**
   * Get feedUploadExchangeActionRequest
   * @return feedUploadExchangeActionRequest
  **/

  public BQFeedUploadExchangeInputModelFeedUploadExchangeActionRequest getFeedUploadExchangeActionRequest() {
    return feedUploadExchangeActionRequest;
  }

  public void setFeedUploadExchangeActionRequest(BQFeedUploadExchangeInputModelFeedUploadExchangeActionRequest feedUploadExchangeActionRequest) {
    this.feedUploadExchangeActionRequest = feedUploadExchangeActionRequest;
  }


}

