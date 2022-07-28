package co.com.gamehero.mongo.juego;

import co.com.gamehero.model.juego.Juego;
import co.com.gamehero.model.juego.gateways.JuegoRepository;
import co.com.gamehero.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class JuegoMongoRepositoryApdater extends AdapterOperations<Juego, JuegoDocument, String, JuegoMongoDBRepository>
implements JuegoRepository
{

    public JuegoMongoRepositoryApdater(JuegoMongoDBRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Juego.class));
    }
}
