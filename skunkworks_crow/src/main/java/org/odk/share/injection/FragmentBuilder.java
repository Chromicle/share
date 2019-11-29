package org.odk.share.injection;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import org.odk.share.injection.config.scopes.PerActivity;
import org.odk.share.views.ui.instance.fragment.ReceivedInstancesFragment;
import org.odk.share.views.ui.instance.fragment.ReviewedInstancesFragment;
import org.odk.share.views.ui.instance.fragment.SentInstancesFragment;
import org.odk.share.views.ui.instance.fragment.StatisticsFragment;
import org.odk.share.views.ui.send.fragment.BlankFormsFragment;
import org.odk.share.views.ui.send.fragment.FilledFormsFragment;

@Module
public abstract class FragmentBuilder {

    @PerActivity
    @ContributesAndroidInjector
    abstract StatisticsFragment provideStatisticsFragment();

    @PerActivity
    @ContributesAndroidInjector
    abstract SentInstancesFragment provideSentInstancesFragment();

    @PerActivity
    @ContributesAndroidInjector
    abstract ReceivedInstancesFragment provideReceivedInstancesFragment();

    @PerActivity
    @ContributesAndroidInjector
    abstract ReviewedInstancesFragment provideReviewedInstancesFragment();

    @PerActivity
    @ContributesAndroidInjector
    abstract BlankFormsFragment provideBlankFormsFragment();

    @PerActivity
    @ContributesAndroidInjector
    abstract FilledFormsFragment provideFilledFormsFragment();
}
