package RocketLaunchModule.animationactivities;

import android.animation.ValueAnimator;

public class RotateRocketAnimationActivity extends BaseAnimationActivity {
  @Override
  protected void onStartAnimation() {
    ValueAnimator animator = ValueAnimator.ofFloat(0, 360);

    animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
      @Override
      public void onAnimationUpdate(ValueAnimator animation) {
        float value = (float) animation.getAnimatedValue();
        mRocket.setRotation(value);
      }
    });

    animator.setDuration(DEFAULT_ANIMATION_DURATION);
    animator.start();
  }
}
