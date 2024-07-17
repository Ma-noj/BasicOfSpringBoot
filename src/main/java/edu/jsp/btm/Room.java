package edu.jsp.btm;

import org.springframework.stereotype.Component;

@Component
public class Room {

	private int roomId;
	private int numberOfBed;

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getNumberOfBed() {
		return numberOfBed;
	}

	public void setNumberOfBed(int numberOfBed) {
		this.numberOfBed = numberOfBed;
	}

}
