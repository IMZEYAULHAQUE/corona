package com.pdi.mcs.coronaservice.services;

import com.pdi.mcs.coronaservice.models.CountryCoronaDataStatistics;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class CoronaService {

	public CountryCoronaDataStatistics fetchCountryCoronaVirusData() {

		try {
			RestTemplate restTemplate = new RestTemplate();
			URI uri = new URI("https://corona-virus-world-and-india-data.p.rapidapi.com/api");

			HttpHeaders headers = new HttpHeaders();
			headers.set("x-rapidapi-host", "corona-virus-world-and-india-data.p.rapidapi.com");
			headers.set("x-rapidapi-key", "2409601d52msh5d509b7d84326dap17c55fjsndf0bfa80c40c");

			HttpEntity<CountryCoronaDataStatistics> requestEntity = new HttpEntity<>(null, headers);
			ResponseEntity<CountryCoronaDataStatistics> result = restTemplate.exchange(uri, HttpMethod.GET, requestEntity, CountryCoronaDataStatistics.class);
			return result.getBody();
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}
}
