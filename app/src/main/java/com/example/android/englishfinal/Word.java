package com.example.android.englishfinal;

public class Word {
    private String mWord , mEnglishMean , mArabic;



    public Word(String Word, String EnglishtoenTranslateion , String Arabic){
        mArabic=Arabic;
        mEnglishMean=EnglishtoenTranslateion;
        mWord = Word;

    }
    public Word(String Word , String Arabic){
        mArabic=Arabic;
        mWord = Word;

    }


    public String getmWord(){
        return mWord;
    }
    public String getmArabic(){
        return mArabic;
    }
    public String getmEnglishMean(){
        return mEnglishMean;
    }
}
