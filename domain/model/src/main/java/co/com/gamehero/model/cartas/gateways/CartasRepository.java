package co.com.gamehero.model.cartas.gateways;

import co.com.gamehero.model.cartas.Cartas;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CartasRepository {
    Mono<Cartas> save(Cartas cartas); //Guardar

    Flux<Cartas> findAll(); //listar cards

    Mono<Void> deleteById(String id); //eliminar

}
