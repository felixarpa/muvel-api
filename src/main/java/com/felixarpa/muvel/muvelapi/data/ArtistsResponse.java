package com.felixarpa.muvel.muvelapi.data;

import com.felixarpa.muvel.muvelapi.domain.entities.Artist;
import java.util.List;
import lombok.Data;

@Data
public class ArtistsResponse {
    private List<Artist> artists;
}
