package co.com.gamehero.model.jugador.gateways;

import co.com.gamehero.model.jugador.Jugador;
import reactor.core.publisher.Mono;

public interface JugadorRepository {

    Mono<Jugador> save(Jugador jugador);

    Mono<Jugador> findById(String id);

}
