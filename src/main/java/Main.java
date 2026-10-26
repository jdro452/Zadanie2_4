// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    
    int liczba=10;
    
    System.out.println(liczba);

    Scanner scanner = new Scanner(System.in);
    System.out.println("podaj pierwsza liczbe");
    int liczba1 =scanner.nextInt();
    System.out.println("podaj druga liczbe");
    int liczba2 =scanner.nextInt();
    int suma = liczba1 + liczba2;
    System.out.println("suma:");
    System.out.println(suma);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}