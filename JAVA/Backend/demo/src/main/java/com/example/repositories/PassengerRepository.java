package com.example.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.Passenger;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface PassengerRepository extends JpaRepository<Passenger,Integer> {
		
//	@Query(value = "select count(passenger_id) from passenger_master where cust_id = :custId", nativeQuery = true)
//    int findByCustomer_Id(@Param("custId") int id);
//
//
//
//		
//
//	
//		@Query(value = "select sum(passenger_amount) from passenger_Master where cust_id = :custId", nativeQuery = true)
//		int findSum(@Param("custId") int id);

	
}
