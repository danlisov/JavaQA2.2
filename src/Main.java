// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int balance = 150;
        int amount = 1500;
        int bonus = amount / 100;
        int FinalSum;

        if (amount >= 1000) {
            FinalSum = balance + amount + bonus;
        } else {
            FinalSum = balance + amount;
        }

        System.out.println(FinalSum);

    }
}