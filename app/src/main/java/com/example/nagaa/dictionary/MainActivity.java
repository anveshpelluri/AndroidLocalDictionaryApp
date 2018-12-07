package com.example.nagaa.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  ArrayList<WordsList> words=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listview);
        WordsList word1=new WordsList("Technophobe","A person who fears, dislikes, or avoids new technology.","Libraries across Swindon are offering free computer sessions for technophobes.");
        WordsList word2=new WordsList("Collogue","talk confidentially or conspiratorially.","They wagged their old heads sadly when they collogued in clubs.");
        WordsList word3=new WordsList("Coz","an archaic word and form of address for cousin","goodbye, fair coz.");
        WordsList word4=new WordsList("Damsel","a young unmarried woman.","She makes a rather sweet damsel in distress.");
        WordsList word5=new WordsList("Assay","attempt","I assayed a little joke of mine on him.");
        WordsList word6=new WordsList("Bijoux","a jewel or trinket."," a bijou apartment.");
        words.add(word1);
        words.add(word2);
        words.add(word3);
        words.add(word4);
        words.add(word5);
        words.add(word6);
        final ListAdapter adapter= new ListAdapter(MainActivity.this, R.layout.abstrction_of_list,words);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent= new Intent(MainActivity.this,DefinitionActivity.class);
                intent.putParcelableArrayListExtra("ArrayList",words);
                intent.putExtra("position",i);
                startActivity(intent);
            }
        });
    }
}
