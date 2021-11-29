package ru.aquapark.entertainment;

import ru.aquapark.entertainment.model.Person;
import ru.aquapark.entertainment.model.Slides;
import ru.aquapark.entertainment.model.SlidesList;

import java.util.ArrayList;
import java.util.Scanner;

public class EntertainmentApp {
    public static void main(String[] args) {
    SlidesList slidesList = new SlidesList(new ArrayList<>());
    Slides slides = new Slides("yellow", 180, 3, true, 15.0);
    Slides slides1 = new Slides("blue", 300, 2, false, 18.0);
    Slides slides2 = new Slides("red", 500, 4, true, 20.0);

    slidesList.add(slides);
    slidesList.add(slides1);
    slidesList.add(slides2);

    Scanner scanner = new Scanner(System.in);

    
    }

}
