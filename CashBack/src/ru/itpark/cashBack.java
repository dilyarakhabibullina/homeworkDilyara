package ru.itpark;

public class cashBack {
    public int calculateHigh(int monthCostsHigh){
        int percent = 5;
        int result = monthCostsHigh*percent/100;
        int limit = 3000;
        if (limit<result) {
            return limit;
        }
            return result;
    }
    public int calculateNormal(int monthCostsNormal){
        int percent = 1;
        int result = monthCostsNormal*percent/100;
        int limit = 3000;
        if (limit<result) {
            return limit;
        }
        return result;
    }
    public int calculateExtra(int monthCostsExtra){
        int percent = 30;
        int result = monthCostsExtra*percent/100;
        int limit = 3000;
        if (limit<result) {
            return limit;
        }
        return result;
    }
}
