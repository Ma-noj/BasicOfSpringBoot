package edu.jsp.btm;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

	@PostMapping("/hotels/save")
	public String saveHotel(@RequestBody Hotel hotel) {
		
		int totalNumberOfBed = 0;
		for (Room room : hotel.getRooms()) {
			totalNumberOfBed = totalNumberOfBed + room.getNumberOfBed();
		}
		return "Total Number Of Bed In " + hotel.getHotelName() + "  = " + totalNumberOfBed;
	}

}
