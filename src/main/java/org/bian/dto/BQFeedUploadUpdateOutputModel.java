package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFeedUploadUpdateOutputModel
 */
public class BQFeedUploadUpdateOutputModel   {
  private Object feedUploadInstanceRecord = null;

  private String feedUploadUpdateActionTaskReference = null;

  private Object feedUploadUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: This function handles the upload of records provided by an information provider - through the interface handled by SD Information Provider Operation. Note that this can be a dynamic/interactive exchange with different content requested within the agreed service arrangements. Multiple sources may be managed marketInformationFeedServiceRecordReference:  type: string  example: \"791778\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Reference to packets of information/records provided, perhaps with real-time updates marketInformationFeedServiceRecord:  type: object  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary    general-info: This is the uploaded market information that is distributed over the switch - its content is updated dynamically during the operating session 
   * @return feedUploadInstanceRecord
  **/

  public Object getFeedUploadInstanceRecord() {
    return feedUploadInstanceRecord;
  }

  public void setFeedUploadInstanceRecord(Object feedUploadInstanceRecord) {
    this.feedUploadInstanceRecord = feedUploadInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return feedUploadUpdateActionTaskReference
  **/

  public String getFeedUploadUpdateActionTaskReference() {
    return feedUploadUpdateActionTaskReference;
  }

  public void setFeedUploadUpdateActionTaskReference(String feedUploadUpdateActionTaskReference) {
    this.feedUploadUpdateActionTaskReference = feedUploadUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return feedUploadUpdateActionTaskRecord
  **/

  public Object getFeedUploadUpdateActionTaskRecord() {
    return feedUploadUpdateActionTaskRecord;
  }

  public void setFeedUploadUpdateActionTaskRecord(Object feedUploadUpdateActionTaskRecord) {
    this.feedUploadUpdateActionTaskRecord = feedUploadUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

