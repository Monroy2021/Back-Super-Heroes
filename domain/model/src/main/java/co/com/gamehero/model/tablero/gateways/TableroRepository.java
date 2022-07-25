package co.com.gamehero.model.tablero.gateways;

import co.com.gamehero.model.tablero.Tablero;
import reactor.core.publisher.Mono;

public interface TableroRepository {
    Mono<Tablero> save(Tablero tablero);
}
