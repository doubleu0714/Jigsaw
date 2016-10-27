package com.toyaction.services;

import com.toy.product.ToyAction;
import com.toy.product.ToyActionProvider;
import java.util.logging.Logger;

//sk.toy 모듈의 ToyAction 인터페이스의 구현클래스
//Provider에서 이 클래스를 반환해 사용한다.
public class PororoToyAction implements ToyAction {

	private final Logger logger = Logger.getLogger(PororoToyAction.class.getName());

	@Override
	public void actionPlay(){
		logger.info("와!!! 뽀로로다~~~~!!!");
	}
}
