package com.example.jonathangrant.teleconferencealert;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.app.NotificationManager;
import android.content.Context;
import android.app.Notification;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        NotificationManager NM = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);

        String title = "Conference Call In 5";
        String subject = "Call now?";
        String body="Call NAO!";
        Notification notify=new Notification(android.R.drawable.stat_notify_more,title,System.currentTimeMillis());

        PendingIntent pending=PendingIntent.getActivity(getApplicationContext(), 0, new Intent(),0);

        notify.setLatestEventInfo(getApplicationContext(), subject, body,pending);

        NM.notify(0, notify);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
