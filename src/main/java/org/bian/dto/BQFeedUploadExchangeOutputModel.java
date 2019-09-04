package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFeedUploadExchangeOutputModel
 */
public class BQFeedUploadExchangeOutputModel   {
  private String feedUploadExchangeActionTaskReference = null;

  private Object feedUploadExchangeActionTaskRecord = null;

  private String feedUploadExchangeActionResponse = null;

  private String feedUploadInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Feed Upload instance exchange service call 
   * @return feedUploadExchangeActionTaskReference
  **/

  public String getFeedUploadExchangeActionTaskReference() {
    return feedUploadExchangeActionTaskReference;
  }

  public void setFeedUploadExchangeActionTaskReference(String feedUploadExchangeActionTaskReference) {
    this.feedUploadExchangeActionTaskReference = feedUploadExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return feedUploadExchangeActionResponse
  **/

  public String getFeedUploadExchangeActionResponse() {
    return feedUploadExchangeActionResponse;
  }

  public void setFeedUploadExchangeActionResponse(String feedUploadExchangeActionResponse) {
    this.feedUploadExchangeActionResponse = feedUploadExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Feed Upload instance (e.g. accepted, rejected, verified) 
   * @return feedUploadInstanceStatus
  **/

  public String getFeedUploadInstanceStatus() {
    return feedUploadInstanceStatus;
  }

  public void setFeedUploadInstanceStatus(String feedUploadInstanceStatus) {
    this.feedUploadInstanceStatus = feedUploadInstanceStatus;
  }


}

