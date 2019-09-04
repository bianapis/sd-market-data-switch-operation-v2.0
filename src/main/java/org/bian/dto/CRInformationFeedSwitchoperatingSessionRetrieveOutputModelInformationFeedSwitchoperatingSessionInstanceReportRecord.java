package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInformationFeedSwitchoperatingSessionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceReportRecord
 */
public class CRInformationFeedSwitchoperatingSessionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceReportRecord   {
  private String informationFeedSwitchoperatingSessionInstanceReportData = null;

  private String informationFeedSwitchoperatingSessionInstanceReportType = null;

  private Object informationFeedSwitchoperatingSessionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return informationFeedSwitchoperatingSessionInstanceReportData
  **/

  public String getInformationFeedSwitchoperatingSessionInstanceReportData() {
    return informationFeedSwitchoperatingSessionInstanceReportData;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceReportData(String informationFeedSwitchoperatingSessionInstanceReportData) {
    this.informationFeedSwitchoperatingSessionInstanceReportData = informationFeedSwitchoperatingSessionInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return informationFeedSwitchoperatingSessionInstanceReport
  **/

  public Object getInformationFeedSwitchoperatingSessionInstanceReport() {
    return informationFeedSwitchoperatingSessionInstanceReport;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceReport(Object informationFeedSwitchoperatingSessionInstanceReport) {
    this.informationFeedSwitchoperatingSessionInstanceReport = informationFeedSwitchoperatingSessionInstanceReport;
  }


}

