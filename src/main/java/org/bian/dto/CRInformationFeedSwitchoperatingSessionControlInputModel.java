package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInformationFeedSwitchoperatingSessionControlInputModelInformationFeedSwitchoperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRInformationFeedSwitchoperatingSessionControlInputModel
 */
public class CRInformationFeedSwitchoperatingSessionControlInputModel   {
  private String marketDataSwitchOperationServicingSessionReference = null;

  private String informationFeedSwitchoperatingSessionInstanceReference = null;

  private Object informationFeedSwitchoperatingSessionControlActionTaskRecord = null;

  private CRInformationFeedSwitchoperatingSessionControlInputModelInformationFeedSwitchoperatingSessionControlActionRequest informationFeedSwitchoperatingSessionControlActionRequest = null;


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
   * Get informationFeedSwitchoperatingSessionControlActionRequest
   * @return informationFeedSwitchoperatingSessionControlActionRequest
  **/

  public CRInformationFeedSwitchoperatingSessionControlInputModelInformationFeedSwitchoperatingSessionControlActionRequest getInformationFeedSwitchoperatingSessionControlActionRequest() {
    return informationFeedSwitchoperatingSessionControlActionRequest;
  }

  public void setInformationFeedSwitchoperatingSessionControlActionRequest(CRInformationFeedSwitchoperatingSessionControlInputModelInformationFeedSwitchoperatingSessionControlActionRequest informationFeedSwitchoperatingSessionControlActionRequest) {
    this.informationFeedSwitchoperatingSessionControlActionRequest = informationFeedSwitchoperatingSessionControlActionRequest;
  }


}

