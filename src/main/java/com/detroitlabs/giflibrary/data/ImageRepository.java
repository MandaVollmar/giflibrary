package com.detroitlabs.giflibrary.data;


import com.detroitlabs.giflibrary.model.Category;
import com.detroitlabs.giflibrary.model.Gif;
import com.detroitlabs.giflibrary.model.Image;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ImageRepository {
    private static final List<Image> ALL_IMAGES = Arrays.asList(
            new Image("dannewport", "Dan"),
            new Image("erikalanguirand", "Erika"),
            new Image("jensocia", "Jen"),
            new Image("mattoflansing", "Matt"),
            new Image("amandavollmar", "Amanda"),
            new Image("ayahchebli", "Ayah"),
            new Image("jasonstolaruk", "Jason"));

    public List<Image> getAllImages() {
        return ALL_IMAGES;
    }

    public Image setAvatar(String picId) {
        for (Image image : ALL_IMAGES) {
            if (image.getPicID().equals(picId)) {
                return image;
            }
        }
        return null;
    }
}
