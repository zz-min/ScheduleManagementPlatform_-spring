package com.webprj.studio.service;

import java.util.List;

import com.webprj.di.entity.Reservation;

public interface ReservationService {

	Reservation getReservation(int rsvSeq);

	List<Reservation> getReservations(String name, String phone);
	
	int registerReservation(Reservation rsv);
	
	int updateReservation(Reservation rsv);
	
	int deleteReservation(Reservation rsv);

	List<Integer> getSeatNumbers(boolean booked);
}
