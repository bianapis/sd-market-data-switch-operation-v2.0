package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDistributionRetrieveOutputModelDistributionInstanceAnalysis
 */
public class BQDistributionRetrieveOutputModelDistributionInstanceAnalysis   {
  private Object distributionInstanceAnalysisRecord = null;

  private String distributionInstanceAnalysisReportType = null;

  private String distributionInstanceAnalysisParameters = null;

  private Object distributionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return distributionInstanceAnalysisRecord
  **/

  public Object getDistributionInstanceAnalysisRecord() {
    return distributionInstanceAnalysisRecord;
  }

  public void setDistributionInstanceAnalysisRecord(Object distributionInstanceAnalysisRecord) {
    this.distributionInstanceAnalysisRecord = distributionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return distributionInstanceAnalysisReportType
  **/

  public String getDistributionInstanceAnalysisReportType() {
    return distributionInstanceAnalysisReportType;
  }

  public void setDistributionInstanceAnalysisReportType(String distributionInstanceAnalysisReportType) {
    this.distributionInstanceAnalysisReportType = distributionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return distributionInstanceAnalysisParameters
  **/

  public String getDistributionInstanceAnalysisParameters() {
    return distributionInstanceAnalysisParameters;
  }

  public void setDistributionInstanceAnalysisParameters(String distributionInstanceAnalysisParameters) {
    this.distributionInstanceAnalysisParameters = distributionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return distributionInstanceAnalysisReport
  **/

  public Object getDistributionInstanceAnalysisReport() {
    return distributionInstanceAnalysisReport;
  }

  public void setDistributionInstanceAnalysisReport(Object distributionInstanceAnalysisReport) {
    this.distributionInstanceAnalysisReport = distributionInstanceAnalysisReport;
  }


}

