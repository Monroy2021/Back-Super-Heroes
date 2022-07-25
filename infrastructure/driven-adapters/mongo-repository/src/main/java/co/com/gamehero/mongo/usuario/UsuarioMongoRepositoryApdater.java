package co.com.gamehero.mongo.usuario;

import co.com.gamehero.model.usuario.Usuario;
import co.com.gamehero.model.usuario.gateways.UsuarioRepository;
import co.com.gamehero.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;


@Repository
public class UsuarioMongoRepositoryApdater extends AdapterOperations<Usuario, UsuarioDocument, String, UsuarioMongoDBRepository>
implements UsuarioRepository
{

    public UsuarioMongoRepositoryApdater(UsuarioMongoDBRepository usuarioMongoDBRepository, ObjectMapper mapper) {
        super(usuarioMongoDBRepository, mapper, d -> mapper.map(d, Usuario.class));
    }
}
