package com.pdi.mcs.coronatracker.feignclients;

import com.pdi.mcs.coronatracker.custom.CustomFeignConfiguration;
import com.pdi.mcs.coronatracker.models.CountryCoronaDataStatistics;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="${feign.client.corona-service.url}", configuration = CustomFeignConfiguration.class, fallback = CoronaServiceFeignClientFallback.class)
public interface CoronaServiceClient {

	@GetMapping(value = "/corona-service/details", produces = MediaType.APPLICATION_JSON_VALUE)
	CountryCoronaDataStatistics getCoronaStatistics();
}
