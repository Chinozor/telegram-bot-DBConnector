package com.yuriyaleksin.spring.springboot.telegrambotfinal.repository;

import com.yuriyaleksin.spring.springboot.telegrambotfinal.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

}
