package com.abhishekslal.android.campusconnect.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.abhishekslal.android.campusconnect.NalandaTab;
import com.abhishekslal.android.campusconnect.NirmanTab;
import com.abhishekslal.android.campusconnect.QuickTab;
import com.abhishekslal.android.campusconnect.R;
import com.abhishekslal.android.campusconnect.YantraTab;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3,R.string.tab_text_4};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                QuickTab quick=new QuickTab();
                return quick;
            case 1:
                NalandaTab nalanda=new NalandaTab();
                return nalanda;
            case 2:
                NirmanTab nirman= new NirmanTab();
                return nirman;
            case 3:
                YantraTab yantra=new YantraTab();
                return yantra;
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
        // Show 4 total pages.
        return 4;
    }
}