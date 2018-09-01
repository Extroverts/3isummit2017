package com.isummit.om.sample;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Developers extends AppCompatActivity {


        GridView grid;
        private List<String> web = new ArrayList<>();
    final Context context = this;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_developers);

            Toolbar mToolbar =  findViewById(R.id.toolbar);
            mToolbar.setTitle("3I Summits");
            mToolbar.setNavigationIcon(R.drawable.ic_action_back);
            mToolbar.setNavigationOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {


                    finish();
                }
            });
            web.add("Jagannath");
            web.add("Sandeep");
            web.add("Onkar");
            web.add("Vishakha");
            web.add("Saurabh");




            CustomGrid adapter =new CustomGrid(Developers.this,web);
            grid=(GridView)findViewById(R.id.grid);
            grid.setAdapter(adapter);
            grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    switch (position)
                    {
                        case 0:
                        {

                            final Dialog dialog = new Dialog(context);
                            dialog.setContentView(R.layout.developers);
                            dialog.show();
                            break;
                        }




                        case 1:
                        {



                        break;


                        }
                        default:
                        {
                            return;
                        }

                    }
                }

            });
        }

}

