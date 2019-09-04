package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInternalPublicationUpdateOutputModel
 */
public class BQInternalPublicationUpdateOutputModel   {
  private String internalPublicationUpdateActionTaskReference = null;

  private Object internalPublicationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return internalPublicationUpdateActionTaskReference
  **/

  public String getInternalPublicationUpdateActionTaskReference() {
    return internalPublicationUpdateActionTaskReference;
  }

  public void setInternalPublicationUpdateActionTaskReference(String internalPublicationUpdateActionTaskReference) {
    this.internalPublicationUpdateActionTaskReference = internalPublicationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return internalPublicationUpdateActionTaskRecord
  **/

  public Object getInternalPublicationUpdateActionTaskRecord() {
    return internalPublicationUpdateActionTaskRecord;
  }

  public void setInternalPublicationUpdateActionTaskRecord(Object internalPublicationUpdateActionTaskRecord) {
    this.internalPublicationUpdateActionTaskRecord = internalPublicationUpdateActionTaskRecord;
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

