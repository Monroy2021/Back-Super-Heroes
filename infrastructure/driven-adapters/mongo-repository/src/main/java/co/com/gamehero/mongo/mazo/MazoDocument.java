package co.com.gamehero.mongo.mazo;

import co.com.gamehero.model.cartas.Cartas;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document
@Data
public class MazoDocument {
    @Id
    private String id;
    private Set<Cartas> cartasSet;
    private String cantidad;

}
