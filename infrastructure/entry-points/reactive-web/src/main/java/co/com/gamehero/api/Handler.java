package co.com.gamehero.api;

import co.com.gamehero.model.cartas.Cartas;
import co.com.gamehero.usecase.cards.SaveCartasUseCase;
import co.com.gamehero.usecase.getcards.GetCartasUseCase;
import co.com.gamehero.usecase.updatecards.UpdateCartasUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {

    private  final SaveCartasUseCase saveCartasUseCase;
    private  final GetCartasUseCase getCartasUseCase;

    private final UpdateCartasUseCase updateCartasUseCase;
    public Mono<ServerResponse> POSTCartasUseCase(ServerRequest serverRequest){
        return serverRequest.bodyToMono(Cartas.class)
                .flatMap(cards -> saveCartasUseCase.saveCartas(cards))
                .flatMap(result -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(result));
    }

    public Mono<ServerResponse> UPDATECartasUseCase(ServerRequest serverRequest){
        var id = serverRequest.pathVariable("id");
        return serverRequest.bodyToMono(Cartas.class)
                .flatMap(cards -> updateCartasUseCase.updateCartas(id,cards))
                .flatMap(result -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(result));
    }

    public Mono<ServerResponse> GETCartasUseCase(ServerRequest serverRequest){
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(getCartasUseCase.getCartas(), Cartas.class);
    }

}
