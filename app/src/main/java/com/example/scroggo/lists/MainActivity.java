package com.example.scroggo.lists;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.list);
        mListView.setAdapter(new MyAdapter());
    }

    private class MyAdapter extends BaseAdapter {
        List<String> mPeople = new ArrayList<>();

        public MyAdapter() {
            for (String name : new String[] {
                    "Amadeus",
                    "Chris",
                    "Anna",
                    "Andrew",
                    "David",
                    "Chris",
                    "Gavin",
                    "Jake",
                    "Jacob",
                    "Jules",
                    "Madison",
                    "Leon",
                    "Jeff",
                    "Ethan",
                    "Alana",
                    "JC",
            }) {
                mPeople.add(name);
            }
        }

        @Override
        public int getCount() {
            return mPeople.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(android.R.layout.activity_list_item,
                        parent, false);
            }
            TextView textView = convertView.findViewById(android.R.id.text1);
            textView.setText(mPeople.get(i));
            textView.setTextSize(30);
            return convertView;
        }
    }
}
