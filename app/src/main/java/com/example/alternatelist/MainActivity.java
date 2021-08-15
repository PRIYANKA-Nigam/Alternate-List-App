package com.example.alternatelist;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.li);
        String[] list=new String[]{
                "item1","item2","item3","item4","item5","item6","item7","item9","item10","item11","item12","item13","item14","item15",
                "item16","item17","item18","item19","item20","item21","item22","item23","item24","item25","item26","item27","item28","item28","item30"
        };
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
              View view=   super.getView(position, convertView, parent);
              if(position%2==1){
                  view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
              }
              else {
                  view.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
              }
              return view;
            }
        };
        listView.setAdapter(arrayAdapter);
    }
}