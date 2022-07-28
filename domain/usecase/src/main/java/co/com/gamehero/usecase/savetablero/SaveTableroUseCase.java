package co.com.gamehero.usecase.savetablero;

import co.com.gamehero.model.cartas.CartaEstado;
import co.com.gamehero.model.cartas.Cartas;
import co.com.gamehero.model.tablero.JugadorId;
import co.com.gamehero.model.tablero.Tablero;
import co.com.gamehero.model.tablero.gateways.TableroRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class SaveTableroUseCase {

    private final TableroRepository tableroRepository;

    public Mono<Tablero> saveTablero(){
        Map<JugadorId, Cartas> cartaApostada = new HashMap<>();
        var tablero = new Tablero();
        tablero.setCartaApostada(cartaApostada);
        tablero.setCartaEstado(new CartaEstado(true));
        tablero.setTiempo(20);
        return tableroRepository.save(tablero);
    }

}
