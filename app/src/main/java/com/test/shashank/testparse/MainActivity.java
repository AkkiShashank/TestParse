package com.test.shashank.testparse;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.parse.ParseAnalytics;
import com.parse.ParseInstallation;
import com.parse.PushService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView test=(TextView)findViewById(R.id.test);
        TextView test2=(TextView)findViewById(R.id.test2);
        SimpleDateFormat dfDate_day= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dt="";
        Calendar c = Calendar.getInstance();
        String data=dfDate_day.format(c.getTime());
        String text1="";
        try {
            Date postDate = dfDate_day.parse(data);
            Date d=new Date(01/01/1988);
            long dat=d.getDate();
            text1=Long.toString(dat);
            String date = (String) android.text.format.DateFormat.format("yyyy",d );
            test.setText(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date postDate = null;
        try {
            postDate = sdf.parse("2015-12-06 17:39:53");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long year=postDate.getYear();
        long month=postDate.getMonth();
        long day=postDate.getDay();
        long now = getCurrentTime();
        long cday = getCurrentDay();
        long cmonth = getCurrentMonth();
        long cyear = getCurrentYear();
        String s=Long.toString(now)+Long.toString(cmonth)+Long.toString(cyear);
        test.setText(text1);
        test2.setText(data);
    }

    public static long getCurrentTime()
    {
        Date now = new Date();
        return TimeUnit.MILLISECONDS.toMillis(now.getDate());
    }
    public static long getCurrentDay()
    {
        Date now = new Date();
        return TimeUnit.MILLISECONDS.toMillis(now.getDay());
    }
    public static long getCurrentMonth()
    {
        Date now = new Date();
        return TimeUnit.MILLISECONDS.toMillis(now.getMonth());
    }
    public static long getCurrentYear()
    {
        Date now = new Date();
        return TimeUnit.MILLISECONDS.toMillis(now.getYear());
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
