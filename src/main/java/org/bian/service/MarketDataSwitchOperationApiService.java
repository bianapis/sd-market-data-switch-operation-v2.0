/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface MarketDataSwitchOperationApiService {

	SDMarketDataSwitchOperationActivateOutputModel activate(SDMarketDataSwitchOperationActivateInputModel request);
	
	SDMarketDataSwitchOperationConfigureOutputModel configure(String sdReferenceId, SDMarketDataSwitchOperationConfigureInputModel request);
	
	CRInformationFeedSwitchoperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRInformationFeedSwitchoperatingSessionControlInputModel request);
	
	BQFeedUploadExchangeOutputModel exchangeFeedupload(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeedUploadExchangeInputModel request);
	
	BQInternalPublicationExchangeOutputModel exchangeInternalpublication(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInternalPublicationExchangeInputModel request);
	
	BQDistributionExecuteOutputModel executeDistribution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionExecuteInputModel request);
	
	CRInformationFeedSwitchoperatingSessionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRInformationFeedSwitchoperatingSessionExecuteInputModel request);
	
	SDMarketDataSwitchOperationFeedbackOutputModel feedback(String sdReferenceId, SDMarketDataSwitchOperationFeedbackInputModel request);
	
	CRInformationFeedSwitchoperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRInformationFeedSwitchoperatingSessionInitiateInputModel request);
	
	BQDistributionInitiateOutputModel initiateDistribution(String sdReferenceId, String crReferenceId, BQDistributionInitiateInputModel request);
	
	BQInternalPublicationInitiateOutputModel initiateInternalpublication(String sdReferenceId, String crReferenceId, BQInternalPublicationInitiateInputModel request);
	
	BQDistributionRequestOutputModel requestDistribution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionRequestInputModel request);
	
	CRInformationFeedSwitchoperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRInformationFeedSwitchoperatingSessionRequestInputModel request);
	
	BQDistributionRetrieveOutputModel retrieveDistribution(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFeedUploadRetrieveOutputModel retrieveFeedupload(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInternalPublicationRetrieveOutputModel retrieveInternalpublication(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRInformationFeedSwitchoperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDMarketDataSwitchOperationRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRInformationFeedSwitchoperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRInformationFeedSwitchoperatingSessionUpdateInputModel request);
	
	BQDistributionUpdateOutputModel updateDistribution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionUpdateInputModel request);
	
	BQFeedUploadUpdateOutputModel updateFeedupload(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeedUploadUpdateInputModel request);
	
	BQInternalPublicationUpdateOutputModel updateInternalpublication(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInternalPublicationUpdateInputModel request);
	
}
