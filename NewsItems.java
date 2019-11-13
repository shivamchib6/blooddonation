package com.example.nisha.blooddonation;

public class NewsItems {
    private int mresource;
    private String text1;
    private String text2;

    public int getMresource() {
        return this.mresource;
    }

    public String getText1() {
        return this.text1;
    }

    public String getText2() {
        return this.text2;
    }

    public NewsItems(int mresource, String text1, String text2) {
        this.mresource = mresource;
        this.text1 = text1;
        this.text2 = text2;
    }
}
