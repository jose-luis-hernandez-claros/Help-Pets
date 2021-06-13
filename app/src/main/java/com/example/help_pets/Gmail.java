package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Gmail extends AppCompatActivity {


    private EditText idesti, idasunt, idmensaj;
    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail);

        idesti = findViewById(R.id.iddesti);
        idasunt = findViewById(R.id.idasunt);
        idmensaj = findViewById(R.id.idmensajem);

        enviar = findViewById(R.id.botonenviarm);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarmensaje();
            }
        });


    }
    public void enviarmensaje(){
        String destinatario =idesti.getText().toString();
        String[] varioscorreos = destinatario.split(","); //enviar a varios correos al mismo tiempo

        String asunto = idasunt.getText().toString();
        String mensaje = idmensaj.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, varioscorreos);
        intent.putExtra(Intent.EXTRA_SUBJECT, asunto);
        intent.putExtra(Intent.EXTRA_TEXT, mensaje);

        intent.setType("message/rfc822");
        startActivity(intent);

    }
}