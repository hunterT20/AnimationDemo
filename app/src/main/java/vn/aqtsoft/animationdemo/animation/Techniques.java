package vn.aqtsoft.animationdemo.animation;


public enum Techniques {
    FlipInX(FlipInXAnimator.class),
    FlipOutX(FlipOutXAnimator.class);
    private Class animatorClazz;

    Techniques(Class clazz) {
        animatorClazz = clazz;
    }

    public BaseViewAnimator getAnimator() {
        try {
            return (BaseViewAnimator) animatorClazz.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}