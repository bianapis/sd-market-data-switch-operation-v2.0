package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDistributionExecuteInputModelDistributionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDistributionExecuteOutputModel
 */
public class BQDistributionExecuteOutputModel   {
  private BQDistributionExecuteInputModelDistributionInstanceRecord distributionInstanceRecord = null;

  private String distributionExecuteActionTaskReference = null;

  private Object distributionExecuteActionTaskRecord = null;

  private String distributionExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get distributionInstanceRecord
   * @return distributionInstanceRecord
  **/

  public BQDistributionExecuteInputModelDistributionInstanceRecord getDistributionInstanceRecord() {
    return distributionInstanceRecord;
  }

  public void setDistributionInstanceRecord(BQDistributionExecuteInputModelDistributionInstanceRecord distributionInstanceRecord) {
    this.distributionInstanceRecord = distributionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Distribution instance execute service call 
   * @return distributionExecuteActionTaskReference
  **/

  public String getDistributionExecuteActionTaskReference() {
    return distributionExecuteActionTaskReference;
  }

  public void setDistributionExecuteActionTaskReference(String distributionExecuteActionTaskReference) {
    this.distributionExecuteActionTaskReference = distributionExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return distributionExecuteActionTaskRecord
  **/

  public Object getDistributionExecuteActionTaskRecord() {
    return distributionExecuteActionTaskRecord;
  }

  public void setDistributionExecuteActionTaskRecord(Object distributionExecuteActionTaskRecord) {
    this.distributionExecuteActionTaskRecord = distributionExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Distribution execute transaction/record 
   * @return distributionExecuteRecordReference
  **/

  public String getDistributionExecuteRecordReference() {
    return distributionExecuteRecordReference;
  }

  public void setDistributionExecuteRecordReference(String distributionExecuteRecordReference) {
    this.distributionExecuteRecordReference = distributionExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

