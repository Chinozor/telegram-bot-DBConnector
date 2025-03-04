package com.yuriyaleksin.spring.springboot.telegrambotfinal.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FoodIntakeDTO {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("dish_name")
    private String dishName;
    @JsonProperty("calories")
    private Float calories;
    @JsonProperty("fats")
    private Float fats;
    @JsonProperty("carbs")
    private Float carbs;
    @JsonProperty("proteins")
    private Float proteins;
    @JsonProperty("date")
    private LocalDate date;
    @JsonProperty("user_id")
    private Long userId;
    @JsonProperty("description")
    private String description;
}
