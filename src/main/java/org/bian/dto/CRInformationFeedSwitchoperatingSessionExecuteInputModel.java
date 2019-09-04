package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInformationFeedSwitchoperatingSessionExecuteInputModelExecuteRecordType;
import org.bian.dto.CRInformationFeedSwitchoperatingSessionExecuteInputModelInformationFeedSwitchoperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRInformationFeedSwitchoperatingSessionExecuteInputModel
 */
public class CRInformationFeedSwitchoperatingSessionExecuteInputModel   {
  private String marketDataSwitchOperationServicingSessionReference = null;

  private String informationFeedSwitchoperatingSessionInstanceReference = null;

  private CRInformationFeedSwitchoperatingSessionExecuteInputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord = null;

  private Object informationFeedSwitchoperatingSessionExecuteActionTaskRecord = null;

  private CRInformationFeedSwitchoperatingSessionExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return marketDataSwitchOperationServicingSessionReference
  **/

  public String getMarketDataSwitchOperationServicingSessionReference() {
    return marketDataSwitchOperationServicingSessionReference;
  }

  public void setMarketDataSwitchOperationServicingSessionReference(String marketDataSwitchOperationServicingSessionReference) {
    this.marketDataSwitchOperationServicingSessionReference = marketDataSwitchOperationServicingSessionReference;
  }


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
   * Get informationFeedSwitchoperatingSessionInstanceRecord
   * @return informationFeedSwitchoperatingSessionInstanceRecord
  **/

  public CRInformationFeedSwitchoperatingSessionExecuteInputModelInformationFeedSwitchoperatingSessionInstanceRecord getInformationFeedSwitchoperatingSessionInstanceRecord() {
    return informationFeedSwitchoperatingSessionInstanceRecord;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceRecord(CRInformationFeedSwitchoperatingSessionExecuteInputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord) {
    this.informationFeedSwitchoperatingSessionInstanceRecord = informationFeedSwitchoperatingSessionInstanceRecord;
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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRInformationFeedSwitchoperatingSessionExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRInformationFeedSwitchoperatingSessionExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

