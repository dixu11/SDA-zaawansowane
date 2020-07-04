package exceptions;

public class Exceptions4Demo {

    public static void main(String[] args)  {
        Shop shop = new Shop("");
        try {
            String item = shop.getItem("abcd");
        }catch (ShopException e){
            System.out.println(e.getMessage());
        }
    }
}
