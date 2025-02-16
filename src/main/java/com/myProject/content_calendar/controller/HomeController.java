package com.myProject.content_calendar.controller;

import com.myProject.content_calendar.config.ContentCalenderProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
@RestController
public class HomeController {

    private final ContentCalenderProperties properties;

    public HomeController(ContentCalenderProperties properties) {
        this.properties = properties;
    }


    @GetMapping("/")
    public ContentCalenderProperties home(){
        return properties;
    }
}
