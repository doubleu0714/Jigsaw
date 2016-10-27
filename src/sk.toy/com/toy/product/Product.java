package com.toy.product;

import java.util.logging.Logger;
import com.toy.product.material.Material;
import java.util.ServiceLoader;
import java.util.Iterator;

public class Product {

	private final Logger logger = Logger.getLogger(Product.class.getName());

	public Product() {
		//com.toy.product.module은 모듈 내부에서만 사용하기 위해 별도 패키지로 분리 후 exports 에서 제외
		Material material = new Material();
		logger.info("Material : " + material.getMadeInKorea());
		logger.info("Create Product!");
	}

	public void playToyAction() {
		logger.info("playToyAction Method!!");

		//모듈정의에서 uses로 설정한 ToyActionProvider 에 대해 구현체를 찾는 로직
		ServiceLoader<ToyActionProvider> sl = ServiceLoader.load(ToyActionProvider.class);
		Iterator<ToyActionProvider> iter = sl.iterator();
		if(!iter.hasNext())
			throw new RuntimeException("No service provider found!");

		ToyActionProvider toyActionProvider = iter.next();
		ToyAction toyAction = toyActionProvider.createToyAction();

		//구현체에서 리턴한 ToyAction구현체의 메소드를 실행하게 됨.
		toyAction.actionPlay();
	}
}
