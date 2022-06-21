//  Napisz program, który będzie kalkulatorem walut z PLN na EUR i odwrotnie.

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj kwote: ");
    float gotowka = scan.nextFloat();
    System.out.println("Podaj walute \n1: PLN, \n2: EUR ");
    int waluta = scan.nextInt();
    switch(waluta)
      {
        case 1:
          {
            System.out.println("wybrano walute w PLN");
            System.out.println("Po zamianie na EUR dostaniemy "+ gotowka*0.22+" EURO");
          }break;
        case 2:
          {
            System.out.println("wybrano walute w EUR");
            System.out.println("Po zamianie na PLN dostaniemy "+ gotowka*4.65+" ZLOTY");
          }break;
      }
  }
}