package com.detroitlabs.giflibrary.data;

import com.detroitlabs.giflibrary.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {


    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("toobad", LocalDate.of(2019, 2, 23), "Erika Languirand", true, 1, "Erika"),
            new Gif("exhausting", LocalDate.of(2019, 2, 23), "Jen Socia", true, 1, "Jen"),
            new Gif("headtilt", LocalDate.of(2019, 2, 23), "Dan Newport", true, 4, "Dan"),
            new Gif("corgibeg", LocalDate.of(2019, 2, 23), "Matt of Lansing", true, 4, "Matt"),
            new Gif("hugemistake", LocalDate.of(2019, 2, 23), "Erika Languirand", true, 1, "Erika"),
            new Gif("whatisaid", LocalDate.of(2019, 2, 23), "Dan Newport", true, 1, "Dan"),
            new Gif("crying", LocalDate.of(2022, 3, 17), "Amanda Vollmar", true, 2, "Amanda"),
            new Gif("smash", LocalDate.of(2022, 3, 16), "Amanda Vollmar", true, 1, "Amanda"),
            new Gif("together", LocalDate.of(2022, 3, 17), "Amanda Vollmar", true, 1, "Amanda"),
            new Gif("ufcleg", LocalDate.of(2022, 3, 17), "Amanda Vollmar", true, 3, "Amanda"),
            new Gif("issues", LocalDate.of(2022, 3, 18), "Ayah Chebli", true, 1, "Ayah"),
            new Gif("patcomp", LocalDate.of(2022, 3, 18), "Ayah Chebli", true, 2, "Ayah"),
            new Gif("catwork", LocalDate.of(2022, 3, 18), "Dan Newport", true, 4, "Dan"),
            new Gif("gpwhat", LocalDate.of(2022, 3, 18), "Jason Stolaruk", true, 4, "Jason"),
            new Gif("bowldance", LocalDate.of(2022, 3, 18), "Jason Stolaruk", true, 4, "Jason"),
            new Gif("yawn", LocalDate.of(2022, 3, 18), "Jason Stolaruk", true, 4, "Jason"),
            new Gif("shake", LocalDate.of(2022, 3, 18), "Jason Stolaruk", true, 4, "Jason"),
            new Gif("nomore", LocalDate.of(2022, 3, 18), "Jen Socia", true, 1, "Jen"),
            new Gif("attempts", LocalDate.of(2022, 3, 18), "Amanda Vollmar", true, 1, "Amanda"),
            new Gif("coffeecode", LocalDate.of(2022, 3, 18), "Jen Socia", true, 1, "Jen"),
            new Gif("sparks", LocalDate.of(2022, 3, 18), "Ayah Chelbi", true, 1, "Ayah"),
            new Gif("servers", LocalDate.of(2022, 3, 18), "Jen Socia", true, 1, "Jen"),
            new Gif("ducklingrun", LocalDate.of(2022, 3, 18), "Dan Newport", true, 4, "Dan"));


    public Gif findByName(String name) {
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> findById(int id) {
        List<Gif> gifsByCategory = new ArrayList<>();
        for (Gif gif : ALL_GIFS) {
            if (gif.getId() == id) {
                gifsByCategory.add(gif);
            }
        }
        return gifsByCategory;
    }
}


