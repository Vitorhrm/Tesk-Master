package com.microsservices_esofii.crud_de_eventos.repository;

import com.microsservices_esofii.crud_de_eventos.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento,Long> {

}
