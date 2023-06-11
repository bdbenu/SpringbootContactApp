package com.bd.benu.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorDeatils> handleAllException(Exception ex, WebRequest request) {
		ErrorDeatils errorDeatils = new ErrorDeatils(LocalDate.now(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<ErrorDeatils>(errorDeatils, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(handleContcatNotFundException.class)
	public final ResponseEntity<ErrorDeatils> handleContcatNotFundException(Exception ex, WebRequest request) {
		ErrorDeatils errorDeatils = new ErrorDeatils(LocalDate.now(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<ErrorDeatils>(errorDeatils, HttpStatus.NOT_FOUND);
	}
}
