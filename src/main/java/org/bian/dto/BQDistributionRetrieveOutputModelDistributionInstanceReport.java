package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDistributionRetrieveOutputModelDistributionInstanceReport
 */
public class BQDistributionRetrieveOutputModelDistributionInstanceReport   {
  private Object distributionInstanceReportRecord = null;

  private String distributionInstanceReportType = null;

  private String distributionInstanceReportParameters = null;

  private Object distributionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return distributionInstanceReportRecord
  **/

  public Object getDistributionInstanceReportRecord() {
    return distributionInstanceReportRecord;
  }

  public void setDistributionInstanceReportRecord(Object distributionInstanceReportRecord) {
    this.distributionInstanceReportRecord = distributionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return distributionInstanceReportType
  **/

  public String getDistributionInstanceReportType() {
    return distributionInstanceReportType;
  }

  public void setDistributionInstanceReportType(String distributionInstanceReportType) {
    this.distributionInstanceReportType = distributionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return distributionInstanceReportParameters
  **/

  public String getDistributionInstanceReportParameters() {
    return distributionInstanceReportParameters;
  }

  public void setDistributionInstanceReportParameters(String distributionInstanceReportParameters) {
    this.distributionInstanceReportParameters = distributionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return distributionInstanceReport
  **/

  public Object getDistributionInstanceReport() {
    return distributionInstanceReport;
  }

  public void setDistributionInstanceReport(Object distributionInstanceReport) {
    this.distributionInstanceReport = distributionInstanceReport;
  }


}

