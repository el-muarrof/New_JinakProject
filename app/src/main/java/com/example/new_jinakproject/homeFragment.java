package com.example.new_jinakproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class homeFragment extends Fragment {
    ImageButton sapi,kambing, kelinci, ayam, bird, ikan;
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        sapi = view.findViewById(R.id.btn_sapi);
        sapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sapiInten = new Intent(getActivity(), sapiPage.class);
                startActivity(sapiInten);
            }
        });
        kambing=view.findViewById(R.id.img_kambing);
        kambing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kambingIntent = new Intent(getActivity(), kambingPage.class);
                startActivity(kambingIntent);
            }
        });
        kelinci=view.findViewById(R.id.img_kelinci);
        kelinci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), kelinciPage.class);
                startActivity(intent);
            }
        });
        ayam=view.findViewById(R.id.img_ayam);
        ayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ayamPage.class);
                startActivity(intent);
            }
        });
        bird=view.findViewById(R.id.img_bird);
        bird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), burungPage.class);
                startActivity(intent);
            }
        });
        ikan=view.findViewById(R.id.img_ikan);
        ikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ikanPage.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
