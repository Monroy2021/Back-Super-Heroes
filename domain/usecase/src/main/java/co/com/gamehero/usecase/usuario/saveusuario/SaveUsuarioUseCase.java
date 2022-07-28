package co.com.gamehero.usecase.usuario.saveusuario;

import co.com.gamehero.model.usuario.Usuario;
import co.com.gamehero.model.usuario.gateways.UsuarioRepository;
import co.com.gamehero.usecase.usuario.getusuarios.GetUsuariosUseCase;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class SaveUsuarioUseCase {
    private final UsuarioRepository usuarioRepository;

    public Mono<Usuario> saveUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
