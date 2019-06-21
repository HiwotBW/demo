package com.example.demo.dao.impl;

import com.example.demo.dao.IMusicDao;
import com.example.demo.domain.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;


@Component
public class MusicDao implements IMusicDao{

    private RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
    private final String geoTrackParam = "&method=geo.gettoptracks";
    private final String filter = "&country=";

    private final String lastFMURL = "http://ws.audioscrobbler.com/2.0/?&api_key=838d7d40aac4230fbbfc0ef45891ff18&format=json";
    private final String musixMatchURL = "https://api.musixmatch.com/ws/1.1/";
    private final String musixMatchFunc = "/matcher.track.get?";

    private final String musixMatchAPI = "&apikey=2cc60d914cdbfd3e695dfb63dac50d17";

    @Autowired
    public MusicDao(RestTemplate restTemplate, ObjectMapper objectMapper){
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
    }

    @Override
    public List<Track> getTopTracks(String country) {
        String url = lastFMURL + geoTrackParam + filter + country;
       Result result = restTemplate.getForObject(url,
               Result.class );
       List<Track> trackList = result.getTracks().getTrack();


      if(trackList == null){
          throw new NoSuchElementException("No track for this country");
      }
      return trackList;
    }

    @Override
    public MusixMatchTrack getMusixMatchTrack(String track, String artist, int hasLyrics) {
        MusicMatchResponse musicMatchResponse = restTemplate.getForObject(musixMatchURL +
                musixMatchFunc + musixMatchAPI + "&q_track=" + track +"&q_artist="+artist +"&f_has_lyrics=1" , MusicMatchResponse.class);
       if(musicMatchResponse == null){
           throw new NoSuchElementException("No track for this query");
       }
        return musicMatchResponse.getMessage().getBody().getTrack();
    }
}
