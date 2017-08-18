package com.rateon.group.rateon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.twotoasters.jazzylistview.JazzyGridView;
import com.twotoasters.jazzylistview.effects.CardsEffect;

public class GenreActivity extends AppCompatActivity {
    String[] genreArray = {"Android","IPhone","WindowsMobile","Blackberry","WebOS","Ubuntu","Windows7","Max OS X","Android","IPhone","WindowsMobile","Blackberry","WebOS","Ubuntu","Windows7","Max OS X","Android","IPhone","WindowsMobile","Blackberry","WebOS","Ubuntu","Windows7","Max OS X","Android","IPhone","WindowsMobile","Blackberry","WebOS","Ubuntu","Windows7","Max OS X"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.genre_list_item,genreArray);
        JazzyGridView list = (JazzyGridView) findViewById(R.id.list);
        list.setTransitionEffect(new CardsEffect());
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String toastText = genreArray[i];
                Toast.makeText(GenreActivity.this, toastText , Toast.LENGTH_SHORT).show();
                Intent movieListIntent = new Intent(view.getContext(),MovieListActivity.class);
                startActivity(movieListIntent);
            }
        });
    }
}
