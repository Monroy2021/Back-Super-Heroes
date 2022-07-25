package co.com.gamehero.usecase.savetablero;

import co.com.gamehero.model.cartas.CartaEstado;
import co.com.gamehero.model.tablero.Tablero;
import co.com.gamehero.model.tablero.gateways.TableroRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class SaveTableroUseCase {

    private final TableroRepository tableroRepository;

    public Mono<Tablero> saveTablero(){
        var tablero = new Tablero();
        tablero.setCartaEstado(new CartaEstado(false));
        tablero.setTiempo(20);
        return tableroRepository.save(tablero);
    }

}
