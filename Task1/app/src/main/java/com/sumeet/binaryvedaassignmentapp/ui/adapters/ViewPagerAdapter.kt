package com.sumeet.binaryvedaassignmentapp.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * Adapter for viewpager in profile activity.
 */
class ViewPagerAdapter(
    fragment : Fragment,
    private val list: List<Fragment>
) : FragmentStateAdapter(fragment)  {
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return list[position]
    }
}