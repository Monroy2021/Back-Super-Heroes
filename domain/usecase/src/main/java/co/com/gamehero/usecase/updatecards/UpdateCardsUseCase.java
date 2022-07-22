package co.com.gamehero.usecase.updatecards;

import co.com.gamehero.model.cards.Cards;
import co.com.gamehero.model.cards.gateways.CardsRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class UpdateCardsUseCase {
    private final CardsRepository cardsRepository;

    public Mono<Cards> updateCards(String id, Cards cards){
        cards.setId(id);
        return cardsRepository.save(cards);
    }
}
