package com.example.bannerlibrary.unselect;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

import com.example.bannerlibrary.BaseAnimator;

public class NoAnimExist extends BaseAnimator
{
    public NoAnimExist() {
        this.mDuration = 200;
    }

    public void setAnimation(View view) {
        this.mAnimatorSet.playTogether(new Animator[]{
                ObjectAnimator.ofFloat(view, "alpha", 1, 1)});
    }
}
