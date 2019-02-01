package com.example.cryptocurrecyconverter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final double US_TO_BTC = 0.00029;
    private static final double BTC_TO_US = 3414.36;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final EditText enterus = findViewById(R.id.enterus);
        final TextView ustobtcoutput = findViewById(R.id.ustobtcoutput);
        final Button ustobtcbutton = findViewById(R.id.ustobtcbutton);
        final EditText enterbtc = findViewById(R.id.enterbtc);
        final TextView btctousoutput = findViewById(R.id.btctousoutput);
        final Button btctousbutton = findViewById(R.id.btctousbutton);

        ustobtcbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                double input = Double.parseDouble(enterus.getText().toString());
                double output = input * US_TO_BTC;
                ustobtcoutput.setText(Double.toString(output));
            }
        });

        btctousbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                double input = Double.parseDouble(enterbtc.getText().toString());
                double output = input * BTC_TO_US;
                btctousoutput.setText(Double.toString(output));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
