package co.com.gamehero.usecase.cards;

import co.com.gamehero.model.cards.Cards;
import co.com.gamehero.model.cards.gateways.CardsRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CardsUseCase {
    private CardsRepository cardsRepository;

    public Mono<Cards> saveCards(Cards cards){
       return cardsRepository.save(cards);
    }
}
