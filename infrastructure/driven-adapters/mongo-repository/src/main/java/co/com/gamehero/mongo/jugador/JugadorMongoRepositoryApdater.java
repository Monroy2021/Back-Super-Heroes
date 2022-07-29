package co.com.gamehero.mongo.jugador;

import co.com.gamehero.model.jugador.Jugador;
import co.com.gamehero.model.jugador.gateways.JugadorRepository;
import co.com.gamehero.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Repository
public class JugadorMongoRepositoryApdater extends AdapterOperations<Jugador, JugadorDocument, String, JugadorMongoDBRepository>
implements JugadorRepository
{

    public JugadorMongoRepositoryApdater(JugadorMongoDBRepository jugadorMongoDBRepository, ObjectMapper objectMapper) {
        super(jugadorMongoDBRepository, objectMapper, d -> objectMapper.map(d, Jugador.class));
    }

}
