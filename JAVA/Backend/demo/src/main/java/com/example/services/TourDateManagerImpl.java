package com.example.services;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.TourDate;
import com.example.repositories.TourDateRepository;

@Service
public class TourDateManagerImpl implements TourDateManager{
	
	@Autowired
	TourDateRepository repository;

	@Override
	public List<TourDate> getAllTourDates() {
		return repository.findAll();
	}

	@Override
	public List<TourDate> getTourDatesBetweenDepartDateAndEndDate(Date searchDate,Date sameSearchDate) {
		return repository.findByDepartDateBeforeAndEndDateAfter(searchDate,sameSearchDate);
	}

	@Override
	public Optional<TourDate> getTourDateById(int id) {
		return repository.findById(id);
	}

	@Override
	public void saveDate(TourDate tourDate) {
		repository.save(tourDate);
	}

	@Override
	public void updateDate(TourDate tourDate) {
		repository.save(tourDate);
	}

	@Override
	public void deleteTourDateById(int id) {
		repository.deleteById(id);
	}
}