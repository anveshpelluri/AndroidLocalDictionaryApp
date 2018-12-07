package com.example.nagaa.dictionary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends ArrayAdapter<WordsList> {
    private Context context;
    TextView wordsTV;


    public ListAdapter(Context context, int resource, List<WordsList> words) {
        super(context, 0, words);
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.abstrction_of_list, parent, false);
        }
         wordsTV=view.findViewById(R.id.word);
        final WordsList wordsobj=getItem(position);
        wordsTV.setText(wordsobj.word);
        return view;
    }
}
