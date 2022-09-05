import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        //Подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        //Вызывваем целевой метод:
        long actual = service.calculate(amount, registered);

        //Производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        //Подготавливаем данные:
        long amount = 18_000;
        boolean registered = true;
        long expected = 500;

        //Вызывваем целевой метод:
        long actual = service.calculate(amount, registered);

        //Производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndForLimit(){
        BonusService service = new BonusService();

        //Подготавливаем данные:
        long amount = 42_000;
        boolean registered = false;
        long expected = 420;

        //Вызывваем целевой метод:
        long actual = service.calculate(amount, registered);

        //Производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndInLimit(){
        BonusService service = new BonusService();

        //Подготавливаем данные:
        long amount = 190_000;
        boolean registered = false;
        long expected = 500;

        //Вызывваем целевой метод:
        long actual = service.calculate(amount, registered);

        //Производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
