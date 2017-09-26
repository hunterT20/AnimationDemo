package vn.aqtsoft.animationdemo.animation;

import android.animation.ObjectAnimator;
import android.view.View;

public class FlipOutXAnimator extends BaseViewAnimator{
    @Override
    protected void prepare(View target) {
        getAnimatorAgent().playTogether(ObjectAnimator.ofFloat(target, "rotationX", 0, 180));
    }
}
