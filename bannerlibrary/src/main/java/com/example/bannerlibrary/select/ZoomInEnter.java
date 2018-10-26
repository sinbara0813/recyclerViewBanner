package com.example.bannerlibrary.select;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

import com.example.bannerlibrary.BaseAnimator;


public class ZoomInEnter extends BaseAnimator {
    public ZoomInEnter() {
        this.mDuration = 200;
    }

    public void setAnimation(View view) {
        this.mAnimatorSet.playTogether(new Animator[]{
                ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0F, 1.5F}),
                ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0F, 1.5F})});
    }
}
