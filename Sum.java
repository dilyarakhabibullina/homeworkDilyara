public class Sum {
    public static void main (String[] args){
        int count=2;
        int price=50;
        int discount=25;
        int sum=(count*price);
        int sumDiscount=(sum*discount)/100;
        int sumFinal=sum-sumDiscount;
                System.out.println(sumFinal);
    }
}