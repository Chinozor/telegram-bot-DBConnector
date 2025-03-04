package com.yuriyaleksin.spring.springboot.telegrambotfinal.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "training_session")
public class TrainingSessionEntity {

    @Id
    @Column
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @JsonProperty("name")
    private String name;

    @Column
    @JsonProperty("weight")
    private float weight;

    @Column
    @JsonProperty("reps")
    private float reps;

    @Column
    @JsonProperty("person_id")
    private Long personId;
}
