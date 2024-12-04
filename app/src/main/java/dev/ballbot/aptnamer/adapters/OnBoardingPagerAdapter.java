package dev.ballbot.aptnamer.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class OnBoardingPagerAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> items = new ArrayList<Fragment>();

    public OnBoardingPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    public void addItem(Fragment fragment) {
        this.items.add(fragment);
    }
}
