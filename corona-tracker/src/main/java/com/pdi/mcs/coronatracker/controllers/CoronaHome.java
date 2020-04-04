package com.pdi.mcs.coronatracker.controllers;

import com.pdi.mcs.coronatracker.models.CountryCoronaData;
import com.pdi.mcs.coronatracker.models.CountryCoronaDataStatistics;
import com.pdi.mcs.coronatracker.services.CoronaTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Controller
public class CoronaHome {

	@Autowired
	private CoronaTrackerService coronaTrackerService;

	@GetMapping(value = "/statistics", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CountryCoronaDataStatistics> getCoronaVirusStatistics() {
		CountryCoronaDataStatistics data = coronaTrackerService.getCoronaVirusStatistics();
		return ResponseEntity.status(HttpStatus.OK).body(data);
	}

	@GetMapping(value = "/")
	public String home(Model model) {
		CountryCoronaDataStatistics data = coronaTrackerService.getCoronaVirusStatistics();
		Optional<CountryCoronaData> usaData = data.getCoronaDataList().stream().filter(x -> x.getCountryName().equalsIgnoreCase("USA")).findFirst();
		Optional<CountryCoronaData> indiaData = data.getCoronaDataList().stream().filter(x -> x.getCountryName().equalsIgnoreCase("INDIA")).findFirst();

		model.addAttribute("usaData", usaData.get());
		model.addAttribute("indiaData", indiaData.get());
		model.addAttribute("countryData", data.getCoronaDataList());
		return "home";
	}
}
