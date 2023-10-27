package com.nextscience.utility;

import com.nextscience.dto.response.NSServiceResponse;
import com.nextscience.enums.ErrorCodes;
import com.nextscience.exceptions.NSException;
import com.nextscience.service.impl.UserServiceImpl;
/**
 * ResponseHelper for managing {@link ResponseHelper}.request
 * 
 * @author Raghu
 */

public class ResponseHelper {

	
	
	/**
	 * Use when the API return some response class.
	 * 
	 * @param response
	 * @param data
	 * @param successMessage
	 * @param errorMessage
	 * @return
	 */
	public static NSServiceResponse createResponse(NSServiceResponse response, Object data, String successMessage,
			String errorMessage) {

		if (data != null) {
			response.setSuccess(true);
			response.setData(data);
			response.setMessage(successMessage);
		} else {
			throw new NSException(ErrorCodes.OK, errorMessage);
		}
		return response;
	}

	/**
	 * Use this format when the API returns only boolean
	 * 
	 * @param response
	 * @param flag
	 * @param successMessage
	 * @param errorMessage
	 * @return
	 */
	public static NSServiceResponse createResponseForFlags(NSServiceResponse response, boolean flag, String successMessage,
			String errorMessage) {
		if (flag) {
			response.setSuccess(flag);
			response.setMessage(successMessage);
		} else {
			throw new NSException(ErrorCodes.OK, errorMessage);
		}
		return response;
	}
	
	
}

