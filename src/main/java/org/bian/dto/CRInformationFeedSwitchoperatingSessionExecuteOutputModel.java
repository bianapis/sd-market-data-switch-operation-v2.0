package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInformationFeedSwitchoperatingSessionExecuteOutputModelInformationFeedSwitchoperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRInformationFeedSwitchoperatingSessionExecuteOutputModel
 */
public class CRInformationFeedSwitchoperatingSessionExecuteOutputModel   {
  private CRInformationFeedSwitchoperatingSessionExecuteOutputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord = null;

  private String informationFeedSwitchoperatingSessionExecuteActionTaskReference = null;

  private Object informationFeedSwitchoperatingSessionExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Information Feed Switch operating Session instance execute service call 
   * @return informationFeedSwitchoperatingSessionExecuteActionTaskReference
  **/

  public String getInformationFeedSwitchoperatingSessionExecuteActionTaskReference() {
    return informationFeedSwitchoperatingSessionExecuteActionTaskReference;
  }

  public void setInformationFeedSwitchoperatingSessionExecuteActionTaskReference(String informationFeedSwitchoperatingSessionExecuteActionTaskReference) {
    this.informationFeedSwitchoperatingSessionExecuteActionTaskReference = informationFeedSwitchoperatingSessionExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return informationFeedSwitchoperatingSessionExecuteActionTaskRecord
  **/

  public Object getInformationFeedSwitchoperatingSessionExecuteActionTaskRecord() {
    return informationFeedSwitchoperatingSessionExecuteActionTaskRecord;
  }

  public void setInformationFeedSwitchoperatingSessionExecuteActionTaskRecord(Object informationFeedSwitchoperatingSessionExecuteActionTaskRecord) {
    this.informationFeedSwitchoperatingSessionExecuteActionTaskRecord = informationFeedSwitchoperatingSessionExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

