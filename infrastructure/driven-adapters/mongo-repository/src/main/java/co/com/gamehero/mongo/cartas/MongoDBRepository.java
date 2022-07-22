package co.com.gamehero.mongo.cartas;

import co.com.gamehero.mongo.cartas.CartasDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface MongoDBRepository extends ReactiveMongoRepository<CartasDocument, String>, ReactiveQueryByExampleExecutor<CartasDocument> {
}
