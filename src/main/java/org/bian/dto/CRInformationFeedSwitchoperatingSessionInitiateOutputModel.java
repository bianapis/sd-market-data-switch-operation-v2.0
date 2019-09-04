package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInformationFeedSwitchoperatingSessionInitiateOutputModel
 */
public class CRInformationFeedSwitchoperatingSessionInitiateOutputModel   {
  private String informationFeedSwitchoperatingSessionInstanceReference = null;

  private String informationFeedSwitchoperatingSessionInitiateActionReference = null;

  private Object informationFeedSwitchoperatingSessionInitiateActionRecord = null;

  private String informationFeedSwitchoperatingSessionInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Information Feed Switch operating Session instance 
   * @return informationFeedSwitchoperatingSessionInstanceReference
  **/

  public String getInformationFeedSwitchoperatingSessionInstanceReference() {
    return informationFeedSwitchoperatingSessionInstanceReference;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceReference(String informationFeedSwitchoperatingSessionInstanceReference) {
    this.informationFeedSwitchoperatingSessionInstanceReference = informationFeedSwitchoperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return informationFeedSwitchoperatingSessionInitiateActionReference
  **/

  public String getInformationFeedSwitchoperatingSessionInitiateActionReference() {
    return informationFeedSwitchoperatingSessionInitiateActionReference;
  }

  public void setInformationFeedSwitchoperatingSessionInitiateActionReference(String informationFeedSwitchoperatingSessionInitiateActionReference) {
    this.informationFeedSwitchoperatingSessionInitiateActionReference = informationFeedSwitchoperatingSessionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return informationFeedSwitchoperatingSessionInitiateActionRecord
  **/

  public Object getInformationFeedSwitchoperatingSessionInitiateActionRecord() {
    return informationFeedSwitchoperatingSessionInitiateActionRecord;
  }

  public void setInformationFeedSwitchoperatingSessionInitiateActionRecord(Object informationFeedSwitchoperatingSessionInitiateActionRecord) {
    this.informationFeedSwitchoperatingSessionInitiateActionRecord = informationFeedSwitchoperatingSessionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Information Feed Switch operating Session instance (e.g. initialised, pending, active) 
   * @return informationFeedSwitchoperatingSessionInstanceStatus
  **/

  public String getInformationFeedSwitchoperatingSessionInstanceStatus() {
    return informationFeedSwitchoperatingSessionInstanceStatus;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceStatus(String informationFeedSwitchoperatingSessionInstanceStatus) {
    this.informationFeedSwitchoperatingSessionInstanceStatus = informationFeedSwitchoperatingSessionInstanceStatus;
  }


}

