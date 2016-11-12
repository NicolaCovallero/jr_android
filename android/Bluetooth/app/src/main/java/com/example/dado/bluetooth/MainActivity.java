package com.example.dado.bluetooth;
// comment to test git
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    private BluetoothAdapter ba;
    private Set<BluetoothDevice> devices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String list = "";

        ba = BluetoothAdapter.getDefaultAdapter();

        if(!ba.isEnabled()) {
            Intent on = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(on, 0);
            Toast.makeText(getApplicationContext(), "Bluetooth not activated", Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(getApplicationContext(), "Bluetooth activated", Toast.LENGTH_SHORT).show();

            //devices = ba.get

            Log.d("Passaggio1","Passato");

            for(BluetoothDevice bd: devices){
                list+= bd.getName() + ";";
            }

            Log.d("Passaggio2","Passato");

            //Toast.makeText(getApplicationContext(), list, Toast.LENGTH_SHORT).show();
            Log.d("Devices list", list);

            Log.d("Passaggio3","Passato");
        }
    }
}
