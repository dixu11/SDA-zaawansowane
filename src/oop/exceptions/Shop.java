package oop.exceptions;

public class Shop {

    private String item;


    public Shop(String item) {
        this.item = item;
    }

    public String getItem(String password) throws ShopException{
        if (password.equals("abcd")) {
            return getItem();
        } else {
            throw new ShopException("Hasło nie poprawne");
        }
    }

    private String getItem() throws ShopException {
        if (item == null || item.isEmpty()) {
           throw new ShopException("Przedmiot nie znaleziony");
        }
        return item;
    }
}
