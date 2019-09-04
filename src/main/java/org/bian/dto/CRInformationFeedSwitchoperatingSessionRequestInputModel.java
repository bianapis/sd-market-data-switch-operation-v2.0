package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInformationFeedSwitchoperatingSessionRequestInputModelInformationFeedSwitchoperatingSessionInstanceRecord;
import org.bian.dto.CRInformationFeedSwitchoperatingSessionRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRInformationFeedSwitchoperatingSessionRequestInputModel
 */
public class CRInformationFeedSwitchoperatingSessionRequestInputModel   {
  private String marketDataSwitchOperationServicingSessionReference = null;

  private String informationFeedSwitchoperatingSessionInstanceReference = null;

  private CRInformationFeedSwitchoperatingSessionRequestInputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord = null;

  private Object informationFeedSwitchoperatingSessionRequestActionTaskRecord = null;

  private CRInformationFeedSwitchoperatingSessionRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRInformationFeedSwitchoperatingSessionRequestInputModelInformationFeedSwitchoperatingSessionInstanceRecord getInformationFeedSwitchoperatingSessionInstanceRecord() {
    return informationFeedSwitchoperatingSessionInstanceRecord;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceRecord(CRInformationFeedSwitchoperatingSessionRequestInputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord) {
    this.informationFeedSwitchoperatingSessionInstanceRecord = informationFeedSwitchoperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return informationFeedSwitchoperatingSessionRequestActionTaskRecord
  **/

  public Object getInformationFeedSwitchoperatingSessionRequestActionTaskRecord() {
    return informationFeedSwitchoperatingSessionRequestActionTaskRecord;
  }

  public void setInformationFeedSwitchoperatingSessionRequestActionTaskRecord(Object informationFeedSwitchoperatingSessionRequestActionTaskRecord) {
    this.informationFeedSwitchoperatingSessionRequestActionTaskRecord = informationFeedSwitchoperatingSessionRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRInformationFeedSwitchoperatingSessionRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRInformationFeedSwitchoperatingSessionRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

