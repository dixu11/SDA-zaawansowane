package advanced.anonymous;

public class ClassesDemo {

    public static void main(String[] args) {

        Object object = new Object(){
            @Override
            public String toString() {
                return "toString hacked";
            }
        };
        System.out.println(object);

        class Klasa4{

        }
    }

    public class Klasa3{

    }

}


class Klasa1{

}

class Klasa2{

}
