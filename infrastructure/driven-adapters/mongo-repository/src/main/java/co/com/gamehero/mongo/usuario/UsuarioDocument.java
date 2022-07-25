package co.com.gamehero.mongo.usuario;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class UsuarioDocument {

    @Id
    private String id;
    private String nombre;
    private String email;
}
