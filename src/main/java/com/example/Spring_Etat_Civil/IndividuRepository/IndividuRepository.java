package com.example.Spring_Etat_Civil.IndividuRepository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring_Etat_Civil.IndividuPackage.Individu;

public interface IndividuRepository extends JpaRepository<Individu,Long> {
    Optional<Individu> findById(Long id);

   
    
}
