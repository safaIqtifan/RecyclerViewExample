package com.example.recyclerview.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class NewsModel implements Parcelable {

    int id;
    String title;
    String category;
    int imag;

    public NewsModel(int id, String title, String category, int imag) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.imag = imag;
    }

    protected NewsModel(Parcel in) {
        id = in.readInt();
        title = in.readString();
        category = in.readString();
        imag = in.readInt();
    }

    public static final Creator<NewsModel> CREATOR = new Creator<NewsModel>() {
        @Override
        public NewsModel createFromParcel(Parcel in) {
            return new NewsModel(in);
        }

        @Override
        public NewsModel[] newArray(int size) {
            return new NewsModel[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getImag() {
        return imag;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "NewsModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", imag=" + imag +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(title);
        dest.writeString(category);
        dest.writeInt(imag);
    }
}
