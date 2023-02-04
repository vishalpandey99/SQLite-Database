package com.example.sqlitedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        MyDBHelper dbHelper = new MyDBHelper(this);
        dbHelper.addContact("vishal","9519280154");
       dbHelper.addContact("ankit","8858484220");
        dbHelper.addContact("dhanush","85214792");
        dbHelper.addContact("upashak","85224112336");

        ContactModel model = new ContactModel();
        model.id = 1;
        model.name = "Raman";
        model.phone_no = "8522114496";

        dbHelper.updateContact(model);
        dbHelper.deletaContact(2);

         ArrayList<ContactModel> arrayList = dbHelper.fetchContact();





    }
}