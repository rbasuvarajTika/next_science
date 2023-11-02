package com.nextscience.dto.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailsResponse {
	
	private int userId;
	private String userName;
	private String firstName;
	private String middleName;
	private String lastName;
	private String fullName;
	private String title;
	private String role;
	private String userMail;
	private String phone;
	private String userMobile;
	private String UserEmpID;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String preferredName;
	private String activeInd;
	private String userTerr;
	private String empId;
	private Date hireDate;
	private Date endDate;
	private Date startDate;
	private String admToolsFlag;
	private String attendeeFlag;
	private String bookingUrl;
	private String managerEmail;
	private String userTimeZone;
	private String userNtId;
	private String outlookClientId;
	private String outlookSecretCode;
	private String outlookEmailId;
	private String salesForce;
	private String password;
	private String confirmPassword;
	private Date passwordUpdatedDate;
	private String userStatusFlag;
	private String userType;
	private String otherPassword;
	private String userImageUrl;
	private String createdUser;
	private Date createdDate;
	private String updatedUser;
	private Date updatedDate;


}
