package com.example.repetition;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.repetition.CustomAdapter;
import com.example.repetition.R;
import com.example.repetition.Rep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends Activity {

    private ListView listView;
    private List<Rep> objectsList;
    private CustomAdapter customAdapter;
    private EditText input1, input2;
    private Button swapButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        swapButton = findViewById(R.id.swapButton);

        objectsList = new ArrayList<>();
        // Populate objectsList with Rep objects...
        Rep rep1 = new Rep(1, 1.5, "Value A");
        Rep rep2 = new Rep(2, 2.7, "Value B");
        Rep rep3 = new Rep(3, 3.2, "Value C");
        Rep rep4 = new Rep(4, 4.9, "Value D");
        Rep rep5 = new Rep(5, 5.3, "Value E");
        objectsList.add(rep1);
        objectsList.add(rep2);
        objectsList.add(rep3);
        objectsList.add(rep4);
        objectsList.add(rep5);

        customAdapter = new CustomAdapter(this, objectsList);
        listView.setAdapter(customAdapter);

        swapButton.setOnClickListener(v -> {
            int index1 = Integer.parseInt(input1.getText().toString()) - 1;
            int index2 = Integer.parseInt(input2.getText().toString()) - 1;

            if (index1 < 0 || index1 >= objectsList.size() || index2 < 0 || index2 >= objectsList.size()) {
                Toast.makeText(MainActivity.this, "Invalid input indices", Toast.LENGTH_SHORT).show();
                return;
            }

            Collections.swap(objectsList, index1, index2);
            customAdapter.notifyDataSetChanged();
        });
    }
}
