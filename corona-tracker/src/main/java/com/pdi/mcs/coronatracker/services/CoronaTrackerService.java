package com.pdi.mcs.coronatracker.services;

import com.pdi.mcs.coronatracker.feignclients.CoronaServiceClient;
import com.pdi.mcs.coronatracker.models.CountryCoronaDataStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoronaTrackerService {

	@Autowired
	private CoronaServiceClient coronaServiceClient;

	public CountryCoronaDataStatistics getCoronaVirusStatistics() {
		return coronaServiceClient.getCoronaStatistics();
	}
}
