package cn.why.viewpager;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.widget.Toast;

public class ViewPagerActivity extends FragmentActivity implements OnPageChangeListener{

	private List<View> viewList = new ArrayList<View>();
	private List<Fragment> fragmentList = new ArrayList<Fragment>();
	private CustomPagerAdapter customPagerAdapter;
	private CustomFragmentPagerAdapter customFragmentPagerAdapter;
	private CustomFragmentStatePagerAdapter customFragmentStatePagerAdapter;
	private ViewPager viewPager;
	
	private PagerTabStrip pagerTabStrip;
	private List<String> titleList = new ArrayList<String>();
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //布局转化为view对象
        View view1 = View.inflate(this, R.layout.view1, null);
        View view2 = View.inflate(this, R.layout.view2, null);
        View view3 = View.inflate(this, R.layout.view3, null);
        View view4 = View.inflate(this, R.layout.view4, null);
        
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);
        viewList.add(view4);
        
        titleList.add("第一页");
        titleList.add("第二页");
        titleList.add("第三页");
        titleList.add("第四页");
        
        fragmentList.add(new Fragment1());
        fragmentList.add(new Fragment2());
        fragmentList.add(new Fragment3());
        fragmentList.add(new Fragment4());
        
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        
        pagerTabStrip = (PagerTabStrip) findViewById(R.id.pagerTabStrip);
        
        pagerTabStrip.setDrawFullUnderline(false);
        pagerTabStrip.setBackgroundColor(Color.WHITE);
        pagerTabStrip.setTextColor(Color.RED);
        pagerTabStrip.setTabIndicatorColor(Color.RED);
        
        customPagerAdapter = new CustomPagerAdapter(viewList, titleList);
        viewPager.setAdapter(customPagerAdapter);
        
        customFragmentPagerAdapter = new CustomFragmentPagerAdapter(getSupportFragmentManager(), fragmentList);
//        viewPager.setAdapter(customFragmentPagerAdapter);
        
        customFragmentStatePagerAdapter = new CustomFragmentStatePagerAdapter(getSupportFragmentManager(), fragmentList);
//        viewPager.setAdapter(customFragmentStatePagerAdapter);
        	
        viewPager.setOnPageChangeListener(this);
    }
	
	public void onPageScrollStateChanged(int arg0) {
		
	}
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		
	}
	public void onPageSelected(int arg0) {
		Toast.makeText(this, "当前是第"+(arg0+1)+"页面", Toast.LENGTH_SHORT).show();
	}
    
}