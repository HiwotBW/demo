package com.example.demo.service.imp;

import com.example.demo.dao.IMusicDao;
import com.example.demo.domain.MusixMatchTrack;
import com.example.demo.domain.Track;
import com.example.demo.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class MusicService implements IMusicService {
    IMusicDao musicDao;

    @Autowired()
    public MusicService(IMusicDao musicDao) {
        this.musicDao = musicDao;
    }

    @Override
    public Track getTopTrack(String country) {
        List<Track> tracks = musicDao.getTopTracks(country);
        if (tracks == null) {
            throw new NoSuchElementException("No Such Track");
        }

       // MusixMatchTrack musixMatchTrack = getMusixMatchTrack(track.getName(), track.getArtist().getName(), 1);
        return tracks.get(1);
    }

    @Override
    public MusixMatchTrack getMusixMatchTrack(String track, String artist, int hasLyrics) {
        MusixMatchTrack musixMatchTrack = musicDao.getMusixMatchTrack(track, artist, hasLyrics);
        if (musixMatchTrack == null) {
            throw new NoSuchElementException("No Such Track");
        }
        return musixMatchTrack;
    }
}
