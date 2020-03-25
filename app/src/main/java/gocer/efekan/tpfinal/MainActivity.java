package gocer.efekan.tpfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import gocer.efekan.tpfinal.Controler.CountryAdapter;
import gocer.efekan.tpfinal.Model.Country;
import gocer.efekan.tpfinal.Model.CountryRepository;
import gocer.efekan.tpfinal.Model.OnCountryClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        CountryAdapter adapter = new CountryAdapter();
        recyclerView.setAdapter(adapter);
        CountryRepository countryRepository = new CountryRepository();
        adapter.setCountryList(countryRepository.getAll());
        adapter.setOnCountryClickListener(new OnCountryClickListener() {
            @Override
            public void onFlagClicked(Country country) {
                Toast.makeText(MainActivity.this, "La capitale de " + country.getCountryName() + " est " + country.getCountryCapital(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNameClicked(Country country) {
                Toast.makeText(MainActivity.this, "C'est le drapeau de " + country.getCountryName(), Toast.LENGTH_SHORT).show();
            }
        });




    }
}