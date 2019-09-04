package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInformationFeedSwitchoperatingSessionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceAnalysis
 */
public class CRInformationFeedSwitchoperatingSessionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceAnalysis   {
  private String informationFeedSwitchoperatingSessionInstanceAnalysisData = null;

  private String informationFeedSwitchoperatingSessionInstanceAnalysisReportType = null;

  private Object informationFeedSwitchoperatingSessionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return informationFeedSwitchoperatingSessionInstanceAnalysisData
  **/

  public String getInformationFeedSwitchoperatingSessionInstanceAnalysisData() {
    return informationFeedSwitchoperatingSessionInstanceAnalysisData;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceAnalysisData(String informationFeedSwitchoperatingSessionInstanceAnalysisData) {
    this.informationFeedSwitchoperatingSessionInstanceAnalysisData = informationFeedSwitchoperatingSessionInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return informationFeedSwitchoperatingSessionInstanceAnalysisReport
  **/

  public Object getInformationFeedSwitchoperatingSessionInstanceAnalysisReport() {
    return informationFeedSwitchoperatingSessionInstanceAnalysisReport;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceAnalysisReport(Object informationFeedSwitchoperatingSessionInstanceAnalysisReport) {
    this.informationFeedSwitchoperatingSessionInstanceAnalysisReport = informationFeedSwitchoperatingSessionInstanceAnalysisReport;
  }


}

