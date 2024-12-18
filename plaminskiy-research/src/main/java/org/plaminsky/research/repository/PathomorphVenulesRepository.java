package org.plaminsky.research.repository;

import org.plaminsky.research.entity.PathomorphVenules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PathomorphVenulesRepository extends JpaRepository<PathomorphVenules, Long> {
}
