package ru.itpark.CashbackTinkoff;

public class CashbackTinkoff {
        public int calculate(int monthCosts){
        if (monthCosts <= 0) {
            return 0;
        }
            int percent = 5;
            int result = monthCosts*percent/100;
            int limit = 3000;
if (result>limit) {
    return limit;
        }
     return result;
    }
}

//TODO: шаблон для метода (ДЗ - Tinkoff)
//    public int calculate(int monthCostsRegular, int monthCostsHigh, int monthCostsExtra) {


    /*int cashBackFuel = 1;  //пусть на топливо у нас обычный кэшбэк//
    int washingMachine = 30; //стиральные машины- по акции//
    int purchase = 100;//
    */