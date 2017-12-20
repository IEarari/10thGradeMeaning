package com.example.android.englishfinal;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {
    private int mColor;

    public WordAdapter(Context context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        mColor = color;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView wordTextView = (TextView) listItemView.findViewById(R.id.word);

        wordTextView.setText(currentWord.getmWord());

        TextView entoenTextView = (TextView) listItemView.findViewById(R.id.entoen);

        entoenTextView.setText(currentWord.getmEnglishMean());
        TextView arabicTextView = (TextView) listItemView.findViewById(R.id.arabic);

        arabicTextView.setText(currentWord.getmArabic());

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColor);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }


}