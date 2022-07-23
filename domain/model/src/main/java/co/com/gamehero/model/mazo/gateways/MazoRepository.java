package co.com.gamehero.model.mazo.gateways;

import co.com.gamehero.model.mazo.Mazo;
import reactor.core.publisher.Mono;

public interface MazoRepository {

    Mono<Mazo> save(Mazo mazo);

}
