package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInternalPublicationRetrieveInputModelInternalPublicationInstanceReport
 */
public class BQInternalPublicationRetrieveInputModelInternalPublicationInstanceReport   {
  private String internalPublicationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return internalPublicationInstanceReportReference
  **/

  public String getInternalPublicationInstanceReportReference() {
    return internalPublicationInstanceReportReference;
  }

  public void setInternalPublicationInstanceReportReference(String internalPublicationInstanceReportReference) {
    this.internalPublicationInstanceReportReference = internalPublicationInstanceReportReference;
  }


}

