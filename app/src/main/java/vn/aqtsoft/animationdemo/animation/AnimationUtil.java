package vn.aqtsoft.animationdemo.animation;

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;

import vn.aqtsoft.animationdemo.R;

/**
 * Class hiệu ứng trong app
 */
public class AnimationUtil {
    public static void SlideRotate(View view, Context context){
        view.startAnimation(AnimationUtils.loadAnimation(context,
                R.anim.rotate_x));
    }
}
