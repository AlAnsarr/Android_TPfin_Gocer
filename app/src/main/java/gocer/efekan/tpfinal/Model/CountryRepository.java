package gocer.efekan.tpfinal.Model;

import java.util.ArrayList;

import gocer.efekan.tpfinal.R;

public class CountryRepository
{
    private ArrayList<Country> countryList;

    public ArrayList<Country> getAll() {
        countryList = new ArrayList<>();

        countryList.add(new Country("France", "Code Pays :   FR", "Paris", R.drawable.france));
        countryList.add(new Country("Deutschland", "Code Pays :   DE", "Berlin", R.drawable.germany));
        countryList.add(new Country("United Kingdom", "Code Pays :   UK", "Londres", R.drawable.united_kingdom));

        return countryList;
    }
}
