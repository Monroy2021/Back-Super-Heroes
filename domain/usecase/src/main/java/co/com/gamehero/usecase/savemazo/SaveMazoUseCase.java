package co.com.gamehero.usecase.savemazo;

import co.com.gamehero.model.mazo.Mazo;
import co.com.gamehero.model.mazo.gateways.MazoRepository;
import co.com.gamehero.usecase.cards.SaveCartasUseCase;
import co.com.gamehero.usecase.getcards.GetCartasUseCase;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class SaveMazoUseCase {

    private final MazoRepository mazoRepository;
    private final GetCartasUseCase getCartasUseCase;

    public Mono<Mazo> saveMazo(Mazo mazo){
        var tarjetas = getCartasUseCase.getCartas();
        
        return mazoRepository.save(mazo);
    }

}
