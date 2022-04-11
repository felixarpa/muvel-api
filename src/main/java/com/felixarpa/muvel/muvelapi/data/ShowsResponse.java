package com.felixarpa.muvel.muvelapi.data;

import com.felixarpa.muvel.muvelapi.domain.entities.Show;
import java.util.List;
import lombok.Data;

@Data
public class ShowsResponse {
    private List<Show> shows;
}
