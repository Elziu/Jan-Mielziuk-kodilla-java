package com.kodilla.stream.beautifier;

import java.sql.SQLOutput;

public class PoemBeautifier {

    public void beautify(String text, PoemDecorator poemDecorator){
        String beautifiedText = poemDecorator.decorate(text);
        System.out.println("Default: " + text + " --> " + "Beautified: " + beautifiedText);
    }

}
