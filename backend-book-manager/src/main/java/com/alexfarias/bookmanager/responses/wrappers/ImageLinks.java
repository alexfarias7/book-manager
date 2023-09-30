package com.alexfarias.bookmanager.responses.wrappers;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImageLinks {
    @JsonProperty("smallThumbnail")
    public String getSmallThumbnail() {
        return this.smallThumbnail;
    }

    public void setSmallThumbnail(String smallThumbnail) {
        this.smallThumbnail = smallThumbnail;
    }

    String smallThumbnail;

    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return this.thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    String thumbnail;
}
