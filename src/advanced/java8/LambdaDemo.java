package advanced.java8;

public class LambdaDemo {

    public static void main(String[] args) {
        Operacja dodawanie = (l1, l2) ->   l1 + l2;
        System.out.println(dodawanie.wykona(10, 20));


        Kalkulator kalkulator = new Kalkulator();
        kalkulator.usawOperacje( (a,b) -> a-b );



    }

}
