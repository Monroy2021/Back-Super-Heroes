package co.com.gamehero.mongo.tablero;

import co.com.gamehero.model.cartas.CartaEstado;
import co.com.gamehero.model.cartas.Cartas;
import co.com.gamehero.model.tablero.JugadorId;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document
@Data
public class TableroDocument {
    @Id
    private String id;
    private Map<JugadorId, Cartas> cartaApostada;
    private CartaEstado cartaEstado;
    private Integer tiempo;
}
