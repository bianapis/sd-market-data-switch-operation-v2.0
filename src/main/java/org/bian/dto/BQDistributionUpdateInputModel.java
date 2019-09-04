package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDistributionUpdateInputModelDistributionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDistributionUpdateInputModel
 */
public class BQDistributionUpdateInputModel   {
  private String informationFeedSwitchoperatingSessionInstanceReference = null;

  private String distributionInstanceReference = null;

  private BQDistributionUpdateInputModelDistributionInstanceRecord distributionInstanceRecord = null;

  private Object distributionUpdateActionTaskRecord = null;

  private String distributionUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Distribution instance 
   * @return distributionInstanceReference
  **/

  public String getDistributionInstanceReference() {
    return distributionInstanceReference;
  }

  public void setDistributionInstanceReference(String distributionInstanceReference) {
    this.distributionInstanceReference = distributionInstanceReference;
  }


  /**
   * Get distributionInstanceRecord
   * @return distributionInstanceRecord
  **/

  public BQDistributionUpdateInputModelDistributionInstanceRecord getDistributionInstanceRecord() {
    return distributionInstanceRecord;
  }

  public void setDistributionInstanceRecord(BQDistributionUpdateInputModelDistributionInstanceRecord distributionInstanceRecord) {
    this.distributionInstanceRecord = distributionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return distributionUpdateActionTaskRecord
  **/

  public Object getDistributionUpdateActionTaskRecord() {
    return distributionUpdateActionTaskRecord;
  }

  public void setDistributionUpdateActionTaskRecord(Object distributionUpdateActionTaskRecord) {
    this.distributionUpdateActionTaskRecord = distributionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return distributionUpdateActionRequest
  **/

  public String getDistributionUpdateActionRequest() {
    return distributionUpdateActionRequest;
  }

  public void setDistributionUpdateActionRequest(String distributionUpdateActionRequest) {
    this.distributionUpdateActionRequest = distributionUpdateActionRequest;
  }


}

