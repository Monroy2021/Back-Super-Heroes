package co.com.gamehero.mongo.usuario;

import co.com.gamehero.model.jugador.Jugador;
import co.com.gamehero.model.usuario.Usuario;
import co.com.gamehero.model.usuario.gateways.UsuarioRepository;
import co.com.gamehero.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Repository
public class UsuarioMongoRepositoryApdater extends AdapterOperations<Usuario, UsuarioDocument, String, UsuarioMongoDBRepository>
implements UsuarioRepository
{

    public UsuarioMongoRepositoryApdater(UsuarioMongoDBRepository usuarioMongoDBRepository, ObjectMapper mapper) {
        super(usuarioMongoDBRepository, mapper, d -> mapper.map(d, Usuario.class));
    }

    /*@Override
    public Flux<Usuario> finByEmail(String email) {
        return repository.findAll()
                .filter(jugadorDocument -> jugadorDocument.getEmail().equals(email))
                .map(usuarioDocument -> {
                    var usuario = new Usuario(
                            usuarioDocument.getId(),
                            usuarioDocument.getNombre(),
                            usuarioDocument.getEmail()
                    );
                    return usuario;
                });
    }*/
}
