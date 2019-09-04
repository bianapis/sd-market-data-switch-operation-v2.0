package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInternalPublicationRetrieveOutputModelInternalPublicationInstanceReport
 */
public class BQInternalPublicationRetrieveOutputModelInternalPublicationInstanceReport   {
  private Object internalPublicationInstanceReportRecord = null;

  private String internalPublicationInstanceReportType = null;

  private String internalPublicationInstanceReportParameters = null;

  private Object internalPublicationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return internalPublicationInstanceReportRecord
  **/

  public Object getInternalPublicationInstanceReportRecord() {
    return internalPublicationInstanceReportRecord;
  }

  public void setInternalPublicationInstanceReportRecord(Object internalPublicationInstanceReportRecord) {
    this.internalPublicationInstanceReportRecord = internalPublicationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return internalPublicationInstanceReportType
  **/

  public String getInternalPublicationInstanceReportType() {
    return internalPublicationInstanceReportType;
  }

  public void setInternalPublicationInstanceReportType(String internalPublicationInstanceReportType) {
    this.internalPublicationInstanceReportType = internalPublicationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return internalPublicationInstanceReportParameters
  **/

  public String getInternalPublicationInstanceReportParameters() {
    return internalPublicationInstanceReportParameters;
  }

  public void setInternalPublicationInstanceReportParameters(String internalPublicationInstanceReportParameters) {
    this.internalPublicationInstanceReportParameters = internalPublicationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return internalPublicationInstanceReport
  **/

  public Object getInternalPublicationInstanceReport() {
    return internalPublicationInstanceReport;
  }

  public void setInternalPublicationInstanceReport(Object internalPublicationInstanceReport) {
    this.internalPublicationInstanceReport = internalPublicationInstanceReport;
  }


}

