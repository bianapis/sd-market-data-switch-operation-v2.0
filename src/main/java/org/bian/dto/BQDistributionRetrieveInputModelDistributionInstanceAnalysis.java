package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDistributionRetrieveInputModelDistributionInstanceAnalysis
 */
public class BQDistributionRetrieveInputModelDistributionInstanceAnalysis   {
  private String distributionInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return distributionInstanceAnalysisReference
  **/

  public String getDistributionInstanceAnalysisReference() {
    return distributionInstanceAnalysisReference;
  }

  public void setDistributionInstanceAnalysisReference(String distributionInstanceAnalysisReference) {
    this.distributionInstanceAnalysisReference = distributionInstanceAnalysisReference;
  }


}

