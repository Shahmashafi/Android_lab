package com.example.toggle;
import android.os.Bundle;import android.view.View;import android.widget.Button;import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView image1, image2;

    Button toggleButton;

    boolean isFirstImage=true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1=findViewById(R.id.image1);
        image2=findViewById(R.id.image2);
        toggleButton=findViewById(R.id.toggleButton);
        toggleButton.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {
            if(isFirstImage)
            {
                image1.setVisibility(View.GONE);
                image2.setVisibility(View.VISIBLE);
            }
            else
            {
                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.GONE);
            }
            isFirstImage=!isFirstImage;
            }
        });

    }
}
