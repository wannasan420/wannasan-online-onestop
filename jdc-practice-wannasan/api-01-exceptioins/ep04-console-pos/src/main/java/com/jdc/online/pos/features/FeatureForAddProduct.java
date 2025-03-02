package com.jdc.online.pos.features;

import com.jdc.console.app.AbstractFeature;
import com.jdc.console.app.UserInputs;
import com.jdc.online.pos.model.ProductModel;
import com.jdc.online.pos.model.input.ProductForm;

public class FeatureForAddProduct extends AbstractFeature{

	private static final int SIZE = 6;
	
	private ProductModel model;

	public FeatureForAddProduct(int id) {
		super(id, "Create Product");
	    model = ProductModel.getInstance();
	}

	@Override
	public void doBusiness() {
		
		var name = UserInputs.readString(SIZE, "Name");
		
		var price = UserInputs.readInt(SIZE,"Price");
		
		var form = new ProductForm(name,price);
		
		var id = model.create(form);
		
		System.out.printf("%s has been created with id %d. %n".formatted(name,id));
	}

}