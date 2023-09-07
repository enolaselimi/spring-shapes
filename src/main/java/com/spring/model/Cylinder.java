package com.spring.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Qualifier("cylinderShape")
@Component
public class Cylinder implements Shape3D{
    private final String SHAPE_TYPE = "cylinder";
    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return this.SHAPE_TYPE.equals(shapeType.toLowerCase());
    }

    @Override
    public Double calculateArea(Double... len) {
        return 2*Math.PI*len[0]*(len[0]+len[1]);
    }

    @Override
    public Double calculateVolume(Double... len) {
        return Math.PI * len[0] * len[0] * len[1];
    }
}
