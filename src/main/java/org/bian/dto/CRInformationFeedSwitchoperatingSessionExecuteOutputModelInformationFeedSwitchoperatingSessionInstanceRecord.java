package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInformationFeedSwitchoperatingSessionExecuteOutputModelInformationFeedSwitchoperatingSessionInstanceRecord
 */
public class CRInformationFeedSwitchoperatingSessionExecuteOutputModelInformationFeedSwitchoperatingSessionInstanceRecord   {
  private String marketInformationFeedServiceProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Sets out the range of information services/pages available - possibly with some form of selection menu 
   * @return marketInformationFeedServiceProfile
  **/

  public String getMarketInformationFeedServiceProfile() {
    return marketInformationFeedServiceProfile;
  }

  public void setMarketInformationFeedServiceProfile(String marketInformationFeedServiceProfile) {
    this.marketInformationFeedServiceProfile = marketInformationFeedServiceProfile;
  }


}

