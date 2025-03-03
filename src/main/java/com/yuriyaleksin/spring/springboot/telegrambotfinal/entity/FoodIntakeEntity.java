package com.yuriyaleksin.spring.springboot.telegrambotfinal.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@Table(name = "diets")
@Entity
@ToString
public class FoodIntakeEntity {

    @Id
    @Column
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @JsonProperty("dishName")
    private String dishName;

    @Column
    @JsonProperty("cal")
    private Float calories;

    @Column
    @JsonProperty("f")
    private Float fats;

    @Column
    @JsonProperty("car")
    private Float carbs;

    @Column
    @JsonProperty("prot")
    private Float proteins;

    @Column
    @JsonProperty("date")
    private LocalDate date;

    @Column
    @JsonProperty("userId")
    private Long userId;

    @Column
    @JsonProperty("description")
    private String description;
}
