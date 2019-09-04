/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class MarketDataSwitchOperationApiServiceImpl implements MarketDataSwitchOperationApiService {

	public SDMarketDataSwitchOperationActivateOutputModel activate(SDMarketDataSwitchOperationActivateInputModel request){
		return JsonReader.read("activate-SDMarketDataSwitchOperationActivateOutputModel.json",new TypeReference<SDMarketDataSwitchOperationActivateOutputModel>(){});
	}
	
	public SDMarketDataSwitchOperationConfigureOutputModel configure(String sdReferenceId, SDMarketDataSwitchOperationConfigureInputModel request){
		return JsonReader.read("configure-SDMarketDataSwitchOperationConfigureOutputModel.json",new TypeReference<SDMarketDataSwitchOperationConfigureOutputModel>(){});
	}
	
	public CRInformationFeedSwitchoperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRInformationFeedSwitchoperatingSessionControlInputModel request){
		return JsonReader.read("control-CRInformationFeedSwitchoperatingSessionControlOutputModel.json",new TypeReference<CRInformationFeedSwitchoperatingSessionControlOutputModel>(){});
	}
	
	public BQFeedUploadExchangeOutputModel exchangeFeedupload(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeedUploadExchangeInputModel request){
		return JsonReader.read("exchange-BQFeedUploadExchangeOutputModel.json",new TypeReference<BQFeedUploadExchangeOutputModel>(){});
	}
	
	public BQInternalPublicationExchangeOutputModel exchangeInternalpublication(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInternalPublicationExchangeInputModel request){
		return JsonReader.read("exchange-BQInternalPublicationExchangeOutputModel.json",new TypeReference<BQInternalPublicationExchangeOutputModel>(){});
	}
	
	public BQDistributionExecuteOutputModel executeDistribution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionExecuteInputModel request){
		return JsonReader.read("execute-BQDistributionExecuteOutputModel.json",new TypeReference<BQDistributionExecuteOutputModel>(){});
	}
	
	public CRInformationFeedSwitchoperatingSessionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRInformationFeedSwitchoperatingSessionExecuteInputModel request){
		return JsonReader.read("execute-CRInformationFeedSwitchoperatingSessionExecuteOutputModel.json",new TypeReference<CRInformationFeedSwitchoperatingSessionExecuteOutputModel>(){});
	}
	
	public SDMarketDataSwitchOperationFeedbackOutputModel feedback(String sdReferenceId, SDMarketDataSwitchOperationFeedbackInputModel request){
		return JsonReader.read("feedback-SDMarketDataSwitchOperationFeedbackOutputModel.json",new TypeReference<SDMarketDataSwitchOperationFeedbackOutputModel>(){});
	}
	
	public CRInformationFeedSwitchoperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRInformationFeedSwitchoperatingSessionInitiateInputModel request){
		return JsonReader.read("initiate-CRInformationFeedSwitchoperatingSessionInitiateOutputModel.json",new TypeReference<CRInformationFeedSwitchoperatingSessionInitiateOutputModel>(){});
	}
	
	public BQDistributionInitiateOutputModel initiateDistribution(String sdReferenceId, String crReferenceId, BQDistributionInitiateInputModel request){
		return JsonReader.read("initiate-BQDistributionInitiateOutputModel.json",new TypeReference<BQDistributionInitiateOutputModel>(){});
	}
	
	public BQInternalPublicationInitiateOutputModel initiateInternalpublication(String sdReferenceId, String crReferenceId, BQInternalPublicationInitiateInputModel request){
		return JsonReader.read("initiate-BQInternalPublicationInitiateOutputModel.json",new TypeReference<BQInternalPublicationInitiateOutputModel>(){});
	}
	
	public BQDistributionRequestOutputModel requestDistribution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionRequestInputModel request){
		return JsonReader.read("request-BQDistributionRequestOutputModel.json",new TypeReference<BQDistributionRequestOutputModel>(){});
	}
	
	public CRInformationFeedSwitchoperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRInformationFeedSwitchoperatingSessionRequestInputModel request){
		return JsonReader.read("request-CRInformationFeedSwitchoperatingSessionRequestOutputModel.json",new TypeReference<CRInformationFeedSwitchoperatingSessionRequestOutputModel>(){});
	}
	
	public BQDistributionRetrieveOutputModel retrieveDistribution(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDistributionRetrieveOutputModel.json",new TypeReference<BQDistributionRetrieveOutputModel>(){});
	}
	
	public BQFeedUploadRetrieveOutputModel retrieveFeedupload(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFeedUploadRetrieveOutputModel.json",new TypeReference<BQFeedUploadRetrieveOutputModel>(){});
	}
	
	public BQInternalPublicationRetrieveOutputModel retrieveInternalpublication(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInternalPublicationRetrieveOutputModel.json",new TypeReference<BQInternalPublicationRetrieveOutputModel>(){});
	}
	
	public CRInformationFeedSwitchoperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRInformationFeedSwitchoperatingSessionRetrieveOutputModel.json",new TypeReference<CRInformationFeedSwitchoperatingSessionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDMarketDataSwitchOperationRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDMarketDataSwitchOperationRetrieveOutputModel.json",new TypeReference<SDMarketDataSwitchOperationRetrieveOutputModel>(){});
	}
	
	public CRInformationFeedSwitchoperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRInformationFeedSwitchoperatingSessionUpdateInputModel request){
		return JsonReader.read("update-CRInformationFeedSwitchoperatingSessionUpdateOutputModel.json",new TypeReference<CRInformationFeedSwitchoperatingSessionUpdateOutputModel>(){});
	}
	
	public BQDistributionUpdateOutputModel updateDistribution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionUpdateInputModel request){
		return JsonReader.read("update-BQDistributionUpdateOutputModel.json",new TypeReference<BQDistributionUpdateOutputModel>(){});
	}
	
	public BQFeedUploadUpdateOutputModel updateFeedupload(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeedUploadUpdateInputModel request){
		return JsonReader.read("update-BQFeedUploadUpdateOutputModel.json",new TypeReference<BQFeedUploadUpdateOutputModel>(){});
	}
	
	public BQInternalPublicationUpdateOutputModel updateInternalpublication(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInternalPublicationUpdateInputModel request){
		return JsonReader.read("update-BQInternalPublicationUpdateOutputModel.json",new TypeReference<BQInternalPublicationUpdateOutputModel>(){});
	}
	
}
