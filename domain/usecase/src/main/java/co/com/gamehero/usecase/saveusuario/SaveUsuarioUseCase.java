package co.com.gamehero.usecase.saveusuario;

import co.com.gamehero.model.usuario.Usuario;
import co.com.gamehero.model.usuario.gateways.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class SaveUsuarioUseCase {
    private final UsuarioRepository usuarioRepository;

    public Mono<Usuario> saveUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
