package com.proyecto01.proyecto.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto01.proyecto.entity.Almacen;

@Repository
public interface AlmacenRepository extends JpaRepository<Almacen, String>{

}
