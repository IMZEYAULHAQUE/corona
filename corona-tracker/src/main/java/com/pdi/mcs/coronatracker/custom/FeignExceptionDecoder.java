package com.pdi.mcs.coronatracker.custom;

import com.pdi.mcs.coronatracker.exceptions.BadRequestException;
import com.pdi.mcs.coronatracker.exceptions.NotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FeignExceptionDecoder implements ErrorDecoder {

	private Logger logger = LoggerFactory.getLogger(FeignExceptionDecoder.class);

	private ErrorDecoder delegate = new Default();

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Exception decode(String methodKey, Response response) {

		switch (response.status()) {
			case 400:
				return new BadRequestException();
			case 404:
				return new NotFoundException();
			default:
				return new Exception("Generic error");
		}
	}

}
