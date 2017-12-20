package com.example.android.englishfinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.lang.String;
import java.util.ArrayList;

public class Fifthunit extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.word_list);

        // Create a list of words

        final ArrayList<Word> Fifth = new ArrayList<Word> ();
        

        Fifth.add ( new Word ( "as", "while", "بينما" ) );
        Fifth.add ( new Word ( "avalanche", "collapse of mass of snow", "انهيار ثلجي" ) );
        Fifth.add ( new Word ( "control", "take lead of something", "يتحكم" ) );
        Fifth.add ( new Word ( "hill", "small mountain", "تل" ) );
        Fifth.add ( new Word ( "melt", "become liquid", "انصهار" ) );
        Fifth.add ( new Word ( "mm", "ملم متر" ) );
        Fifth.add ( new Word ( "mudslide", "collapse in soil", "انهيار طيني" ) );
        Fifth.add ( new Word ( "spread", "extent to other areas", "انتشار" ) );
        Fifth.add ( new Word ( "steep", "انحدار" ) );
        Fifth.add ( new Word ( "temperature", "how cold or hot the weather is ", "درجة حرارة" ) );
        Fifth.add ( new Word ( "tornado", "storm", "اعصار" ) );
        Fifth.add ( new Word ( "violent", "strong", "عنيف" ) );
        Fifth.add ( new Word ( "accurate", "precise", "دقيق" ) );
        Fifth.add ( new Word ( "approach","come closer" , "يقترب" ) );
        Fifth.add ( new Word ( "breathe", "in hale", "نفس" ) );
        Fifth.add ( new Word ( "combine", "join , mix", "ضم" ) );
        Fifth.add ( new Word ( "escape", "run away", "هرب" ) );
        Fifth.add ( new Word ( "force", "power", "قوة" ) );
        Fifth.add ( new Word ( "heat", "noun of hot", "حرارة" ) );
        Fifth.add ( new Word ( "hit", "strike", "ضرب" ) );
        Fifth.add ( new Word ( "moreover", "besides", "علاوة على ذلك" ) );
        Fifth.add ( new Word ( "poor", "not rich", "فقير" ) );
        Fifth.add ( new Word ( "proper", "appropriate", "لائق" ) );
        Fifth.add ( new Word ( "result", "effect", "نتيجة" ) );
        Fifth.add ( new Word ( "storm surge", "", "اندفاع العاصفة" ) );


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter ( this, Fifth, R.color.FifthUnit );

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById ( R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter ( adapter );
    }
}