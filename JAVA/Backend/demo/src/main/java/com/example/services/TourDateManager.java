package com.example.services;
import java.sql.Date;
import java.util.List;
import java.util.Optional;
import com.example.entity.TourDate;	

public interface TourDateManager 
{
	List<TourDate> getAllTourDates();
	List<TourDate> getTourDatesBetweenDepartDateAndEndDate(Date searchDate,Date sameSearchDate);
	Optional<TourDate> getTourDateById(int id);
	void saveDate(TourDate tourDate);
	void updateDate(TourDate TourDate);
	void deleteTourDateById(int id);
}