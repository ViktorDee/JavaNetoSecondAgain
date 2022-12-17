public class Main {
    public static void main(String[] args) {

        //Задание 2. «Получи рубль за каждые 100»
        int initialAccountMoney = 350;
        int topUpMoney = 3500;
        int bonusMoney = topUpMoney / 100;
        int totalMoney = initialAccountMoney + topUpMoney + bonusMoney;
        if (topUpMoney > 1000) {
            System.out.println(totalMoney + " - Сумма Вашего счёта. " + bonusMoney + " - Сумма Ваших Бонусов");
        } else {
            System.out.println(initialAccountMoney + topUpMoney + " - Сумма Вашего счёта");
        }
    }
}
