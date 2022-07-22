package co.com.gamehero.usecase.cards;

import co.com.gamehero.model.cartas.Cartas;
import co.com.gamehero.model.cartas.gateways.CartasRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class SaveCartasUseCase {
    private final CartasRepository cartasRepository;

    public Mono<Cartas> saveCartas(Cartas cartas){
        /*
            Logic
         */
       return cartasRepository.save(cartas);
    }
}
