package co.com.gamehero.mongo.jugador;

import co.com.gamehero.model.mazo.Mazo;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class JugadorDocument {
    @Id
    private String id;
    private String usuarioId;
    private Mazo mazo;
    private String alias;
    private Integer puntaje;
}
