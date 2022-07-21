package co.com.gamehero.mongo;

import co.com.gamehero.model.cards.Cards;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface MongoDBRepository extends ReactiveMongoRepository<CardsDocument, String>, ReactiveQueryByExampleExecutor<CardsDocument> {
}
