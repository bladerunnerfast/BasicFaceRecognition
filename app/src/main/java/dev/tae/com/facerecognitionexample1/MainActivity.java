package dev.tae.com.facerecognitionexample1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    protected Overlay overlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        overlay = (Overlay) findViewById(R.id.face_overlay);
        InputStream stream = getResources().openRawResource(R.raw.group);
        Bitmap bitmap = BitmapFactory.decodeStream(stream);
        overlay.setBitmap(bitmap);
    }
}
