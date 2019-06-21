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
        "header",
        "body"
})
public class Message {

    @JsonProperty("header")
    private Header header;
    @JsonProperty("body")
    private Body body;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("header")
    public Header getHeader() {
        return header;
    }

    @JsonProperty("header")
    public void setHeader(Header header) {
        this.header = header;
    }

    @JsonProperty("body")
    public Body getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(Body body) {
        this.body = body;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "status_code",
            "execute_time",
            "confidence",
            "mode",
            "cached"
    })
    public class Header {

        @JsonProperty("status_code")
        private Integer statusCode;
        @JsonProperty("execute_time")
        private Double executeTime;
        @JsonProperty("confidence")
        private Integer confidence;
        @JsonProperty("mode")
        private String mode;
        @JsonProperty("cached")
        private Integer cached;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("status_code")
        public Integer getStatusCode() {
            return statusCode;
        }

        @JsonProperty("status_code")
        public void setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
        }

        @JsonProperty("execute_time")
        public Double getExecuteTime() {
            return executeTime;
        }

        @JsonProperty("execute_time")
        public void setExecuteTime(Double executeTime) {
            this.executeTime = executeTime;
        }

        @JsonProperty("confidence")
        public Integer getConfidence() {
            return confidence;
        }

        @JsonProperty("confidence")
        public void setConfidence(Integer confidence) {
            this.confidence = confidence;
        }

        @JsonProperty("mode")
        public String getMode() {
            return mode;
        }

        @JsonProperty("mode")
        public void setMode(String mode) {
            this.mode = mode;
        }

        @JsonProperty("cached")
        public Integer getCached() {
            return cached;
        }

        @JsonProperty("cached")
        public void setCached(Integer cached) {
            this.cached = cached;
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "track"
    })
    public class Body {

        @JsonProperty("track")
        private MusixMatchTrack track;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("track")
        public MusixMatchTrack getTrack() {
            return track;
        }

        @JsonProperty("track")
        public void setTrack(MusixMatchTrack track) {
            this.track = track;
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

}