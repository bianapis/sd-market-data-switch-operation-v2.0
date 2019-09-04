package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInformationFeedSwitchoperatingSessionRetrieveInputModelInformationFeedSwitchoperatingSessionInstanceAnalysis;
import org.bian.dto.CRInformationFeedSwitchoperatingSessionRetrieveInputModelInformationFeedSwitchoperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRInformationFeedSwitchoperatingSessionRetrieveInputModel
 */
public class CRInformationFeedSwitchoperatingSessionRetrieveInputModel   {
  private Object informationFeedSwitchoperatingSessionRetrieveActionTaskRecord = null;

  private String informationFeedSwitchoperatingSessionRetrieveActionRequest = null;

  private CRInformationFeedSwitchoperatingSessionRetrieveInputModelInformationFeedSwitchoperatingSessionInstanceReportRecord informationFeedSwitchoperatingSessionInstanceReportRecord = null;

  private CRInformationFeedSwitchoperatingSessionRetrieveInputModelInformationFeedSwitchoperatingSessionInstanceAnalysis informationFeedSwitchoperatingSessionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return informationFeedSwitchoperatingSessionRetrieveActionTaskRecord
  **/

  public Object getInformationFeedSwitchoperatingSessionRetrieveActionTaskRecord() {
    return informationFeedSwitchoperatingSessionRetrieveActionTaskRecord;
  }

  public void setInformationFeedSwitchoperatingSessionRetrieveActionTaskRecord(Object informationFeedSwitchoperatingSessionRetrieveActionTaskRecord) {
    this.informationFeedSwitchoperatingSessionRetrieveActionTaskRecord = informationFeedSwitchoperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return informationFeedSwitchoperatingSessionRetrieveActionRequest
  **/

  public String getInformationFeedSwitchoperatingSessionRetrieveActionRequest() {
    return informationFeedSwitchoperatingSessionRetrieveActionRequest;
  }

  public void setInformationFeedSwitchoperatingSessionRetrieveActionRequest(String informationFeedSwitchoperatingSessionRetrieveActionRequest) {
    this.informationFeedSwitchoperatingSessionRetrieveActionRequest = informationFeedSwitchoperatingSessionRetrieveActionRequest;
  }


  /**
   * Get informationFeedSwitchoperatingSessionInstanceReportRecord
   * @return informationFeedSwitchoperatingSessionInstanceReportRecord
  **/

  public CRInformationFeedSwitchoperatingSessionRetrieveInputModelInformationFeedSwitchoperatingSessionInstanceReportRecord getInformationFeedSwitchoperatingSessionInstanceReportRecord() {
    return informationFeedSwitchoperatingSessionInstanceReportRecord;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceReportRecord(CRInformationFeedSwitchoperatingSessionRetrieveInputModelInformationFeedSwitchoperatingSessionInstanceReportRecord informationFeedSwitchoperatingSessionInstanceReportRecord) {
    this.informationFeedSwitchoperatingSessionInstanceReportRecord = informationFeedSwitchoperatingSessionInstanceReportRecord;
  }


  /**
   * Get informationFeedSwitchoperatingSessionInstanceAnalysis
   * @return informationFeedSwitchoperatingSessionInstanceAnalysis
  **/

  public CRInformationFeedSwitchoperatingSessionRetrieveInputModelInformationFeedSwitchoperatingSessionInstanceAnalysis getInformationFeedSwitchoperatingSessionInstanceAnalysis() {
    return informationFeedSwitchoperatingSessionInstanceAnalysis;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceAnalysis(CRInformationFeedSwitchoperatingSessionRetrieveInputModelInformationFeedSwitchoperatingSessionInstanceAnalysis informationFeedSwitchoperatingSessionInstanceAnalysis) {
    this.informationFeedSwitchoperatingSessionInstanceAnalysis = informationFeedSwitchoperatingSessionInstanceAnalysis;
  }


}

