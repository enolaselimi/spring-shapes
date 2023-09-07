package com.spring.service;

import com.spring.model.Shape2D;
import com.spring.model.Shape3D;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ShapeService {
    @Qualifier("triangleShape")
    @Autowired
    private Shape2D triangle;
    @Qualifier("squareShape")
    @Autowired
    private Shape2D square;
    @Qualifier("rectangleShape")
    @Autowired
    private Shape2D rectangle;
    @Qualifier("trapezoidShape")
    @Autowired
    private Shape2D trapezoid;
    @Qualifier("rhombusShape")
    @Autowired
    private Shape2D rhombus;
    @Qualifier("cubeShape")
    @Autowired
    private Shape3D cube;
    @Qualifier("cuboidShape")
    @Autowired
    private Shape3D cuboid;
    @Qualifier("cylinderShape")
    @Autowired
    private Shape3D cylinder;

    public Double calculateArea2D(String shapeType, Double... len) {
        return switch (shapeType.toLowerCase()) {
            case "triangle" -> triangle.calculateArea(len);
            case "square" -> square.calculateArea(len);
            case "rectangle" -> rectangle.calculateArea(len);
            case "trapezoid" -> trapezoid.calculateArea(len);
            case "rhombus" -> rhombus.calculateArea(len);
            default -> throw new RuntimeException("2D Shape Type not defined");
        };
    }

    public Double calculatePerimeter2D(String shapeType, Double... len) {
        return switch (shapeType.toLowerCase()) {
            case "triangle" -> triangle.calculatePerimeter(len);
            case "square" -> square.calculatePerimeter(len);
            case "rectangle" -> rectangle.calculatePerimeter(len);
            case "trapezoid" -> trapezoid.calculatePerimeter(len);
            case "rhombus" -> rhombus.calculatePerimeter(len);
            default -> throw new RuntimeException("2D Shape Type not defined");
        };
    }

    public Double calculateArea3D(String shapeType, Double... len) {
        return switch (shapeType.toLowerCase()) {
            case "cube" -> cube.calculateArea(len);
            case "cuboid" -> cuboid.calculateArea(len);
            case "cylinder" -> cylinder.calculateArea(len);
            default -> throw new RuntimeException("3D Shape Type not defined");
        };
    }

    public Double calculateVolume3D(String shapeType, Double... len) {
        return switch (shapeType.toLowerCase()) {
            case "cube" -> cube.calculateVolume(len);
            case "cuboid" -> cuboid.calculateVolume(len);
            case "cylinder" -> cylinder.calculateVolume(len);
            default -> throw new RuntimeException("3D Shape Type not defined");
        };
    }
}
