package collections.collections_poject.part2and3;

import java.util.*;

public class CountryService {
    private Set<Country> countries = new TreeSet<>();

    public void add(Country country) {
        countries.add(country);
    }

    public void remove(Country country) {
        countries.remove(country);
    }

    public void remove(String name) {
        countries.remove(findByExactName(name));
    }

    public List<Country> getAll() {
        return new ArrayList<>(countries);
    }

    public Country findByExactName(String name) {
        for (Country country : countries) {
            if (country.getName().equals(name)) {
                return country;
            }
        }
        return null;
    }

    public List<Country> findByName(String fragment) {
        List<Country> foundElements = new ArrayList<>();
        for (Country country : countries) {
            if (country.getName().contains(fragment)) {
                foundElements.add(country);
            }
        }
        return foundElements;
    }

    public Country findByCapital(String capital) {
        for (Country country : countries) {
            if (country.getCapital().equals(capital)) {
                return country;
            }
        }
        return null;
    }

    public List<Country> findAbove(int population) {
        List<Country> countriesAbove = new ArrayList<>();
        for (Country country : countries) {
            if (country.getPopulation() > population) {
                countriesAbove.add(country);
            }
        }
        return countriesAbove;
    }

    public Map<String, Country> createShortcutMap() {
        Map<String, Country> mapaCountries = new HashMap<>();
        for (Country country : countries) {
            mapaCountries.put(country.getShortcut(), country);
        }
        return mapaCountries;
    }

   public List<Country> getSortedByPopulation(){
       SortingByPopulationComparator sorting = new SortingByPopulationComparator();
       List<Country> sorted = new ArrayList<>(countries);
       sorted.sort(sorting);
       return sorted;
    }

    @Override
    public String toString() {
        return "CountryService{" +
                "countries=" + countries +
                '}';
    }
}
