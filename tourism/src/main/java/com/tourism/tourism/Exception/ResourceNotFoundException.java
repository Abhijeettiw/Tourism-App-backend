package com.tourism.tourism.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResourceNotFoundException {
	String name;
	   Long id;
	    public ResourceNotFoundException(String name, Long id)
	    {
	        super(String.format(" Not Found !!! "));
	        this.name=name;
	        this.id= id;
	    }
}
