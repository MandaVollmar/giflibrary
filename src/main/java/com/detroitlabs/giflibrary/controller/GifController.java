package com.detroitlabs.giflibrary.controller;

import com.detroitlabs.giflibrary.data.GifRepository;
import com.detroitlabs.giflibrary.data.ImageRepository;
import com.detroitlabs.giflibrary.model.Gif;
import com.detroitlabs.giflibrary.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GifController {
    @Autowired
    private GifRepository gifRepository;
    @Autowired
    private ImageRepository imageRepository;

    @RequestMapping("/")
    public String displayGifs(){
        return "home";
    }

    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){
        Gif gif = gifRepository.findByName(name);
        Image image = imageRepository.setAvatar(gif.getPicId());
        modelMap.put("gif", gif);
        modelMap.put("image", image);
        return "gif-details";
    }
}
