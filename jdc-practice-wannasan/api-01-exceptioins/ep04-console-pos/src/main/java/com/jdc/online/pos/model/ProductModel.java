package com.jdc.online.pos.model;

import com.jdc.online.pos.model.input.ProductForm;
import com.jdc.online.pos.model.output.Product;

public interface ProductModel{

	int create(ProductForm form);
	
	static ProductModel getInstance() {
		return ProductModelImpl.getInstance();
	}

	Product[] search(String name);


}
