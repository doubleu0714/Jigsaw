package com.factory;

import java.util.logging.Logger;
import com.toy.product.Product;
//com.toy.product.material 패키지는 sk.toy 모듈에서 exports로 선언하지 않았기 때문에 사용할 수 없음.
//import com.toy.product.material.Material;

public class Factory {
	//java.logging 모듈을 참조하고 있지 않지만, sk.toy의 모듈 정의에서 requires public 으로 정의했기 때문에 참조가 전이되어 사용할 수 있음.
    private final Logger logger = Logger.getLogger(Factory.class.getName());
    public Factory() {
    }

    public Product createProduct() {
		logger.info("createProduct Method Start!");
		//sk.toy에서 export한 Product 클래스의 단순 객체 생성
        Product toyProduct = new Product();
        return toyProduct;
    }

    public static void main(String[] args) {
        Factory factory = new Factory();
        Product product = factory.createProduct();
		//sk.toy모듈에는 interface만 존재하고, 실제 구현체는 sk.toyaction모듈에 존재
		//sk.factory 모듈에서 sk.toyaction을 직접 참조 하고 있지 않지만 구현체의 메소드를 호출함.
        product.playToyAction();
    }
}
