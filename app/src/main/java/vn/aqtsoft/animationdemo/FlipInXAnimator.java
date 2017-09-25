package vn.aqtsoft.animationdemo;

import android.animation.ObjectAnimator;
import android.view.View;

public class FlipInXAnimator extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "rotationX", 180, 0)
                /*ObjectAnimator.ofFloat(target, "alpha", 0.25f, 0.5f, 0.75f, 1)*/
        );
    }
}
