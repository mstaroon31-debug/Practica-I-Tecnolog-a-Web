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
    public String etiquetaH2() {
        return "h2.html";
    }

    @GetMapping("/h3")
    public String etiquetaH3() {
        return "h3.html";
    }

    @GetMapping("/h4")
    public String etiquetaH4() {
        return "h4.html";
    }


    @GetMapping("/h5")
    public String etiquetaH5() {
        return "h5.html";
    }

    @GetMapping("/h6")
    public String etiquetaH6() {
        return "h6.html";
    }

    @GetMapping("/strong")
    public String etiquetastrong() {
        return "strong.html";
    }


    @GetMapping("/head")
    public String etiquetahead() {
        return "head.html";
    }

    @GetMapping("/body")
    public String etiquetabody() {
        return "body.html";
    }

    @GetMapping("/table")
    public String etiquetatable() {
        return "table.html";
    }


    @GetMapping("/select")
    public String etiquetaselect() {
        return "select.html";
    }

    @GetMapping("/button")
    public String etiquetabutton() {
        return "button.html";
    }

    @GetMapping("/section")
    public String etiquetasection() {
        return "section.html";
    }


    @GetMapping("/article")
    public String etiquetaarticulo() {
        return "article.html";
    }

    @GetMapping("/input")
    public String etiquetainput() {
        return "input.html";
    }

    @GetMapping("/th")
    public String etiquetath() {
        return "th.html";
    }


    @GetMapping("/td")
    public String etiquetatd() {
        return "td.html";
    }

    @GetMapping("/ul")
    public String etiquetaul() {
        return "ul.html";
    }

    @GetMapping("/form")
    public String etiquetathfrom() {
        return "form.html";
    }

}