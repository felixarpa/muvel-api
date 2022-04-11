package com.felixarpa.muvel.muvelapi.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.felixarpa.muvel.muvelapi.domain.entities.Artist;
import com.felixarpa.muvel.muvelapi.domain.service.ArtistService;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

@Component("artistService")
public class ArtistServiceImpl implements ArtistService {
    private final ObjectMapper objectMapper;

    public ArtistServiceImpl() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public List<Artist> getArtists() {
        try {
            File file = ResourceUtils.getFile("classpath:artists_list.json");
            ArtistsResponse response = objectMapper.readValue(file, ArtistsResponse.class);
            return response.getArtists();
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
