package com.proyecto01.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto01.proyecto.entity.Personal;

@Repository
public interface PersonalRepository extends JpaRepository<Personal, String> {

}
