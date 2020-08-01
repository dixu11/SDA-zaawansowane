package collections.collections_poject.part2and3;

import java.util.Comparator;

public class SortingByPopulationComparator implements Comparator<Country> {
    @Override
    public int compare(Country country1, Country country2) {
        return country1.getPopulation() - country2.getPopulation();
    }
}
