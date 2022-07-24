package co.com.gamehero.usecase.cartas.savecards;

import co.com.gamehero.model.cartas.Cartas;
import co.com.gamehero.model.cartas.gateways.CartasRepository;
import co.com.gamehero.usecase.cartas.getcards.GetCartasUseCase;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class SaveCartasUseCase {
    private final CartasRepository cartasRepository;
    private final GetCartasUseCase getCartasUseCase;

    public Mono<Cartas> saveCartas(Cartas cartas) {
        return getCartasUseCase.getCartas()
                .collectList()
                .map(indice -> {
                    cartas.setIndice(indice.size() + 1);
                    return cartas;
                }).flatMap(cartasRepository::save);
        //return cartasRepository.save(cartas);
    }
}
