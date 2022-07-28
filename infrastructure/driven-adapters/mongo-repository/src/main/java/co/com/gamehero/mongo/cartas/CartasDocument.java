package co.com.gamehero.mongo.cartas;

import co.com.gamehero.model.cartas.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class CartasDocument {

    @Id
    private String id;
    private Integer indice;
    private Url url;
    private String descripcion;
    private String poder;
    private CartaEstado cartaEstado;
    private Caracteristicas caracteristicas;
    private List<Personajes> personajesList;
}
