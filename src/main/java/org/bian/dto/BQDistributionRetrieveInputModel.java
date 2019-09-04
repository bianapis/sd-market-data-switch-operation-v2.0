package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDistributionRetrieveInputModelDistributionInstanceAnalysis;
import org.bian.dto.BQDistributionRetrieveInputModelDistributionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDistributionRetrieveInputModel
 */
public class BQDistributionRetrieveInputModel   {
  private Object distributionRetrieveActionTaskRecord = null;

  private String distributionRetrieveActionRequest = null;

  private BQDistributionRetrieveInputModelDistributionInstanceReport distributionInstanceReport = null;

  private BQDistributionRetrieveInputModelDistributionInstanceAnalysis distributionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return distributionRetrieveActionTaskRecord
  **/

  public Object getDistributionRetrieveActionTaskRecord() {
    return distributionRetrieveActionTaskRecord;
  }

  public void setDistributionRetrieveActionTaskRecord(Object distributionRetrieveActionTaskRecord) {
    this.distributionRetrieveActionTaskRecord = distributionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return distributionRetrieveActionRequest
  **/

  public String getDistributionRetrieveActionRequest() {
    return distributionRetrieveActionRequest;
  }

  public void setDistributionRetrieveActionRequest(String distributionRetrieveActionRequest) {
    this.distributionRetrieveActionRequest = distributionRetrieveActionRequest;
  }


  /**
   * Get distributionInstanceReport
   * @return distributionInstanceReport
  **/

  public BQDistributionRetrieveInputModelDistributionInstanceReport getDistributionInstanceReport() {
    return distributionInstanceReport;
  }

  public void setDistributionInstanceReport(BQDistributionRetrieveInputModelDistributionInstanceReport distributionInstanceReport) {
    this.distributionInstanceReport = distributionInstanceReport;
  }


  /**
   * Get distributionInstanceAnalysis
   * @return distributionInstanceAnalysis
  **/

  public BQDistributionRetrieveInputModelDistributionInstanceAnalysis getDistributionInstanceAnalysis() {
    return distributionInstanceAnalysis;
  }

  public void setDistributionInstanceAnalysis(BQDistributionRetrieveInputModelDistributionInstanceAnalysis distributionInstanceAnalysis) {
    this.distributionInstanceAnalysis = distributionInstanceAnalysis;
  }


}

