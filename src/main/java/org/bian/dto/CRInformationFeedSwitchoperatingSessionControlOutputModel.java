package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInformationFeedSwitchoperatingSessionControlOutputModel
 */
public class CRInformationFeedSwitchoperatingSessionControlOutputModel   {
  private String informationFeedSwitchoperatingSessionControlActionTaskReference = null;

  private Object informationFeedSwitchoperatingSessionControlActionTaskRecord = null;

  private String informationFeedSwitchoperatingSessionControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Information Feed Switch operating Session instance control processing service call 
   * @return informationFeedSwitchoperatingSessionControlActionTaskReference
  **/

  public String getInformationFeedSwitchoperatingSessionControlActionTaskReference() {
    return informationFeedSwitchoperatingSessionControlActionTaskReference;
  }

  public void setInformationFeedSwitchoperatingSessionControlActionTaskReference(String informationFeedSwitchoperatingSessionControlActionTaskReference) {
    this.informationFeedSwitchoperatingSessionControlActionTaskReference = informationFeedSwitchoperatingSessionControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return informationFeedSwitchoperatingSessionControlActionTaskRecord
  **/

  public Object getInformationFeedSwitchoperatingSessionControlActionTaskRecord() {
    return informationFeedSwitchoperatingSessionControlActionTaskRecord;
  }

  public void setInformationFeedSwitchoperatingSessionControlActionTaskRecord(Object informationFeedSwitchoperatingSessionControlActionTaskRecord) {
    this.informationFeedSwitchoperatingSessionControlActionTaskRecord = informationFeedSwitchoperatingSessionControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return informationFeedSwitchoperatingSessionControlActionResponse
  **/

  public String getInformationFeedSwitchoperatingSessionControlActionResponse() {
    return informationFeedSwitchoperatingSessionControlActionResponse;
  }

  public void setInformationFeedSwitchoperatingSessionControlActionResponse(String informationFeedSwitchoperatingSessionControlActionResponse) {
    this.informationFeedSwitchoperatingSessionControlActionResponse = informationFeedSwitchoperatingSessionControlActionResponse;
  }


}

