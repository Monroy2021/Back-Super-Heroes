package co.com.gamehero.mongo.cartas;

import co.com.gamehero.model.cartas.Cartas;
import co.com.gamehero.model.cartas.gateways.CartasRepository;
import co.com.gamehero.mongo.cartas.CartasDocument;
import co.com.gamehero.mongo.cartas.MongoDBRepository;
import co.com.gamehero.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepositoryAdapter extends AdapterOperations<Cartas, CartasDocument, String, MongoDBRepository>
implements CartasRepository
{

    public MongoRepositoryAdapter(MongoDBRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Cartas.class));
    }

}
