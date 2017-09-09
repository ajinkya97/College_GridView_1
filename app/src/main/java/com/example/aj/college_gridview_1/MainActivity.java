package com.example.aj.college_gridview_1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] country={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    GridView gv;
    RelativeLayout rlv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rlv=(RelativeLayout)findViewById(R.id.back);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,country);

        gv=(GridView)findViewById(R.id.gridview);
        gv.setAdapter(adapter);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String message=country[position];
                Toast.makeText(MainActivity.this,message, Toast.LENGTH_SHORT).show();
                if(message=="A")
                {
                    rlv.setBackgroundColor(Color.parseColor("#F44336"));
                }
                else if(message=="B")
                {
                    rlv.setBackgroundColor(Color.parseColor("#E91E63"));
                }
                else if(message=="C")
                {
                    rlv.setBackgroundColor(Color.parseColor("#9C27B0"));
                }
                else if(message=="D")
                {
                    rlv.setBackgroundColor(Color.parseColor("#006064"));
                }
                else if(message=="E")
                {
                    rlv.setBackgroundColor(Color.parseColor("#00BCD4"));
                }
                else if(message=="F")
                {
                    rlv.setBackgroundColor(Color.parseColor("#009688"));
                }
                else if(message=="G")
                {
                    rlv.setBackgroundColor(Color.parseColor("#8BC34A"));
                }
                else if(message=="H")
                {
                    rlv.setBackgroundColor(Color.parseColor("#4CAF50"));
                }
                else if(message=="I")
                {
                    rlv.setBackgroundColor(Color.parseColor("#CDDC39"));
                }
                else if(message=="J")
                {
                    rlv.setBackgroundColor(Color.parseColor("#00C853"));
                }
                else if(message=="K")
                {
                    rlv.setBackgroundColor(Color.parseColor("#64DD17"));
                }
                else if(message=="L")
                {
                    rlv.setBackgroundColor(Color.parseColor("#AEEA00"));
                }
                else if(message=="M")
                {
                    rlv.setBackgroundColor(Color.parseColor("#FFB300"));
                }
                else if(message=="N")
                {
                    rlv.setBackgroundColor(Color.parseColor("#795548"));
                }
                else if(message=="O")
                {
                    rlv.setBackgroundColor(Color.parseColor("#9E9E9E"));
                }
                else if(message=="P")
                {
                    rlv.setBackgroundColor(Color.parseColor("#546E7A"));
                }
                else if(message=="Q")
                {
                    rlv.setBackgroundColor(Color.parseColor("#E91E63"));
                }
                else if(message=="R")
                {
                    rlv.setBackgroundColor(Color.parseColor("#9C27B0"));
                }
                else if(message=="S")
                {
                    rlv.setBackgroundColor(Color.parseColor("#00BCD4"));
                }
                else if(message=="T")
                {
                    rlv.setBackgroundColor(Color.parseColor("#AEEA00"));
                }
                else if(message=="U")
                {
                    rlv.setBackgroundColor(Color.parseColor("#64DD17"));
                }
                else if(message=="V")
                {
                    rlv.setBackgroundColor(Color.parseColor("#CDDC39"));
                }
                else if(message=="W")
                {
                    rlv.setBackgroundColor(Color.parseColor("#F44336"));
                }
                else if(message=="X")
                {
                    rlv.setBackgroundColor(Color.parseColor("#8BC34A"));
                }
                else if(message=="Y")
                {
                    rlv.setBackgroundColor(Color.parseColor("#006064"));
                }
                else if(message=="Z")
                {
                    rlv.setBackgroundColor(Color.parseColor("#8BC34A"));
                }
            }
        });
    }
}
