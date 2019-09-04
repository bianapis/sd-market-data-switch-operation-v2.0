package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInformationFeedSwitchoperatingSessionUpdateInputModelInformationFeedSwitchoperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRInformationFeedSwitchoperatingSessionUpdateOutputModel
 */
public class CRInformationFeedSwitchoperatingSessionUpdateOutputModel   {
  private CRInformationFeedSwitchoperatingSessionUpdateInputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord = null;

  private String informationFeedSwitchoperatingSessionUpdateActionTaskReference = null;

  private Object informationFeedSwitchoperatingSessionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get informationFeedSwitchoperatingSessionInstanceRecord
   * @return informationFeedSwitchoperatingSessionInstanceRecord
  **/

  public CRInformationFeedSwitchoperatingSessionUpdateInputModelInformationFeedSwitchoperatingSessionInstanceRecord getInformationFeedSwitchoperatingSessionInstanceRecord() {
    return informationFeedSwitchoperatingSessionInstanceRecord;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceRecord(CRInformationFeedSwitchoperatingSessionUpdateInputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord) {
    this.informationFeedSwitchoperatingSessionInstanceRecord = informationFeedSwitchoperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return informationFeedSwitchoperatingSessionUpdateActionTaskReference
  **/

  public String getInformationFeedSwitchoperatingSessionUpdateActionTaskReference() {
    return informationFeedSwitchoperatingSessionUpdateActionTaskReference;
  }

  public void setInformationFeedSwitchoperatingSessionUpdateActionTaskReference(String informationFeedSwitchoperatingSessionUpdateActionTaskReference) {
    this.informationFeedSwitchoperatingSessionUpdateActionTaskReference = informationFeedSwitchoperatingSessionUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return informationFeedSwitchoperatingSessionUpdateActionTaskRecord
  **/

  public Object getInformationFeedSwitchoperatingSessionUpdateActionTaskRecord() {
    return informationFeedSwitchoperatingSessionUpdateActionTaskRecord;
  }

  public void setInformationFeedSwitchoperatingSessionUpdateActionTaskRecord(Object informationFeedSwitchoperatingSessionUpdateActionTaskRecord) {
    this.informationFeedSwitchoperatingSessionUpdateActionTaskRecord = informationFeedSwitchoperatingSessionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

