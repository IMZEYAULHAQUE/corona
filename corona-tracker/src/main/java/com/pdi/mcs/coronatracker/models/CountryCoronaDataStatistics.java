package com.pdi.mcs.coronatracker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CountryCoronaDataStatistics {

	@JsonProperty(value = "countries_stat")
	private List<CountryCoronaData> coronaDataList;

}
