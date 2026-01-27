package com.stela.appcadastro;

import static android.view.View.VISIBLE;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnOla = findViewById(R.id.btnOla);
        TextView txtMensagem = findViewById(R.id.txtMensagem);

        btnOla.setOnClickListener(v -> {
            txtMensagem.setVisibility(VISIBLE);
        });


    }
}