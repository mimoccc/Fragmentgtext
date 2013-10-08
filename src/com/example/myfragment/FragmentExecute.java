package com.example.myfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;


/** 
 * 文件名称:   FragmentExecute.java 
 * 功能描述:  
 * 版本信息:   Copyright (c)2013 
 * 公司信息:   杭州瑜旭
 * 开发人员:   yuyejiang
 * 版本日志:   1.0 
 * 创建时间:   2013年10月8日 上午11:19:05 
 * 
 * 修改历史: 
 * 时间         开发者      版本号    修改内容 
 * ------------------------------------------------------------------ 
 * 2013年10月8日   yuyejiang      1.0         1.0 Version 
 */
public class FragmentExecute extends Fragment{
	private Button btn ;

	public FragmentExecute()
	{
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) 
	{
		if (container == null) 
		{
            // Currently in a layout without a container, so no
            // reason to create our view.
            return null;
        }
		LayoutInflater myInflater = (LayoutInflater)getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);  
	    View layout = myInflater.inflate(R.layout.frag_execute, container, false); 
	    btn = (Button)layout.findViewById(R.id.btn_add);
	    btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
//				startActivity(new Intent(getActivity(), SecondActivity.class));
				Fragment fr = new Fragment();
				fr = (Fragment)new FragmentTest();
				FragmentTransaction ft = getFragmentManager().beginTransaction();
				ft.replace(R.id.details,fr);
				ft.commit();
			}
		});
		return layout;
	}

}
