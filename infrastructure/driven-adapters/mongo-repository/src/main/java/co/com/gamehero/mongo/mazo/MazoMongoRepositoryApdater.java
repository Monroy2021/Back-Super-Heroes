package co.com.gamehero.mongo.mazo;

import co.com.gamehero.model.mazo.Mazo;
import co.com.gamehero.model.mazo.gateways.MazoRepository;
import co.com.gamehero.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MazoMongoRepositoryApdater extends AdapterOperations<Mazo, MazoDocument, String, MazoMongoDBRepository>
implements MazoRepository
{
    public MazoMongoRepositoryApdater(MazoMongoDBRepository mazoMongoDBRepository, ObjectMapper objectMapper){
        super(mazoMongoDBRepository, objectMapper, d -> objectMapper.map(d, Mazo.class));
    }
}
