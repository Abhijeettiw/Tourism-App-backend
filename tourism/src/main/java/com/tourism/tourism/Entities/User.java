package com.tourism.tourism.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name =  "ID")
	    private Long id;
	    @Column(name = "Name", nullable = false, length = 100)
	    private String name;
	    @Column(name = "Contact No",nullable = false, length = 20)
	    private Long no;
	    @Column(name = "Email-Id",nullable = false,length =100)
	    private String email;

}
