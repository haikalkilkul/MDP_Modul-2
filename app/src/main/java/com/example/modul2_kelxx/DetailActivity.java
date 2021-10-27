package com.example.modul2_kelxx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.modul2_kelxx.R;

import com.example.modul2_kelxx.R;

public class DetailActivity extends AppCompatActivity {

    private TextView tvNama;
    private TextView tvLNama;
    private TextView tvEmail;
    private ImageView tvFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNama = findViewById(R.id.tv_item_first_name );
        tvLNama = findViewById(R.id.tv_item_last_name);
        tvEmail = findViewById(R.id.tv_item_email);
        tvFoto = findViewById(R.id.img_photo_user);

        if (getIntent().hasExtra("name")) {

            String nama = getIntent().getStringExtra("name");
            tvNama.setText(nama);
        }

        if (getIntent().hasExtra("Lname")) {

            String Lnama = getIntent().getStringExtra("Lname");
            tvLNama.setText(Lnama);
        }

        if (getIntent().hasExtra("emaill")) {

            String email = getIntent().getStringExtra("emaill");
            tvEmail.setText(email);
        }

        Glide.with(getApplicationContext()).load(getIntent().getStringExtra("foto")).into(tvFoto);
    }
}


