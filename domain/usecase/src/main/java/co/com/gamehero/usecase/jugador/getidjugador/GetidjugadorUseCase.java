package co.com.gamehero.usecase.jugador.getidjugador;

import co.com.gamehero.model.jugador.Jugador;
import co.com.gamehero.model.jugador.gateways.JugadorRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class GetidjugadorUseCase {

    private final JugadorRepository jugadorRepository;

    public Mono<Jugador> getIdJugador(String id){
        return jugadorRepository.findById(id);
    }

}
