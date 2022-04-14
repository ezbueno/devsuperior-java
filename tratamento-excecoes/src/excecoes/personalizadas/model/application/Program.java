package excecoes.personalizadas.model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import excecoes.personalizadas.model.entities.Reservation;
import excecoes.personalizadas.model.entities.exceptions.DomainException;

/**
 * @author Ezandro Bueno
 * Fazer um programa para ler os dados de uma reserva de hotel(número do quarto, data
 * de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração.
 * Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar
 * novamente a reserva com os dados atualizados. O programa não deve aceitar dados
 * inválidos para a reserva, conforme as seguintes regras:
 * - Alterações de reserva só podem ocorrer para datas futuras
 * - A data de saída deve ser maior que a data de entrada
 */
public class Program {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Reservation reservation;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();

			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());

			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());

			reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());

			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());

			reservation.updateDates(checkIn, checkOut);
			System.out.println(reservation);

		} catch (ParseException e) {
			System.out.println("Invalid date format!");			
		} catch (DomainException e) {
			System.out.println(e.getMessage());			
		} catch (RuntimeException e) {
			System.out.println("Unexpected error!");
		}
	}
}
