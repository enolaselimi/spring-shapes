package com.spring.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Qualifier("cuboidShape")
@Component
public class Cuboid implements Shape3D{
    private final String SHAPE_TYPE = "cuboid";
    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return this.SHAPE_TYPE.equals(shapeType.toLowerCase());
    }

    @Override
    public Double calculateArea(Double... len) {
        return null;
    }

    @Override
    public Double calculateVolume(Double... len) {
        return 2*((len[0]*len[2])+(len[1]*len[2])+(len[0]*len[1]));
    }
}
