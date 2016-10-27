package com.toy.product.material;

import java.util.logging.Logger;
public class Material {

    private final Logger logger = Logger.getLogger(Material.class.getName());
    public String getMadeInKorea() {
        logger.info("Made In Korea!!!!");
        return "Plastic";
    }

}
