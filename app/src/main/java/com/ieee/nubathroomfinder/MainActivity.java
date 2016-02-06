package com.ieee.nubathroomfinder;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import uk.co.senab.photoview.PhotoViewAttacher;

public class MainActivity extends AppCompatActivity {

//    @Bind(R.id.first_floor) Button firstFloor;
    @Bind(R.id.first_floor_image) ImageView firstFloorImage;
    PhotoViewAttacher mAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mAttacher = new PhotoViewAttacher(firstFloorImage);
    }

    @OnClick(R.id.first_floor_button)
    public void showFirstFloorMap() {
        firstFloorImage.setVisibility(View.VISIBLE);
    }
}
