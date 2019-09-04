package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInternalPublicationRetrieveInputModelInternalPublicationInstanceAnalysis;
import org.bian.dto.BQInternalPublicationRetrieveInputModelInternalPublicationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInternalPublicationRetrieveInputModel
 */
public class BQInternalPublicationRetrieveInputModel   {
  private Object internalPublicationRetrieveActionTaskRecord = null;

  private String internalPublicationRetrieveActionRequest = null;

  private BQInternalPublicationRetrieveInputModelInternalPublicationInstanceReport internalPublicationInstanceReport = null;

  private BQInternalPublicationRetrieveInputModelInternalPublicationInstanceAnalysis internalPublicationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return internalPublicationRetrieveActionTaskRecord
  **/

  public Object getInternalPublicationRetrieveActionTaskRecord() {
    return internalPublicationRetrieveActionTaskRecord;
  }

  public void setInternalPublicationRetrieveActionTaskRecord(Object internalPublicationRetrieveActionTaskRecord) {
    this.internalPublicationRetrieveActionTaskRecord = internalPublicationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return internalPublicationRetrieveActionRequest
  **/

  public String getInternalPublicationRetrieveActionRequest() {
    return internalPublicationRetrieveActionRequest;
  }

  public void setInternalPublicationRetrieveActionRequest(String internalPublicationRetrieveActionRequest) {
    this.internalPublicationRetrieveActionRequest = internalPublicationRetrieveActionRequest;
  }


  /**
   * Get internalPublicationInstanceReport
   * @return internalPublicationInstanceReport
  **/

  public BQInternalPublicationRetrieveInputModelInternalPublicationInstanceReport getInternalPublicationInstanceReport() {
    return internalPublicationInstanceReport;
  }

  public void setInternalPublicationInstanceReport(BQInternalPublicationRetrieveInputModelInternalPublicationInstanceReport internalPublicationInstanceReport) {
    this.internalPublicationInstanceReport = internalPublicationInstanceReport;
  }


  /**
   * Get internalPublicationInstanceAnalysis
   * @return internalPublicationInstanceAnalysis
  **/

  public BQInternalPublicationRetrieveInputModelInternalPublicationInstanceAnalysis getInternalPublicationInstanceAnalysis() {
    return internalPublicationInstanceAnalysis;
  }

  public void setInternalPublicationInstanceAnalysis(BQInternalPublicationRetrieveInputModelInternalPublicationInstanceAnalysis internalPublicationInstanceAnalysis) {
    this.internalPublicationInstanceAnalysis = internalPublicationInstanceAnalysis;
  }


}

