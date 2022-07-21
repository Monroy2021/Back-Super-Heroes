package co.com.gamehero.mongo;

import co.com.gamehero.model.cards.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class CardsDocument {

    @Id
    private String id;

    private Url url;
    private Descripcion descripcion;
    private Poder poder;
    private Caracteristicas caracteristicas;
    private List<Personajes> personajesList;
}