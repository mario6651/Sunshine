package com.example.mariusz.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_main, container, false);
    String[] forecastArray = {
            "Today - Sunny - 25/11",
            "Tommorow - Foggy - 70/40",
            "Sobota - deszcz - 72/63",
            "Niedziela - snieg - 75/65",
            "Pon - ostry deszcz - 65/56",
            "wtorek - tatatatata - 60/62",
            "sroda - slonce -63/43"
    };

        List<String> weekforecast = new ArrayList<>(Arrays.asList(forecastArray));

        ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekforecast);

        ListView list_view_forecast;
        list_view_forecast = (ListView) rootView.findViewById(R.id.listview_forecast);
        list_view_forecast.setAdapter(mForecastAdapter);

        return rootView;
    }
}
