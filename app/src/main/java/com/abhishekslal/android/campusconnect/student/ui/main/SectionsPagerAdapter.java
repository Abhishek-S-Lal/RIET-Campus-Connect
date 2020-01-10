package com.abhishekslal.android.campusconnect.student.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.abhishekslal.android.campusconnect.R;
import com.abhishekslal.android.campusconnect.student.ConnectTab;
import com.abhishekslal.android.campusconnect.student.HomeTab;
import com.abhishekslal.android.campusconnect.student.LinwaysTab;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.student_tab_text_1, R.string.student_tab_text_2, R.string.student_tab_text_3};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position) {
            case 0:
                HomeTab home = new HomeTab();
                return home;
            case 1:
                LinwaysTab linways = new LinwaysTab();
                return linways;
            case 2:
                ConnectTab connect = new ConnectTab();
                return connect;
        }

        return PlaceholderFragment.newInstance(position + 1);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }
}