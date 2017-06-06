package com.marananseb.outilmathematique;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Moyenne extends AppCompatActivity {

    Button ButMoySave;
    ArrayList<Float> addArray = new ArrayList<Float>();
    EditText Nombre;
    ListView show;
    TextView DescriptionTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moyenne);

        setTitle("Calcul de moyenne");
        DescriptionTxt = (TextView) findViewById(R.id.textViewMoy);
        Nombre = (EditText) findViewById(R.id.EditMoy);
        show = (ListView) findViewById(R.id.ListViewMoy);
        ButMoySave = (Button) findViewById(R.id.ButSaveMoy);
        ButMoySave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getTxt = Nombre.getText().toString();
                float getNombre = Float.valueOf(Nombre.getText().toString());



                //addArray.add(getNombre);
                addArray.add(0,getNombre);
                ArrayAdapter<Float> adapter = new ArrayAdapter<Float>(Moyenne.this, android.R.layout.simple_list_item_1, addArray);
                show.setAdapter(adapter);
                ((EditText) findViewById(R.id.EditMoy)).setText(" ");

            }

        });
       /* Nombre.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean Focus) {
                if (Focus) {
                    DescriptionTxt.setVisibility(View.GONE);
                } else {
                    DescriptionTxt.setVisibility(View.VISIBLE);
                }

            }
        });
        */

    }
}
