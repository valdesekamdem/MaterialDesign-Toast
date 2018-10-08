package com.valdesekamdem.library.mdtoastsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.valdesekamdem.library.mdtoast.MDToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showInfoToast(View view) {
        MDToast mdToast = MDToast.makeText(this, "This is an INFO Toast");
        mdToast.show();
    }

    public void showSuccessToast(View view) {
        MDToast.makeText(this, "This is a SUCCESS Toast", MDToast.LENGTH_SHORT, MDToast.TYPE_SUCCESS).show();
    }

    public void showWarningToast(View view) {
        MDToast.makeText(this, "This is a WARNING Toast", MDToast.LENGTH_SHORT, MDToast.TYPE_WARNING).show();
    }

    public void showErrorToast(View view) {
        MDToast.makeText(this, "This is an ERROR Toast", MDToast.LENGTH_SHORT, MDToast.TYPE_ERROR).show();
    }
    
    
      //Snackbar is a new Material Design Toast
    
    public void snackbar(View view)
    {
        Snackbar.make(view,"hello world!!",Snackbar.LENGTH_LONG)
            .setAction("close it",new View.onClickListener()
                         {
                             public void onClick(View v)
                                 {
                                    //go to new Activity
                                  }
                         }
                       
        } 
}
