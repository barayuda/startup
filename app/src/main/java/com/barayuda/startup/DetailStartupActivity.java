package com.barayuda.startup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailStartupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_startup);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Startup startupkey = getIntent().getParcelableExtra("key");

        ImageView startup_gambar = findViewById(R.id.img_startup_photo);
        TextView startup_nama = findViewById(R.id.tv_startup_name);
        TextView startup_desc = findViewById(R.id.tv_startup_desc);
        TextView deskripsi = findViewById(R.id.tv_deskripsi);
        TextView startup_berdiri = findViewById(R.id.tv_berdiri);
        TextView startup_ceo = findViewById(R.id.tv_ceo);

        Glide.with(this).load(startupkey.getPhoto()).override(350,550).into(startup_gambar);
        startup_nama.setText(startupkey.getName());
        startup_desc.setText(startupkey.getRemarks());
        deskripsi.setText(startupkey.getDeskripsi());
        startup_berdiri.setText(startupkey.getBerdiri());
        startup_ceo.setText(startupkey.getCeo());

        Log.i("photo", startupkey.getPhoto());
        Log.i("deskripsi", startupkey.getDeskripsi());
    }
}
