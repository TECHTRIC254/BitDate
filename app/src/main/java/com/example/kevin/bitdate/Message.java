package com.example.kevin.bitdate;

import java.util.Date;

/**
 * Created by kevin on 6/2/15.
 */
public class Message {

    private String mText;
    private String mSender;
    private Date mDate;

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getSender() {
        return mSender;
    }

    public void setSender(String sender) {
        mSender = sender;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }
}
