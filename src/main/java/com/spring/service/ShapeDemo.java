package com.spring.service;

import com.spring.SpringBasicsHwApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ShapeDemo implements CommandLineRunner {
    @Autowired
    private ShapeService shapeServiceDemo;

    private static final Logger logger  = LoggerFactory.getLogger(SpringBasicsHwApplication.class);
    @Override
    public void run(String... args) throws Exception {
        logger.info("TRIANGLE Perimeter: {},  Area: {}",shapeServiceDemo.calculatePerimeter2D("Triangle",3.0,6.0, 6.0),
                shapeServiceDemo.calculateArea2D("triangle",3.0,6.0));

        logger.info("SQUARE Perimeter: {},  Area: {}",shapeServiceDemo.calculatePerimeter2D("square",3.0),
                shapeServiceDemo.calculateArea2D("square",3.0));

        logger.info("RECTANGLE Perimeter: {},  Area: {}",shapeServiceDemo.calculatePerimeter2D("rectangle",4.0,5.0),
                shapeServiceDemo.calculateArea2D("rectangle",4.0,5.0));

        logger.info("TRAPEZOID Perimeter: {},  Area: {}",shapeServiceDemo.calculatePerimeter2D("trapezoid",2.0, 4.0, 3.0, 3.0),
                shapeServiceDemo.calculateArea2D("trapezoid",2.0, 4.0, 3.0));

        logger.info("RHOMBUS Perimeter: {},  Area: {}",shapeServiceDemo.calculatePerimeter2D("rhombus",4.0),
                shapeServiceDemo.calculateArea2D("rhombus",4.0, 3.0));

        logger.info("CUBE Area: {},  Volume: {}",shapeServiceDemo.calculateArea3D("cube",3.0),
                shapeServiceDemo.calculateVolume3D("cube",3.0));

        logger.info("CUBOID Area: {},  Volume: {}",shapeServiceDemo.calculateArea3D("cuboid",3.0, 4.0, 2.0),
                shapeServiceDemo.calculateVolume3D("cuboid",3.0, 4.0, 2.0));

        logger.info("CYLINDER Area: {},  Volume: {}",shapeServiceDemo.calculateArea3D("cylinder",3.0, 6.0),
                shapeServiceDemo.calculateVolume3D("cylinder",3.0, 6.0));

    }
}
