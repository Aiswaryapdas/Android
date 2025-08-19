package com.example.toggle;
import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView first_image = (ImageView) this.findViewById(R.id.imageView);
        ImageView second_image = (ImageView) this.findViewById(R.id.imageView2);
        ImageView third_image = (ImageView) this.findViewById(R.id.imageView3);

        first_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_image.setVisibility(View.VISIBLE);
                view.setVisibility(View.GONE);
            }
        });
        second_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second_image.setVisibility(View.VISIBLE);
                view.setVisibility(View.GONE);
            }
        });
        third_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                third_image.setVisibility(View.VISIBLE);
                view.setVisibility(View.GONE);
            }
        });
    }

}
