package co.com.gamehero.model.jugador;
import co.com.gamehero.model.mazo.Mazo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Jugador {

    private String id;
    private String usuarioId;
    private Mazo mazo;
    private String alias;
    private String puntaje;

}
