package com.springboot.exercise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.exercise.domain.Matrix;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MatrixController {

    private final AtomicLong Counter = new AtomicLong();

    @GetMapping("/")
    public String homePage(){
        return String.format("En la ruta /matrix complementar con los parametros R, C, X, Y y Z");
    }

    @GetMapping("/matrix")
    public String Matrix( @RequestParam(value="R") int R, @RequestParam(value="C") int C,
                          @RequestParam(value="X") int X, @RequestParam(value="Y") int Y, @RequestParam(value="Z") int Z){
        Matrix matriz = new Matrix(R, C, Z);
        return (
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "    <title>Document</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        matriz.fillMatrix() + "\n" +
                        matriz.getSum(X, Y) +
                        "</body>\n" +
                        "</html>"
                );
    }
}
