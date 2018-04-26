package com.ravi.spring.rest;

public class Response {
private boolean statusCode;
private String statusDescription;
public boolean isStatusCode() {
	return statusCode;
}
public void setStatusCode(boolean statusCode) {
	this.statusCode = statusCode;
}
public String getStatusDescription() {
	return statusDescription;
}
public void setStatusDescription(String statusDescription) {
	this.statusDescription = statusDescription;
}

}
