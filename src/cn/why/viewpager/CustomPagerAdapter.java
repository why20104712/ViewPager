package cn.why.viewpager;

import java.util.List;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class CustomPagerAdapter extends PagerAdapter{

	private List<View> viewList;
	private List<String> titleList;
	
	public CustomPagerAdapter(List<View> viewList, List<String> titleList) {
		this.viewList = viewList;
		this.titleList = titleList;
	}
	
	@Override
	public void destroyItem(View arg0, int arg1, Object arg2) {
		((ViewGroup)arg0).removeView(viewList.get(arg1));
	}

	@Override
	public void finishUpdate(View arg0) {
	}

	@Override
	public int getCount() {
		return viewList.size();
	}

	@Override
	public Object instantiateItem(View arg0, int arg1) {
		((ViewGroup)arg0).addView(viewList.get(arg1));
		return viewList.get(arg1);
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0 == arg1;
	}

	@Override
	public void restoreState(Parcelable arg0, ClassLoader arg1) {
	}

	@Override
	public Parcelable saveState() {
		return null;
	}

	@Override
	public void startUpdate(View arg0) {
		
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return titleList.get(position);
	}
}
