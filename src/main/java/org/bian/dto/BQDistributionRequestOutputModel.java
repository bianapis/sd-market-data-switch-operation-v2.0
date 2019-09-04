package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDistributionRequestInputModelDistributionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDistributionRequestOutputModel
 */
public class BQDistributionRequestOutputModel   {
  private BQDistributionRequestInputModelDistributionInstanceRecord distributionInstanceRecord = null;

  private String distributionRequestActionTaskReference = null;

  private Object distributionRequestActionTaskRecord = null;

  private String distributionRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Distribution instance request service call 
   * @return distributionRequestActionTaskReference
  **/

  public String getDistributionRequestActionTaskReference() {
    return distributionRequestActionTaskReference;
  }

  public void setDistributionRequestActionTaskReference(String distributionRequestActionTaskReference) {
    this.distributionRequestActionTaskReference = distributionRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Distribution service request record 
   * @return distributionRequestRecordReference
  **/

  public String getDistributionRequestRecordReference() {
    return distributionRequestRecordReference;
  }

  public void setDistributionRequestRecordReference(String distributionRequestRecordReference) {
    this.distributionRequestRecordReference = distributionRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

