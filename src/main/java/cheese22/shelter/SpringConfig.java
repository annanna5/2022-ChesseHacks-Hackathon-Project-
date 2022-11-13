package cheese22.shelter;

import cheese22.shelter.repository.*;
import cheese22.shelter.service.DogService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class SpringConfig {
    private final EntityManager em;

    public SpringConfig(EntityManager em) {
        this.em = em;
    }

    @Bean
    public DogService dogService() {
        return new DogService(dogRepository());
    }

    @Bean
    public DogRepository dogRepository() {
        return new DogRepository(em);
    }
}
