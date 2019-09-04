package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDistributionInitiateInputModelDistributionInstanceRecord;
import org.bian.dto.BQDistributionInitiateInputModelInformationFeedSwitchoperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDistributionInitiateOutputModel
 */
public class BQDistributionInitiateOutputModel   {
  private BQDistributionInitiateInputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord = null;

  private String distributionInstanceReference = null;

  private String distributionInitiateActionReference = null;

  private Object distributionInitiateActionRecord = null;

  private String distributionInstanceStatus = null;

  private BQDistributionInitiateInputModelDistributionInstanceRecord distributionInstanceRecord = null;


  /**
   * Get informationFeedSwitchoperatingSessionInstanceRecord
   * @return informationFeedSwitchoperatingSessionInstanceRecord
  **/

  public BQDistributionInitiateInputModelInformationFeedSwitchoperatingSessionInstanceRecord getInformationFeedSwitchoperatingSessionInstanceRecord() {
    return informationFeedSwitchoperatingSessionInstanceRecord;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceRecord(BQDistributionInitiateInputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord) {
    this.informationFeedSwitchoperatingSessionInstanceRecord = informationFeedSwitchoperatingSessionInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return distributionInitiateActionReference
  **/

  public String getDistributionInitiateActionReference() {
    return distributionInitiateActionReference;
  }

  public void setDistributionInitiateActionReference(String distributionInitiateActionReference) {
    this.distributionInitiateActionReference = distributionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return distributionInitiateActionRecord
  **/

  public Object getDistributionInitiateActionRecord() {
    return distributionInitiateActionRecord;
  }

  public void setDistributionInitiateActionRecord(Object distributionInitiateActionRecord) {
    this.distributionInitiateActionRecord = distributionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Distribution instance (e.g. initialised, pending, active) 
   * @return distributionInstanceStatus
  **/

  public String getDistributionInstanceStatus() {
    return distributionInstanceStatus;
  }

  public void setDistributionInstanceStatus(String distributionInstanceStatus) {
    this.distributionInstanceStatus = distributionInstanceStatus;
  }


  /**
   * Get distributionInstanceRecord
   * @return distributionInstanceRecord
  **/

  public BQDistributionInitiateInputModelDistributionInstanceRecord getDistributionInstanceRecord() {
    return distributionInstanceRecord;
  }

  public void setDistributionInstanceRecord(BQDistributionInitiateInputModelDistributionInstanceRecord distributionInstanceRecord) {
    this.distributionInstanceRecord = distributionInstanceRecord;
  }


}

