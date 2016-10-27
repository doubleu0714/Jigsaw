package com.toyaction.services;

import com.toy.product.ToyActionProvider;
import com.toy.product.ToyAction;

//sk.toy모듈의 ToyActionProvider 인터페이스의 구현체
//ServiceLoader<ToyActionProvider>에서 이 클래스가 반환된다.
public class PororoToyActionProvider implements ToyActionProvider {

	@Override
	public ToyAction createToyAction() {
		//ToyAction 구현체를 단순 리턴
		return new PororoToyAction();
	}

}
