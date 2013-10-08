package com.example.myfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import com.example.myfragment.BottomBar.OnItemChangedListener;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.layout_main_test);
		final BottomBar bottomBar = (BottomBar)findViewById(R.id.ll_bottom_bar);
        bottomBar.setOnItemChangedListener(new OnItemChangedListener() 
        {
			
			@Override
			public void onItemChanged(int index) 
			{
				showDetails(index);
			}
		});
        bottomBar.setSelectedState(0);
	}
	private void showDetails(int index)
	{
		Fragment details = (Fragment)
	            getSupportFragmentManager().findFragmentById(R.id.details);
		switch(index)
		{
		case 0:
			details =(Fragment)new FragmentExecute();
			break;
		case 1:
//			details = new FragmentLaunch();
			break;
		case 2:
//			details = new FragmentTeam();
			break;
		case 3:
//			details = new FragmentSearch();
			break;
		case 4:
//			details = new FragmentSetting();
			break;
		}
		// Execute a transaction, replacing any existing
        // fragment with this one inside the frame.
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.details, details);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
//        ft.addToBackStack(null);//这行代码可以返回之前的操作（横屏的情况下，即两边都显示的情况下）
        ft.commit();
	}
	public void addFragment(Fragment details) {
		// TODO Auto-generated method stub
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.details, details);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
//        ft.addToBackStack(null);//这行代码可以返回之前的操作（横屏的情况下，即两边都显示的情况下）
        ft.commit();
	}
	
}
