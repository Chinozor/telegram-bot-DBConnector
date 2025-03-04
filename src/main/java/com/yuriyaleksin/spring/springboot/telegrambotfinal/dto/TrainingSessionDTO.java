package com.yuriyaleksin.spring.springboot.telegrambotfinal.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrainingSessionDTO {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("weight")
    private float weight;
    @JsonProperty("reps")
    private float reps;
    @JsonProperty("person_id")
    private Long personId;
}
