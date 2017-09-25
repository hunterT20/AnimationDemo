package vn.aqtsoft.animationdemo;

import android.animation.Animator;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;

import static vn.aqtsoft.animationdemo.Techniques.FlipInX;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private LinearLayout layouttotal1;
    private LinearLayout layout1;
    private LinearLayout layout2;
    private LinearLayout layout3;
    private LinearLayout layout4;
    private LinearLayout layout5;
    private TextView t1;
    private TextView t2;
    private TextView t3;
    private TextView t4;
    private TextView t5;

    private YoYo.YoYoString rope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addViews();
    }

    private void addViews() {
        layout1 = findViewById(R.id.l1);
        layout2 = findViewById(R.id.l2);
        layout3 = findViewById(R.id.l3);
        layout4 = findViewById(R.id.l4);
        layout5 = findViewById(R.id.l5);
        layouttotal1 = findViewById(R.id.lt1);

        layout2.setVisibility(View.GONE);
        layout3.setVisibility(View.GONE);
        layout4.setVisibility(View.GONE);
        layout5.setVisibility(View.GONE);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnimationDemo();
            }
        });
    }

    public void playAnimationDemo(){
        layout2.setVisibility(View.GONE);
        layout3.setVisibility(View.GONE);
        layout4.setVisibility(View.GONE);
        layout5.setVisibility(View.GONE);

        t2.setTextColor(getResources().getColor(R.color.cardview_light_background));
        t3.setTextColor(getResources().getColor(R.color.cardview_light_background));
        t4.setTextColor(getResources().getColor(R.color.cardview_light_background));
        t5.setTextColor(getResources().getColor(R.color.cardview_light_background));


        Techniques technique = (Techniques) FlipInX;
        rope = YoYo.with(technique)
                .duration(300)
                .pivot(YoYo.CENTER_PIVOT, 0)
                .interpolate(new AccelerateDecelerateInterpolator())
                .withListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {
                        t1.setText("thay thế 1");
                        layout2.setVisibility(View.VISIBLE);
                        layout3.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        t2.setTextColor(getResources().getColor(R.color.cardview_dark_background));
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                }).playOn(layouttotal1);

        rope = YoYo.with(technique)
                .duration(300)
                .pivot(YoYo.CENTER_PIVOT, 0)
                .delay(300)
                .interpolate(new AccelerateDecelerateInterpolator())
                .withListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        t3.setTextColor(getResources().getColor(R.color.cardview_dark_background));
                        layout4.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                }).playOn(layout3);

        rope = YoYo.with(technique)
                .duration(300)
                .pivot(YoYo.CENTER_PIVOT, 0)
                .delay(600)
                .interpolate(new AccelerateDecelerateInterpolator())
                .withListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        t3.setTextColor(getResources().getColor(R.color.cardview_dark_background));
                        t4.setTextColor(getResources().getColor(R.color.cardview_dark_background));
                        layout5.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                }).playOn(layout4);

        rope = YoYo.with(technique)
                .duration(300)
                .pivot(YoYo.CENTER_PIVOT, 0)
                .delay(900)
                .interpolate(new AccelerateDecelerateInterpolator())
                .withListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                t5.setTextColor(getResources().getColor(R.color.cardview_dark_background));
                            }
                        }, 1100);
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                }).playOn(layout5);

    }
}
