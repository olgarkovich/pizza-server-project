package com.example.repository;

import com.example.entity.Dessert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DessertRepository extends JpaRepository<Dessert, Integer> {

}
