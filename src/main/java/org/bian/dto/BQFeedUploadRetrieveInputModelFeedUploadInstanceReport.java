package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFeedUploadRetrieveInputModelFeedUploadInstanceReport
 */
public class BQFeedUploadRetrieveInputModelFeedUploadInstanceReport   {
  private String feedUploadInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return feedUploadInstanceReportReference
  **/

  public String getFeedUploadInstanceReportReference() {
    return feedUploadInstanceReportReference;
  }

  public void setFeedUploadInstanceReportReference(String feedUploadInstanceReportReference) {
    this.feedUploadInstanceReportReference = feedUploadInstanceReportReference;
  }


}

