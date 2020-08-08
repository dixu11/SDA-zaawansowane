package advanced.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Product product = new Product("Kosiarka", 1500, 3);
        Class klasaProduktu = Product.class;
        Class klasaProduktu2 = product.getClass();
        Class klasaProduktu3 = Class.forName("advanced.reflection.Product");


        for (Method method : klasaProduktu.getMethods()) {
            System.out.println(method.getReturnType());
            System.out.println(method.getName());
            System.out.println(Arrays.toString(method.getParameterTypes()));
            System.out.println();
        }

        Class[] argumentyKonstruktora = {String.class, double.class, int.class};
        Constructor constructor = klasaProduktu.getConstructor(argumentyKonstruktora);
      Product product2 = (Product) constructor.newInstance("Taczka", 500, 4);
        System.out.println(product2);

        Field poleCena = klasaProduktu.getDeclaredField("price");
        poleCena.setAccessible(true);
        poleCena.set(product,90);
        System.out.println(product);

    }

}
