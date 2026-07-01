package projects.MovieTicketBookingSystem;

public class BookingSystem {

	String status[] = new String[5];

	public BookingSystem() {
		for (int i = 0; i < status.length; i++) {
			status[i] = "Available";
		}
	}

	public void viewAllSeats() {
		for (int i = 0; i < status.length; i++) {
			System.out.println("Seat " + (i + 1) + ": " + status[i]);
		}
	}

	public boolean bookSeat(int seatNumber) {
		if (seatNumber <= 0 || seatNumber > status.length) {
			System.out.println("Invalid Seat");
		} else if (status[seatNumber - 1].equals("Available")) {
			status[seatNumber - 1] = "Booked";
			return true;
		} else if (status[seatNumber - 1].equals("Booked")) {
			System.out.println("Seat is already booked");
		}
		return false;
	}

	public boolean cancelSeat(int seatNumber) {
		if (seatNumber <= 0 || seatNumber > status.length) {
			System.out.println("Invalid Seat");
		} else if (status[seatNumber - 1].equals("Booked")) {
			status[seatNumber - 1] = "Available";
			return true;
		} else if (status[seatNumber - 1].equals("Available")) {
			System.out.println("Cannot cancel an available seat.");
		}
		return false;
	}

	public void bookingSummary() {

	}
}
