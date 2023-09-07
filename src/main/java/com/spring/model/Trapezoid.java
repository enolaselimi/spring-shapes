package com.spring.model;

import com.spring.model.Shape2D;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Qualifier("trapezoidShape")
@Component
public class Trapezoid implements Shape2D {
    private final String SHAPE_TYPE = "trapezoid";
    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return this.SHAPE_TYPE.equals(shapeType.toLowerCase());
    }

    @Override
    public Double calculatePerimeter(Double... len) {
        return len[0]+len[1]+len[2]+len[3];
    }

    @Override
    public Double calculateArea(Double... len) {
        return ((len[0]+len[1])*len[2])/2;
    }
}
