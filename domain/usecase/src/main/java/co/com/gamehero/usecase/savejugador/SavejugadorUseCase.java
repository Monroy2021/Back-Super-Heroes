package co.com.gamehero.usecase.savejugador;

import co.com.gamehero.model.jugador.Jugador;
import co.com.gamehero.model.jugador.gateways.JugadorRepository;
import co.com.gamehero.model.mazo.Mazo;
import co.com.gamehero.usecase.savemazo.SaveMazoUseCase;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class SavejugadorUseCase {

    private final JugadorRepository jugadorRepository;
    private final SaveMazoUseCase saveMazoUseCase;

    public Mono<Jugador> saveJugador(Jugador jugador){
        var mazo = saveMazoUseCase.saveMazo();
        jugador.setMazo(Mazo.builder().build());
       return jugadorRepository.save(jugador);
    }

}
