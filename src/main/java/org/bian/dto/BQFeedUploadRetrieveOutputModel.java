package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFeedUploadRetrieveOutputModelFeedUploadInstanceAnalysis;
import org.bian.dto.BQFeedUploadRetrieveOutputModelFeedUploadInstanceReport;
import org.bian.dto.BQFeedUploadRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFeedUploadRetrieveOutputModel
 */
public class BQFeedUploadRetrieveOutputModel   {
  private BQFeedUploadRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord = null;

  private Object feedUploadInstanceRecord = null;

  private String feedUploadRetrieveActionTaskReference = null;

  private Object feedUploadRetrieveActionTaskRecord = null;

  private String feedUploadRetrieveActionResponse = null;

  private BQFeedUploadRetrieveOutputModelFeedUploadInstanceReport feedUploadInstanceReport = null;

  private BQFeedUploadRetrieveOutputModelFeedUploadInstanceAnalysis feedUploadInstanceAnalysis = null;


  /**
   * Get informationFeedSwitchoperatingSessionInstanceRecord
   * @return informationFeedSwitchoperatingSessionInstanceRecord
  **/

  public BQFeedUploadRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceRecord getInformationFeedSwitchoperatingSessionInstanceRecord() {
    return informationFeedSwitchoperatingSessionInstanceRecord;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceRecord(BQFeedUploadRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord) {
    this.informationFeedSwitchoperatingSessionInstanceRecord = informationFeedSwitchoperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: This function handles the upload of records provided by an information provider - through the interface handled by SD Information Provider Operation. Note that this can be a dynamic/interactive exchange with different content requested within the agreed service arrangements. Multiple sources may be managed marketInformationFeedServiceRecordReference:  type: string  example: \"750883\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Reference to packets of information/records provided, perhaps with real-time updates marketInformationFeedServiceRecord:  type: object  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary    general-info: This is the uploaded market information that is distributed over the switch - its content is updated dynamically during the operating session 
   * @return feedUploadInstanceRecord
  **/

  public Object getFeedUploadInstanceRecord() {
    return feedUploadInstanceRecord;
  }

  public void setFeedUploadInstanceRecord(Object feedUploadInstanceRecord) {
    this.feedUploadInstanceRecord = feedUploadInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Feed Upload instance retrieve service call 
   * @return feedUploadRetrieveActionTaskReference
  **/

  public String getFeedUploadRetrieveActionTaskReference() {
    return feedUploadRetrieveActionTaskReference;
  }

  public void setFeedUploadRetrieveActionTaskReference(String feedUploadRetrieveActionTaskReference) {
    this.feedUploadRetrieveActionTaskReference = feedUploadRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return feedUploadRetrieveActionTaskRecord
  **/

  public Object getFeedUploadRetrieveActionTaskRecord() {
    return feedUploadRetrieveActionTaskRecord;
  }

  public void setFeedUploadRetrieveActionTaskRecord(Object feedUploadRetrieveActionTaskRecord) {
    this.feedUploadRetrieveActionTaskRecord = feedUploadRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return feedUploadRetrieveActionResponse
  **/

  public String getFeedUploadRetrieveActionResponse() {
    return feedUploadRetrieveActionResponse;
  }

  public void setFeedUploadRetrieveActionResponse(String feedUploadRetrieveActionResponse) {
    this.feedUploadRetrieveActionResponse = feedUploadRetrieveActionResponse;
  }


  /**
   * Get feedUploadInstanceReport
   * @return feedUploadInstanceReport
  **/

  public BQFeedUploadRetrieveOutputModelFeedUploadInstanceReport getFeedUploadInstanceReport() {
    return feedUploadInstanceReport;
  }

  public void setFeedUploadInstanceReport(BQFeedUploadRetrieveOutputModelFeedUploadInstanceReport feedUploadInstanceReport) {
    this.feedUploadInstanceReport = feedUploadInstanceReport;
  }


  /**
   * Get feedUploadInstanceAnalysis
   * @return feedUploadInstanceAnalysis
  **/

  public BQFeedUploadRetrieveOutputModelFeedUploadInstanceAnalysis getFeedUploadInstanceAnalysis() {
    return feedUploadInstanceAnalysis;
  }

  public void setFeedUploadInstanceAnalysis(BQFeedUploadRetrieveOutputModelFeedUploadInstanceAnalysis feedUploadInstanceAnalysis) {
    this.feedUploadInstanceAnalysis = feedUploadInstanceAnalysis;
  }


}

