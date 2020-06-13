package com.example.new_jinakproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class detailKelinci extends AppCompatActivity {
    ImageView image, foto;
    TextView nama, alamat;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kelinci);
        image=findViewById(R.id.gmbr_sapi);
        foto=findViewById(R.id.foto);
        nama=findViewById(R.id.nama_peternak);
        alamat=findViewById(R.id.alamat_peternak);

        Intent intent = getIntent();

        image.setImageResource(intent.getIntExtra("image",0));
        foto.setImageResource(intent.getIntExtra("foto",0));
        nama.setText(intent.getStringExtra("nama"));
        alamat.setText(intent.getStringExtra("alamat"));

        back=findViewById(R.id.btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(getApplication(), kelinciPage.class);
                startActivity(back);
            }
        });
    }
}
