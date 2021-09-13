package com.webprj.studio.service;

import java.util.List;

import com.webprj.di.entity.Reservation;

public class ReservationServiceImpl implements ReservationService {

	@Override
	public Reservation getReservation(int rsvSeq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> getReservations(String name, String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int registerReservation(Reservation rsv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateReservation(Reservation rsv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteReservation(Reservation rsv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Integer> getSeatNumbers(boolean booked) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/*
	 * private ReservationDao rsvDao; private SeatDao seatDao;
	 * 
	 * public ReservationServiceImpl(ReservationDao rsvDao, SeatDao seatDao) {
	 * this.rsvDao = rsvDao; this.seatDao = seatDao; }
	 * 
	 * @Override public Reservation getReservation(int rsvSeq) { return
	 * rsvDao.getReservation(rsvSeq); }
	 * 
	 * @Override public List<Reservation> getReservations(String name, String phone)
	 * { return rsvDao.getReservations( String.format("NAME='%s' and PHONE='%s'",
	 * name, phone)); }
	 * 
	 * // UPDATE SEAT SET RSV_SEQ = ? WHERE SEAT_NUMBER IN (.....)
	 * 
	 * @Override public int registerReservation(Reservation rsv) { int result = 0;
	 * 
	 * int rsvSeq = rsvDao.insertReservation(rsv);
	 * 
	 * result = seatDao.updateSeat(rsv.getSeatNumbers(), rsvSeq);
	 * 
	 * return result; }
	 * 
	 * @Override public int updateReservation(Reservation rsv) { Reservation
	 * prevRsv=rsvDao.getReservation(rsv.getRsvSeq());
	 * seatDao.updateSeat(prevRsv.getSeatNumbers(),0);
	 * 
	 * rsvDao.updateReservation(rsv);
	 * seatDao.updateSeat(rsv.getSeatNumbers(),rsv.getRsvSeq());
	 * 
	 * return 1; }
	 * 
	 * @Override public int deleteReservation(Reservation rsv) { int result = 0;
	 * 
	 * result = rsvDao.deleteReservation(rsv.getRsvSeq());
	 * 
	 * result = seatDao.updateSeat(rsv.getSeatNumbers(), 0);
	 * 
	 * return result; }
	 * 
	 * @Override public List<Integer> getSeatNumbers(boolean booked) { return
	 * seatDao.getSeatNumbers(booked); }
	 */

}
