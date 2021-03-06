package com.example.kt_thanhdat;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView img1, img2, img3, img4, img5;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);

        img1.setOnClickListener(v ->{
            i=new Intent(MainActivity.this,MainActivity2.class);
            startActivity(i);

        });
        img2.setOnClickListener(v ->{
            i=new Intent(MainActivity.this,MainActivity3.class);
            startActivity(i);

        });
        img3.setOnClickListener(v ->{
            i=new Intent(MainActivity.this,ListviewActivity.class);
           startActivity(i);

       });
      //  img4.setOnClickListener(v ->{
        //    i=new Intent(MainActivity.this,MainActivity5.class);
        //    startActivity(i);

      //  });
       // img5.setOnClickListener(v ->{
        //    i=new Intent(MainActivity.this,MainActivity6.class);
         //   startActivity(i);

       // });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.menu1:
                i=new Intent(MainActivity.this, info1.class);
                startActivity(i);

                //code x??? l?? khi b???m menu1
                break;
            case R.id.menu2:
                makeText(this, "B???n b???m v??o menu 2", LENGTH_SHORT).show();
                //code x??? l?? khi b???m menu2
                break;
            case R.id.menu3:
                //code x??? l?? khi b???m menu3
                i = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(i);
                break;
            case R.id.menu4:
                makeText(this, "B???n b???m v??o menu 2", LENGTH_SHORT).show();
                //code x??? l?? khi b???m menu2
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void xuLyThoat(View view){
        //T???o ?????i t?????ng
        AlertDialog.Builder b = new AlertDialog.Builder(this);
//Thi???t l???p ti??u ?????
        b.setTitle("X??c nh???n");
        b.setMessage("B???n c?? ?????ng ?? tho??t ch????ng tr??nh kh??ng?");
// N??t Ok
        b.setPositiveButton("?????ng ??", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });
//N??t Cancel
        b.setNegativeButton("Kh??ng ?????ng ??", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
//T???o dialog
        AlertDialog al = b.create();
//Hi???n th???
        al.show();

    }


}
