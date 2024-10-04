package org.plaminsky.research.repository;

import org.plaminsky.research.entity.DeceasedRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeceasedRecordRepository extends JpaRepository<DeceasedRecord, Long> {
}
