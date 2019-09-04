package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDistributionUpdateInputModelDistributionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDistributionUpdateOutputModel
 */
public class BQDistributionUpdateOutputModel   {
  private BQDistributionUpdateInputModelDistributionInstanceRecord distributionInstanceRecord = null;

  private String distributionUpdateActionTaskReference = null;

  private Object distributionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return distributionUpdateActionTaskReference
  **/

  public String getDistributionUpdateActionTaskReference() {
    return distributionUpdateActionTaskReference;
  }

  public void setDistributionUpdateActionTaskReference(String distributionUpdateActionTaskReference) {
    this.distributionUpdateActionTaskReference = distributionUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

