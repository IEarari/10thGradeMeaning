package com.example.android.englishfinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Firstunit extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> firstUnitMeans = new ArrayList<Word>();
        firstUnitMeans.add(new Word("apartment : ", " Flat : ", "شقة"));
        firstUnitMeans.add(new Word("attach : ", " Join : ", " ارفاق"));
        firstUnitMeans.add(new Word("Cancel : ", " Stop : ", "الغاء"));
        firstUnitMeans.add(new Word("Definite : ", "Certain : ", "مؤكد"));
        firstUnitMeans.add(new Word("attach: ", " Join sth : ", " ارفاق"));
        firstUnitMeans.add(new Word("Depart :", " Take Off : ", " يقلع"));
        firstUnitMeans.add(new Word("District ", " Area ", "   منطقة"));
        firstUnitMeans.add(new Word("Junior ", " Opposite of  Senior : under 15 ", " ناشئ"));
        firstUnitMeans.add(new Word("PostScript", "", " حاشية يتم وضعة بعد الرسالة تتضمن ملحوظة"));
        firstUnitMeans.add(new Word("Research ", " Study", " بحث"));
        firstUnitMeans.add(new Word("Reply :", " Answer :", " يجيب"));
        firstUnitMeans.add(new Word("Settle in :", " Live :", " يقطن"));
        firstUnitMeans.add(new Word("Show (someone) round :", "", " يري شخص المكان"));
        firstUnitMeans.add(new Word("Take (someone) out :", "", " يأخذ شخص في نزهة"));
        firstUnitMeans.add(new Word(" Appointment :", " Meeting :", " موعد"));
        firstUnitMeans.add(new Word("Canteen :", " Cafeteria :", " مقصف"));
        firstUnitMeans.add(new Word("Condition : ", "Case :", " حالة"));
        firstUnitMeans.add(new Word("Director : ", " Manager : ", " مدير"));
        firstUnitMeans.add(new Word("Experiment : ", " Try : ", " تجربة"));
        firstUnitMeans.add(new Word("Feed :", " To give food : ", " يغذي"));
        firstUnitMeans.add(new Word("Field :", "", " حقل"));
        firstUnitMeans.add(new Word("Interview : ", " Meeting someone face to face : ", "مقابلة"));
        firstUnitMeans.add(new Word("Predict : ", "Expect : ", " يتنبأ"));
        firstUnitMeans.add(new Word("Region : ", " Area : ", " منطقة"));
        firstUnitMeans.add(new Word("Warehouse : ", " Store : ", " مخزن"));
        firstUnitMeans.add(new Word("Office :", " A desk with computer :", " مكتب"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, firstUnitMeans, R.color.FirstUnit);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}