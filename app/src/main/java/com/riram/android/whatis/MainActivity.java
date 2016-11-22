package com.riram.android.whatis;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getViews(){
        cameraButton = (ImageButton) findViewById(R.id.cameraButton);
        galleryButton = (ImageButton)findViewById(R.id.galleryButton);
        listview = (ListView) findViewById(R.id.item_listView);
    }

    public void handleCameraBtnClick() {
        cameraButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
            }
        });
    }

    public void handleGalleryBtnClick(){
        galleryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, GALLERY_IMAGE_ACTIVITY_REQUEST_CODE);
            }
        });
    }
}
