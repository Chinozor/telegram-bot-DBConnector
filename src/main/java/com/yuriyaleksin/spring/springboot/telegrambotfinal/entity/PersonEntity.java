package com.yuriyaleksin.spring.springboot.telegrambotfinal.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class PersonEntity {

    @Id
    @Column
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @JsonProperty("name")
    private String name;

    @Column
    @JsonProperty("dailyActivity")
    private String dailyActivity;

}
