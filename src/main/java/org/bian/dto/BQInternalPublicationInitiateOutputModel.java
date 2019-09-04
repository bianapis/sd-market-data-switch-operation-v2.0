package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInternalPublicationInitiateInputModelInformationFeedSwitchoperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInternalPublicationInitiateOutputModel
 */
public class BQInternalPublicationInitiateOutputModel   {
  private BQInternalPublicationInitiateInputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord = null;

  private String internalPublicationInstanceReference = null;

  private String internalPublicationInitiateActionReference = null;

  private Object internalPublicationInitiateActionRecord = null;

  private String internalPublicationInstanceStatus = null;


  /**
   * Get informationFeedSwitchoperatingSessionInstanceRecord
   * @return informationFeedSwitchoperatingSessionInstanceRecord
  **/

  public BQInternalPublicationInitiateInputModelInformationFeedSwitchoperatingSessionInstanceRecord getInformationFeedSwitchoperatingSessionInstanceRecord() {
    return informationFeedSwitchoperatingSessionInstanceRecord;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceRecord(BQInternalPublicationInitiateInputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord) {
    this.informationFeedSwitchoperatingSessionInstanceRecord = informationFeedSwitchoperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Internal Publication instance 
   * @return internalPublicationInstanceReference
  **/

  public String getInternalPublicationInstanceReference() {
    return internalPublicationInstanceReference;
  }

  public void setInternalPublicationInstanceReference(String internalPublicationInstanceReference) {
    this.internalPublicationInstanceReference = internalPublicationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return internalPublicationInitiateActionReference
  **/

  public String getInternalPublicationInitiateActionReference() {
    return internalPublicationInitiateActionReference;
  }

  public void setInternalPublicationInitiateActionReference(String internalPublicationInitiateActionReference) {
    this.internalPublicationInitiateActionReference = internalPublicationInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return internalPublicationInitiateActionRecord
  **/

  public Object getInternalPublicationInitiateActionRecord() {
    return internalPublicationInitiateActionRecord;
  }

  public void setInternalPublicationInitiateActionRecord(Object internalPublicationInitiateActionRecord) {
    this.internalPublicationInitiateActionRecord = internalPublicationInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Internal Publication instance (e.g. initialised, pending, active) 
   * @return internalPublicationInstanceStatus
  **/

  public String getInternalPublicationInstanceStatus() {
    return internalPublicationInstanceStatus;
  }

  public void setInternalPublicationInstanceStatus(String internalPublicationInstanceStatus) {
    this.internalPublicationInstanceStatus = internalPublicationInstanceStatus;
  }


}

