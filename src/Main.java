public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int refill = 1500;
        int bonus = refill / 100;
        if (refill > 1000) {
            System.out.println("Ваш баланс равен:");
            System.out.println(balance + refill + bonus);
            System.out.println("Ваш бонус равен:");
            System.out.println(bonus);
        } else {
            System.out.println("Ваш баланс равен:");
            System.out.println(balance + refill);
            System.out.println("Ваш бонус равен:");
            System.out.println("0");
        }

    }
}