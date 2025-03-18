package contab.process_data.persistence.repositories;

import contab.process_data.persistence.entities.ArtistsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpotifyRepository extends JpaRepository<ArtistsEntity, Long> {
    List<ArtistsEntity> getAll();
    List<ArtistsEntity> findByNameLike(String content);
    List<ArtistsEntity> findByLastNameLike(String content);

@NativeQuery(value = "select a.* from artists a where lastName = ?1")
    List<ArtistsEntity> selectNativeQuery(String content);
}
