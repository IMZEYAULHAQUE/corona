package com.pdi.mcs.coronaservice.controllers;

import com.pdi.mcs.coronaservice.models.CountryCoronaDataStatistics;
import com.pdi.mcs.coronaservice.services.CoronaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoronaController {

	@Autowired
	private CoronaService coronaService;

	@GetMapping(value = "/details", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CountryCoronaDataStatistics> getCoronaStatistics() {
		CountryCoronaDataStatistics data = coronaService.fetchCountryCoronaVirusData();
		return ResponseEntity.status(HttpStatus.OK).body(data);
	}
}
