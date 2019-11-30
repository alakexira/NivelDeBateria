package facci.AlexTubay.niveldebateria;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NiveldeBateria extends AppCompatActivity {
    TextView txt_nivel;
    ProgressBar pg_bateria;

    private BroadcastReceiver mReceiver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel_de_bateria);

        txt_nivel = (TextView) findViewById(R.id.txt_nivel);
        pg_bateria = (ProgressBar) findViewById(R.id.pb_bateria);

        mReceiver = new NiveldeBateria.BatteryBroadcastReceiver();


        registerReceiver(mReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

    }

    @Override
    protected void onStart() {
        super.onStart();
        registerReceiver(mReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }



    private class BatteryBroadcastReceiver extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
            txt_nivel.setText(level + " " + "%");
            pg_bateria.setProgress(level);
        }
    }

}
