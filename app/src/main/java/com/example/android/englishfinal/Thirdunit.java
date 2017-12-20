package com.example.android.englishfinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Thirdunit extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> ThirdUnitMeans = new ArrayList<Word>();
        ThirdUnitMeans.add(new Word("against", "Versus (VS)", "ضد"));
        ThirdUnitMeans.add(new Word("arrange", "decorate", "يرتب"));
        ThirdUnitMeans.add(new Word("at least", "minimum", "على الاقل"));
        ThirdUnitMeans.add(new Word("exam", "test", "اختبار"));
        ThirdUnitMeans.add(new Word("forest", "large Woods", "غابة"));
        ThirdUnitMeans.add(new Word("island", "a land surrounded by water", "جزيرة"));
        ThirdUnitMeans.add(new Word("Leisure (time)", "spare time", "وقت اضافي"));
        ThirdUnitMeans.add(new Word("might", "may", "احتمال"));
        ThirdUnitMeans.add(new Word("pretty", "nice", "جميل"));
        ThirdUnitMeans.add(new Word("quad bikes", "Bikes with 4 Wheels ", "دراجات رباعية"));
        ThirdUnitMeans.add(new Word("Rugby", "American Football", "لعبة الكرة الامريكية"));
        ThirdUnitMeans.add(new Word("Senior", "Above 15 Year Age", "اكبر من 15 سنة"));
        ThirdUnitMeans.add(new Word("View", "", "منظر"));
        ThirdUnitMeans.add(new Word("afford ", "manage to pay for", "يستطيع الدفع على"));
        ThirdUnitMeans.add(new Word("business", "job", "عمل"));
        ThirdUnitMeans.add(new Word("castle", "", "قلعة"));
        ThirdUnitMeans.add(new Word("Decorate", "to make the view of something beautiful", "الترتيب بطريقة جميلة"));
        ThirdUnitMeans.add(new Word("Frame", "shape", "اطار شيء"));
        ThirdUnitMeans.add(new Word("for free", "with no money", "مجانا"));
        ThirdUnitMeans.add(new Word("on my own", "alone", "لوحده"));
        ThirdUnitMeans.add(new Word("Recycle", "to make sth again and use it", "اعادة التدوير"));
        ThirdUnitMeans.add(new Word("similar", "like", "يشبه"));
        ThirdUnitMeans.add(new Word("Supply", "provide", "يزود"));
        ThirdUnitMeans.add(new Word("think of ", "consider", "يفكر في"));
        ThirdUnitMeans.add(new Word("turn into", "change", "يتجه الى او يغير المسار الى"));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, ThirdUnitMeans, R.color.ThirdUnit);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}