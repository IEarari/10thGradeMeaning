package com.example.android.englishfinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Sixthunit extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> Sixth = new ArrayList<Word> ();
        Sixth.add ( new Word ( "abroad  ", "outside the country", "خارج البلاد" ) );
        Sixth.add ( new Word ( "dream ", "wish", "حلم" ) );
        Sixth.add ( new Word ( "give up ", "stop trying", "يتوقف عن" ) );
        Sixth.add ( new Word ( "graduate", "finish 'school or University' ", "يتخرج" ) );
        Sixth.add ( new Word ( "laboratory ", "place where scientists do experiments ", "مختبر" ) );
        Sixth.add ( new Word ( "law ", "rule", "قانون" ) );
        Sixth.add ( new Word ( "radiation ",  "اشعاع" ) );
        Sixth.add ( new Word ( "treat ", "to cure someone", "يعالج" ) );
        Sixth.add ( new Word ( "university ", "place when you can get a degree", "جامعة" ) );
        Sixth.add ( new Word ( "war ", "fight between countries", "حرب" ) );
        Sixth.add ( new Word ( "X-ray", "اشعة سينية" ) );
        Sixth.add ( new Word ( "along with ", "together with", "معا" ) );
        Sixth.add ( new Word ( "(house) arrest ", "Home residence ", "اقامة جبرية" ) );
        Sixth.add ( new Word ( "attack", "fight", "يقاتل" ) );
        Sixth.add ( new Word ( "cultivate  ", "prepare land for farming", "يحرث" ) );
        Sixth.add ( new Word ( "delighted ", "happy", "سعيد" ) );
        Sixth.add ( new Word ( "editor ", "person who is responsible for a newspaper ", "محرر" ) );
        Sixth.add ( new Word ( "except for", "without", "بدون" ) );
        Sixth.add ( new Word ( "exile ", "a place which is far from home because of power", "منفى" ) );
        Sixth.add ( new Word ( "orchard", "", "بستان" ) );
        Sixth.add ( new Word ( "permit ", "", "اذن سفر" ) );
        Sixth.add ( new Word ( "publish ", "", "ينشر" ) );
        Sixth.add ( new Word ( "refugee ", "a person who was forced to leave his homeland", "لاجئ" ) );
        Sixth.add ( new Word ( "steal ", "rob", "يسرق" ) );
        Sixth.add ( new Word ( "tragic(ally)", "catastrophic", "مأساوي" ) );

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter ( this, Sixth, R.color.SixthUnit);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById ( R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter ( adapter );
    }
}