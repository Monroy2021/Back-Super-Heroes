package co.com.gamehero.usecase.cartas.getcards;

import co.com.gamehero.model.cartas.Cartas;
import co.com.gamehero.model.cartas.gateways.CartasRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class GetCartasUseCase {
    private final CartasRepository cartasRepository;

    public Flux<Cartas> getCartas(){
        return cartasRepository.findAll();
    }
}
