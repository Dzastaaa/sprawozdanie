package sprawozdanie;


import java.util.ArrayList;
import java.util.Scanner;
public class Aplikacja {
 private static ArrayList<String> notatki = new ArrayList<String>();
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in); //pobranie liczby od użytkownika
 int wybor = 0;
 while (wybor != 5) {
 System.out.println("Wybierz opcję:"); //wyświetlenie dostępnych opcji
 System.out.println("1. Dodaj notatkę");
 System.out.println("2. Wyświetl notatki");
 System.out.println("3. Usuń notatkę");
 System.out.println("4. Wyszukaj notatki");
 System.out.println("5. Wyjdź");
 wybor = scanner.nextInt();
 switch (wybor) {
 case 1:
 dodajNotatke(scanner);
break;
 case 2:
 wyswietlNotatki();
break;
 case 3:
 usunNotatke(scanner);
 break;
 case 4:
 wyszukajNotatki(scanner);
break;
 case 5:
 zapiszNotatki(scanner);
break;
 default:
 System.out.println("Nieznana opcja");
 }
 }
 scanner.close();
 }
 private static void zapiszNotatki(Scanner scanner) {
 }
 private static void dodajNotatke(Scanner scanner) {
 System.out.println("Podaj treść notatki:");
 scanner.nextLine();
 String notatka = scanner.nextLine();
 notatki.add(notatka);
 System.out.println("Notatka dodana");
 }
 private static void wyswietlNotatki() {
 if (notatki.isEmpty()) {
 System.out.println("Brak notatek");
 return;
 }
 for (int i = 0; i < notatki.size(); i++) {
 System.out.println((i + 1) + ". " + notatki.get(i));
 }
 }
 private static void usunNotatke(Scanner scanner) {
 if (notatki.isEmpty()) {
 System.out.println("Brak notatek");
 return;
 }
 System.out.println("Podaj numer notatki do usunięcia:");
 int numer = scanner.nextInt();
 if (numer < 1 || numer > notatki.size()) {
 System.out.println("Nieprawidłowy numer notatki");
 return;
 }
 notatki.remove(numer - 1);
 System.out.println("Notatka usunięta");
}
 /**
 * @param scanner
 */
private static void wyszukajNotatki(Scanner scanner) {
 if (notatki.isEmpty()) {
 System.out.println("Brak notatek");
 return;
 }
 System.out.println("Podaj fragment do wyszukania:");
 scanner.nextLine();
 String fragment = scanner.nextLine().toLowerCase();
 for (int i = 0; i < notatki.size(); i++) {
 if (notatki.get(i).toLowerCase().contains(fragment)) {
 System.out.println((i + 1) + ". " + notatki.get(i));
 }
 }
}
}
 