package com.gregchu.f4.app;

/**
 * Created by GRCHU01 on 6/10/2014.
 */


import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class AnotherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Intent intent=getIntent();
        Log.d("VIVZ", " Inside another activity ");
        int index=intent.getIntExtra("index",0);
        FragmentB f2= (FragmentB) getFragmentManager().findFragmentById(R.id.fragment2);
        Log.d("VIVZ", "  "+(f2==null));
        if(f2!=null)
        {
            f2.changeData(index);
        }
    }


}
