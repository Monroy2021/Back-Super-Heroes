package co.com.gamehero.usecase.cards;

import co.com.gamehero.model.cards.Cards;
import co.com.gamehero.model.cards.gateways.CardsRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class SaveCardsUseCase {
    private final CardsRepository cardsRepository;

    public Mono<Cards> saveCards(Cards cards){
        /*
            Logic
         */
       return cardsRepository.save(cards);
    }
}
