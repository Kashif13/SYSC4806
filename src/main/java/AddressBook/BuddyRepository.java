package AddressBook;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="buddies", path ="buddies")
public interface BuddyRepository extends CrudRepository<BuddyInfo, Long> {
    List<BuddyInfo> findByName(String Name);
}