package com.lukebiubiubiu.splashview;

import android.animation.TypeEvaluator;

/**
 * 作者： 刘泽旻luke
 * Github: https://github.com/lukebiubiubiu
 */
public class LineEvaluator implements TypeEvaluator<Splash> {

    @Override
    public Splash evaluate(float fraction, Splash startValue, Splash endValue) {
        Splash splash = new Splash();
        splash.x = startValue.x + (endValue.x - startValue.x) * fraction;
        splash.y = startValue.y + (endValue.y - startValue.y) * fraction;
        splash.radius = startValue.radius + (endValue.radius - startValue.radius) * fraction;
        return splash;
    }
}
