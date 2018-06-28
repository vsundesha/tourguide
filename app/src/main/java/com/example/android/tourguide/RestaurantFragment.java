package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;


public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.r1, R.string.ra1, R.drawable.ic_action_name));
        locations.add(new Location(R.string.r2, R.string.ra2, R.drawable.ic_action_name));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_restaurants);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }


}
