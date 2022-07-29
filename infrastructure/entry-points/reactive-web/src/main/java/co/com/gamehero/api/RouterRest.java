package co.com.gamehero.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;


@Configuration
public class RouterRest {
    @Bean
    public RouterFunction<ServerResponse> routerFunction(Handler handler) {
        return route(POST("/api/heroes/save"), handler::POSTCartasUseCase)
                .and(route(GET("api/heroes"), handler::GETCartasUseCase))
                .and(route(POST("/api/heroes/update/{id}"), handler::UPDATECartasUseCase))
                .and(route(DELETE("/api/heroes/delete/{id}"), handler::DELETECartasUseCase))
                .and(route(POST("/api/heroes/mazo/save"), handler::POSTMazoUseCase))
                .and(route(POST("/api/heroes/jugador/save"), handler::POSTJugadorUseCase))
                .and(route(POST("/api/heroes/tablero/save"), handler::POSTTableroUseCase))
                .and(route(POST("/api/heroes/usuario/save"), handler::POSTUsarioUseCase))
                .and(route(GET("/api/heroes/usuario/listar"), handler::GETUsuarioUseCase))
                .and(route(POST("/api/heroes/juego/save"), handler::POSTJuego))
                .and(route(GET("/api/heroes/jugador/listar/{id}"), handler::GETIdjugadorUseCase));
        //return route(GET("/api/usecase/path"), handler::listenGETUseCase);
        //.andRoute(POST("/api/usecase/otherpath"), handler::listenPOSTUseCase).and(route(GET("/api/otherusercase/path"), handler::listenGETOtherUseCase));

    }
}
