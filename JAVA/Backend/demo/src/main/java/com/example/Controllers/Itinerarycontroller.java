package com.example.Controllers;
import com.example.entity.Itinerary;
import com.example.services.ItineraryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("api/")
public class Itinerarycontroller {

    @Autowired
    ItineraryManager manager;

    @GetMapping("itineraries")
    public List<Itinerary> getAllItineraries() {
        return manager.getAllItineraries();
    }

    @GetMapping("itineraries/{categoryid}")
    public List<Itinerary> getItinerariesByCategoryId(@PathVariable int categoryid) {
        return manager.getItinerariesByCategoryId(categoryid);
    }
    
    @GetMapping("itinerary/{id}")
    public Optional<Itinerary> getItineraryById(@PathVariable int id) {
        return manager.getItineraryById(id);
    }
    
    @PostMapping("itinerary")
    public void createItinerary(@RequestBody Itinerary itinerary) {
        manager.saveItinerary(itinerary);
    }
    
    @PutMapping("itinerary/{id}")
	public void update(@RequestBody Itinerary itinerary, @PathVariable int id) { 
    	itinerary.setId(id);
		manager.updateItinerary(itinerary); 
    }
    
    @DeleteMapping("itinerary/{id}")
    public void deleteItinerary(@PathVariable int id) {
        manager.deleteCategoryById(id);
    }
}