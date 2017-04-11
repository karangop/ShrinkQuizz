package cl.karangop.shrinkquizz.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import cl.karangop.shrinkquizz.views.tabs.CoolFragment;
import cl.karangop.shrinkquizz.views.tabs.LuckyFragment;
import cl.karangop.shrinkquizz.views.tabs.MatchFragment;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        //return PlaceholderFragment.newInstance(position + 1);
        switch (position){
            case 0:
                return CoolFragment.newInstance();
            case 1:
                return LuckyFragment.newInstance();
            case 2:
                return MatchFragment.newInstance();
            default:
                return CoolFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "COOL";
            case 1:
                return "SUERTE";
            case 2:
                return "COMPATIBLES";
        }
        return null;
    }
}
