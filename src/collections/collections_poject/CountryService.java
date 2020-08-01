package collections.collections_poject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountryService {
    private Set<String> countries = new HashSet<>();

    public void add(String countryName) {
        countries.add(countryName);
    }

    public void remove(String countryName) {
        countries.remove(countryName);
    }

    public List<String> getAll() {
        return new ArrayList<>(countries);
    }

    public String findByExactName(String name) {
        if (countries.contains(name)) {
            return name;
        }
        return "";
    }

    public List<String> findByName(String fragment) {
        List<String> foundElements = new ArrayList<>();
        for (String country : countries) {
            if (country.contains(fragment)) {
                foundElements.add(country);
            }
        }
        return foundElements;
    }

    @Override
    public String toString() {
        return "CountryService{" +
                "countries=" + countries +
                '}';
    }
}
