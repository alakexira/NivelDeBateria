package facci.AlexTubay.niveldebateria;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_Registro extends AppCompatActivity {
    EditText ing_nom, ing_tlf, ing_correo;
    Button btn_env;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        ing_nom = (EditText)findViewById(R.id.ing_nom);
        ing_tlf = (EditText)findViewById(R.id.ing_tlf);
        ing_correo = (EditText)findViewById(R.id.ing_correo);
        btn_env = (Button)findViewById(R.id.btn_env);


        btn_env.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Registrado",Toast.LENGTH_LONG).show();
            }
        });
    }
}
