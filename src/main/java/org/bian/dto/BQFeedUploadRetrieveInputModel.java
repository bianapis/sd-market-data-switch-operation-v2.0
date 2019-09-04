package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFeedUploadRetrieveInputModelFeedUploadInstanceAnalysis;
import org.bian.dto.BQFeedUploadRetrieveInputModelFeedUploadInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFeedUploadRetrieveInputModel
 */
public class BQFeedUploadRetrieveInputModel   {
  private Object feedUploadRetrieveActionTaskRecord = null;

  private String feedUploadRetrieveActionRequest = null;

  private BQFeedUploadRetrieveInputModelFeedUploadInstanceReport feedUploadInstanceReport = null;

  private BQFeedUploadRetrieveInputModelFeedUploadInstanceAnalysis feedUploadInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return feedUploadRetrieveActionRequest
  **/

  public String getFeedUploadRetrieveActionRequest() {
    return feedUploadRetrieveActionRequest;
  }

  public void setFeedUploadRetrieveActionRequest(String feedUploadRetrieveActionRequest) {
    this.feedUploadRetrieveActionRequest = feedUploadRetrieveActionRequest;
  }


  /**
   * Get feedUploadInstanceReport
   * @return feedUploadInstanceReport
  **/

  public BQFeedUploadRetrieveInputModelFeedUploadInstanceReport getFeedUploadInstanceReport() {
    return feedUploadInstanceReport;
  }

  public void setFeedUploadInstanceReport(BQFeedUploadRetrieveInputModelFeedUploadInstanceReport feedUploadInstanceReport) {
    this.feedUploadInstanceReport = feedUploadInstanceReport;
  }


  /**
   * Get feedUploadInstanceAnalysis
   * @return feedUploadInstanceAnalysis
  **/

  public BQFeedUploadRetrieveInputModelFeedUploadInstanceAnalysis getFeedUploadInstanceAnalysis() {
    return feedUploadInstanceAnalysis;
  }

  public void setFeedUploadInstanceAnalysis(BQFeedUploadRetrieveInputModelFeedUploadInstanceAnalysis feedUploadInstanceAnalysis) {
    this.feedUploadInstanceAnalysis = feedUploadInstanceAnalysis;
  }


}

