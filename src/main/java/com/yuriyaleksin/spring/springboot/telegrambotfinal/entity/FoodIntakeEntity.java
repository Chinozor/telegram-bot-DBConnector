package com.yuriyaleksin.spring.springboot.telegrambotfinal.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@Table(name = "food_intake")
@Entity
@ToString
public class FoodIntakeEntity {

    @Id
    @Column
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @JsonProperty("dish_name")
    private String dishName;

    @Column
    @JsonProperty("calories")
    private Float calories;

    @Column
    @JsonProperty("fats")
    private Float fats;

    @Column
    @JsonProperty("carbs")
    private Float carbs;

    @Column
    @JsonProperty("proteins")
    private Float proteins;

    @Column
    @JsonProperty("date")
    private LocalDate date;

    @Column
    @JsonProperty("user_id")
    private Long userId;

    @Column
    @JsonProperty("description")
    private String description;
}
