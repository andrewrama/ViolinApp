package andrewrama.honorsmobileapps.violinapp;

public class Session {

    private String mSessionTitle;
    private String mSessionDescription;

    public Session(String sessionTitle, String sessionDescription){
        mSessionTitle = sessionTitle;
        mSessionDescription = sessionDescription;
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

}
