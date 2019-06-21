package com.example.demo.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "music_genre_id",
        "music_genre_parent_id",
        "music_genre_name",
        "music_genre_name_extended",
        "music_genre_vanity"
})
public class MusicGenre {

    @JsonProperty("music_genre_id")
    private Integer musicGenreId;
    @JsonProperty("music_genre_parent_id")
    private Integer musicGenreParentId;
    @JsonProperty("music_genre_name")
    private String musicGenreName;
    @JsonProperty("music_genre_name_extended")
    private String musicGenreNameExtended;
    @JsonProperty("music_genre_vanity")
    private String musicGenreVanity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("music_genre_id")
    public Integer getMusicGenreId() {
        return musicGenreId;
    }

    @JsonProperty("music_genre_id")
    public void setMusicGenreId(Integer musicGenreId) {
        this.musicGenreId = musicGenreId;
    }

    @JsonProperty("music_genre_parent_id")
    public Integer getMusicGenreParentId() {
        return musicGenreParentId;
    }

    @JsonProperty("music_genre_parent_id")
    public void setMusicGenreParentId(Integer musicGenreParentId) {
        this.musicGenreParentId = musicGenreParentId;
    }

    @JsonProperty("music_genre_name")
    public String getMusicGenreName() {
        return musicGenreName;
    }

    @JsonProperty("music_genre_name")
    public void setMusicGenreName(String musicGenreName) {
        this.musicGenreName = musicGenreName;
    }

    @JsonProperty("music_genre_name_extended")
    public String getMusicGenreNameExtended() {
        return musicGenreNameExtended;
    }

    @JsonProperty("music_genre_name_extended")
    public void setMusicGenreNameExtended(String musicGenreNameExtended) {
        this.musicGenreNameExtended = musicGenreNameExtended;
    }

    @JsonProperty("music_genre_vanity")
    public String getMusicGenreVanity() {
        return musicGenreVanity;
    }

    @JsonProperty("music_genre_vanity")
    public void setMusicGenreVanity(String musicGenreVanity) {
        this.musicGenreVanity = musicGenreVanity;
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
