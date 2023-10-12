package com.alexfarias.bookmanager.responses.wrappers;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class IndustryIdentifiers {
    private String type;

    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    private String identifier;

    @JsonProperty("identifier")
    public String getIdentifier() {
        return this.identifier;
    }
}
