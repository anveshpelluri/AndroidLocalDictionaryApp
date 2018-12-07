package com.example.nagaa.dictionary;

import android.os.Parcel;
import android.os.Parcelable;

public class WordsList implements Parcelable {
    String word="";
    String definition="";
    String example1="";
    @Override
    public void writeToParcel(Parcel parcel, int i) {

      parcel.writeString(word);
      parcel.writeString(definition);
      parcel.writeString(example1);
    }
private WordsList(Parcel in)
{
    word=in.readString();
    definition=in.readString();
    example1=in.readString();
}
    @Override
    public int describeContents() {
        return 0;
    }
    public static final Parcelable.Creator<WordsList> CREATOR = new Parcelable.Creator<WordsList>() {
        public WordsList createFromParcel(Parcel in) {
            return new WordsList(in);
        }

        public WordsList[] newArray(int size) {
            return new WordsList[size];

        }
    };
    public WordsList(String word, String definition, String example1)
     {
        this.word=word;
        this.definition=definition;
        this.example1=example1;
     }
    public String getWord() {
        return word;
    }

    public String getDefinition() {
        return definition;
    }

    public String getExample() {
        return example1;
    }
}
