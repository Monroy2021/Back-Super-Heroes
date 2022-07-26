package co.com.gamehero.model.cartas;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Cartas {
    private String id;
    private Integer indice;
    private Url url;
    private String descripcion;
    private String poder;
    private CartaEstado cartaEstado;
    private Caracteristicas caracteristicas;
    private List<Personajes> personajesList;
}
