package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInternalPublicationRetrieveOutputModelInternalPublicationInstanceAnalysis
 */
public class BQInternalPublicationRetrieveOutputModelInternalPublicationInstanceAnalysis   {
  private Object internalPublicationInstanceAnalysisRecord = null;

  private String internalPublicationInstanceAnalysisReportType = null;

  private String internalPublicationInstanceAnalysisParameters = null;

  private Object internalPublicationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return internalPublicationInstanceAnalysisRecord
  **/

  public Object getInternalPublicationInstanceAnalysisRecord() {
    return internalPublicationInstanceAnalysisRecord;
  }

  public void setInternalPublicationInstanceAnalysisRecord(Object internalPublicationInstanceAnalysisRecord) {
    this.internalPublicationInstanceAnalysisRecord = internalPublicationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return internalPublicationInstanceAnalysisReportType
  **/

  public String getInternalPublicationInstanceAnalysisReportType() {
    return internalPublicationInstanceAnalysisReportType;
  }

  public void setInternalPublicationInstanceAnalysisReportType(String internalPublicationInstanceAnalysisReportType) {
    this.internalPublicationInstanceAnalysisReportType = internalPublicationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return internalPublicationInstanceAnalysisParameters
  **/

  public String getInternalPublicationInstanceAnalysisParameters() {
    return internalPublicationInstanceAnalysisParameters;
  }

  public void setInternalPublicationInstanceAnalysisParameters(String internalPublicationInstanceAnalysisParameters) {
    this.internalPublicationInstanceAnalysisParameters = internalPublicationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return internalPublicationInstanceAnalysisReport
  **/

  public Object getInternalPublicationInstanceAnalysisReport() {
    return internalPublicationInstanceAnalysisReport;
  }

  public void setInternalPublicationInstanceAnalysisReport(Object internalPublicationInstanceAnalysisReport) {
    this.internalPublicationInstanceAnalysisReport = internalPublicationInstanceAnalysisReport;
  }


}

