package com.example.new_jinakproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

public class ikanPage extends AppCompatActivity {
    ImageButton back;
    ListView list;
    String[] mJenis = {"Ikan Putih", "Ikan Hitam Putih", "Ikan Coklat", "Ikan Putih mulus", "Ikan Putih Hitam", "Ikan Fish"};
    String[] mPemilik = {"Hinata", "Minion", "Doraemon", "Sinchan", "Hinata", "Monion"};
    String[] mAlamat = {"Sawojajar-Malang", "Dau-Malang", "Tlogomas-Malang", "Singosari-Malang", "Sengkaling-Malang", "Dampit-Malang"};
    Integer[] mImgs = {R.drawable.ikan1, R.drawable.ikan2, R.drawable.ikan3, R.drawable.ikan4, R.drawable.ikan5, R.drawable.ikan6};
    Integer[] mFoto = {R.drawable.hinata, R.drawable.ninion, R.drawable.doraemon, R.drawable.sinchan,R.drawable.hinata,R.drawable.ninion};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan_page);
        list = findViewById(R.id.list_layout);
        back = findViewById(R.id.icon_back);
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
                Intent intent = new Intent(getApplication(), detailIkan.class);
                intent.putExtra("nama", mPemilik[position]);
                intent.putExtra("image", mImgs[position]);
                intent.putExtra("foto", mFoto[position]);
                intent.putExtra("alamat", mAlamat[position]);
                startActivity(intent);
            }
        });
    }
}
