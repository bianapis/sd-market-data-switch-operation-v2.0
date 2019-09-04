package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInternalPublicationRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceRecord;
import org.bian.dto.BQInternalPublicationRetrieveOutputModelInternalPublicationInstanceAnalysis;
import org.bian.dto.BQInternalPublicationRetrieveOutputModelInternalPublicationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInternalPublicationRetrieveOutputModel
 */
public class BQInternalPublicationRetrieveOutputModel   {
  private BQInternalPublicationRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord = null;

  private String internalPublicationRetrieveActionTaskReference = null;

  private Object internalPublicationRetrieveActionTaskRecord = null;

  private String internalPublicationRetrieveActionResponse = null;

  private BQInternalPublicationRetrieveOutputModelInternalPublicationInstanceReport internalPublicationInstanceReport = null;

  private BQInternalPublicationRetrieveOutputModelInternalPublicationInstanceAnalysis internalPublicationInstanceAnalysis = null;


  /**
   * Get informationFeedSwitchoperatingSessionInstanceRecord
   * @return informationFeedSwitchoperatingSessionInstanceRecord
  **/

  public BQInternalPublicationRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceRecord getInformationFeedSwitchoperatingSessionInstanceRecord() {
    return informationFeedSwitchoperatingSessionInstanceRecord;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceRecord(BQInternalPublicationRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord) {
    this.informationFeedSwitchoperatingSessionInstanceRecord = informationFeedSwitchoperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Internal Publication instance retrieve service call 
   * @return internalPublicationRetrieveActionTaskReference
  **/

  public String getInternalPublicationRetrieveActionTaskReference() {
    return internalPublicationRetrieveActionTaskReference;
  }

  public void setInternalPublicationRetrieveActionTaskReference(String internalPublicationRetrieveActionTaskReference) {
    this.internalPublicationRetrieveActionTaskReference = internalPublicationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return internalPublicationRetrieveActionTaskRecord
  **/

  public Object getInternalPublicationRetrieveActionTaskRecord() {
    return internalPublicationRetrieveActionTaskRecord;
  }

  public void setInternalPublicationRetrieveActionTaskRecord(Object internalPublicationRetrieveActionTaskRecord) {
    this.internalPublicationRetrieveActionTaskRecord = internalPublicationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return internalPublicationRetrieveActionResponse
  **/

  public String getInternalPublicationRetrieveActionResponse() {
    return internalPublicationRetrieveActionResponse;
  }

  public void setInternalPublicationRetrieveActionResponse(String internalPublicationRetrieveActionResponse) {
    this.internalPublicationRetrieveActionResponse = internalPublicationRetrieveActionResponse;
  }


  /**
   * Get internalPublicationInstanceReport
   * @return internalPublicationInstanceReport
  **/

  public BQInternalPublicationRetrieveOutputModelInternalPublicationInstanceReport getInternalPublicationInstanceReport() {
    return internalPublicationInstanceReport;
  }

  public void setInternalPublicationInstanceReport(BQInternalPublicationRetrieveOutputModelInternalPublicationInstanceReport internalPublicationInstanceReport) {
    this.internalPublicationInstanceReport = internalPublicationInstanceReport;
  }


  /**
   * Get internalPublicationInstanceAnalysis
   * @return internalPublicationInstanceAnalysis
  **/

  public BQInternalPublicationRetrieveOutputModelInternalPublicationInstanceAnalysis getInternalPublicationInstanceAnalysis() {
    return internalPublicationInstanceAnalysis;
  }

  public void setInternalPublicationInstanceAnalysis(BQInternalPublicationRetrieveOutputModelInternalPublicationInstanceAnalysis internalPublicationInstanceAnalysis) {
    this.internalPublicationInstanceAnalysis = internalPublicationInstanceAnalysis;
  }


}

