package com.upiiz.etiquetas2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TagController {

    @GetMapping("/")
    public String inicio() {
        return "index.html";
    }

    @GetMapping("/p")
    public String etiquetaP() {
        return "p.html";
    }

    @GetMapping("/Users/PC/Desktop/jairo/etiquetas2/etiquetas2/src/main/resources/templates/h1.html")
    public String etiquetaH1() {
        return "h1";
    }


    @GetMapping("/h2")
    public String inicio() {
        return "h2.html";
    }

    @GetMapping("/h3")
    public String etiquetaP() {
        return "h3.html";
    }

    @GetMapping("/h4")
    public String etiquetaH1() {
        return "h4.html";
    }


    @GetMapping("/h5")
    public String inicio() {
        return "h5.html";
    }

    @GetMapping("/h6")
    public String etiquetaP() {
        return "h6.html";
    }

    @GetMapping("/strong")
    public String etiquetaH1() {
        return "strong.html";
    }


    @GetMapping("/head")
    public String inicio() {
        return "head.html";
    }

    @GetMapping("/body")
    public String etiquetaP() {
        return "body.html";
    }

    @GetMapping("/table")
    public String etiquetaH1() {
        return "table.html";
    }


    @GetMapping("/select")
    public String inicio() {
        return "select.html";
    }

    @GetMapping("/button")
    public String etiquetaP() {
        return "button.html";
    }

    @GetMapping("/section")
    public String etiquetaH1() {
        return "section.html";
    }


    @GetMapping("/article")
    public String inicio() {
        return "article.html";
    }

    @GetMapping("/input")
    public String etiquetaP() {
        return "input.html";
    }

    @GetMapping("/th")
    public String etiquetaH1() {
        return "th.html";
    }


    @GetMapping("/td")
    public String inicio() {
        return "td.html";
    }

    @GetMapping("/ul")
    public String etiquetaP() {
        return "ul.html";
    }

    @GetMapping("/form")
    public String etiquetaH1() {
        return "form.html";
    }

}