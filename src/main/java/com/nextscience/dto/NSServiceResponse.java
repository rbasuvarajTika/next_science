package com.nextscience.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NSServiceResponse<T> {
	
	/**
	 * Generic data which will adopt to the different resources
	 */
	private T data;

	/**
	 * The success/error message of the API requested.
	 */
	private String message;

	/**
	 * The parameter which indicates the status of API response.
	 */
	private boolean success;

	/**
	 * The application specific error codes.
	 */
	private String errorCode;


}
