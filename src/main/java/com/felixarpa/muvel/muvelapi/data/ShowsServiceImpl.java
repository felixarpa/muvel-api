package com.felixarpa.muvel.muvelapi.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.felixarpa.muvel.muvelapi.domain.entities.Show;
import com.felixarpa.muvel.muvelapi.domain.service.ShowsService;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

@Component("showsService")
public class ShowsServiceImpl implements ShowsService {
    private final ObjectMapper objectMapper;

    public ShowsServiceImpl() {
        this.objectMapper = new ObjectMapper();
    }
    @Override
    public List<Show> getShows() {
        try {
            File file = ResourceUtils.getFile("classpath:shows_list.json");
            ShowsResponse response = objectMapper.readValue(file, ShowsResponse.class);
            return response.getShows();
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
