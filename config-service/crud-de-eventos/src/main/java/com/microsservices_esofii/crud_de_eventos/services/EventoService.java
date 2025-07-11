package com.microsservices_esofii.crud_de_eventos.services;

import com.microsservices_esofii.crud_de_eventos.model.Evento;
import com.microsservices_esofii.crud_de_eventos.repository.EventoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventoService {

private final EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    public Evento criarEvento(Evento evento){
      return eventoRepository.save(evento);
    }

    public Evento atualizarEvento(Long id,Evento eventoAtualizado){

        Optional<Evento> optionalEvento = eventoRepository.findById(id);

        if (optionalEvento.isPresent()) {
            Evento evento = optionalEvento.get();

            if(!evento.getTitulo().equals(eventoAtualizado.getTitulo())){
                evento.setTitulo(eventoAtualizado.getTitulo());
            }
            if(!evento.getDescricao().equals(eventoAtualizado.getDescricao())){
                evento.setDescricao(eventoAtualizado.getDescricao());
            }
            if(!evento.getDataInicio().equals(eventoAtualizado.getDataInicio())){
                evento.setDataInicio(eventoAtualizado.getDataInicio());
            }
            if(!evento.getHorarioInicio().equals(eventoAtualizado.getHorarioInicio())){
                evento.setHorarioInicio(eventoAtualizado.getHorarioInicio());
            }
            if(!evento.getLocalEvento().equals(eventoAtualizado.getLocalEvento())){
                evento.setLocalEvento(eventoAtualizado.getLocalEvento());
            }

          return  eventoRepository.save(evento);
        }
        return null;



    }

}
