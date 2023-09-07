package com.spring.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Qualifier("cubeShape")
@Component
public class Cube implements Shape3D {

    private final String SHAPE_TYPE = "cube";

    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return this.SHAPE_TYPE.equals(shapeType.toLowerCase());
    }

    @Override
    public Double calculateArea(Double... len) {
        return 6 * (len[0] * len[0]);
    }

    @Override
    public Double calculateVolume(Double... len) {
        return len[0] * len[0] * len[0];
    }
}
