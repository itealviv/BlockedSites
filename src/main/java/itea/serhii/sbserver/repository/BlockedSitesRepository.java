package itea.serhii.sbserver.repository;

import itea.serhii.sbserver.domain.BlockedSite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BlockedSitesRepository extends JpaRepository<BlockedSite, Integer> {
}
