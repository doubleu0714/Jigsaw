package com.toyaction.services;

import com.toy.product.ToyActionProvider;
import com.toy.product.ToyAction;
public class PororoToyActionProvider implements ToyActionProvider {

    @Override
    public ToyAction createToyAction() {
        return new PororoToyAction();

    }

}
