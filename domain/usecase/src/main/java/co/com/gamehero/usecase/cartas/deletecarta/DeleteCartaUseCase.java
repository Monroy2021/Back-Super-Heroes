package co.com.gamehero.usecase.cartas.deletecarta;

import co.com.gamehero.model.cartas.gateways.CartasRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class DeleteCartaUseCase {

    private final CartasRepository cartasRepository;

    public Mono<Void> deleteCarta(String id){
        return cartasRepository.deleteById(id);
    }
}
