import ru.itpark.CashbackTinkoff.CashbackTinkoff;

public class Main {
    public static void main(String[] args) {
        CashbackTinkoff service = new CashbackTinkoff();
        System.out.println(service.calculate(0)); // F4 на имени
        System.out.println(service.calculate(-50_000)); // F4 на имени
        System.out.println(service.calculate(10_000));
        System.out.println(service.calculate(1_000_000));
    }
}

