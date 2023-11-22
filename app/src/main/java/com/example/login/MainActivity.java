package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText user = findViewById(R.id.usuario);
        TextView resulText= findViewById(R.id.result_check);
        EditText passwd= findViewById(R.id.contraseña);
        Button button= findViewById(R.id.boton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuariocorrecto = "galle";
                String contraseñacorrecta = "12345";
                String usuario = user.getText().toString();
                String contraseña = passwd.getText().toString();
                resulText.setTextColor(Color.rgb(255,0,0));


                if (usuario.equals(usuariocorrecto) && contraseña.equals(contraseñacorrecta)) {
                    resulText.setText("Usuario y contraseña correctos");
                    resulText.setTextColor(Color.rgb(0,255,0));
                } else if (usuario.isEmpty() && contraseña.isEmpty()) {
                    resulText.setText("El usuario y la contraseña no pueden estar vacíos");
                } else if (!usuario.equals(usuariocorrecto) && contraseña.equals(contraseñacorrecta)) {
                    resulText.setText("El usuario es incorrecto");
                } else if (usuario.equals(usuariocorrecto) && !contraseña.equals(contraseñacorrecta)) {
                    resulText.setText("La contraseña es incorrecta");
                } else if (!usuario.equals(usuariocorrecto) && !contraseña.equals(contraseñacorrecta)) {
                    resulText.setText("El usuario y la contraseña no son correctos");
                }


            }
        });
    }
}

