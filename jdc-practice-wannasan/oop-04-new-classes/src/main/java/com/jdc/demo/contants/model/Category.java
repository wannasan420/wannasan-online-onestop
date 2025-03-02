package com.jdc.demo.contants.model;

import com.jdc.demo.metadata.NotBlank;

import lombok.Data;

@Data
public class Category {

	private int id;
	@NotBlank
	private String name;
	@NotBlank
	private String image;
	
}
