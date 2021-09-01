package com.example.lab21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;
    private List<ContactModel> listContact = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        lvContact = (ListView) findViewById(R.id.lvContact);
        ContactAdapter adapter = new ContactAdapter(listContact,this);
        lvContact.setAdapter(adapter);

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                ContactModel contactModel = listContact.get(position);
                Toast.makeText(MainActivity.this, contactModel.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initData(){
        ContactModel contact = new ContactModel("Nguyen van A ","012312312321312",R.drawable.ic_avatar1);
        listContact.add(contact);
        contact = new ContactModel("Nguyen van B "," 0123124123142",R.drawable.ic_avatar2);
        listContact.add(contact);
        contact = new ContactModel("Nguyen van C "," 0123124123142",R.drawable.ic_avatar2);
        listContact.add(contact);
        contact = new ContactModel("Nguyen van D "," 0123124123142",R.drawable.ic_avatar1);
        listContact.add(contact);
        contact = new ContactModel("Nguyen van E "," 0123124123142",R.drawable.ic_avatar4);
        listContact.add(contact);
        contact = new ContactModel("Nguyen van F "," 0123124123142",R.drawable.ic_avatar1);
        listContact.add(contact);
        contact = new ContactModel("Nguyen van G "," 0123124123142",R.drawable.ic_avatar4);
        listContact.add(contact);
        contact = new ContactModel("Nguyen van H "," 0123124123142",R.drawable.ic_avatar3);
        listContact.add(contact);
    }
}
