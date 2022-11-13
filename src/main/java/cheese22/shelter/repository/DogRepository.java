package cheese22.shelter.repository;

import cheese22.shelter.domain.Dog;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class DogRepository {
    private final EntityManager em;

    public DogRepository(EntityManager em) {
        this.em = em;
    }

    public List<Dog> findAll() {
        return em.createQuery("SELECT d FROM Dog d", Dog.class)
                .getResultList();
    }

    public List<Dog> findLocation(String location) {
        return em.createQuery("SELECT d FROM Dog d WHERE d.location LIKE :rqtlocation", Dog.class)
                .setParameter("rqtlocation", location)
                .getResultList();
    }
}