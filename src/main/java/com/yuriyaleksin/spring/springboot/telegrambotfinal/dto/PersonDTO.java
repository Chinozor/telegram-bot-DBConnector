package com.yuriyaleksin.spring.springboot.telegrambotfinal.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonDTO {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("dailyActivity")
    private String dailyActivity;
}
