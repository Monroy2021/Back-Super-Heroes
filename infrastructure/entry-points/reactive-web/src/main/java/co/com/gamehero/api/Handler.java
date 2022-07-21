package co.com.gamehero.api;

import co.com.gamehero.model.cards.Cards;
import co.com.gamehero.usecase.cards.SaveCardsUseCase;
import co.com.gamehero.usecase.getcards.GetCardsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {

    private  final SaveCardsUseCase saveCardsUseCase;
    private  final GetCardsUseCase getCardsUseCase;
    public Mono<ServerResponse> POSTCardsUseCase(ServerRequest serverRequest){
        return serverRequest.bodyToMono(Cards.class)
                .flatMap(cards -> saveCardsUseCase.saveCards(cards))
                .flatMap(result -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(result));
    }

    public Mono<ServerResponse> GETCardsUseCase(ServerRequest serverRequest){
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(getCardsUseCase.getCards(), Cards.class);
    }

}
