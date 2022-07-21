package co.com.gamehero.usecase.getcards;

import co.com.gamehero.model.cards.Cards;
import co.com.gamehero.model.cards.gateways.CardsRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class GetCardsUseCase {
    private final CardsRepository cardsRepository;

    public Flux<Cards> getCards(){
        return cardsRepository.findAll();
    }
}
