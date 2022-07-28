package co.com.gamehero.usecase.usuario.getusuarios;

import co.com.gamehero.model.usuario.Usuario;
import co.com.gamehero.model.usuario.gateways.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class GetUsuariosUseCase {

    private final UsuarioRepository usuarioRepository;

    public Flux<Usuario> getUsuarios(){
        return usuarioRepository.findAll();
    }
}
