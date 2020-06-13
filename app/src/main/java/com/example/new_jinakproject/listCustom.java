package com.example.new_jinakproject;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class listCustom extends ArrayAdapter<String> {
    private String[] Jenis;
    private String[] Pemilik;
    private String[] Alamat;
    private Integer[] Image;
    private Integer[] Foto;
    private Activity context;

    listCustom(Activity context, String[] Jenis, String[] Pemilik, String[] Alamat, Integer[] Image, Integer[] Foto){
        super(context, R.layout.list_item, Jenis);
        this.Jenis=Jenis;
        this.Pemilik=Pemilik;
        this.Alamat=Alamat;
        this.Image= Image;
        this.Foto=Foto;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder=null;
        if (view==null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            view=layoutInflater.inflate(R.layout.list_item, null, true);
            viewHolder=new ViewHolder(view);
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.jns.setText(Jenis[position]);
        viewHolder.pmlk.setText(Pemilik[position]);
        viewHolder.almt.setText(Alamat[position]);
        viewHolder.img.setImageResource(Image[position]);
        viewHolder.ft.setImageResource(Foto[position]);

        return view;
    }

    class ViewHolder {
        TextView jns, pmlk, almt;
        ImageView img, ft;
        ViewHolder(View v){
            jns= v.findViewById(R.id.jenis);
            pmlk= v.findViewById(R.id.pemilik);
            almt= v.findViewById(R.id.alamat);
            img= v.findViewById(R.id.list_img);
            ft= v.findViewById(R.id.foto);
        }
    }
}
