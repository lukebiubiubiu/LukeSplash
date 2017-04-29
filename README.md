## What's LukeSplash ?
It's a cool animation which can use in splash or anywhere else.
这是一个很酷的动画闪屏效果
## Demo

![Markdown](https://raw.githubusercontent.com/jeasonwong/Particle/master/screenshots/particle.gif)

## Article
[Luke哥教你用Canvas实现简单粒子动画]
## Attributes

|name|format|description|中文解释
|:---:|:---:|:---:|:---:|
| pv_host_text | string |set left host text|设置左边主文案
| pv_host_text_size | dimension |set host text size|设置主文案的大小
| pv_particle_text | string |set right particle text|设置右边粒子上的文案
| pv_particle_text_size | dimension |set particle text size|设置粒子上文案的大小
| pv_text_color | color |set host text color|设置左边主文案颜色
|pv_background_color|color|set background color|设置背景颜色
| pv_text_anim_time | integer |set particle text duration|设置粒子上文案的运动时间
| pv_spread_anim_time | integer |set particle text spread duration|设置粒子上文案的伸展时间
|pv_host_text_anim_time|integer|set host text displacement duration|设置左边主文案的位移时间

## Usage
#### Define your banner under your xml :

```xml
<com.lukebiubiubiu.splashview.SplashView
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    pv:pv_background_color="#2E2E2E"
    pv:pv_host_text="github"
    pv:pv_host_text_size="14sp"
    pv:pv_particle_text=".com"
    pv:pv_particle_text_size="14sp"
    pv:pv_text_color="#FFF"
    pv:pv_text_anim_time="3000"
    pv:pv_spread_anim_time="2000"
    pv:pv_host_text_anim_time="3000" />
```

#### Start animation :

```java
mSplashView.startAnim();
```

#### Add animation listener to listen the end callback :

```java
mSplashView.setOnParticleAnimListener(new SplashView.ParticleAnimListener() {
    @Override
    public void onAnimationEnd() {
        Toast.makeText(MainActivity.this, "Animation is End", Toast.LENGTH_SHORT).show();
    }
});
```

## Import

Step 1. Add it in your project's build.gradle at the end of repositories:

如何使用 帅比luke哥教你

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency:

```gradle
	dependencies {
	        compile 'com.github.lukebiubiubiu:VentilationSafety:v1.0.0'
	}

```

### wechat 欢迎讨论

979433196

##**License**
