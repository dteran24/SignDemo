package com.example.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private EditText editName;
    private RadioGroup radioGroup;
    private Spinner spinner;


    static String NAME = "key1";
    static String GENDER = "key2";
    static String FOOD = "key3";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = (EditText) findViewById(R.id.eTName);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner1, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    public void HandleSubmit(View view) {
        Intent intent = new Intent(this, DisplayResults.class);

        String name = editName.getText().toString();
        String selectedRadioValue = ((RadioButton)findViewById(radioGroup.getCheckedRadioButtonId() )).getText().toString();
        String selectedSpinnerValue = spinner.getSelectedItem().toString();

        intent.putExtra(NAME, name);
        intent.putExtra(GENDER, selectedRadioValue);
        intent.putExtra(FOOD, selectedSpinnerValue);

        startActivity(intent);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {



    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}