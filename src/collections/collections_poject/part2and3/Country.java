package collections.collections_poject.part2and3;

import java.util.Objects;

public class Country implements Comparable<Country>{
    private String name;
    private int population = 0;
    private String capital = "";
    private String shortcut;

    public Country(String name) {
        this.name = name;
        population = (int)(Math.random()*1000);
    }


    public Country(String name, int population, String capital, String shortcut) {
        this.name = name;
        this.population = population;
        this.capital = capital;
        this.shortcut = shortcut;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getPopulation() {
        return population;
    }

    public String getShortcut() {
        return shortcut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return population == country.population &&
                Objects.equals(name, country.name) &&
                Objects.equals(capital, country.capital) &&
                Objects.equals(shortcut, country.shortcut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population, capital, shortcut);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", capital='" + capital + '\'' +
                ", shortcut='" + shortcut + '\'' +
                '}';
    }

    @Override
    public int compareTo(Country otherCountry) {
        return name.compareTo(otherCountry.name);
    }
}
