package co.com.gamehero.model.juego.gateways;

import co.com.gamehero.model.juego.Juego;
import reactor.core.publisher.Mono;

public interface JuegoRepository {
    Mono<Juego> save(Juego juego);
}
