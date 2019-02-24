package ru.itpark;

public class Main {
    public static void main(String[] args) {//что означает эта строка?
        cashBack service = new cashBack();
        System.out.println(service.calculateHigh (800));
        System.out.println(service.calculateNormal(20_000));
        System.out.println(service.calculateExtra(500_000_000));
            }
    }
