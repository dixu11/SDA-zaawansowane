package advanced.java8;

public class EquationDemo {

    public static void main(String[] args) {
        Equation equation = (num1, num2) -> {
            if (num2 == 0) {
                throw new IllegalArgumentException("Nie można podać liczby 0 jako tej przez którą dzielimy");
            }
          return   num1 / num2;
        };

        try {
            System.out.println(equation.execute(5,0));
        }catch (IllegalArgumentException e){
            System.out.println("Obsługa dzielenia przez 0 ");
        }

    }
}

