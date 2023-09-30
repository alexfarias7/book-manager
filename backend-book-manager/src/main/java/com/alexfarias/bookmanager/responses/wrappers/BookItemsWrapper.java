package com.alexfarias.bookmanager.responses.wrappers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class BookItemsWrapper {
    private BookVolumeInfoWrapper volumeInfo;
}
