package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDistributionRetrieveOutputModelDistributionInstanceAnalysis;
import org.bian.dto.BQDistributionRetrieveOutputModelDistributionInstanceRecord;
import org.bian.dto.BQDistributionRetrieveOutputModelDistributionInstanceReport;
import org.bian.dto.BQDistributionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDistributionRetrieveOutputModel
 */
public class BQDistributionRetrieveOutputModel   {
  private BQDistributionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord = null;

  private BQDistributionRetrieveOutputModelDistributionInstanceRecord distributionInstanceRecord = null;

  private String distributionRetrieveActionTaskReference = null;

  private Object distributionRetrieveActionTaskRecord = null;

  private String distributionRetrieveActionResponse = null;

  private BQDistributionRetrieveOutputModelDistributionInstanceReport distributionInstanceReport = null;

  private BQDistributionRetrieveOutputModelDistributionInstanceAnalysis distributionInstanceAnalysis = null;


  /**
   * Get informationFeedSwitchoperatingSessionInstanceRecord
   * @return informationFeedSwitchoperatingSessionInstanceRecord
  **/

  public BQDistributionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceRecord getInformationFeedSwitchoperatingSessionInstanceRecord() {
    return informationFeedSwitchoperatingSessionInstanceRecord;
  }

  public void setInformationFeedSwitchoperatingSessionInstanceRecord(BQDistributionRetrieveOutputModelInformationFeedSwitchoperatingSessionInstanceRecord informationFeedSwitchoperatingSessionInstanceRecord) {
    this.informationFeedSwitchoperatingSessionInstanceRecord = informationFeedSwitchoperatingSessionInstanceRecord;
  }


  /**
   * Get distributionInstanceRecord
   * @return distributionInstanceRecord
  **/

  public BQDistributionRetrieveOutputModelDistributionInstanceRecord getDistributionInstanceRecord() {
    return distributionInstanceRecord;
  }

  public void setDistributionInstanceRecord(BQDistributionRetrieveOutputModelDistributionInstanceRecord distributionInstanceRecord) {
    this.distributionInstanceRecord = distributionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Distribution instance retrieve service call 
   * @return distributionRetrieveActionTaskReference
  **/

  public String getDistributionRetrieveActionTaskReference() {
    return distributionRetrieveActionTaskReference;
  }

  public void setDistributionRetrieveActionTaskReference(String distributionRetrieveActionTaskReference) {
    this.distributionRetrieveActionTaskReference = distributionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return distributionRetrieveActionTaskRecord
  **/

  public Object getDistributionRetrieveActionTaskRecord() {
    return distributionRetrieveActionTaskRecord;
  }

  public void setDistributionRetrieveActionTaskRecord(Object distributionRetrieveActionTaskRecord) {
    this.distributionRetrieveActionTaskRecord = distributionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return distributionRetrieveActionResponse
  **/

  public String getDistributionRetrieveActionResponse() {
    return distributionRetrieveActionResponse;
  }

  public void setDistributionRetrieveActionResponse(String distributionRetrieveActionResponse) {
    this.distributionRetrieveActionResponse = distributionRetrieveActionResponse;
  }


  /**
   * Get distributionInstanceReport
   * @return distributionInstanceReport
  **/

  public BQDistributionRetrieveOutputModelDistributionInstanceReport getDistributionInstanceReport() {
    return distributionInstanceReport;
  }

  public void setDistributionInstanceReport(BQDistributionRetrieveOutputModelDistributionInstanceReport distributionInstanceReport) {
    this.distributionInstanceReport = distributionInstanceReport;
  }


  /**
   * Get distributionInstanceAnalysis
   * @return distributionInstanceAnalysis
  **/

  public BQDistributionRetrieveOutputModelDistributionInstanceAnalysis getDistributionInstanceAnalysis() {
    return distributionInstanceAnalysis;
  }

  public void setDistributionInstanceAnalysis(BQDistributionRetrieveOutputModelDistributionInstanceAnalysis distributionInstanceAnalysis) {
    this.distributionInstanceAnalysis = distributionInstanceAnalysis;
  }


}

