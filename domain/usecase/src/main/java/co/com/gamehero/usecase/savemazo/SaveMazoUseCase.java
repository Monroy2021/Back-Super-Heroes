package co.com.gamehero.usecase.savemazo;

import co.com.gamehero.model.mazo.Mazo;
import co.com.gamehero.model.mazo.gateways.MazoRepository;
import co.com.gamehero.usecase.cartas.getcards.GetCartasUseCase;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class SaveMazoUseCase {

    private final MazoRepository mazoRepository;
    private final GetCartasUseCase getCartasUseCase;

    public Mono<Mazo> saveMazo() {
        var mazo = new Mazo();
        return getCartasUseCase.getCartas()
                .collectList()
                .map(random -> {
                    Collections.shuffle(random);
                    return random.stream().limit(2).collect(Collectors.toList());
                })
                .map(element -> {
                    mazo.setCartasSet(element);
                    return mazo;
                }).flatMap(mazoRepository::save);
    }

}
