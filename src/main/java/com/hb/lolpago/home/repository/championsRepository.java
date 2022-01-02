import java.util.List;

import com.hb.lolpago.home.document.champions;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface championsRepository extends MongoRepository<champions, String> {
    
    @Query("{name:'?0'}")
    champions findChampionByName(String name);
    
    // @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    // List<champions> findAll(String category);
    
    // public long count();

}