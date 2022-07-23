package co.com.gamehero.model.mazo;
import co.com.gamehero.model.cartas.Cartas;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Mazo {
    private String id;
    private Set<Cartas> cartasSet;
    private String cantidad;
}
