package andrewrama.honorsmobileapps.violinapp;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Session implements Parcelable {

    private String mSessionTitle;
    private String mSessionDescription;
    public static String TYPE = "session";
    public static ArrayList<Session> sessionList;

    public Session(String title, String description){
        mSessionTitle = title;
        mSessionDescription = description;
    }
    public Session(Parcel in){
        mSessionTitle = in.readString();
        mSessionDescription = in.readString();
    }

    @Override
    public int describeContents(){
        return 0;
    }

    public void writeToParcel(Parcel out, int i){
        out.writeString(mSessionTitle);
        out.writeString(mSessionDescription);
    }

    public static final Parcelable.Creator<Session> CREATOR = new Parcelable.Creator<Session>(){
       public Session createFromParcel(Parcel in){
           return new Session(in);
       }
       public Session[] newArray(int size){
           return new Session[size];
       }
    };

    public String getSessionTitle(){
        return mSessionTitle;
    }

    public void setSessionTitle(String sessionTitle){
        mSessionTitle = sessionTitle;
    }

    public String getSessionDescription(){
        return mSessionDescription;
    }

    public void setSessionDescription(String sessionDescription){
        mSessionDescription = sessionDescription;
    }

    public static void setSessionList(ArrayList<Session> list){
        sessionList = list;
    }

    public static ArrayList<Session> getSessionList(){
        return sessionList;
    }

}
