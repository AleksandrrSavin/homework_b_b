public class Main {
    public static void main(String[] args) {
        int amountOnTheAccount = 100;
        int depositAmount = 2000;
        int balance = (amountOnTheAccount + depositAmount);

        int bonus;
        if (depositAmount >= 1000) {
            bonus = (depositAmount / 100);
        } else {
            bonus = 0;
        }
        int totalAmount = (balance + bonus);

        System.out.println("Общее количество рублей на Вашем счету "+ totalAmount);
        System.out.println("Количество бонусных рублей " + bonus);
    }
}