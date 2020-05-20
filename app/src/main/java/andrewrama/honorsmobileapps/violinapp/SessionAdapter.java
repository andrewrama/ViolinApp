package andrewrama.honorsmobileapps.violinapp;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SessionAdapter extends RecyclerView.Adapter<SessionViewHolder> {

    private ArrayList<Session> mSessions;

    public SessionAdapter(ArrayList<Session> sessions){
        mSessions = sessions;
    }
    @Override
    public SessionViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View rootView = layoutInflater.inflate(R.layout.listitem_layout, parent, false);
        SessionViewHolder newViewHolder = new SessionViewHolder(rootView);
        return newViewHolder;
    }

    @Override
    public void onBindViewHolder(SessionViewHolder currentViewHolder, int position){
        Session currentSession = mSessions.get(position);
        currentViewHolder.bindSession(currentSession);
    }

    @Override
    public int getItemCount(){
        return mSessions.size();
    }
}
