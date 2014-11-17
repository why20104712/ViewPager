package cn.why.viewpager;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;

public class CustomFragmentStatePagerAdapter extends FragmentStatePagerAdapter{

	private List<Fragment> fragmentList;
	
	public CustomFragmentStatePagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {
		super(fm);
		this.fragmentList = fragmentList;
	}

	@Override
	public Fragment getItem(int arg0) {
		return fragmentList.get(arg0);
	}

	@Override
	public int getCount() {
		return fragmentList.size();
	}

	@Override
	public Object instantiateItem(View arg0, int arg1) {
		return super.instantiateItem(arg0, arg1);
	}
	
	@Override
	public void destroyItem(View container, int position, Object object) {
		super.destroyItem(container, position, object);
	}
	
}
