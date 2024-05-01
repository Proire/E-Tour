package com.example.repositories;
import java.sql.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.TourDate;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface TourDateRepository extends JpaRepository<TourDate, Integer> 
{
		List<TourDate> findByDepartDateBeforeAndEndDateAfter(Date searchDate,Date sameSearchDate);
}