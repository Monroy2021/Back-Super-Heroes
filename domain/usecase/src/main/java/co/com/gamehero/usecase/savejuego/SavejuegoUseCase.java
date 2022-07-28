package co.com.gamehero.usecase.savejuego;

import co.com.gamehero.model.juego.Juego;
import co.com.gamehero.model.juego.JugadoresId;
import co.com.gamehero.model.juego.gateways.JuegoRepository;
import co.com.gamehero.usecase.savetablero.SaveTableroUseCase;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
public class SavejuegoUseCase {

    private final JuegoRepository juegoRepository;

    private final SaveTableroUseCase saveTableroUseCase;

    public Mono<Juego> saveJuego(Juego juego){
        return saveTableroUseCase.saveTablero()
                .map(tablero -> {
                    juego.setTableroId(tablero.getId());
                    juego.setRonda(1);
                    return juego;
                }).flatMap(juegoRepository::save);
        //return juegoRepository.save(juego);
    }

}
