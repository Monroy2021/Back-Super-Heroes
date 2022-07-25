package co.com.gamehero.mongo.tablero;

import co.com.gamehero.model.tablero.Tablero;
import co.com.gamehero.model.tablero.gateways.TableroRepository;
import co.com.gamehero.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class TableroMongoRepositoryApdater extends AdapterOperations<Tablero, TableroDocument, String, TableroMongoDBRepository>
implements TableroRepository
{
    public TableroMongoRepositoryApdater(TableroMongoDBRepository tableroMongoDBRepository, ObjectMapper mapper) {
        super(tableroMongoDBRepository, mapper, d -> mapper.map(d, Tablero.class));
    }
}
