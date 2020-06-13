package com.example.new_jinakproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

public class kambingPage extends AppCompatActivity {
    ImageButton back;
    ListView list;
    String[] mJenis = {"Kambing putih", "Kambing Hitam Putih", "Kambing Coklat", "Kambing Putih mulus", "Kambing Putih Hitam", "Kambing Goat"};
    String[] mPemilik = {"Hinata", "Minion", "Doraemon", "Sinchan", "Hinata", "Monion"};
    String[] mAlamat = {"Sawojajar-Malang", "Dau-Malang", "Tlogomas-Malang", "Singosari-Malang", "Sengkaling-Malang", "Dampit-Malang"};
    Integer[] mImgs = {R.drawable.kambing1, R.drawable.kambing2, R.drawable.kambing3, R.drawable.kambing4, R.drawable.kambing5, R.drawable.kambing6};
    Integer[] mFoto = {R.drawable.hinata, R.drawable.ninion, R.drawable.doraemon, R.drawable.sinchan,R.drawable.hinata,R.drawable.ninion};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kambing_page);
        list = findViewById(R.id.list_layout);
        back=findViewById(R.id.icon_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backintent = new Intent(getApplication(), fragmentController.class);
                startActivity(backintent);
            }
        });

        listCustom lc = new listCustom(this, mJenis, mPemilik, mAlamat, mImgs, mFoto);
        list.setAdapter(lc);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplication(), detailkambing.class);
                intent.putExtra("nama", mPemilik[position]);
                intent.putExtra("image", mImgs[position]);
                intent.putExtra("foto", mFoto[position]);
                intent.putExtra("alamat", mAlamat[position]);
                startActivity(intent);
            }
        });

    }
}
