package com.pdi.mcs.coronatracker.custom;

import feign.Logger;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomFeignConfiguration {

   @Bean
   public ErrorDecoder feignExceptionDecoder() {
     return new FeignExceptionDecoder();
   }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
