package com.masterclass.masterclass.repository;

import com.masterclass.masterclass.entity.CardHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<CardHolder, Long> {

}
