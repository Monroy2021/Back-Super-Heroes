package co.com.gamehero.model.usuario.gateways;

import co.com.gamehero.model.usuario.Usuario;
import reactor.core.publisher.Mono;

public interface UsuarioRepository {
    Mono<Usuario> save(Usuario usuario);
}
