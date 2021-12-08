package ru.aquapark.entertainment.config;

import ru.aquapark.entertainment.model.Slides;
import ru.aquapark.entertainment.model.SlidesList;

import java.util.ArrayList;
import java.util.Scanner;

public class StartConfig {
    public static void start(){
        SlidesList slidesList = createSlides();
        Slides slides = createSlide();
        Slides resultSlide = slidesList.get(slides);
        outSlide(resultSlide);
    }

    private static SlidesList createSlides(){
        SlidesList slidesList = new SlidesList(new ArrayList<>());
        Slides slides = new Slides("yellow", 180, 3, true, 15.0);
        Slides slides1 = new Slides("blue", 300, 2, false, 18.0);
        Slides slides2 = new Slides("red", 500, 4, true, 20.0);
        slidesList.add(slides);
        slidesList.add(slides1);
        slidesList.add(slides2);
        return slidesList;
    }
    private static Slides createSlide(){
        return Slides.builder()
                .colour(new Scanner(System.in).nextLine())
                .height(new Scanner(System.in).nextInt())
                .width(new Scanner(System.in).nextInt())
                .build();
    }

    private static void outSlide(Slides slides){
        System.out.println(slides);

    }
}
