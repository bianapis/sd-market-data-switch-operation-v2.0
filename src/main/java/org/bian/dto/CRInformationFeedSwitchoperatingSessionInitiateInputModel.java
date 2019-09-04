package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInformationFeedSwitchoperatingSessionInitiateInputModelInformationFeedSwitchoperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRInformationFeedSwitchoperatingSessionInitiateInputModel
 */
public class CRInformationFeedSwitchoperatingSessionInitiateInputModel   {
  private String marketDataSwitchOperationServicingSessionReference = null;

  private Object informationFeedSwitchoperatingSessionInitiateActionRecord = null;

  private String informationFeedSwitchoperatingSessionInstanceStatus = null;

  private CRInformationFeedSwitchoperatingSessionInitiateInputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord = null;


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


  /**
   * Get informationFeedSwitchoperatingSessionInstanceRecord
   * @return informationFeedSwitchoperatingSessionInstanceRecord
  **/

  public CRInformationFeedSwitchoperatingSessionInitiateInputModelInformationFeedSwitchoperatingSessionInstanceRecord getInformationFeedSwitchoperatingSessionInstanceRecord() {
    return informationFeedSwitchoperatingSessionInstanceRecord;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceRecord(CRInformationFeedSwitchoperatingSessionInitiateInputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord) {
    this.informationFeedSwitchoperatingSessionInstanceRecord = informationFeedSwitchoperatingSessionInstanceRecord;
  }


}

