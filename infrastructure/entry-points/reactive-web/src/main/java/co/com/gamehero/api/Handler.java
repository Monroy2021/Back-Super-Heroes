package co.com.gamehero.api;

import co.com.gamehero.model.cartas.Cartas;
import co.com.gamehero.model.juego.Juego;
import co.com.gamehero.model.jugador.Jugador;
import co.com.gamehero.model.mazo.Mazo;
import co.com.gamehero.model.tablero.Tablero;
import co.com.gamehero.model.usuario.Usuario;
import co.com.gamehero.usecase.cartas.savecards.SaveCartasUseCase;
import co.com.gamehero.usecase.cartas.deletecarta.DeleteCartaUseCase;
import co.com.gamehero.usecase.cartas.getcards.GetCartasUseCase;
import co.com.gamehero.usecase.jugador.getidjugador.GetidjugadorUseCase;
import co.com.gamehero.usecase.jugador.savejugador.SavejugadorUseCase;
import co.com.gamehero.usecase.savejuego.SavejuegoUseCase;
import co.com.gamehero.usecase.savemazo.SaveMazoUseCase;
import co.com.gamehero.usecase.cartas.updatecards.UpdateCartasUseCase;
import co.com.gamehero.usecase.savetablero.SaveTableroUseCase;
import co.com.gamehero.usecase.usuario.getusuarios.GetUsuariosUseCase;
import co.com.gamehero.usecase.usuario.saveusuario.SaveUsuarioUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {

    private  final SaveCartasUseCase saveCartasUseCase;
    private  final GetCartasUseCase getCartasUseCase;

    private final DeleteCartaUseCase deleteCartaUseCase;

    private final UpdateCartasUseCase updateCartasUseCase;

    private final SaveMazoUseCase saveMazoUseCase;

    private final SavejugadorUseCase savejugadorUseCase;

    private final SaveTableroUseCase saveTableroUseCase;

    private final SaveUsuarioUseCase saveUsuarioUseCase;

    private final GetUsuariosUseCase getUsuariosUseCase;

    private final SavejuegoUseCase savejuegoUseCase;

    private final GetidjugadorUseCase getidjugadorUseCase;

    public Mono<ServerResponse> POSTCartasUseCase(ServerRequest serverRequest){
        return serverRequest.bodyToMono(Cartas.class)
                .flatMap(cards -> saveCartasUseCase.saveCartas(cards))
                .flatMap(result -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(result));
    }

    public Mono<ServerResponse> POSTMazoUseCase(ServerRequest serverRequest){
        return serverRequest.bodyToMono(Mazo.class)
                .flatMap(mazo -> saveMazoUseCase.saveMazo())
                .flatMap(result -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(result));

    }

    public Mono<ServerResponse> POSTJugadorUseCase(ServerRequest serverRequest){
        return serverRequest.bodyToMono(Jugador.class)
                .flatMap(jugador -> savejugadorUseCase.saveJugador(jugador))
                .flatMap(result -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(result));

    }

    public Mono<ServerResponse> POSTUsarioUseCase(ServerRequest serverRequest){
        return serverRequest.bodyToMono(Usuario.class)
                .flatMap((usuario -> saveUsuarioUseCase.saveUsuario(usuario)))
                .flatMap(result -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(result));
    }

    public Mono<ServerResponse> GETUsuarioUseCase(ServerRequest serverRequest){
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(getUsuariosUseCase.getUsuarios(), Cartas.class);
    }

    public Mono<ServerResponse> POSTTableroUseCase(ServerRequest serverRequest){
        return serverRequest.bodyToMono(Tablero.class)
                .flatMap(tablero -> saveTableroUseCase.saveTablero())
                .flatMap(result -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(result));
    }

    public Mono<ServerResponse> POSTJuego(ServerRequest serverRequest){
        return serverRequest.bodyToMono(Juego.class)
                .flatMap(juego -> savejuegoUseCase.saveJuego(juego))
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

    public Mono<ServerResponse> DELETECartasUseCase(ServerRequest serverRequest){
        var id = serverRequest.pathVariable("id");
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(deleteCartaUseCase.deleteCarta(id), Void.class);
    }

    public Mono<ServerResponse> GETCartasUseCase(ServerRequest serverRequest){
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(getCartasUseCase.getCartas(), Cartas.class);
    }

    public Mono<ServerResponse> GETIdjugadorUseCase(ServerRequest serverRequest){
        var id = serverRequest.pathVariable("id");
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(getidjugadorUseCase.getIdJugador(id), Jugador.class);
    }

}
