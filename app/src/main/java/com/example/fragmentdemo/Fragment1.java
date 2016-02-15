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
public class Fragment1 extends Fragment {

	@Override
	public void onAttach(Activity activity) {
		Log.d("FRAGMENT", "Fragment1-------->onAttach");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d("FRAGMENT", "Fragment1-------->onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.d("FRAGMENT", "Fragment1-------->onCreateView");
//		return super.onCreateView(inflater, container, savedInstanceState);
		return inflater.inflate(R.layout.fragment1, container, false);
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		Log.d("FRAGMENT", "Fragment1-------->onViewCreated");
		super.onViewCreated(view, savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.d("FRAGMENT", "Fragment1-------->onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onStart() {
		Log.d("FRAGMENT", "Fragment1-------->onStart");
		super.onStart();
	}

	@Override
	public void onResume() {
		Log.d("FRAGMENT", "Fragment1-------->onResume");
		super.onResume();
	}

	@Override
	public void onPause() {
		Log.d("FRAGMENT", "Fragment1-------->onPause");
		super.onPause();
	}

	@Override
	public void onStop() {
		Log.d("FRAGMENT", "Fragment1-------->onStop");
		super.onStop();
	}

	@Override
	public void onDestroyView() {
		Log.d("FRAGMENT", "Fragment1-------->onDestroyView");
		super.onDestroyView();
	}

	@Override
	public void onDestroy() {
		Log.d("FRAGMENT", "Fragment1-------->onDestroy");
		super.onDestroy();
	}

	@Override
	public void onDetach() {
		Log.d("FRAGMENT", "Fragment1-------->onDetach");
		super.onDetach();
	}
	
	
	
}
