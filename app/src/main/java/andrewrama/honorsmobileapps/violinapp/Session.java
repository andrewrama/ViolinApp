package andrewrama.honorsmobileapps.violinapp;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

public class Session implements Serializable {

    private String mSessionTitle;
    private String mSessionDescription;
    public static String TYPE = "session";
    public static ArrayList<Session> sessionList;

    public Session(String title, String description){
        mSessionTitle = title;
        mSessionDescription = description;
    }


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
