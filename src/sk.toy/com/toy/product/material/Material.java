package com.toy.product.material;

//참조 설정이 되어있으므로 사용가능
import java.util.logging.Logger;
public class Material {

	private final Logger logger = Logger.getLogger(Material.class.getName());

	public String getMadeInKorea() {
		logger.info("getMadeInKorea method start!");
		return "Plastic";
	}
}
