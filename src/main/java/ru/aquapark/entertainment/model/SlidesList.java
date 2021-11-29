package ru.aquapark.entertainment.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

public class SlidesList {
    List<Slides> slidesList;

    public void add(Slides slides){
        slidesList.add(slides);
    }

    public void add(Integer index, Slides slides){
        slidesList.add(index, slides);
    }

    public void remove(Slides slides){
        slidesList.remove(slides);
    }

    public Slides get(Slides slides){
        for (Slides slides1: slidesList) {
            if(slides.getColour().equals(slides1.getColour())
             && slides.getHeight().equals(slides1.getHeight())
             && slides.getWidth().equals(slides1.getWidth())){
                return slides1;
            }
        }
        return null;
    }
}
