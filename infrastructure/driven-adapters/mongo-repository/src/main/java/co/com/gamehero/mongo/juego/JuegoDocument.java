package co.com.gamehero.mongo.juego;

import co.com.gamehero.model.juego.JugadoresId;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class JuegoDocument {

    @Id
    private String id;
    private String tableroId;
    private Integer ronda;
    private String ganadorId; //id del jugador ganador
    private List<JugadoresId> jugadores;
}
