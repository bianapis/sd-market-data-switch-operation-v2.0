package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInformationFeedSwitchoperatingSessionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceAnalysis;
import org.bian.dto.CRInformationFeedSwitchoperatingSessionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceRecord;
import org.bian.dto.CRInformationFeedSwitchoperatingSessionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRInformationFeedSwitchoperatingSessionRetrieveOutputModel
 */
public class CRInformationFeedSwitchoperatingSessionRetrieveOutputModel   {
  private CRInformationFeedSwitchoperatingSessionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord = null;

  private String informationFeedSwitchoperatingSessionRetrieveActionTaskReference = null;

  private Object informationFeedSwitchoperatingSessionRetrieveActionTaskRecord = null;

  private String informationFeedSwitchoperatingSessionRetrieveActionResponse = null;

  private CRInformationFeedSwitchoperatingSessionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceReportRecord informationFeedSwitchoperatingSessionInstanceReportRecord = null;

  private CRInformationFeedSwitchoperatingSessionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceAnalysis informationFeedSwitchoperatingSessionInstanceAnalysis = null;


  /**
   * Get informationFeedSwitchoperatingSessionInstanceRecord
   * @return informationFeedSwitchoperatingSessionInstanceRecord
  **/

  public CRInformationFeedSwitchoperatingSessionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceRecord getInformationFeedSwitchoperatingSessionInstanceRecord() {
    return informationFeedSwitchoperatingSessionInstanceRecord;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceRecord(CRInformationFeedSwitchoperatingSessionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord) {
    this.informationFeedSwitchoperatingSessionInstanceRecord = informationFeedSwitchoperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Information Feed Switch operating Session instance retrieve service call 
   * @return informationFeedSwitchoperatingSessionRetrieveActionTaskReference
  **/

  public String getInformationFeedSwitchoperatingSessionRetrieveActionTaskReference() {
    return informationFeedSwitchoperatingSessionRetrieveActionTaskReference;
  }

  public void setInformationFeedSwitchoperatingSessionRetrieveActionTaskReference(String informationFeedSwitchoperatingSessionRetrieveActionTaskReference) {
    this.informationFeedSwitchoperatingSessionRetrieveActionTaskReference = informationFeedSwitchoperatingSessionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return informationFeedSwitchoperatingSessionRetrieveActionResponse
  **/

  public String getInformationFeedSwitchoperatingSessionRetrieveActionResponse() {
    return informationFeedSwitchoperatingSessionRetrieveActionResponse;
  }

  public void setInformationFeedSwitchoperatingSessionRetrieveActionResponse(String informationFeedSwitchoperatingSessionRetrieveActionResponse) {
    this.informationFeedSwitchoperatingSessionRetrieveActionResponse = informationFeedSwitchoperatingSessionRetrieveActionResponse;
  }


  /**
   * Get informationFeedSwitchoperatingSessionInstanceReportRecord
   * @return informationFeedSwitchoperatingSessionInstanceReportRecord
  **/

  public CRInformationFeedSwitchoperatingSessionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceReportRecord getInformationFeedSwitchoperatingSessionInstanceReportRecord() {
    return informationFeedSwitchoperatingSessionInstanceReportRecord;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceReportRecord(CRInformationFeedSwitchoperatingSessionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceReportRecord informationFeedSwitchoperatingSessionInstanceReportRecord) {
    this.informationFeedSwitchoperatingSessionInstanceReportRecord = informationFeedSwitchoperatingSessionInstanceReportRecord;
  }


  /**
   * Get informationFeedSwitchoperatingSessionInstanceAnalysis
   * @return informationFeedSwitchoperatingSessionInstanceAnalysis
  **/

  public CRInformationFeedSwitchoperatingSessionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceAnalysis getInformationFeedSwitchoperatingSessionInstanceAnalysis() {
    return informationFeedSwitchoperatingSessionInstanceAnalysis;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceAnalysis(CRInformationFeedSwitchoperatingSessionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceAnalysis informationFeedSwitchoperatingSessionInstanceAnalysis) {
    this.informationFeedSwitchoperatingSessionInstanceAnalysis = informationFeedSwitchoperatingSessionInstanceAnalysis;
  }


}

