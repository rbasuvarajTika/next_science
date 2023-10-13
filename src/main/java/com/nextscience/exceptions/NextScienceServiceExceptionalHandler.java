package com.nextscience.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Processes an {@link NextScienceServiceExceptionalHandler } request.
 * 
 * @author Raghu
 *
 */

@ControllerAdvice
@RestController
public class NextScienceServiceExceptionalHandler {

	/**
	 * Returns custom error response on occurrence of custom exception.
	 * 
	 * @param e
	 * @param response
	 * @return
	 */

	@ExceptionHandler(value = NSException.class)
	public ErrorResponse handleContentNotFoundException(NSException e, HttpServletResponse response) {
		response.setStatus(e.getErrorCode());
		ErrorResponse error = new ErrorResponse();
		error.setMessage(e.getMessage());
		error.setErrorCode(e.getErrorCode());
		error.setSuccess(false);
		return error;
	}
}
