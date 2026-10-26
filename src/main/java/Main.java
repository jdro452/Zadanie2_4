// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    
    
    
    System.out.println("1.dodawanie 2.odejmowanie 3.mnozenie 4.dzielenie");
    System.out.println("wybor:");
    Scanner scanner = new Scanner(System.in);
    int wybor = scanner.nextInt();
    
    switch(wybor){

      case 1:
        System.out.println("podaj pierwsza liczbe");
        int liczba1 =scanner.nextInt();
        System.out.println("podaj druga liczbe");
        int liczba2 =scanner.nextInt();
        int suma = liczba1 + liczba2;
        System.out.println("suma:");
        System.out.println(suma);
        break;

      case 2:
        System.out.println("podaj pierwsza liczbe");
        int liczba11 =scanner.nextInt();
        System.out.println("podaj druga liczbe");
        int liczba22 =scanner.nextInt();
        int roznica = liczba11 - liczba22;
        System.out.println("roznica:");
        System.out.println(roznica);
        break;

        case 3:
        System.out.println("podaj pierwsza liczbe");
        int liczba111 =scanner.nextInt();
        System.out.println("podaj druga liczbe");
        int liczba222 =scanner.nextInt();
        int iloczyn = liczba111 * liczba222;
        System.out.println("iloczyn:");
        System.out.println(iloczyn);
        break;

        case 4:
        System.out.println("podaj pierwsza liczbe");
        int liczba1111 =scanner.nextInt();
        System.out.println("podaj druga liczbe");
        int liczba2222 =scanner.nextInt();
        int iloraz = liczba1111 / liczba2222;
        System.out.println("iloraz:");
        System.out.println(iloraz);
        break;
    }

    
    //System.out.println("podaj pierwsza liczbe");
    int liczba1 =scanner.nextInt();
    System.out.println("podaj druga liczbe");
    int liczba2 =scanner.nextInt();
    
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}