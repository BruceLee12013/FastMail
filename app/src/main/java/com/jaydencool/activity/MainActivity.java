package com.jaydencool.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.jaydencool.R;
import com.jaydencool.util.HttpHelper;
import com.jaydencool.util.MD5Utils;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.apaches.commons.codec.digest.DigestUtils;
import org.json.JSONObject;
import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    private SliderLayout sliderShow;
    private PagerIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sliderShow=(SliderLayout)findViewById(R.id.slider);
        indicator=(PagerIndicator)findViewById(R.id.custom_indicator);
        initSlider();
    }

    private void initSlider() {
        TextSliderView textSliderView = new TextSliderView(this);
        textSliderView
                .description("Game of Thrones")
                .image("http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");

        textSliderView.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView slider) {
                Toast.makeText(MainActivity.this,"textSliderView",Toast.LENGTH_SHORT).show();
            }
        });
        sliderShow.addSlider(textSliderView);
        TextSliderView textSliderView1 = new TextSliderView(this);

        textSliderView1
                .description("Game of Thrones")
                .image("http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");
        textSliderView1.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView slider) {
                Toast.makeText(MainActivity.this,"textSliderView1",Toast.LENGTH_SHORT).show();
            }
        });
        sliderShow.addSlider(textSliderView1);
        TextSliderView textSliderView2 = new TextSliderView(this);
        textSliderView2
                .description("Game of Thrones")
                .image("http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");
        textSliderView2.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView slider) {
                Toast.makeText(MainActivity.this,"textSliderView2",Toast.LENGTH_SHORT).show();
            }
        });
        sliderShow.addSlider(textSliderView2);
        sliderShow.setCustomIndicator(indicator);
        sliderShow.setPresetTransformer(SliderLayout.Transformer.Default);
        sliderShow.addOnPageChangeListener(new ViewPagerEx.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        sliderShow.setDuration(2000);
    }
}
