package AddressBook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(BuddyRepository repository, AddressBookRepository addressBookRepository) {
        return (args) -> {
            // save a couple of buddys
            repository.save(new BuddyInfo("1","2", "2"));
            repository.save(new BuddyInfo("2","2", "2"));
            repository.save(new BuddyInfo("3","2", "2"));
            repository.save(new BuddyInfo("4","2", "2"));
            repository.save(new BuddyInfo("5","2", "2"));
            repository.save(new BuddyInfo("6","2", "2"));
            addressBookRepository.save(new AddressBook());

            // fetch all customers
            log.info("Buddies found with findAll():");
            log.info("-------------------------------");
            for (BuddyInfo buddy : repository.findAll()) {
                log.info(buddy.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            BuddyInfo b1 = repository.findOne(1L);
            log.info("Buddy found with findOne(1L):");
            log.info("--------------------------------");
            log.info(b1.toString());
            log.info("");

            // fetch customers by last name
            log.info("Buddy found with findByName('2'):");
            log.info("--------------------------------------------");
            for (BuddyInfo bauer : repository.findByName("2")) {
                log.info(bauer.toString());
            }
            log.info("");
        };
    }

}