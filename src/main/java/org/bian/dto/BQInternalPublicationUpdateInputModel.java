package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInternalPublicationUpdateInputModel
 */
public class BQInternalPublicationUpdateInputModel   {
  private String informationFeedSwitchoperatingSessionInstanceReference = null;

  private String internalPublicationInstanceReference = null;

  private Object internalPublicationUpdateActionTaskRecord = null;

  private String internalPublicationUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Information Feed Switch operating Session instance 
   * @return informationFeedSwitchoperatingSessionInstanceReference
  **/

  public String getInformationFeedSwitchoperatingSessionInstanceReference() {
    return informationFeedSwitchoperatingSessionInstanceReference;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceReference(String informationFeedSwitchoperatingSessionInstanceReference) {
    this.informationFeedSwitchoperatingSessionInstanceReference = informationFeedSwitchoperatingSessionInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return internalPublicationUpdateActionTaskRecord
  **/

  public Object getInternalPublicationUpdateActionTaskRecord() {
    return internalPublicationUpdateActionTaskRecord;
  }

  public void setInternalPublicationUpdateActionTaskRecord(Object internalPublicationUpdateActionTaskRecord) {
    this.internalPublicationUpdateActionTaskRecord = internalPublicationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return internalPublicationUpdateActionRequest
  **/

  public String getInternalPublicationUpdateActionRequest() {
    return internalPublicationUpdateActionRequest;
  }

  public void setInternalPublicationUpdateActionRequest(String internalPublicationUpdateActionRequest) {
    this.internalPublicationUpdateActionRequest = internalPublicationUpdateActionRequest;
  }


}

