package com.microsservices_esofii.crud_de_eventos.controller;
import com.microsservices_esofii.crud_de_eventos.model.Evento;
import com.microsservices_esofii.crud_de_eventos.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    private final EventoService eventoService;

    @Autowired
    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @PostMapping("/salvar")
    public ResponseEntity<Evento> criarEvento(@RequestBody Evento evento) {
        System.out.println("Recebido no controller: " + evento);
        Evento salvo = eventoService.criarEvento(evento);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<Evento> atualizarEvento(@RequestBody Evento eventoAtualizado) {
        System.out.println("Recebido no controller: " + eventoAtualizado);
        Evento salvo = eventoService.atualizarEvento(eventoAtualizado.getId(),eventoAtualizado);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }


}
