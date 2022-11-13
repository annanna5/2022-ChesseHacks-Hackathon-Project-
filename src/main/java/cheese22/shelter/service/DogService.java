package cheese22.shelter.service;

import cheese22.shelter.domain.Dog;
import cheese22.shelter.repository.DogRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public class DogService {
    private final DogRepository dogRepository;

    public DogService(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public List<Dog> findDogs() {
        return dogRepository.findAll();
    }

    public List<Dog> findDogsByLocation(String location) {
        return dogRepository.findLocation(location);
    }
}
