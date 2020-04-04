package com.pdi.mcs.coronatracker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CountryCoronaData {

	@JsonProperty(value = "country_name")
	private String countryName;

	@JsonProperty(value = "cases")
	private String cases;

	@JsonProperty(value = "deaths")
	private String death;

	@JsonProperty(value = "region")
	private String region;

	@JsonProperty(value = "total_recovered")
	private String totalRecovered;

	@JsonProperty(value = "new_deaths")
	private String newDeath;

	@JsonProperty(value = "new_cases")
	private String newCases;

	@JsonProperty(value = "serious_critical")
	private String seriousCritical;

	@JsonProperty(value = "active_cases")
	private String activeCases;

	@JsonProperty(value = "total_cases_per_1m_population")
	private String totalCasesPer1Million;

}
