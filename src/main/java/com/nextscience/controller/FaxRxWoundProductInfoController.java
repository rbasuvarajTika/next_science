package com.nextscience.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nextscience.dto.response.FaxRxProviderResponse;
import com.nextscience.dto.response.FaxRxWoundProductInfoResponse;
import com.nextscience.dto.response.NSServiceResponse;
import com.nextscience.dto.response.PageResponseDTO;

import com.nextscience.service.FaxRxWoundProductInfoService;
import com.nextscience.utility.ResponseHelper;
@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/fax")
public class FaxRxWoundProductInfoController {
	@Autowired
	FaxRxWoundProductInfoService faxRxWoundProductInfoService;
	
	@SuppressWarnings("unchecked")
	@GetMapping("/woundProduct")
	public NSServiceResponse<List<FaxRxWoundProductInfoResponse>> executeCustomQuery()
	{
    		
			 PageResponseDTO response =faxRxWoundProductInfoService.fetchList();
			//List<FaxRxResponse> faxRxResponse = faxRxService.fetchList();
			return ResponseHelper.createResponse(new NSServiceResponse<PageResponseDTO>(), 
					response, "Successfully ", "Error");
}
	

}