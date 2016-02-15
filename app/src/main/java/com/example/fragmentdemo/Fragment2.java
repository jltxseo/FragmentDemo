package com.example.fragmentdemo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/** 
 * @author junlintianxia 
 * @version Create on：2015年7月27日 下午12:23:31 
 * @describe
 **/
public class Fragment2 extends Fragment {

	@Override
	public void onAttach(Activity activity) {
		Log.d("FRAGMENT", "Fragment2-------->onAttach");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d("FRAGMENT", "Fragment2-------->onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.d("FRAGMENT", "Fragment2-------->onCreateView");
		
//		return super.onCreateView(inflater, container, savedInstanceState);
		return inflater.inflate(R.layout.fragment2, container, false);
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		Log.d("FRAGMENT", "Fragment2-------->onViewCreated");
		super.onViewCreated(view, savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.d("FRAGMENT", "Fragment2-------->onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onStart() {
		Log.d("FRAGMENT", "Fragment2-------->onStart");
		super.onStart();
	}

	@Override
	public void onResume() {
		Log.d("FRAGMENT", "Fragment2-------->onResume");
		super.onResume();
	}

	@Override
	public void onPause() {
		Log.d("FRAGMENT", "Fragment2-------->onPause");
		super.onPause();
	}

	@Override
	public void onStop() {
		Log.d("FRAGMENT", "Fragment2-------->onStop");
		super.onStop();
	}

	@Override
	public void onDestroyView() {
		Log.d("FRAGMENT", "Fragment2-------->onDestroyView");
		super.onDestroyView();
	}

	@Override
	public void onDestroy() {
		Log.d("FRAGMENT", "Fragment2-------->onDestroy");
		super.onDestroy();
	}

	@Override
	public void onDetach() {
		Log.d("FRAGMENT", "Fragment2-------->onDetach");
		super.onDetach();
	}
	
	
	
}
