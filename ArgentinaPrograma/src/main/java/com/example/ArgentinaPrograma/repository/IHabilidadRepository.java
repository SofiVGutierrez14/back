package com.example.ArgentinaPrograma.repository;
import com.example.ArgentinaPrograma.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadRepository extends JpaRepository <Habilidad, Long>{
    
    
}
