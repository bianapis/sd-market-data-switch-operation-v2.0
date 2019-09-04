package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInternalPublicationRetrieveInputModelInternalPublicationInstanceAnalysis
 */
public class BQInternalPublicationRetrieveInputModelInternalPublicationInstanceAnalysis   {
  private String internalPublicationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return internalPublicationInstanceAnalysisReference
  **/

  public String getInternalPublicationInstanceAnalysisReference() {
    return internalPublicationInstanceAnalysisReference;
  }

  public void setInternalPublicationInstanceAnalysisReference(String internalPublicationInstanceAnalysisReference) {
    this.internalPublicationInstanceAnalysisReference = internalPublicationInstanceAnalysisReference;
  }


}

