package com.example.gagum;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class GaleryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        String imgFoto = getIntent().getExtras().getString("foto");
        ImageView foto = findViewById(R.id.imageView);
        Glide.with(this)
               .asBitmap()
                .load(imgFoto)
                .into(foto);


        String tvName = getIntent().getExtras().getString("name");
        TextView name = findViewById(R.id.tv_item_name);
        name.setText(tvName);

        String tvFrom = getIntent().getExtras().getString("deskripsi");
        TextView from = findViewById(R.id.tv_item_from);
        from.setText(tvFrom);
    }
}
