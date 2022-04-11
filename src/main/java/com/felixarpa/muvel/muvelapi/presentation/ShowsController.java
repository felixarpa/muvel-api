package com.felixarpa.muvel.muvelapi.presentation;

import com.felixarpa.muvel.muvelapi.domain.entities.Show;
import com.felixarpa.muvel.muvelapi.domain.service.ShowsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowsController {

    private final ShowsService showsService;

    @Autowired
    public ShowsController(ShowsService showsService) {
        this.showsService = showsService;
    }

    @GetMapping("/shows")
    public List<Show> shows(@RequestParam(value = "artistId") String artistId) {
        return showsService.getShows();
    }
}
