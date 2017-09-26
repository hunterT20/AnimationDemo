package vn.aqtsoft.animationdemo;

import android.animation.Animator;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;

import vn.aqtsoft.animationdemo.animation.Techniques;
import vn.aqtsoft.animationdemo.animation.YoYo;

import static vn.aqtsoft.animationdemo.animation.Techniques.FlipInX;
import static vn.aqtsoft.animationdemo.animation.Techniques.FlipOutX;

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

        layouttotal1.setVisibility(View.GONE);
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
                playAnimationDemoIN();
            }
        });

        layout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnimationDemoOUT();
            }
        });
    }

    public void playAnimationDemoIN(){
        layouttotal1.setVisibility(View.VISIBLE);
        layout4.setVisibility(View.GONE);
        layout5.setVisibility(View.GONE);

        t2.setTextColor(getResources().getColor(R.color.cardview_light_background));
        t3.setTextColor(getResources().getColor(R.color.cardview_light_background));
        t4.setTextColor(getResources().getColor(R.color.cardview_light_background));
        t5.setTextColor(getResources().getColor(R.color.cardview_light_background));


        Techniques technique = FlipInX;
        rope = YoYo.with(technique)
                .duration(350)
                .pivot(YoYo.CENTER_PIVOT, 0)
                .interpolate(new AccelerateDecelerateInterpolator())
                .withListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {
                        t1.setText("thay thế 1");
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        t2.setTextColor(getResources().getColor(R.color.cardview_dark_background));
                        layout4.setVisibility(View.VISIBLE);
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
                .delay(350)
                .interpolate(new AccelerateDecelerateInterpolator())
                .withListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                t3.setTextColor(getResources().getColor(R.color.cardview_dark_background));
                            }
                        }, 550);
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
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
                .delay(650)
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
                        }, 850);
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

    public void playAnimationDemoOUT(){
        Techniques technique = FlipOutX;
        rope = YoYo.with(technique)
                .duration(350)
                .pivot(YoYo.CENTER_PIVOT, 0)
                .interpolate(new AccelerateDecelerateInterpolator())
                .withListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {
                        t5.setTextColor(getResources().getColor(R.color.cardview_light_background));
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        layout5.setVisibility(View.GONE);
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                }).playOn(layout5);

        rope = YoYo.with(technique)
                .duration(350)
                .delay(350)
                .pivot(YoYo.CENTER_PIVOT, 0)
                .interpolate(new AccelerateDecelerateInterpolator())
                .withListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {
                        t4.setTextColor(getResources().getColor(R.color.cardview_light_background));
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        layout4.setVisibility(View.GONE);
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                }).playOn(layout4);

        rope = YoYo.with(technique)
                .duration(400)
                .delay(700)
                .pivot(YoYo.CENTER_PIVOT, 0)
                .interpolate(new AccelerateDecelerateInterpolator())
                .withListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {
                        t3.setTextColor(getResources().getColor(R.color.cardview_light_background));
                        t2.setTextColor(getResources().getColor(R.color.cardview_light_background));
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        layouttotal1.setVisibility(View.GONE);
                        t1.setText("Out");
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                }).playOn(layouttotal1);
    }
}
