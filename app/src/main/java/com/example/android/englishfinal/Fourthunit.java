package com.example.android.englishfinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Fourthunit extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> FourthUnitMeans = new ArrayList<Word>();
        FourthUnitMeans.add(new Word("cost", " the payment of", "يكلف"));
        FourthUnitMeans.add(new Word("deal with", "Cope with or control", "يتعامل"));
        FourthUnitMeans.add(new Word("emergency ", "", "طوارئ"));
        FourthUnitMeans.add(new Word("exhausted", "Very tired", "تعبان"));
        FourthUnitMeans.add(new Word("faulty ", "broken", "خربان"));
        FourthUnitMeans.add(new Word("fire engine ", "", "سيارة اطفاء"));
        FourthUnitMeans.add(new Word("fire station ", "", "محطة اطفاء"));
        FourthUnitMeans.add(new Word("flame ", "Fire", "شعلة نار او السنة اللهب"));
        FourthUnitMeans.add(new Word("flexible ", "Easy to bend", "مرن"));
        FourthUnitMeans.add(new Word("paramedic ", "A person who gives the first aid", "مسعف"));
        FourthUnitMeans.add(new Word("partner ", "mate", "شريك"));
        FourthUnitMeans.add(new Word("service ", "", "خدمة"));
        FourthUnitMeans.add(new Word("smoke", "", "دخان"));
        FourthUnitMeans.add(new Word("alive", "not dead", "حي"));
        FourthUnitMeans.add(new Word("ambulance ", "a vehicle to transfer the ill people ", "اسعاف"));
        FourthUnitMeans.add(new Word("cheer", "clap and shout happily", "يصفق ويصرخ بفرح"));
        FourthUnitMeans.add(new Word("desperate", "helplessly", "بيأس"));
        FourthUnitMeans.add(new Word("examine", "test", "يفحص"));
        FourthUnitMeans.add(new Word("floor", "ground", "طابق"));
        FourthUnitMeans.add(new Word("ladder", "a tool used for climbing", "سلم"));
        FourthUnitMeans.add(new Word("lean", "bend down", "يخجل"));
        FourthUnitMeans.add(new Word("ledge", "edge , rim", "حافة"));
        FourthUnitMeans.add(new Word("nowhere", "no place", "لا مكان"));
        FourthUnitMeans.add(new Word("rush", "hurry , run", "يندفع"));
        FourthUnitMeans.add(new Word("shoot out", "move quickly", "ينطلق بسرعة"));
        FourthUnitMeans.add(new Word("smash", "destroy", "يدمر"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, FourthUnitMeans, R.color.FourthUnit);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}