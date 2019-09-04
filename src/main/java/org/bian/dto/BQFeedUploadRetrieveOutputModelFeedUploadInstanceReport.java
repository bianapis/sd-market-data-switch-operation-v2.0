package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFeedUploadRetrieveOutputModelFeedUploadInstanceReport
 */
public class BQFeedUploadRetrieveOutputModelFeedUploadInstanceReport   {
  private Object feedUploadInstanceReportRecord = null;

  private String feedUploadInstanceReportType = null;

  private String feedUploadInstanceReportParameters = null;

  private Object feedUploadInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return feedUploadInstanceReportRecord
  **/

  public Object getFeedUploadInstanceReportRecord() {
    return feedUploadInstanceReportRecord;
  }

  public void setFeedUploadInstanceReportRecord(Object feedUploadInstanceReportRecord) {
    this.feedUploadInstanceReportRecord = feedUploadInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return feedUploadInstanceReportType
  **/

  public String getFeedUploadInstanceReportType() {
    return feedUploadInstanceReportType;
  }

  public void setFeedUploadInstanceReportType(String feedUploadInstanceReportType) {
    this.feedUploadInstanceReportType = feedUploadInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return feedUploadInstanceReportParameters
  **/

  public String getFeedUploadInstanceReportParameters() {
    return feedUploadInstanceReportParameters;
  }

  public void setFeedUploadInstanceReportParameters(String feedUploadInstanceReportParameters) {
    this.feedUploadInstanceReportParameters = feedUploadInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return feedUploadInstanceReport
  **/

  public Object getFeedUploadInstanceReport() {
    return feedUploadInstanceReport;
  }

  public void setFeedUploadInstanceReport(Object feedUploadInstanceReport) {
    this.feedUploadInstanceReport = feedUploadInstanceReport;
  }


}

