import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        defineAYear(400);
        operationSystem(2023,0);
        delivery(126);

    }

    public static void defineAYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " високосный.");
        }else {
            System.out.println("Год "+year+" не високосный.");}
    }

    public static void operationSystem(int clientDeviceYear, int clientOs) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (clientOs == 0) {
            if (clientDeviceYear <currentYear ) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");}
        }
    }

    public static void delivery(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Время доставки - 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Время доставки - 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Время доставки - 3 дня");
        } else {
            System.out.println("Сожалеем, но дальность доставки не более 100 км.");
        }
    }
}