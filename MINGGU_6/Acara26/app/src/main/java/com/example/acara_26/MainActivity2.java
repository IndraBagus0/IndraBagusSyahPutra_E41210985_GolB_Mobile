package com.example.acara_26;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import android.content.Intent;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity{
    TextView showText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        showText = (TextView) findViewById(R.id.getText);
    }
    public void back(View view){
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
    public void getPulic(View view){
        File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        File myFile = new File(folder, "Data1.txt");
        String text = getdata(myFile);
        if (text != null){
            showText.setText(text);
        }else{
            showText.setText("no data");
        }
    }

    public void getPrivate(View view){
        File folder = getExternalFilesDir("indra");
        File myFile = new File(folder, "Data2.txt");
        String text = getdata(myFile);
        if (text != null){
            showText.setText(text);
        }else{
            showText.setText("data Data");
        }
    }

    private String getdata(File myfile){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(myfile);
            int i = -1;
            StringBuilder buffer;
            buffer = new StringBuilder();
            while ((i=fileInputStream.read())!=-1){
                buffer.append((char)i);
            }
            return buffer.toString();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}