package com.example.dialogfragment;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.util.Log;
import android.widget.Toast;

import androidx.fragment.app.FragmentManager;

public class Loader extends AsyncTask<Void,Void,Void> {

    private Context mctx;
    private  Dialog dialog;
    FragmentManager fm;

    public Loader(Context mctx,FragmentManager fm) {
        this.mctx = mctx;
        this.dialog=new Dialog();
        this.fm=fm;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.e("Loader","Line 20");
        Toast.makeText(mctx,"On Pre Execute",Toast.LENGTH_SHORT).show();
        dialog.show(fm,null);
    }

    @Override
    protected Void doInBackground(Void... voids) {
        Log.e("Loader","Line 26");
        SystemClock.sleep(7000);
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Log.e("Loader","Line 34");
        Toast.makeText(mctx,"On Pre Execute",Toast.LENGTH_SHORT).show();
        dialog.dismiss();
    }
}
