package projects.MovieTicketBookingSystem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		BookingSystem bookingSystem = new BookingSystem();

		System.out.println("-----Booking System-----");

		while (true) {
			System.out.println(" ");
			System.out.println("1.View Available Seats");
			System.out.println("2.Book Seat");
			System.out.println("3.Cancel Booking");
			System.out.println("4.View Booking Summary");
			System.out.println("5.Exit");
			System.out.println(" ");
			int choice = input.nextInt();

			switch (choice) {
			case 1:
				bookingSystem.viewAllSeats();
				break;

			case 2:
				System.out.println("Enter seat number: ");
				int seatNumber = input.nextInt();
				if (bookingSystem.bookSeat(seatNumber)) {
					System.out.println("Seat is booked");
				}
				break;

			case 3:
				System.out.println("Enter seat number you want to cancel: ");
				int seat = input.nextInt();
				if (bookingSystem.cancelSeat(seat)) {
					System.out.println("Booked seat is cancelled");
				}
				break;

			case 4:
				bookingSystem.bookingSummary();
				break;
				
			case 5:
				System.exit(0);
				break;
			default:
				
				System.out.println("Invalid Request!");
				break;
			}
		}

	}
}
