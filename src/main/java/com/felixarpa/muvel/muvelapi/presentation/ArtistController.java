package com.felixarpa.muvel.muvelapi.presentation;

import com.felixarpa.muvel.muvelapi.domain.entities.Artist;
import com.felixarpa.muvel.muvelapi.domain.service.ArtistService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistController {

    private final ArtistService artistService;

    @Autowired
    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/artists")
    public List<Artist> artists() {
        return artistService.getArtists();
    }
}
