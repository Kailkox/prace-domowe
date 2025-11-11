import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        Integer liczba1 = Integer.parseInt(scan.nextLine());
        System.out.println("Podaj druga liczbe");
        Integer liczba2 = Integer.parseInt(scan.nextLine());
        System.out.println("Podaj trzecia liczbe");
        Integer liczba3 = Integer.parseInt(scan.nextLine());

        System.out.println(liczba1 + liczba2 + liczba3);
        Integer najwieksza = 0;
        
        if(liczba1 > liczba2 && liczba1 > liczba3)
        {
            najwieksza = liczba1;
        }
        if(liczba2 > liczba1 && liczba2 > liczba3)
        {
            najwieksza = liczba2;
        }
        if(liczba1 > liczba2 && liczba1 > liczba3)
        {
            najwieksza = liczba3;
        }
        if(najwieksza > liczba1 + liczba2)
        {
            System.out.println("Z podanych bokow da sie zrobic trojkat!");
        }
        else
        {
            System.out.println("Z podanych bokow NIE da sie zrobic trojkata!"); 
        }
    }
}

import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        Integer liczba1 = Integer.parseInt(scan.nextLine());
        System.out.println("Podaj druga liczbe");
        Integer liczba2 = Integer.parseInt(scan.nextLine());
        System.out.println("Podaj trzecia liczbe");
        Integer liczba3 = Integer.parseInt(scan.nextLine());        
        System.out.println("Podaj czwarte liczbe");
        Integer liczba4 = Integer.parseInt(scan.nextLine());
        Integer najwieksza = 0;
        
        Integer[] Liczby = new Integer[4];
        Liczby[0] = liczba1;
        Liczby[1] = liczba2;
        Liczby[2] = liczba3;
        Liczby[3] = liczba4;
        
        Arrays.sort(Liczby);
        System.out.println(Liczby[0]);
        System.out.println(Liczby[3]);
    }
}
