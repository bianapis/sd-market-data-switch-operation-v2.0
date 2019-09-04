package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDistributionRetrieveOutputModelDistributionInstanceRecord
 */
public class BQDistributionRetrieveOutputModelDistributionInstanceRecord   {
  private String marketDataSwitchUserAccessRightsRecordReference = null;

  private Object marketDataSwitchUserAccessRightsRecord = null;

  private Object marketDataSwitchServiceUserSessionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a user's switch service access rights 
   * @return marketDataSwitchUserAccessRightsRecordReference
  **/

  public String getMarketDataSwitchUserAccessRightsRecordReference() {
    return marketDataSwitchUserAccessRightsRecordReference;
  }

  public void setMarketDataSwitchUserAccessRightsRecordReference(String marketDataSwitchUserAccessRightsRecordReference) {
    this.marketDataSwitchUserAccessRightsRecordReference = marketDataSwitchUserAccessRightsRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The users are registered to access different services/information made available through the switch - it is used to control information distribution 
   * @return marketDataSwitchUserAccessRightsRecord
  **/

  public Object getMarketDataSwitchUserAccessRightsRecord() {
    return marketDataSwitchUserAccessRightsRecord;
  }

  public void setMarketDataSwitchUserAccessRightsRecord(Object marketDataSwitchUserAccessRightsRecord) {
    this.marketDataSwitchUserAccessRightsRecord = marketDataSwitchUserAccessRightsRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: This tracks the switch service content that the user will receive for this session - reflecting their user access rights 
   * @return marketDataSwitchServiceUserSessionRecord
  **/

  public Object getMarketDataSwitchServiceUserSessionRecord() {
    return marketDataSwitchServiceUserSessionRecord;
  }

  public void setMarketDataSwitchServiceUserSessionRecord(Object marketDataSwitchServiceUserSessionRecord) {
    this.marketDataSwitchServiceUserSessionRecord = marketDataSwitchServiceUserSessionRecord;
  }


}

