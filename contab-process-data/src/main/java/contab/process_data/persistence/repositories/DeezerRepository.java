package contab.process_data.persistence.repositories;

import contab.process_data.persistence.entities.ArtistsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeezerRepository extends JpaRepository<ArtistsEntity, Long> {
    List<ArtistsEntity> getAll();
    List<ArtistsEntity> findByNameLike(String content);
    List<ArtistsEntity> findByLastNameLike(String content);
}
