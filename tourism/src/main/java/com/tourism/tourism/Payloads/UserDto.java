package com.tourism.tourism.Payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class UserDto {
	private Long id;
    @NotEmpty
    @Size(min = 4,max = 20,message = "Username must ave characters between 4 to 20 !!")
    private String name;
    @NotEmpty(message = "Please Enter Valid Email-Id !!")
    private Long no;
    @NotEmpty
    @Email
    private String email;
}
