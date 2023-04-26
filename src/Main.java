// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int price = 13676; //стоимость билета
        int oneMile = 20; //за каждые 20 рублей начисляется по одной миле

        int bonus = price / oneMile;
        
                System.out.println("Количество бонусов = " + bonus);
    }
}