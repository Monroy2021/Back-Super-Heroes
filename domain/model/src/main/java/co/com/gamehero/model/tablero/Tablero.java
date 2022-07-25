package co.com.gamehero.model.tablero;
import co.com.gamehero.model.cartas.CartaEstado;
import co.com.gamehero.model.cartas.Cartas;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Tablero {
    private String id;
    private Map<JugadorId, Cartas> cartaApostada;
    private CartaEstado cartaEstado;
    private Integer tiempo;
}
