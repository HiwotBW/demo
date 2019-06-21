package com.example.demo.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "track_id",
        "track_name",
        "track_name_translation_list",
        "track_rating",
        "commontrack_id",
        "instrumental",
        "explicit",
        "has_lyrics",
        "has_subtitles",
        "has_richsync",
        "num_favourite",
        "album_id",
        "album_name",
        "artist_id",
        "artist_name",
        "track_share_url",
        "track_edit_url",
        "restricted",
        "updated_time",
        "primary_genres"
})
public class MusixMatchTrack {

    @JsonProperty("track_id")
    private Integer trackId;
    @JsonProperty("track_name")
    private String trackName;
    @JsonProperty("track_name_translation_list")
    private List<Object> trackNameTranslationList = null;
    @JsonProperty("track_rating")
    private Integer trackRating;
    @JsonProperty("commontrack_id")
    private Integer commontrackId;
    @JsonProperty("instrumental")
    private Integer instrumental;
    @JsonProperty("explicit")
    private Integer explicit;
    @JsonProperty("has_lyrics")
    private Integer hasLyrics;
    @JsonProperty("has_subtitles")
    private Integer hasSubtitles;
    @JsonProperty("has_richsync")
    private Integer hasRichsync;
    @JsonProperty("num_favourite")
    private Integer numFavourite;
    @JsonProperty("album_id")
    private Integer albumId;
    @JsonProperty("album_name")
    private String albumName;
    @JsonProperty("artist_id")
    private Integer artistId;
    @JsonProperty("artist_name")
    private String artistName;
    @JsonProperty("track_share_url")
    private String trackShareUrl;
    @JsonProperty("track_edit_url")
    private String trackEditUrl;
    @JsonProperty("restricted")
    private Integer restricted;
    @JsonProperty("updated_time")
    private String updatedTime;
    @JsonProperty("primary_genres")
    private PrimaryGenres primaryGenres;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("track_id")
    public Integer getTrackId() {
        return trackId;
    }

    @JsonProperty("track_id")
    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    @JsonProperty("track_name")
    public String getTrackName() {
        return trackName;
    }

    @JsonProperty("track_name")
    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    @JsonProperty("track_name_translation_list")
    public List<Object> getTrackNameTranslationList() {
        return trackNameTranslationList;
    }

    @JsonProperty("track_name_translation_list")
    public void setTrackNameTranslationList(List<Object> trackNameTranslationList) {
        this.trackNameTranslationList = trackNameTranslationList;
    }

    @JsonProperty("track_rating")
    public Integer getTrackRating() {
        return trackRating;
    }

    @JsonProperty("track_rating")
    public void setTrackRating(Integer trackRating) {
        this.trackRating = trackRating;
    }

    @JsonProperty("commontrack_id")
    public Integer getCommontrackId() {
        return commontrackId;
    }

    @JsonProperty("commontrack_id")
    public void setCommontrackId(Integer commontrackId) {
        this.commontrackId = commontrackId;
    }

    @JsonProperty("instrumental")
    public Integer getInstrumental() {
        return instrumental;
    }

    @JsonProperty("instrumental")
    public void setInstrumental(Integer instrumental) {
        this.instrumental = instrumental;
    }

    @JsonProperty("explicit")
    public Integer getExplicit() {
        return explicit;
    }

    @JsonProperty("explicit")
    public void setExplicit(Integer explicit) {
        this.explicit = explicit;
    }

    @JsonProperty("has_lyrics")
    public Integer getHasLyrics() {
        return hasLyrics;
    }

    @JsonProperty("has_lyrics")
    public void setHasLyrics(Integer hasLyrics) {
        this.hasLyrics = hasLyrics;
    }

    @JsonProperty("has_subtitles")
    public Integer getHasSubtitles() {
        return hasSubtitles;
    }

    @JsonProperty("has_subtitles")
    public void setHasSubtitles(Integer hasSubtitles) {
        this.hasSubtitles = hasSubtitles;
    }

    @JsonProperty("has_richsync")
    public Integer getHasRichsync() {
        return hasRichsync;
    }

    @JsonProperty("has_richsync")
    public void setHasRichsync(Integer hasRichsync) {
        this.hasRichsync = hasRichsync;
    }

    @JsonProperty("num_favourite")
    public Integer getNumFavourite() {
        return numFavourite;
    }

    @JsonProperty("num_favourite")
    public void setNumFavourite(Integer numFavourite) {
        this.numFavourite = numFavourite;
    }

    @JsonProperty("album_id")
    public Integer getAlbumId() {
        return albumId;
    }

    @JsonProperty("album_id")
    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    @JsonProperty("album_name")
    public String getAlbumName() {
        return albumName;
    }

    @JsonProperty("album_name")
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    @JsonProperty("artist_id")
    public Integer getArtistId() {
        return artistId;
    }

    @JsonProperty("artist_id")
    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    @JsonProperty("artist_name")
    public String getArtistName() {
        return artistName;
    }

    @JsonProperty("artist_name")
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @JsonProperty("track_share_url")
    public String getTrackShareUrl() {
        return trackShareUrl;
    }

    @JsonProperty("track_share_url")
    public void setTrackShareUrl(String trackShareUrl) {
        this.trackShareUrl = trackShareUrl;
    }

    @JsonProperty("track_edit_url")
    public String getTrackEditUrl() {
        return trackEditUrl;
    }

    @JsonProperty("track_edit_url")
    public void setTrackEditUrl(String trackEditUrl) {
        this.trackEditUrl = trackEditUrl;
    }

    @JsonProperty("restricted")
    public Integer getRestricted() {
        return restricted;
    }

    @JsonProperty("restricted")
    public void setRestricted(Integer restricted) {
        this.restricted = restricted;
    }

    @JsonProperty("updated_time")
    public String getUpdatedTime() {
        return updatedTime;
    }

    @JsonProperty("updated_time")
    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    @JsonProperty("primary_genres")
    public PrimaryGenres getPrimaryGenres() {
        return primaryGenres;
    }

    @JsonProperty("primary_genres")
    public void setPrimaryGenres(PrimaryGenres primaryGenres) {
        this.primaryGenres = primaryGenres;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}