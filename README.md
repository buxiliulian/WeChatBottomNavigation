# WeChatBottomNavigation
高仿微信底部导航栏动画，几乎一毛一样。

# 动画演示
![动画演示](https://github.com/buxiliulian/WeChatBottomNavigation/blob/master/gif/weixin.gif)

# 如何使用

## 布局添加TabView
```xml
        <com.uni.wechatbottomnavigation.view.TabView
            android:id="@+id/tab_profile"
            bxll:tabImage="@mipmap/profile_normal"
            bxll:tabColor="#FF11E53F"
            bxll:tabSelectedImage="@mipmap/profile_pressed"
            bxll:tabTitle="我"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1" />
```

`tabImage`属性代表默认显示的图片

`tabSelectedImage`属性代表选中时的图片

`tabColor`属性代表颜色变换的最终颜色

`tabTitle`代表标题

## Activity中控制进度
```java
        mViewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                // 左边TabView进行动画
                mTabViews.get(position).setXPercentage(1 - positionOffset);
                // 右边TabView进行动画
                if (positionOffset > 0) {
                    mTabViews.get(position + 1).setXPercentage(positionOffset);
                }
            }
        });
```

`ViewPager`监听滑动事件，向`TabView`传入一个进度值，从而控制`TabView`的动画

# 联系我
1. blog: https://juejin.im/post/5d5365876fb9a06b130f1aa6
2. QQ Email: 509643792@qq.com
3. Gmail: zwlove5250@gmail.com
