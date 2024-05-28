package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @GetMapping
    public List<Event> getEvents() {
        return Arrays.asList(
                new Event("Opening Ceremony", "Join us for the grand opening ceremony of the festival. Expect a night full of surprises and excitement!"),
                new Event("Art Exhibition", "Explore the art exhibition featuring works from local and international artists. A visual treat awaits you."),
                new Event("Music Concert", "Enjoy live music performances from various genres. A night of great music and entertainment."),
                new Event("Food Fair", "Savor delicious dishes from around the world at our food fair. A culinary adventure you don't want to miss.")
        );
    }
}