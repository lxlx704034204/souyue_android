package com.zhongsou.souyue.ui;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.zhongsou.souyue.utils.LogDebugUtil;

/**
 * @author fan
 *         嵌套viewpager
 */
public class GalleryViewPager extends ViewPager {
    /**
     * the last x position
     */
    private float lastX;

    /**
     * if the first swipe was from left to right (->), dont listen to swipes
     * from the right
     */
    private boolean slidingLeft;

    /**
     * if the first swipe was from right to left (<-), dont listen to swipes
     * from the left
     */
    private boolean slidingRight;

    public GalleryViewPager(final Context context, final AttributeSet attrs) {
        super(context, attrs);
    }

    public GalleryViewPager(final Context context) {
        super(context);
    }

    public ViewParent getViewPagerParent() {
        ViewParent p = getParent();
        while (p != null) {
            LogDebugUtil.v("fanxing", p + "");
            if (p instanceof ViewPager)
                return p;

            p = p.getParent();
        }

        return null;
    }

    public void requestParentPagerDisallowInterceptTouchEvent(boolean disallowIntercept) {
        ViewParent p = getViewPagerParent();
        if (p != null) {
            p.requestDisallowInterceptTouchEvent(disallowIntercept);
        }
    }

    @Override
    public boolean onTouchEvent(final MotionEvent ev) {
        final int action = ev.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:

                // Disallow parent ViewPager to intercept touch events.
                requestParentPagerDisallowInterceptTouchEvent(true);

                // save the current x position
                this.lastX = ev.getX();

                break;

            case MotionEvent.ACTION_UP:
                // Allow parent ViewPager to intercept touch events.
                requestParentPagerDisallowInterceptTouchEvent(false);

                // save the current x position
                this.lastX = ev.getX();

                // reset swipe actions
                this.slidingLeft = false;
                this.slidingRight = false;

                break;

            case MotionEvent.ACTION_MOVE:
            /*
			 * if this is the first item, scrolling from left to right should
			 * navigate in the surrounding ViewPager
			 */
                if (this.getCurrentItem() == 0) {
                    // swiping from left to right (->)?
                    if (this.lastX <= ev.getX() && !this.slidingRight) {
                        // make the parent touch interception active -> parent pager
                        // can swipe
                        requestParentPagerDisallowInterceptTouchEvent(false);
                    } else {
					/*
					 * if the first swipe was from right to left, dont listen to
					 * swipes from left to right. this fixes glitches where the
					 * user first swipes right, then left and the scrolling
					 * state gets reset
					 */
                        this.slidingRight = true;

                        // save the current x position
                        this.lastX = ev.getX();
                        requestParentPagerDisallowInterceptTouchEvent(true);
                    }
                } else
			/*
			 * if this is the last item, scrolling from right to left should
			 * navigate in the surrounding ViewPager
			 */
                    if (this.getCurrentItem() == this.getAdapter().getCount() - 1) {
                        // swiping from right to left (<-)?
                        if (this.lastX >= ev.getX() && !this.slidingLeft) {
                            // make the parent touch interception active -> parent pager
                            // can swipe
                            requestParentPagerDisallowInterceptTouchEvent(false);
                        } else {
					/*
					 * if the first swipe was from left to right, dont listen to
					 * swipes from right to left. this fixes glitches where the
					 * user first swipes left, then right and the scrolling
					 * state gets reset
					 */
                            this.slidingLeft = true;

                            // save the current x position
                            this.lastX = ev.getX();
                            requestParentPagerDisallowInterceptTouchEvent(true);
                        }
                    }

                break;
        }

        return super.onTouchEvent(ev);
    }
}
