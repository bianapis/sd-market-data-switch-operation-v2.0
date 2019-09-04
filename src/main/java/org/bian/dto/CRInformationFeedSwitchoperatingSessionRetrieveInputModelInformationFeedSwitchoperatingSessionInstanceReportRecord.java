package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInformationFeedSwitchoperatingSessionRetrieveInputModelInformationFeedSwitchoperatingSessionInstanceReportRecord
 */
public class CRInformationFeedSwitchoperatingSessionRetrieveInputModelInformationFeedSwitchoperatingSessionInstanceReportRecord   {
  private String informationFeedSwitchoperatingSessionInstanceReportReference = null;

  private String informationFeedSwitchoperatingSessionInstanceReportType = null;

  private String informationFeedSwitchoperatingSessionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return informationFeedSwitchoperatingSessionInstanceReportReference
  **/

  public String getInformationFeedSwitchoperatingSessionInstanceReportReference() {
    return informationFeedSwitchoperatingSessionInstanceReportReference;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceReportReference(String informationFeedSwitchoperatingSessionInstanceReportReference) {
    this.informationFeedSwitchoperatingSessionInstanceReportReference = informationFeedSwitchoperatingSessionInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return informationFeedSwitchoperatingSessionInstanceReportType
  **/

  public String getInformationFeedSwitchoperatingSessionInstanceReportType() {
    return informationFeedSwitchoperatingSessionInstanceReportType;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceReportType(String informationFeedSwitchoperatingSessionInstanceReportType) {
    this.informationFeedSwitchoperatingSessionInstanceReportType = informationFeedSwitchoperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return informationFeedSwitchoperatingSessionInstanceReportParameters
  **/

  public String getInformationFeedSwitchoperatingSessionInstanceReportParameters() {
    return informationFeedSwitchoperatingSessionInstanceReportParameters;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceReportParameters(String informationFeedSwitchoperatingSessionInstanceReportParameters) {
    this.informationFeedSwitchoperatingSessionInstanceReportParameters = informationFeedSwitchoperatingSessionInstanceReportParameters;
  }


}

