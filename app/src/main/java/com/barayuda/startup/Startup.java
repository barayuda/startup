package com.barayuda.startup;

import android.os.Parcel;
import android.os.Parcelable;

public class Startup implements Parcelable {
    private String name, remarks, photo, deskripsi, berdiri, ceo;

    protected Startup(Parcel in) {
        name = in.readString();
        remarks = in.readString();
        photo = in.readString();
        deskripsi = in.readString();
        berdiri = in.readString();
        ceo = in.readString();
    }

    public static final Parcelable.Creator<Startup> CREATOR = new Parcelable.Creator<Startup>() {
        @Override
        public Startup createFromParcel(Parcel in) {
            return new Startup(in);
        }

        @Override
        public Startup[] newArray(int size) {
            return new Startup[size];
        }
    };

    public Startup() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getBerdiri() {
        return berdiri;
    }

    public void setBerdiri(String berdiri) {
        this.berdiri = berdiri;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.remarks);
        parcel.writeString(this.photo);
        parcel.writeString(this.deskripsi);
        parcel.writeString(this.berdiri);
        parcel.writeString(this.ceo);
    }
}
