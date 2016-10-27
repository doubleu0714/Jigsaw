package com.toyaction.services;

import com.toy.product.ToyAction;
import com.toy.product.ToyActionProvider;
import java.util.logging.Logger;

public class PororoToyAction implements ToyAction {
    private static final Logger logger = Logger.getLogger(PororoToyAction.class.getName());

    @Override
    public void actionPlay(){
        logger.info("와!!! 뽀로로다~~~~!!!");
    }
}
