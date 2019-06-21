package com.example.demo.service;

import com.example.demo.domain.MusixMatchTrack;
import com.example.demo.domain.Track;

public interface IMusicService {
    public Track getTopTrack(String country);
    public MusixMatchTrack getMusixMatchTrack(String track, String artist, int hasLyrics);
}
