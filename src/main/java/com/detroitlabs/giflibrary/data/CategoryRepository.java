package com.detroitlabs.giflibrary.data;

import com.detroitlabs.giflibrary.model.Category;
import com.detroitlabs.giflibrary.model.Gif;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class CategoryRepository {
    public static final List<Category> ALL_CATEGORIES = Arrays.asList (
            new Category(1,"Reactions"),
            new Category(2,"Cartoons"),
            new Category(3, "Sports"),
            new Category(4, "Animals")
    );
    public List<Category> getAllCategories(){
    return ALL_CATEGORIES;
    }
    public Category findById (int id){
        for (Category category : ALL_CATEGORIES) {
            if (category.getId()== id) {
                return category;
            }
        }
        return null;
    }
}