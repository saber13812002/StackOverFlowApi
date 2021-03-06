package info.sanaebadi.stackoverflowproject.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import info.sanaebadi.stackoverflowproject.mvvm.feature.view.MainActivity
import info.sanaebadi.stackoverflowproject.mvvm.feature.view.fragment.DetailsFragment
import info.sanaebadi.stackoverflowproject.mvvm.feature.view.fragment.UserListFragment

@Module
abstract class BuildersModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class])
    internal abstract fun bindMainActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class])
    internal abstract fun bindUserListFragment(): UserListFragment

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class])
    internal abstract fun bindDetailsFragment(): DetailsFragment


}