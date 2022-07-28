package co.com.gamehero.model.juego;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Juego {
    private String id;
    private String tableroId;
    private Integer ronda;
    private String ganadorId; //id del jugador ganador
    private List<JugadoresId> jugadores;
}
