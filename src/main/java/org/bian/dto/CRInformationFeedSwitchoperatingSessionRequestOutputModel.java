package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInformationFeedSwitchoperatingSessionExecuteOutputModelInformationFeedSwitchoperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRInformationFeedSwitchoperatingSessionRequestOutputModel
 */
public class CRInformationFeedSwitchoperatingSessionRequestOutputModel   {
  private CRInformationFeedSwitchoperatingSessionExecuteOutputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord = null;

  private String informationFeedSwitchoperatingSessionRequestActionTaskReference = null;

  private Object informationFeedSwitchoperatingSessionRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get informationFeedSwitchoperatingSessionInstanceRecord
   * @return informationFeedSwitchoperatingSessionInstanceRecord
  **/

  public CRInformationFeedSwitchoperatingSessionExecuteOutputModelInformationFeedSwitchoperatingSessionInstanceRecord getInformationFeedSwitchoperatingSessionInstanceRecord() {
    return informationFeedSwitchoperatingSessionInstanceRecord;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceRecord(CRInformationFeedSwitchoperatingSessionExecuteOutputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord) {
    this.informationFeedSwitchoperatingSessionInstanceRecord = informationFeedSwitchoperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Information Feed Switch operating Session instance request service call 
   * @return informationFeedSwitchoperatingSessionRequestActionTaskReference
  **/

  public String getInformationFeedSwitchoperatingSessionRequestActionTaskReference() {
    return informationFeedSwitchoperatingSessionRequestActionTaskReference;
  }

  public void setInformationFeedSwitchoperatingSessionRequestActionTaskReference(String informationFeedSwitchoperatingSessionRequestActionTaskReference) {
    this.informationFeedSwitchoperatingSessionRequestActionTaskReference = informationFeedSwitchoperatingSessionRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return informationFeedSwitchoperatingSessionRequestActionTaskRecord
  **/

  public Object getInformationFeedSwitchoperatingSessionRequestActionTaskRecord() {
    return informationFeedSwitchoperatingSessionRequestActionTaskRecord;
  }

  public void setInformationFeedSwitchoperatingSessionRequestActionTaskRecord(Object informationFeedSwitchoperatingSessionRequestActionTaskRecord) {
    this.informationFeedSwitchoperatingSessionRequestActionTaskRecord = informationFeedSwitchoperatingSessionRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

