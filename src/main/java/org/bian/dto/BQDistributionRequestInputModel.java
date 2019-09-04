package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDistributionRequestInputModelDistributionInstanceRecord;
import org.bian.dto.CRInformationFeedSwitchoperatingSessionRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQDistributionRequestInputModel
 */
public class BQDistributionRequestInputModel   {
  private String informationFeedSwitchoperatingSessionInstanceReference = null;

  private String distributionInstanceReference = null;

  private BQDistributionRequestInputModelDistributionInstanceRecord distributionInstanceRecord = null;

  private Object distributionRequestActionTaskRecord = null;

  private CRInformationFeedSwitchoperatingSessionRequestInputModelRequestRecordType requestRecordType = null;


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

  public BQDistributionRequestInputModelDistributionInstanceRecord getDistributionInstanceRecord() {
    return distributionInstanceRecord;
  }

  public void setDistributionInstanceRecord(BQDistributionRequestInputModelDistributionInstanceRecord distributionInstanceRecord) {
    this.distributionInstanceRecord = distributionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return distributionRequestActionTaskRecord
  **/

  public Object getDistributionRequestActionTaskRecord() {
    return distributionRequestActionTaskRecord;
  }

  public void setDistributionRequestActionTaskRecord(Object distributionRequestActionTaskRecord) {
    this.distributionRequestActionTaskRecord = distributionRequestActionTaskRecord;
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

