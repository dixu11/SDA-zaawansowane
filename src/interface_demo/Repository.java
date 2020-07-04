package interface_demo;

import inheritance.ZwierzeDomowe;

public interface Repository {

    void loadData();

    void saveData();

}
//nie można tworzyć obiektu bezpośrednio
//wszystkie metody wyłącznie abstrakcyjne
//metody są publiczne i abstrakcyjne domyślnie - nie trzeba tego pisać
//brak konstruktorów
//brak pól obiektowych - wszystkie pola są domyślnie stałymi statycznymi

//jak interfejs implementuje inny interfejs piszemy extends
