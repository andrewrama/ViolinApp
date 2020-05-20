package andrewrama.honorsmobileapps.violinapp;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class SessionViewHolder extends RecyclerView.ViewHolder {

    private TextView mSessionTitle;
    private TextView mSessionDescription;
    private Session mSession;

    public SessionViewHolder(View rootView){
        super(rootView);
        mSessionTitle = rootView.findViewById(R.id.sessionTitle);
        mSessionDescription = rootView.findViewById(R.id.sessionDescription);
    }

    public void bindSession(Session session){
        mSession = session;
        mSessionTitle.setText(mSession.getSessionTitle());
        mSessionDescription.setText(mSession.getSessionDescription());
    }
}
