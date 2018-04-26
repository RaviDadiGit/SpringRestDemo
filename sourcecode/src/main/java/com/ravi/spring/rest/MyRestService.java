package com.ravi.spring.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestService {
	@RequestMapping(value="myService",method=RequestMethod.GET)
 public ResponseEntity<RestResponse> myService(){
		RestResponse restResponse= new RestResponse();
		Response response = new Response();
		response.setStatusCode(true);
		response.setStatusDescription("Success");
		restResponse.setResponse(response);
	 return new ResponseEntity<RestResponse>(restResponse, HttpStatus.OK);
 }
}
