package com.spring.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier("triangleShape")
@Component
public class Triangle implements Shape2D {
    private final String SHAPE_TYPE = "triangle";
    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return this.SHAPE_TYPE.equals(shapeType.toLowerCase());
    }

    @Override
    public Double calculatePerimeter(Double... len) {
        return len[0]+len[1]+len[2];
    }

    @Override
    public Double calculateArea(Double... len) {
        return (len[0]*len[1])/2;
    }
}
