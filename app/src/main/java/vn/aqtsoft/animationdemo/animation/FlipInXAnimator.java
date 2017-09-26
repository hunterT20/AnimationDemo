package vn.aqtsoft.animationdemo.animation;

import android.animation.ObjectAnimator;
import android.view.View;

public class FlipInXAnimator extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "rotationX", 180, 0)
        );
    }
}
