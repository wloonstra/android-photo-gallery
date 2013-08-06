package com.bignerdranch.android.photogallery;

import android.support.v4.app.Fragment;

/**
 * Created by wloonstra on 06-08-13.
 */
public class PhotoPageActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new PhotoPageFragment();
    }
}
