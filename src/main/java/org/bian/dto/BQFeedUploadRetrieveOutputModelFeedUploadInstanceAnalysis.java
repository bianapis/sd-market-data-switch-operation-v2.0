package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFeedUploadRetrieveOutputModelFeedUploadInstanceAnalysis
 */
public class BQFeedUploadRetrieveOutputModelFeedUploadInstanceAnalysis   {
  private Object feedUploadInstanceAnalysisRecord = null;

  private String feedUploadInstanceAnalysisReportType = null;

  private String feedUploadInstanceAnalysisParameters = null;

  private Object feedUploadInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return feedUploadInstanceAnalysisRecord
  **/

  public Object getFeedUploadInstanceAnalysisRecord() {
    return feedUploadInstanceAnalysisRecord;
  }

  public void setFeedUploadInstanceAnalysisRecord(Object feedUploadInstanceAnalysisRecord) {
    this.feedUploadInstanceAnalysisRecord = feedUploadInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return feedUploadInstanceAnalysisReportType
  **/

  public String getFeedUploadInstanceAnalysisReportType() {
    return feedUploadInstanceAnalysisReportType;
  }

  public void setFeedUploadInstanceAnalysisReportType(String feedUploadInstanceAnalysisReportType) {
    this.feedUploadInstanceAnalysisReportType = feedUploadInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return feedUploadInstanceAnalysisParameters
  **/

  public String getFeedUploadInstanceAnalysisParameters() {
    return feedUploadInstanceAnalysisParameters;
  }

  public void setFeedUploadInstanceAnalysisParameters(String feedUploadInstanceAnalysisParameters) {
    this.feedUploadInstanceAnalysisParameters = feedUploadInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return feedUploadInstanceAnalysisReport
  **/

  public Object getFeedUploadInstanceAnalysisReport() {
    return feedUploadInstanceAnalysisReport;
  }

  public void setFeedUploadInstanceAnalysisReport(Object feedUploadInstanceAnalysisReport) {
    this.feedUploadInstanceAnalysisReport = feedUploadInstanceAnalysisReport;
  }


}

