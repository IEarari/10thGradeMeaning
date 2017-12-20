package com.example.android.englishfinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;


import java.util.ArrayList;

public class Secondunit extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> SecondUnitMeans = new ArrayList<Word> ();
        SecondUnitMeans.add ( new Word ( "about to ", "Almost", "على وشك" ) );
        SecondUnitMeans.add ( new Word ( "at last ", "Finally", "اخيرا" ) );
        SecondUnitMeans.add ( new Word ( "clue ", "hint", "دليل" ) );
        SecondUnitMeans.add ( new Word ( "get to ", "reach", "يصل الى" ) );
        SecondUnitMeans.add ( new Word ( "or  ", "(if not) ", "اذا لم" ) );
        SecondUnitMeans.add ( new Word ( "prize ", "reward", "جائزة" ) );
        SecondUnitMeans.add ( new Word ( "riddle ", "mystery , puzzle", "احجية" ) );
        SecondUnitMeans.add ( new Word ( "scout ", "Group Of people who do several activities together", "كشافة" ) );
        SecondUnitMeans.add ( new Word ( "set off ", "Start", "يبدأ" ) );
        SecondUnitMeans.add ( new Word ( "so far ", "up to now", "حتى الان" ) );
        SecondUnitMeans.add ( new Word ( "track  ", "path , way", "ممر" ) );
        SecondUnitMeans.add ( new Word ( "treasure hunt ", "searching the treasure", "عملية البحث عن الكنز" ) );
        SecondUnitMeans.add ( new Word ( "exact(ly)", "correctly", "بالضبط" ) );
        SecondUnitMeans.add ( new Word ( "GPS ", "(Global Positioning System)", "نظام تحديد المواقع" ) );
        SecondUnitMeans.add ( new Word ( "kph  ", "(kilometres per hour)", "كم/ساعة" ) );
        SecondUnitMeans.add ( new Word ( "life raft ", "a small boat ", "قارب نجاة" ) );
        SecondUnitMeans.add ( new Word ( "measure ", "calculate", "يقيس , يحسب" ) );
        SecondUnitMeans.add ( new Word ( "orbit", "go round", "يدور" ) );
        SecondUnitMeans.add ( new Word ( "point ", "small area", "نقطة" ) );
        SecondUnitMeans.add ( new Word ( "position   ", "Place", "موقع" ) );
        SecondUnitMeans.add ( new Word ( "row (v)  ", "to move paddle in water", "يجدف" ) );
        SecondUnitMeans.add ( new Word ( "satnav ", "(satellite navigation system)", "نظام الملاحة" ) );
        SecondUnitMeans.add ( new Word ( "storm", "strong wind", "عاصفة" ) );
        SecondUnitMeans.add ( new Word ( "wave", "", "موجة" ) );

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter ( this, SecondUnitMeans, R.color.SecondUnit );

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById ( R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter ( adapter );
    }
}