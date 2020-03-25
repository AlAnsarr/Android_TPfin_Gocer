package gocer.efekan.tpfinal.View;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import gocer.efekan.tpfinal.Model.Country;
import gocer.efekan.tpfinal.Model.OnCountryClickListener;
import gocer.efekan.tpfinal.R;

public class CountryViewHolder extends RecyclerView.ViewHolder {
    private Country country;
    private final TextView countryName;
    private final TextView countryCode;
    private final ImageView countryFlag;

    public CountryViewHolder(@NonNull View itemView, final OnCountryClickListener onCountryClickListener) {
        super(itemView);

        countryName = itemView.findViewById(R.id.country_name);
        countryCode = itemView.findViewById(R.id.country_code);
        countryFlag = itemView.findViewById(R.id.country_flag);

        countryName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCountryClickListener.onFlagClicked(country);
            }
        });

        countryFlag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCountryClickListener.onNameClicked(country);
            }
        });
    }

    public void bind(Country c) {
        country = c;

        countryName.setText(c.getCountryName());
        countryCode.setText(c.getCountryCode());
        countryFlag.setImageResource(country.getCountryFlag());
    }

    public static CountryViewHolder newInstance(ViewGroup parent, final OnCountryClickListener onCountryClickListener) {
        return new CountryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.country_list_item, parent, false), onCountryClickListener);
    }

}
