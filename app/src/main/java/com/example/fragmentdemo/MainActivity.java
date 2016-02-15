package com.example.fragmentdemo;


import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button addFrag1Btn;
	private Button addFrag2Btn;
	private Button removeFrag2Btn;
	private Button replaceFrag1Btn;
	private Button replaceFrag1HideBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d("FRAGMENT", "MainActivity-------->onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Fragment1 fragment1 = new Fragment1();
		addFragment(fragment1, "fragment1");
		
		addFrag1Btn = (Button)this.findViewById(R.id.btn_add_frag1);
		addFrag2Btn = (Button)this.findViewById(R.id.btn_add_frag2);
		removeFrag2Btn = (Button)this.findViewById(R.id.btn_remove_frag2);
		replaceFrag1Btn = (Button)this.findViewById(R.id.btn_replace_frag1);
		replaceFrag1HideBtn = (Button)this.findViewById(R.id.btn_replace_hide_frag1);
		
		
		addFrag1Btn.setOnClickListener(myClickListener);
		addFrag2Btn.setOnClickListener(myClickListener);
		removeFrag2Btn.setOnClickListener(myClickListener);
		replaceFrag1Btn.setOnClickListener(myClickListener);
		replaceFrag1HideBtn.setOnClickListener(myClickListener);
		
	}

	@Override
	protected void onStart() {
		Log.d("FRAGMENT", "MainActivity-------->onStart");
		super.onStart();
	}

	@Override
	protected void onRestart() {
		Log.d("FRAGMENT", "MainActivity-------->onRestart");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		Log.d("FRAGMENT", "MainActivity-------->onResume");
		super.onResume();
	}

	@Override
	protected void onPause() {
		Log.d("FRAGMENT", "MainActivity-------->onPause");
		super.onPause();
	}

	@Override
	protected void onStop() {
		Log.d("FRAGMENT", "MainActivity-------->onStop");
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		Log.d("FRAGMENT", "MainActivity-------->onDestroy");
		super.onDestroy();
	}

	@Override
	public void onBackPressed() {
		Log.d("FRAGMENT", "MainActivity-------->onBackPressed");
		super.onBackPressed();
	}

	private View.OnClickListener myClickListener = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			if(v == addFrag1Btn){
				Fragment1 fragment1 = new Fragment1();
				addFragment(fragment1, "fragment1");
			}else if(v == addFrag2Btn){
				Fragment2 fragment2 = new Fragment2();
				addFragment(fragment2, "fragment2");
			}else if(v == removeFrag2Btn){
				removeFragment("fragment2");
			}else if(v == replaceFrag1Btn){
				replaceFragment1();
			}else if(v == replaceFrag1HideBtn){
				hideAddEqualReplacFragment1();
			}
			
		}
	};
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void addFragment(Fragment fragment, String tag){
		FragmentManager fragmanager = getFragmentManager();
		FragmentTransaction transaction = fragmanager.beginTransaction();
		transaction.add(R.id.fragment_container, fragment, tag);
		transaction.commit();
	}
	
	private void removeFragment(String tag){
		FragmentManager fragmanager = getFragmentManager();
		Fragment fragment = fragmanager.findFragmentByTag(tag);
		if(fragment != null){
			FragmentTransaction transaction = fragmanager.beginTransaction();
			transaction.remove(fragment);
			transaction.commit();
		}else{
			Toast.makeText(getApplicationContext(), "tag 的 Fragment为null", 250).show();
		}

	}
	
	private void replaceFragment1(){
		FragmentManager fragmanager = getFragmentManager();
		Fragment2 fragment2 = new Fragment2();
		FragmentTransaction transaction = fragmanager.beginTransaction();
//		transaction.replace(R.id.fragment_container, fragment2);
		transaction.setCustomAnimations(R.animator.scalex_enter, R.animator.scalex_exit, R.animator.scalex_enter, R.animator.scalex_exit);
//		transaction.setCustomAnimations(R.animator.card_flip_horizontal_right_in, R.animator.card_flip_horizontal_left_out, R.animator.card_flip_horizontal_left_in, R.animator.card_flip_horizontal_right_out);
		transaction.replace(R.id.fragment_container, fragment2, "fragment2");
		transaction.commit();
	}
	
	private void hideAddEqualReplacFragment1(){
		FragmentManager fragmanager = getFragmentManager();
		Fragment fragment = fragmanager.findFragmentByTag("fragment1");
		FragmentTransaction transaction = fragmanager.beginTransaction();
		if(fragment != null){
			transaction.hide(fragment);
		}
		Fragment2 fragment2 = new Fragment2();
		transaction.add(R.id.fragment_container, fragment2);
		transaction.addToBackStack(null);
		transaction.commit();

	}
}
