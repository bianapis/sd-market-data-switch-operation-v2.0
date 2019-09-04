package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInternalPublicationInitiateInputModelInformationFeedSwitchoperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInternalPublicationInitiateInputModel
 */
public class BQInternalPublicationInitiateInputModel   {
  private BQInternalPublicationInitiateInputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord = null;

  private String informationFeedSwitchoperatingSessionInstanceReference = null;

  private Object internalPublicationInitiateActionRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return internalPublicationInitiateActionRecord
  **/

  public Object getInternalPublicationInitiateActionRecord() {
    return internalPublicationInitiateActionRecord;
  }

  public void setInternalPublicationInitiateActionRecord(Object internalPublicationInitiateActionRecord) {
    this.internalPublicationInitiateActionRecord = internalPublicationInitiateActionRecord;
  }


}

