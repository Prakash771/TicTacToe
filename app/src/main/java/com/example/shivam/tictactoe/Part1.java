package com.example.shivam.tictactoe;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.display.DisplayManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.support.v4.app.ShareCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.util.List;
import android.support.v7.widget.ShareActionProvider;
import android.widget.Toast;

public class Part1 extends AppCompatActivity {

	private ShareActionProvider mShareActionProvider;


	Button b2,b3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_part1);




		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		b2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent=new Intent(getApplicationContext(),Part3.class);
				startActivity(intent);

			}
		});
		b3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent=new Intent(getApplicationContext(),Part2.class);
				startActivity(intent);
			}
		});

}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.my_options_menu, menu);
		MenuItem item = menu.findItem(R.id.Share);
		mShareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(item);
		// Create the share Intent
		String playStoreLink = "https://play.google.com/store/apps/details?id=" + getPackageName();
		String yourShareText = "Install this app " + playStoreLink;
		Intent shareIntent = ShareCompat.IntentBuilder.from(this)
				.setType("text/plain").setText(yourShareText).getIntent();
		// Set the share Intent
		mShareActionProvider.setShareIntent(shareIntent);
		return true;


	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId())
		{
			case R.id.Aboutme:
			{

				Intent intent=new Intent(getApplicationContext(),aboutme.class);
				startActivity(intent);
				return true;
			}
			case R.id.Share:
			{
				return true;

			}
			case R.id.Exit:
			{
				finish();
				return true;

			}
			case R.id.rate:
			{
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("market://details?id=com.example.android.shivam.tictactoe"));
				startActivity(intent);
				return true;
			}

			default:

				return true;
		}}

}
