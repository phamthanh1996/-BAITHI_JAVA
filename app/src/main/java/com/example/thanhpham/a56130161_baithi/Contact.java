package com.example.thanhpham.a56130161_baithi;

/**
 * Created by Thanh Pham on 2017-06-13.
 */

public class Contact {
    private boolean isMale;
    private String mName;
    private String mNumber;

    public Contact(boolean isMale, String mName, String mNumber) {
        this.isMale = isMale;
        this.mName = mName;
        this.mNumber = mNumber;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
