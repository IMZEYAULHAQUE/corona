package com.pdi.mcs.coronatracker.feignclients;

import com.pdi.mcs.coronatracker.models.CountryCoronaData;
import com.pdi.mcs.coronatracker.models.CountryCoronaDataStatistics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ TODO Need to find out how to implement selected method as fallback and leave rest for default failure. Raise a ticket in github 'https://github.com/OpenFeign/feign/issues/681'
 */
@Component
public class CoronaServiceFeignClientFallback implements CoronaServiceClient {

   private Logger logger = LoggerFactory.getLogger(CoronaServiceFeignClientFallback.class);

   private Throwable cause;

   public CoronaServiceFeignClientFallback() {
   }
   
   public CoronaServiceFeignClientFallback setCause(Throwable cause) {
      this.cause = cause;
      return this;
   }

   @Override
   public CountryCoronaDataStatistics getCoronaStatistics() {
      logger.error(cause.toString());
      return this.getDefaultStatistics();
   }

   private CountryCoronaDataStatistics getDefaultStatistics() {
      CountryCoronaDataStatistics statistics = new CountryCoronaDataStatistics();
      List<CountryCoronaData> dataList = new ArrayList<>();
      statistics.setCoronaDataList(dataList);
      return statistics;
   }
}
