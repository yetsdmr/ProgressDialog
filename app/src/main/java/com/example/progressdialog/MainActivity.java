package com.example.progressdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialogVer();
    }
    private void dialogVer(){
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Mesajlar bölünü");
        progressDialog.setMessage("Mesajlar listeleniyor, lütfen bekleyiniz");
        progressDialog.setCancelable(false);
        progressDialog.show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(20000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}