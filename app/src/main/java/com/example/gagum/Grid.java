package com.example.gagum;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Grid extends Fragment {
    private RecyclerView rvHeroes;
    private ArrayList<Hero> list = new ArrayList<>();

    public Grid() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_grid, container, false);
        rvHeroes = (RecyclerView) rootview.findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);
        list.addAll(HeroesData.getListData());
        GridHeroAdapter gridHeroAdapter = new GridHeroAdapter(list);
        rvHeroes.setAdapter(gridHeroAdapter);
        GridLayoutManager glm = new GridLayoutManager(getActivity(),2);
        rvHeroes.setLayoutManager(glm);

        gridHeroAdapter.setOnItemClickCallback(new GridHeroAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Hero data) {
                showSelectedHero(data);
            }
        });

        return rootview;
    }

    private void showSelectedHero(Hero hero) {
        Toast.makeText(getActivity() ,"kamu memilih" + hero.getName(), Toast.LENGTH_SHORT).show();
    }

}
