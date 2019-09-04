package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInformationFeedSwitchoperatingSessionRetrieveInputModelInformationFeedSwitchoperatingSessionInstanceAnalysis
 */
public class CRInformationFeedSwitchoperatingSessionRetrieveInputModelInformationFeedSwitchoperatingSessionInstanceAnalysis   {
  private String informationFeedSwitchoperatingSessionInstanceAnalysisReference = null;

  private String informationFeedSwitchoperatingSessionInstanceAnalysisReportType = null;

  private String informationFeedSwitchoperatingSessionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return informationFeedSwitchoperatingSessionInstanceAnalysisReference
  **/

  public String getInformationFeedSwitchoperatingSessionInstanceAnalysisReference() {
    return informationFeedSwitchoperatingSessionInstanceAnalysisReference;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceAnalysisReference(String informationFeedSwitchoperatingSessionInstanceAnalysisReference) {
    this.informationFeedSwitchoperatingSessionInstanceAnalysisReference = informationFeedSwitchoperatingSessionInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return informationFeedSwitchoperatingSessionInstanceAnalysisReportType
  **/

  public String getInformationFeedSwitchoperatingSessionInstanceAnalysisReportType() {
    return informationFeedSwitchoperatingSessionInstanceAnalysisReportType;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceAnalysisReportType(String informationFeedSwitchoperatingSessionInstanceAnalysisReportType) {
    this.informationFeedSwitchoperatingSessionInstanceAnalysisReportType = informationFeedSwitchoperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return informationFeedSwitchoperatingSessionInstanceAnalysisParameters
  **/

  public String getInformationFeedSwitchoperatingSessionInstanceAnalysisParameters() {
    return informationFeedSwitchoperatingSessionInstanceAnalysisParameters;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceAnalysisParameters(String informationFeedSwitchoperatingSessionInstanceAnalysisParameters) {
    this.informationFeedSwitchoperatingSessionInstanceAnalysisParameters = informationFeedSwitchoperatingSessionInstanceAnalysisParameters;
  }


}

