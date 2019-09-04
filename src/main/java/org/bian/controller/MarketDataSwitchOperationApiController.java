/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class MarketDataSwitchOperationApiController {

	@Autowired
	MarketDataSwitchOperationApiService service;
	
	@Operate.Activate
	public BianResponse<SDMarketDataSwitchOperationActivateOutputModel> activate(@RequestBody BianRequest<SDMarketDataSwitchOperationActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Operate.Configure
	public BianResponse<SDMarketDataSwitchOperationConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDMarketDataSwitchOperationConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Operate.Control
	public BianResponse<CRInformationFeedSwitchoperatingSessionControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRInformationFeedSwitchoperatingSessionControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("feedupload")
	@Operate.Exchange
	public BianResponse<BQFeedUploadExchangeOutputModel> exchangeFeedupload(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFeedUploadExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeFeedupload(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("internalpublication")
	@Operate.Exchange
	public BianResponse<BQInternalPublicationExchangeOutputModel> exchangeInternalpublication(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInternalPublicationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeInternalpublication(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("distribution")
	@Operate.Execute
	public BianResponse<BQDistributionExecuteOutputModel> executeDistribution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDistributionExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeDistribution(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Execute
	public BianResponse<CRInformationFeedSwitchoperatingSessionExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRInformationFeedSwitchoperatingSessionExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Feedback
	public BianResponse<SDMarketDataSwitchOperationFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDMarketDataSwitchOperationFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Operate.Initiate
	public BianResponse<CRInformationFeedSwitchoperatingSessionInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRInformationFeedSwitchoperatingSessionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("distribution")
	@Operate.Initiate
	public BianResponse<BQDistributionInitiateOutputModel> initiateDistribution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQDistributionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateDistribution(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("internalpublication")
	@Operate.Initiate
	public BianResponse<BQInternalPublicationInitiateOutputModel> initiateInternalpublication(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQInternalPublicationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateInternalpublication(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("distribution")
	@Operate.Request
	public BianResponse<BQDistributionRequestOutputModel> requestDistribution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDistributionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestDistribution(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Request
	public BianResponse<CRInformationFeedSwitchoperatingSessionRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRInformationFeedSwitchoperatingSessionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("distribution")
	@Operate.Retrieve
	public BianResponse<BQDistributionRetrieveOutputModel> retrieveDistribution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDistribution(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("feedupload")
	@Operate.Retrieve
	public BianResponse<BQFeedUploadRetrieveOutputModel> retrieveFeedupload(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFeedupload(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("internalpublication")
	@Operate.Retrieve
	public BianResponse<BQInternalPublicationRetrieveOutputModel> retrieveInternalpublication(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInternalpublication(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Operate.Retrieve
	public BianResponse<CRInformationFeedSwitchoperatingSessionRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Operate.RetrieveSD
	public BianResponse<SDMarketDataSwitchOperationRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Operate.Update
	public BianResponse<CRInformationFeedSwitchoperatingSessionUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRInformationFeedSwitchoperatingSessionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("distribution")
	@Operate.Update
	public BianResponse<BQDistributionUpdateOutputModel> updateDistribution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDistributionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateDistribution(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("feedupload")
	@Operate.Update
	public BianResponse<BQFeedUploadUpdateOutputModel> updateFeedupload(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFeedUploadUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFeedupload(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("internalpublication")
	@Operate.Update
	public BianResponse<BQInternalPublicationUpdateOutputModel> updateInternalpublication(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInternalPublicationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateInternalpublication(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
