package facci.AlexTubay.niveldebateria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        Intent intent;
        switch (item.getItemId()){
            case R.id.opcionLogin:
                Intent a = new Intent(MainActivity.this, Login.class);
                startActivity(a);
                break;

            case R.id.opcionRegistrar:
                Intent b = new Intent(MainActivity.this, Activity_Registro.class);
                startActivity(b);
                break;

            case R.id.opcionBateria:
                Intent c = new Intent(MainActivity.this, NiveldeBateria.class);
                startActivity(c);
                break;

        }
        return true;
    }
}
