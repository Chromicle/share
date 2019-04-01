package org.odk.share.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import org.odk.share.R;
import org.odk.share.adapters.ViewPagerAdapter;
import org.odk.share.fragments.BlankFormsFragment;
import org.odk.share.fragments.FilledFormsFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SendFormsActivity extends InjectableActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tabs)
    TabLayout tabLayout;
    @BindView(R.id.viewpager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instance_manager_tabs);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new FilledFormsFragment(), getString(R.string.filled_form));
        adapter.addFrag(new BlankFormsFragment(), getString(R.string.blank_form));
        viewPager.setAdapter(adapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition(), true);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
                if (mRecyclerView != null)
                    mRecyclerView.smoothScrollToPosition(0);
            }
        });
    }
}