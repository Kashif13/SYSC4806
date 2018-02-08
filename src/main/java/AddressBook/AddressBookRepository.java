package AddressBook;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel="books", path ="books")
public interface AddressBookRepository extends CrudRepository<AddressBook, Long> {

}