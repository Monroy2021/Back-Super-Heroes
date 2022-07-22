package co.com.gamehero.model.cards.gateways;

import co.com.gamehero.model.cards.Cards;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CardsRepository {
    Mono<Cards> save(Cards cards); //Guardar

    Flux<Cards> findAll(); //listar cards

}
