package com.project.gdgbackend.controller;
import com.project.gdgbackend.model.Event;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/events")
@CrossOrigin(origins ="*")

public class EventController {
    @GetMapping("/upcoming")
    public List <Event> upcomingEvents() {
        return List.of( new Event(1l, "TechSprint" , "Jan 2026", "assets/events/techsprint.jpg", "Https://hosturl.link/J4WvOi"));
    }

     @GetMapping("/past")
    public List <Event> pastEvents() {
        return List.of( new Event(1l, "Hackfest 2025" , "Nov 2025", "assets/events/hackfest25.jpg",null),
                    new Event(1l, "Hackon 2025" , "Feb 2025", "assets/events/hackon.jpg",null)
                    );
    }
}
