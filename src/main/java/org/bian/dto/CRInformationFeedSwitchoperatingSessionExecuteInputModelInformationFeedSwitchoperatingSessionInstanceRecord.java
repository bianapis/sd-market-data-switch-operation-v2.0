package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInformationFeedSwitchoperatingSessionExecuteInputModelInformationFeedSwitchoperatingSessionInstanceRecord
 */
public class CRInformationFeedSwitchoperatingSessionExecuteInputModelInformationFeedSwitchoperatingSessionInstanceRecord   {
  private String marketInformationFeedServiceReference = null;

  private String marketInformationFeedServiceProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the market feed service - Note: the service operated by SD Information Provider Operation actually extracts the feed content 
   * @return marketInformationFeedServiceReference
  **/

  public String getMarketInformationFeedServiceReference() {
    return marketInformationFeedServiceReference;
  }

  public void setMarketInformationFeedServiceReference(String marketInformationFeedServiceReference) {
    this.marketInformationFeedServiceReference = marketInformationFeedServiceReference;
  }


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

