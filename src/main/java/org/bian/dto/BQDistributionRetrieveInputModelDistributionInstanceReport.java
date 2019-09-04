package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDistributionRetrieveInputModelDistributionInstanceReport
 */
public class BQDistributionRetrieveInputModelDistributionInstanceReport   {
  private String distributionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return distributionInstanceReportReference
  **/

  public String getDistributionInstanceReportReference() {
    return distributionInstanceReportReference;
  }

  public void setDistributionInstanceReportReference(String distributionInstanceReportReference) {
    this.distributionInstanceReportReference = distributionInstanceReportReference;
  }


}

