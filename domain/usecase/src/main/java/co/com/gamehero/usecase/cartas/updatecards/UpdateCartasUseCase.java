package co.com.gamehero.usecase.cartas.updatecards;

import co.com.gamehero.model.cartas.Cartas;
import co.com.gamehero.model.cartas.gateways.CartasRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class UpdateCartasUseCase {
    private final CartasRepository cartasRepository;

    public Mono<Cartas> updateCartas(String id, Cartas cartas){
        cartas.setId(id);
        return cartasRepository.save(cartas);
    }
}
