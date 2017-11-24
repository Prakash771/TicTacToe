package com.example.shivam.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Random;

import es.dmoral.toasty.Toasty;

import static com.example.shivam.tictactoe.R.drawable.background2;

public class Part5 extends AppCompatActivity {

	static Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
	RadioButton r1, r2, r3;
	EditText e2, e3, e1;

	Integer[] a;
	Boolean b = true;
	Boolean c=true;
	static Boolean d=true;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_part5);

		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		a = new Integer[18];
		Arrays.fill(a, 0);


		e1 = (EditText) findViewById(R.id.stats);
		e1.setText("0");
		e2 = (EditText) findViewById(R.id.edittext2);
		e2.setText("0");
		e3 = (EditText) findViewById(R.id.edittext3);
		e3.setText("0");



		r1 = (RadioButton) findViewById(R.id.radio1);
		r2 = (RadioButton) findViewById(R.id.radio2);
		r3 = (RadioButton) findViewById(R.id.radio3);


		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b3 = (Button) findViewById(R.id.button3);
		b4 = (Button) findViewById(R.id.button4);
		b5 = (Button) findViewById(R.id.button5);
		b6 = (Button) findViewById(R.id.button6);
		b7 = (Button) findViewById(R.id.button7);
		b8 = (Button) findViewById(R.id.button8);
		b9 = (Button) findViewById(R.id.button9);

		r3.setChecked(true);

		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio0);
		radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// checkedId is the RadioButton selected

				//easy
				if (checkedId == (R.id.radio1)) {
					//  r1.setChecked(false);
					finish();
					Intent i= new Intent(getApplicationContext(), Part3.class);
					startActivity(i);

				}
				//medium
				if (checkedId == (R.id.radio2)) {
					finish();
					Intent i= new Intent(getApplicationContext(), Part4.class);
					startActivity(i);

				}
			}
		});

		b1.setOnClickListener(new View.OnClickListener() {
								  @Override
								  public void onClick(View view) {

									  if(b==true) {
										  b1.setText("0");
										  b=false;
										  b1.setEnabled(false);
										  a[0] = 1;
										  fun();

										  androidfun();
									  }


								  }

							  }
		);

		b2.setOnClickListener(new View.OnClickListener() {
								  @Override
								  public void onClick(View view) {

									  if(b==true) {
										  b2.setText("0");
										  b2.setEnabled(false);
										  a[1] = 1;
										  fun();
										  b=false;
										  androidfun();
									  }

								  }


							  }


		);

		b3.setOnClickListener(new View.OnClickListener() {
								  @Override
								  public void onClick(View view) {

									  if(b==true) {

										  b3.setText("0");
										  b3.setEnabled(false);
										  a[2] = 1;
										  fun();
										  b=false;
										  androidfun();
									  }

								  }


							  }


		);

		b4.setOnClickListener(new View.OnClickListener() {
								  @Override
								  public void onClick(View view) {

									  if(b==true) {
										  b4.setText("0");
										  b4.setEnabled(false);
										  a[3] = 1;
										  fun();
										  b=false;
										  androidfun();
									  }

								  }


							  }


		);

		b5.setOnClickListener(new View.OnClickListener() {
								  @Override
								  public void onClick(View view) {

									  if(b==true) {

										  b5.setText("0");
										  b5.setEnabled(false);
										  a[4] = 1;
										  fun();
										  b=false;
										  androidfun();
									  }

								  }


							  }


		);

		b6.setOnClickListener(new View.OnClickListener() {
								  @Override
								  public void onClick(View view) {

									  if(b==true) {
										  b6.setText("0");
										  b6.setEnabled(false);
										  a[5] = 1;
										  fun();
										  b=false;
										  androidfun();
									  }

								  }
							  }


		);

		b7.setOnClickListener(new View.OnClickListener() {
								  @Override
								  public void onClick(View view) {

									  if(b==true) {
										  b7.setText("0");
										  b7.setEnabled(false);
										  a[6] = 1;
										  fun();
										  b=false;
										  androidfun();
									  }

								  }


							  }
		);

		b8.setOnClickListener(new View.OnClickListener() {
								  @Override
								  public void onClick(View view) {
									  if(b==true) {

										  b8.setText("0");
										  b8.setEnabled(false);
										  a[7] = 1;
										  fun();
										  b=false;
										  androidfun();
									  }
								  }


							  }


		);

		b9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if(b==true) {
					b9.setText("0");
					b9.setEnabled(false);
					a[8] = 1;
					fun();
					b=false;
					androidfun();
				}

			}
		});


		Button b10 = (Button) findViewById(R.id.playagain); //play again do reset
		b10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				b1.setText("");
				b1.setEnabled(true);

				b2.setText("");
				b2.setEnabled(true);


				b3.setText("");
				b3.setEnabled(true);


				b4.setText("");
				b4.setEnabled(true);

				b5.setText("");
				b5.setEnabled(true);

				b6.setText("");
				b6.setEnabled(true);

				b7.setText("");
				b7.setEnabled(true);

				b8.setText("");
				b8.setEnabled(true);

				b9.setText("");
				b9.setEnabled(true);

				b1.setBackgroundResource(background2);
				b2.setBackgroundResource(background2);
				b3.setBackgroundResource(background2);
				b4.setBackgroundResource(background2);
				b5.setBackgroundResource(background2);
				b6.setBackgroundResource(background2);
				b7.setBackgroundResource(background2);
				b8.setBackgroundResource(background2);
				b9.setBackgroundResource(background2);

				Arrays.fill(a, 0);
				c=true;

				if(b==false)
					androidfun();


			}
		});


	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.my_options_menu2, menu);
		return true;
	} // menu option
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
			case android.R.id.home:{
				// app icon in action bar clicked; goto parent activity.
				finish();
				return true;}
			default:

				return true;
		}}
	//random generator
	public static int getRandom(Integer[] a) {

		boolean indicate = false;
		for (int i = 0; i < 9; i++) {
			if (a[i] == 0) {
				indicate = true;
				break;
			}

		}
		if (indicate == true) {

			while (true) {
				int rnd = new Random().nextInt(a.length / 2);

				//pehle chance android ki hai and android hamesha 5 button par hi press karega
				if (b1.getText() == "" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "" && b5.getText()=="" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "" && b9.getText() == "")
				{
					return 4;
				}

				//android ne chala b5 and user  ne anywhere then android konsa chalega
				//even buttons
				else if(b1.getText() == "" && b2.getText() == "0" && b3.getText() == "" && b4.getText() == "" && b5.getText()=="X" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "" && b9.getText() == "")
				{
					return 7;

				}	else if(b1.getText() == "" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "0" && b5.getText()=="X" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "" && b9.getText() == "")
				{
					return 5;

				}	else if(b1.getText() == "" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "" && b5.getText()=="X" && b6.getText() == "0" && b7.getText() == "" && b8.getText() == "" && b9.getText() == "")
				{
					return 3;

				}	else if(b1.getText() == "" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "" && b5.getText()=="X" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "0" && b9.getText() == "")
				{
					return 1;

				}
				// odd buttons
				else

				if(b1.getText() == "0" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "" && b5.getText()=="X" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "" && b9.getText() == "")
				{
					return 8;

				}	else if(b1.getText() == "" && b2.getText() == "" && b3.getText() == "0" && b4.getText() == "" && b5.getText()=="X" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "" && b9.getText() == "")
				{
					return 6;

				}	else if(b1.getText() == "" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "" && b5.getText()=="X" && b6.getText() == "" && b7.getText() == "0" && b8.getText() == "" && b9.getText() == "")
				{
					return 2;

				}	else if(b1.getText() == "" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "" && b5.getText()=="X" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "" && b9.getText() == "0")
				{
					return 0;

				}

				//android ne chala b5 and user  ne anywhere then android konsa chalega
				//even buttons
				//2
				else if(b1.getText() == "" && b2.getText() == "0" && b3.getText() == "" && b4.getText() == "0" && b5.getText()=="X" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "X" && b9.getText() == "")
				{
					return 6;
				}
				else if(b1.getText() == "" && b2.getText() == "0" && b3.getText() == "" && b4.getText() == "" && b5.getText()=="X" && b6.getText() == "0" && b7.getText() == "" && b8.getText() == "X" && b9.getText() == "")
				{
					return 8;
				}

			    //4
				else if(b1.getText() == "" && b2.getText() == "0" && b3.getText() == "" && b4.getText() == "0" && b5.getText()=="X" && b6.getText() == "X" && b7.getText() == "" && b8.getText() == "" && b9.getText() == "")
				{
					return 2;
				}
				else if(b1.getText() == "" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "0" && b5.getText()=="X" && b6.getText() == "X" && b7.getText() == "" && b8.getText() == "0" && b9.getText() == "")
				{
					return 8;
				}
				//6
				else if(b1.getText() == "" && b2.getText() == "0" && b3.getText() == "" && b4.getText() == "X" && b5.getText()=="X" && b6.getText() == "0" && b7.getText() == "" && b8.getText() == "" && b9.getText() == "")
				{
					return 0;
				}
				else if(b1.getText() == "" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "X" && b5.getText()=="X" && b6.getText() == "0" && b7.getText() == "" && b8.getText() == "0" && b9.getText() == "")
				{
					return 6;
				}

				//8
				else if(b1.getText() == "" && b2.getText() == "X" && b3.getText() == "" && b4.getText() == "0" && b5.getText()=="X" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "0" && b9.getText() == "")
				{
					return 0;
				}
				else if(b1.getText() == "" && b2.getText() == "X" && b3.getText() == "" && b4.getText() == "" && b5.getText()=="X" && b6.getText() == "0" && b7.getText() == "" && b8.getText() == "0" && b9.getText() == "")
				{
					return 2;
				}


				// odd buttons
				else
			   //1 buuton-->0
                 //
				if(b1.getText() == "0" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "" && b5.getText()=="X" && b6.getText() == "0" && b7.getText() == "" && b8.getText() == "" && b9.getText() == "X")
				{
					return 6;
				}
				//
				if(b1.getText() == "0" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "" && b5.getText()=="X" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "0" && b9.getText() == "X")
				{
					return 2;
				}
				//3
				else if(b1.getText() == "" && b2.getText() == "" && b3.getText() == "0" && b4.getText() == "0" && b5.getText()=="X" && b6.getText() == "" && b7.getText() == "X" && b8.getText() == "" && b9.getText() == "")
				{
					return 8;

				}
				else if(b1.getText() == "" && b2.getText() == "" && b3.getText() == "0" && b4.getText() == "" && b5.getText()=="X" && b6.getText() == "" && b7.getText() == "X" && b8.getText() == "0" && b9.getText() == "")
				{
					return 0;
				}

				//7
				else if(b1.getText() == "" && b2.getText() == "" && b3.getText() == "X" && b4.getText() == "" && b5.getText()=="X" && b6.getText() == "0" && b7.getText() == "0" && b8.getText() == "" && b9.getText() == "")
				{
					return 0;

				}
				else if(b1.getText() == "" && b2.getText() == "0" && b3.getText() == "X" && b4.getText() == "" && b5.getText()=="X" && b6.getText() == "" && b7.getText() == "0" && b8.getText() == "" && b9.getText() == "")
				{
					return 8;

				}
				//9
				else if(b1.getText() == "X" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "0" && b5.getText()=="X" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "" && b9.getText() == "0")
				{
					return 2;

				}
				else if(b1.getText() == "X" && b2.getText() == "0" && b3.getText() == "" && b4.getText() == "" && b5.getText()=="X" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "" && b9.getText() == "0")
				{
					return 6;
				}

                //agr user pehle chalta hai toh
				//he has 3 options as stated below:-
				//5 button
				//odd buttons 1,3,7,9
				//even button 2,4,6,8


				//user presses either odd button or even button but not 5 button
				// except 5 user presses any button , android will press 5 button
				      else if (b1.getText() == "0" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "" && b5.getText() == "" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "" && b9.getText() == "") {
						return 4;
					} else if (b1.getText() == "" && b2.getText() == "0" && b3.getText() == "" && b4.getText() == "" && b5.getText() == "" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "" && b9.getText() == "") {
						return 4;
					} else if (b1.getText() == "" && b2.getText() == "" && b3.getText() == "0" && b4.getText() == "" && b5.getText() == "" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "" && b9.getText() == "") {
						return 4;
					} else if (b1.getText() == "" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "0" && b5.getText() == "" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "" && b9.getText() == "") {
						return 4;
					} else if (b1.getText() == "" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "" && b5.getText() == "" && b6.getText() == "0" && b7.getText() == "" && b8.getText() == "" && b9.getText() == "") {
						return 4;
					} else if (b1.getText() == "" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "" && b5.getText() == "" && b6.getText() == "" && b7.getText() == "0" && b8.getText() == "" && b9.getText() == "") {
						return 4;
					} else if (b1.getText() == "" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "" && b5.getText() == "" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "0" && b9.getText() == "") {
						return 4;
					} else if (b1.getText() == "" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "" && b5.getText() == "" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "" && b9.getText() == "0") {
						return 4;
					}

				//user ne chala buton 5 then android chalega either 1 or 3 or 7 or 9 button but not even button to avoid situation stated below:-
				//eliminating this type of situation
				//when user use b5 button  and android use even button like 2,4,6,8
				//    0|X|
				//    0|0|
				//     | |X
				else if(b5.getText()=="0" && b1.getText()=="" && b2.getText()=="" && b3.getText()=="" && b4.getText()=="" && b6.getText()=="" && b7.getText()=="" && b8.getText()=="" && b9.getText()=="")
				{
					while(true){
						int rand = new Random().nextInt(a.length / 2);
						if(rand == 0 || rand == 2 || rand == 6 || rand == 8)
						{
							return rand;
						}
					}
				}

				 // 5 Button is pressed
				 //      X| |
				 //       |0|0              eliminating this type of situation
				 //       | |0
				   else if (b5.getText() == "0" && b9.getText() == "0" && b1.getText() == "X" && b2.getText()=="" && b3.getText()=="" && b4.getText()=="" && b6.getText()=="" && b7.getText()=="" && b8.getText()=="")
				 {
					 return 6;
				 } else if (b5.getText() == "0" && b7.getText() == "0" && b3.getText() == "X" && b2.getText()=="" && b1.getText()=="" && b4.getText()=="" && b6.getText()=="" && b9.getText()=="" && b8.getText()=="")
				 {
					 return 8;
				 } else if (b5.getText() == "0" && b3.getText() == "0" && b7.getText() == "X" && b2.getText()=="" && b1.getText()=="" && b4.getText()=="" && b6.getText()=="" && b8.getText()=="" && b9.getText()=="")
				 {
					 return 0;
				 }
				   else if (b5.getText() == "0" && b1.getText() == "0" && b9.getText() == "X" && b2.getText()=="" && b3.getText()=="" && b4.getText() =="" && b6.getText() =="" && b7.getText() == "" && b8.getText() == "")
				 {
					 return 2;
				 }

				// 0|  |          eliminating this type of situation
				//  |X |
				// 0|  |0
				else if (b1.getText() == "0" && b5.getText() == "X" && b9.getText() == "0" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "" && b6.getText() == "" && b7.getText() == "" && b8.getText() == "" )
				{
					return 7;

				} else if (b1.getText() == "" && b2.getText() == "" && b4.getText() == "" && b3.getText() == "0" && b5.getText() == "X" && b7.getText() == "0" && b6.getText() == "" && b8.getText() == "" && b9.getText() == "" )
				{
					return 7;
				}
				//    0| |
				//     |X|
				//    0|0|
				//1
				else if (b1.getText() == "0" && b5.getText() == "X" && b8.getText() == "0" && b2.getText() == "" && b3.getText() == "" && b4.getText() == "" && b6.getText() == "" && b7.getText() == "" && b9.getText() == ""  )
				{
					return 8;
				}
				else if(b1.getText() == "0" && b5.getText() == "X" && b6.getText() == "0" && b2.getText()=="" && b3.getText()=="" && b4.getText()=="" && b7.getText()=="" && b8.getText()=="" && b9.getText()=="")
				{
					return 8;
				}
				//3
				else if (b3.getText() == "0" && b5.getText() == "X" && b8.getText() == "0" && b1.getText()=="" && b2.getText()=="" && b4.getText()=="" && b6.getText()=="" && b7.getText()=="" && b9.getText()=="")
				{
					return 6;
				}
				else if (b3.getText() == "0" && b5.getText() == "X" && b4.getText() == "0" && b1.getText()=="" && b2.getText()=="" && b8.getText()=="" && b6.getText()=="" && b7.getText()=="" && b9.getText()=="")
				{
					return 6;
				}
				//7
				else if(b6.getText() == "0" && b5.getText() == "X" && b7.getText() == "0" && b4.getText()=="" && b1.getText()==""&& b2.getText()=="" && b3.getText()=="" && b8.getText()=="" && b9.getText()=="")
				{
					return 2;
				}
				else if(b1.getText()=="" && b6.getText()=="" && b2.getText()=="0" && b3.getText()=="" && b4.getText() == "" && b5.getText() == "X" && b9.getText() == "" && b7.getText()=="0" && b8.getText()=="")
				{
					return 2;
				}
				//9
				else if( b1.getText()=="" && b2.getText()=="0" && b3.getText() == "" && b5.getText() == "X" && b4.getText() == "" && b6.getText()=="" && b7.getText()==""&& b8.getText()=="" && b9.getText()=="0")
				{
					return 0;
				}
				else if( b1.getText()=="" && b2.getText() == "" && b3.getText()=="" && b8.getText()=="" && b9.getText()=="0" && b4.getText()=="0" && b6.getText()==""  && b5.getText() == "X" && b7.getText() == "")
				{
					return 3;
				}

//////////////////////////////////
				 // eliminating this type of situation
				 //  |0|
				//  0|X|
				//   | |
				//2
				else if(b1.getText()=="" && b2.getText()=="0" && b3.getText()=="" && b4.getText()=="0" && b5.getText()=="X" && b6.getText()=="" && b7.getText()=="" && b8.getText()=="" && b9.getText()=="")
				{
					return 0;
				}
				else if(b1.getText()=="" && b2.getText()=="0" && b3.getText()=="" && b4.getText()=="" && b5.getText()=="X" && b6.getText()=="0" && b7.getText()=="" && b8.getText()=="" && b9.getText()=="")
				{
					return 2;
				}
				else if(b1.getText()=="" && b2.getText()=="0" && b3.getText()=="" && b4.getText()=="" && b5.getText()=="X" && b6.getText()=="" && b7.getText()=="0" && b8.getText()=="" && b9.getText()=="")
				{
					return 0;
				}
				else if(b1.getText()=="" && b2.getText()=="0" && b3.getText()=="" && b4.getText()=="" && b5.getText()=="X" && b6.getText()=="" && b7.getText()=="" && b8.getText()=="" && b9.getText()=="0")
				{
					return 2;
				}
               //4
				else if(b1.getText()=="" && b2.getText()=="" && b3.getText()=="" && b4.getText()=="0" && b5.getText()=="X" && b6.getText()=="" && b7.getText()=="" && b8.getText()=="0" && b9.getText()=="")
				{
					return 6;
				}
				else if(b1.getText()=="" && b2.getText()=="" && b3.getText()=="" && b4.getText()=="0" && b5.getText()=="X" && b6.getText()=="" && b7.getText()=="" && b8.getText()=="" && b9.getText()=="0")
				{
					return 6;
				}
				else if(b1.getText()=="" && b2.getText()=="" && b3.getText()=="0" && b4.getText()=="0" && b5.getText()=="X" && b6.getText()=="" && b7.getText()=="" && b8.getText()=="" && b9.getText()=="")
				{
					return 0;
				}
				//6
				else if(b1.getText()=="" && b2.getText()=="" && b3.getText()=="" && b4.getText()=="" && b5.getText()=="X" && b6.getText()=="0" && b7.getText()=="" && b8.getText()=="0" && b9.getText()=="")
				{
					return 8;
				}
				else if(b1.getText()=="0" && b2.getText()=="" && b3.getText()=="" && b4.getText()=="" && b5.getText()=="X" && b6.getText()=="0" && b7.getText()=="" && b8.getText()=="" && b9.getText()=="")
				{
					return 2;
				}
				else if(b1.getText()=="" && b2.getText()=="" && b3.getText()=="" && b4.getText()=="" && b5.getText()=="X" && b6.getText()=="0" && b7.getText()=="0" && b8.getText()=="" && b9.getText()=="")
				{
					return 8;
				}
				//8 user having button 8 ,android 5 ,user turn now,android kya chalega is stated

				else if(b1.getText()=="0" && b2.getText()=="" && b3.getText()=="" && b4.getText()=="" && b5.getText()=="X" && b6.getText()=="" && b7.getText()=="" && b8.getText()=="0" && b9.getText()=="")
				{
					return 6;
				}
				else if(b1.getText()=="" && b2.getText()=="" && b3.getText()=="0" && b4.getText()=="" && b5.getText()=="X" && b6.getText()=="" && b7.getText()=="" && b8.getText()=="0" && b9.getText()=="")
				{
					return 8;
				}



				// koi bhi X ban toh nahi rha
				  else if ((b1.getText() == "X") && (b2.getText() == "X") && (b3.getText() == "")) {
					return 2;
				} else if ((b1.getText() == "X") && (b5.getText() == "X") && (b9.getText() == "")) {
					return 8;
				} else if ((b1.getText() == "X") && (b4.getText() == "X") && (b7.getText() == "")) {
					return 6;
				} else if ((b1.getText() == "X") && (b3.getText() == "X") && (b2.getText() == "")) {
					return 1;
				} else if ((b1.getText() == "X") && (b9.getText() == "X") && (b5.getText() == "")) {
					return 4;
				} else if ((b1.getText() == "X") && (b7.getText() == "X") && (b4.getText() == "")) {
					return 3;
				}
//2
				else if ((b3.getText() == "X") && (b2.getText() == "X") && (b1.getText() == "")) {
					return 0;
				} else if ((b2.getText() == "X") && (b5.getText() == "X") && (b8.getText() == "")) {
					return 7;
				} else if ((b2.getText() == "X") && (b8.getText() == "X") && (b5.getText() == "")) {
					return 4;
				}
//3
				else if ((b3.getText() == "X") && (b6.getText() == "X") && (b9.getText() == "")) {
					return 8;
				} else if ((b3.getText() == "X") && (b9.getText() == "X") && (b6.getText() == "")) {
					return 5;
				} else if ((b3.getText() == "X") && (b5.getText() == "X") && (b7.getText() == "")) {
					return 6;
				} else if ((b3.getText() == "X") && (b7.getText() == "X") && (b5.getText() == "")) {
					return 4;
				}
				//4
				else if ((b4.getText() == "X") && (b1.getText() == "X") && (b7.getText() == "")) {
					return 6;
				} else if ((b4.getText() == "X") && (b7.getText() == "X") && (b1.getText() == "")) {
					return 0;
				} else if ((b4.getText() == "X") && (b5.getText() == "X") && (b6.getText() == "")) {
					return 5;
				} else if ((b4.getText() == "X") && (b6.getText() == "X") && (b5.getText() == "")) {
					return 4;
				}
				//5
				else if ((b5.getText() == "X") && (b6.getText() == "X") && (b4.getText() == "")) {
					return 3;
				} else if ((b5.getText() == "X") && (b8.getText() == "X") && (b2.getText() == "")) {
					return 1;
				} else if ((b9.getText() == "X") && (b5.getText() == "X") && (b1.getText() == "")) {
					return 0;
				} else if ((b5.getText() == "X") && (b7.getText() == "X") && (b3.getText() == "")) {
					return 2;
				}
				//6
				else if ((b6.getText() == "X") && (b9.getText() == "X") && (b3.getText() == "")) {
					return 2;
				}
				//7
				else if ((b7.getText() == "X") && (b8.getText() == "X") && (b9.getText() == "")) {
					return 8;
				} else if ((b7.getText() == "X") && (b9.getText() == "X") && (b8.getText() == "")) {
					return 7;
				}
				//8
				else if ((b8.getText() == "X") && (b9.getText() == "X") && (b7.getText() == "")) {
					return 6;
				}
//koi 0 ban rha toh use rokooo
				  else if ((b1.getText() == "0") && (b2.getText() == "0") && (b3.getText() == "")) {
					return 2;
				} else if ((b1.getText() == "0") && (b5.getText() == "0") && (b9.getText() == "")) {
					return 8;
				} else if ((b1.getText() == "0") && (b4.getText() == "0") && (b7.getText() == "")) {
					return 6;
				} else if ((b1.getText() == "0") && (b3.getText() == "0") && (b2.getText() == "")) {
					return 1;
				} else if ((b1.getText() == "0") && (b9.getText() == "0") && (b5.getText() == "")) {
					return 4;
				} else if ((b1.getText() == "0") && (b7.getText() == "0") && (b4.getText() == "")) {
					return 3;
				}
//2
				  else if ((b3.getText() == "0") && (b2.getText() == "0") && (b1.getText() == "")) {
					return 0;
				} else if ((b2.getText() == "0") && (b5.getText() == "0") && (b8.getText() == "")) {
					return 7;
				} else if ((b2.getText() == "0") && (b8.getText() == "0") && (b5.getText() == "")) {
					return 4;
				}
//3
				  else if ((b3.getText() == "0") && (b6.getText() == "0") && (b9.getText() == "")) {
					return 8;
				} else if ((b3.getText() == "0") && (b9.getText() == "0") && (b6.getText() == "")) {
					return 5;
				} else if ((b3.getText() == "0") && (b5.getText() == "0") && (b7.getText() == "")) {
					return 6;
				} else if ((b3.getText() == "0") && (b7.getText() == "0") && (b5.getText() == "")) {
					return 4;
				}
				//4
				  else if ((b4.getText() == "0") && (b1.getText() == "0") && (b7.getText() == "")) {
					return 6;
				} else if ((b4.getText() == "0") && (b7.getText() == "0") && (b1.getText() == "")) {
					return 0;
				} else if ((b4.getText() == "0") && (b5.getText() == "0") && (b6.getText() == "")) {
					return 5;
				} else if ((b4.getText() == "0") && (b6.getText() == "0") && (b5.getText() == "")) {
					return 4;
				}
				//5
				  else if ((b5.getText() == "0") && (b6.getText() == "0") && (b4.getText() == "")) {
					return 3;
				} else if ((b5.getText() == "0") && (b8.getText() == "0") && (b2.getText() == "")) {
					return 1;
				} else if ((b9.getText() == "0") && (b5.getText() == "0") && (b1.getText() == "")) {
					return 0;
				} else if ((b5.getText() == "0") && (b7.getText() == "0") && (b3.getText() == "")) {
					return 2;
				}
				//6
				  else if ((b6.getText() == "0") && (b9.getText() == "0") && (b3.getText() == "")) {
					return 2;
				}
				//7
				  else if ((b7.getText() == "0") && (b8.getText() == "0") && (b9.getText() == "")) {
					return 8;
				} else if ((b7.getText() == "0") && (b9.getText() == "0") && (b8.getText() == "")) {
					return 7;
				}
				//8
				else if ((b8.getText() == "0") && (b9.getText() == "0") && (b7.getText() == "")) {
					return 6;
				}
              if (a[rnd] == 0)
					 return rnd;
			}
		}
		else
			return 10;

		}


	//to check who is a winner
	private void fun() {

		String s;
		if (b1.getText()=="0" && b2.getText()=="0" && b3.getText()=="0") {

			Toasty.success(getApplicationContext(), "You Win", Toast.LENGTH_SHORT, true).show();


			b1.setBackgroundColor(Color.rgb(255,255,224));
			b2.setBackgroundColor(Color.rgb(255,255,224));
			b3.setBackgroundColor(Color.rgb(255,255,224));


			b1.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b5.setEnabled(false);
			b3.setEnabled(false);
			b2.setEnabled(false);
			b4.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);


			s=String.valueOf(e1.getText());
			int n=0;
			n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e1.setText(s);

			c=false;

		} else if ((b4.getText()=="0" && b5.getText()=="0" && b6.getText()=="0") ) {

			Toasty.success(getApplicationContext(), "You Win", Toast.LENGTH_SHORT, true).show();

			b4.setBackgroundColor(Color.rgb(255,255,224));
			b5.setBackgroundColor(Color.rgb(255,255,224));
			b6.setBackgroundColor(Color.rgb(255,255,224));


			b1.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b5.setEnabled(false);
			b3.setEnabled(false);
			b2.setEnabled(false);
			b4.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);

			s=String.valueOf(e1.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e1.setText(s);

			c=false;


		} else if (b7.getText()=="0" && b8.getText()=="0" && b9.getText()=="0")  {

			Toasty.success(getApplicationContext(), "You Win", Toast.LENGTH_SHORT, true).show();

			b1.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b5.setEnabled(false);
			b3.setEnabled(false);
			b2.setEnabled(false);
			b4.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);
			b7.setBackgroundColor(Color.rgb(255,255,224));
			b8.setBackgroundColor(Color.rgb(255,255,224));
			b9.setBackgroundColor(Color.rgb(255,255,224));

			s=String.valueOf(e1.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e1.setText(s);

			c=false;


		} else if (b1.getText()=="0" && b4.getText()=="0" && b7.getText()=="0")  {

			Toasty.success(getApplicationContext(), "You Win", Toast.LENGTH_SHORT, true).show();

			b7.setBackgroundColor(Color.rgb(255,255,224));
			b1.setBackgroundColor(Color.rgb(255,255,224));
			b4.setBackgroundColor(Color.rgb(255,255,224));

			b1.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b5.setEnabled(false);
			b3.setEnabled(false);
			b2.setEnabled(false);
			b4.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);

			s=String.valueOf(e1.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e1.setText(s);

			c=false;

		} else if ((b5.getText()=="0" && b2.getText()=="0" && b8.getText()=="0") ) {

			Toasty.success(getApplicationContext(), "You Win", Toast.LENGTH_SHORT, true).show();

			b2.setBackgroundColor(Color.rgb(255,255,224));
			b5.setBackgroundColor(Color.rgb(255,255,224));
			b8.setBackgroundColor(Color.rgb(255,255,224));

			b1.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b5.setEnabled(false);
			b3.setEnabled(false);
			b2.setEnabled(false);
			b4.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);

			s=String.valueOf(e1.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e1.setText(s);

			c=false;

		} else if (b3.getText()=="0" && b6.getText()=="0" && b9.getText()=="0")  {

			Toasty.success(getApplicationContext(), "You Win", Toast.LENGTH_SHORT, true).show();

			b3.setBackgroundColor(Color.rgb(255,255,224));
			b6.setBackgroundColor(Color.rgb(255,255,224));
			b9.setBackgroundColor(Color.rgb(255,255,224));
			b1.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b5.setEnabled(false);
			b3.setEnabled(false);
			b2.setEnabled(false);
			b4.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);

			s=String.valueOf(e1.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e1.setText(s);

			c=false;

		} else if (b1.getText()=="0" && b5.getText()=="0" && b9.getText()=="0")  {


			Toasty.success(getApplicationContext(), "You Win", Toast.LENGTH_SHORT, true).show();

			b1.setBackgroundColor(Color.rgb(255,255,224));
			b5.setBackgroundColor(Color.rgb(255,255,224));
			b9.setBackgroundColor(Color.rgb(255,255,224));

			b1.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b5.setEnabled(false);
			b3.setEnabled(false);
			b2.setEnabled(false);
			b4.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);

			s=String.valueOf(e1.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e1.setText(s);

			c=false;

		} else if (b7.getText()=="0" && b5.getText()=="0" && b3.getText()=="0")  {

			Toasty.success(getApplicationContext(), "You Win", Toast.LENGTH_SHORT, true).show();

			b7.setBackgroundColor(Color.rgb(255,255,224));
			b3.setBackgroundColor(Color.rgb(255,255,224));
			b5.setBackgroundColor(Color.rgb(255,255,224));


			b1.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b5.setEnabled(false);
			b3.setEnabled(false);
			b2.setEnabled(false);
			b4.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);


			s=String.valueOf(e1.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e1.setText(s);

			c=false;

		}

		if  (b1.getText()=="X" && b2.getText()=="X" && b3.getText()=="X") {

			Toasty.success(getApplicationContext(), "Android Win", Toast.LENGTH_SHORT, true).show();


			b1.setBackgroundColor(Color.rgb(255,255,224));
			b2.setBackgroundColor(Color.rgb(255,255,224));
			b3.setBackgroundColor(Color.rgb(255,255,224));

			b1.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b5.setEnabled(false);
			b3.setEnabled(false);
			b2.setEnabled(false);
			b4.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);

			s=String.valueOf(e2.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e2.setText(s);

			c=false;

		} else if ( (b4.getText()=="X" && b5.getText()=="X" && b6.getText()=="X")) {


			Toasty.success(getApplicationContext(), "Android Win", Toast.LENGTH_SHORT, true).show();

			b4.setBackgroundColor(Color.rgb(255,255,224));
			b5.setBackgroundColor(Color.rgb(255,255,224));
			b6.setBackgroundColor(Color.rgb(255,255,224));

			b1.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b5.setEnabled(false);
			b3.setEnabled(false);
			b2.setEnabled(false);
			b4.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);

			s=String.valueOf(e2.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e2.setText(s);

			c=false;

		} else if  (b7.getText()=="X" && b8.getText()=="X" && b9.getText()=="X") {


			Toasty.success(getApplicationContext(), "Android Win", Toast.LENGTH_SHORT, true).show();

			b7.setBackgroundColor(Color.rgb(255,255,224));
			b8.setBackgroundColor(Color.rgb(255,255,224));
			b9.setBackgroundColor(Color.rgb(255,255,224));

			b1.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b5.setEnabled(false);
			b3.setEnabled(false);
			b2.setEnabled(false);
			b4.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);

			s=String.valueOf(e2.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e2.setText(s);

			c=false;

		} else if  (b1.getText()=="X" && b4.getText()=="X" && b7.getText()=="X") {


			Toasty.success(getApplicationContext(), "Android Win", Toast.LENGTH_SHORT, true).show();

			b7.setBackgroundColor(Color.rgb(255,255,224));
			b1.setBackgroundColor(Color.rgb(255,255,224));
			b4.setBackgroundColor(Color.rgb(255,255,224));

			b1.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b5.setEnabled(false);
			b3.setEnabled(false);
			b2.setEnabled(false);
			b4.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);

			s=String.valueOf(e2.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e2.setText(s);

			c=false;

		} else if  (b5.getText()=="X" && b2.getText()=="X" && b8.getText()=="X") {

			Toasty.success(getApplicationContext(), "Android Win", Toast.LENGTH_SHORT, true).show();

			b2.setBackgroundColor(Color.rgb(255,255,224));
			b5.setBackgroundColor(Color.rgb(255,255,224));
			b8.setBackgroundColor(Color.rgb(255,255,224));

			b1.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b5.setEnabled(false);
			b3.setEnabled(false);
			b2.setEnabled(false);
			b4.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);

			s=String.valueOf(e2.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e2.setText(s);


			c=false;

		} else if  (b9.getText()=="X" && b6.getText()=="X" && b3.getText()=="X") {


			Toasty.success(getApplicationContext(), "Android Win", Toast.LENGTH_SHORT, true).show();

			b3.setBackgroundColor(Color.rgb(255,255,224));
			b6.setBackgroundColor(Color.rgb(255,255,224));
			b9.setBackgroundColor(Color.rgb(255,255,224));

			b1.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b5.setEnabled(false);
			b3.setEnabled(false);
			b2.setEnabled(false);
			b4.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);

			s=String.valueOf(e2.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e2.setText(s);

			c=false;

		} else if  (b1.getText()=="X" && b5.getText()=="X" && b9.getText()=="X") {


			Toasty.success(getApplicationContext(), "Android Win", Toast.LENGTH_SHORT, true).show();

			b1.setBackgroundColor(Color.rgb(255,255,224));
			b5.setBackgroundColor(Color.rgb(255,255,224));
			b9.setBackgroundColor(Color.rgb(255,255,224));

			b1.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b5.setEnabled(false);
			b3.setEnabled(false);
			b2.setEnabled(false);
			b4.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);

			s=String.valueOf(e2.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e2.setText(s);

			c=false;

		} else if  (b5.getText()=="X" && b7.getText()=="X" && b3.getText()=="X") {


			Toasty.success(getApplicationContext(), "Android Win", Toast.LENGTH_SHORT, true).show();

			b7.setBackgroundColor(Color.rgb(255,255,224));
			b3.setBackgroundColor(Color.rgb(255,255,224));
			b5.setBackgroundColor(Color.rgb(255,255,224));

			b1.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b5.setEnabled(false);
			b3.setEnabled(false);
			b2.setEnabled(false);
			b4.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);


			s=String.valueOf(e2.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e2.setText(s);

			c=false;

		}
		if((c.equals(true))&&(b1.getText()=="0"  || b1.getText()=="X")&&(b2.getText()=="0"  || b2.getText()=="X")&&(b3.getText()=="0" || b3.getText()=="X")&&(b4.getText()=="0" || b4.getText()=="X")&&(b5.getText()=="0" || b5.getText()=="X")&&(b6.getText()=="0" || b6.getText()=="X")&&(b7.getText()=="0" || b7.getText()=="X")&&(b8.getText()=="0"  || b8.getText()=="X")&&(b9.getText()=="0"|| b9.getText()=="X"))
		{

			Toasty.success(getApplicationContext(), "This is a Draw", Toast.LENGTH_SHORT, true).show();
			s=String.valueOf(e3.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e3.setText(s);
		}

	}
	//android chance
	public void androidfun() {

		int i = getRandom(a);
	//	e3.setText(String.valueOf(i));
		if(c==false)
		{

		}
		else {


			switch (i) {

				case 0: {
					b1.setText("X");
					b1.setEnabled(false);
					a[0] = 1;
					fun();
					b = true;
					break;
				}
				case 1: {

					b2.setText("X");
					b2.setEnabled(false);
					a[1] = 1;
					fun();
					b = true;
					break;

				}
				case 2: {
					b3.setText("X");
					b3.setEnabled(false);
					a[2] = 1;
					fun();
					b = true;
					break;
				}
				case 3: {
					b4.setText("X");
					b4.setEnabled(false);
					a[3] = 1;
					fun();
					b = true;
					break;
				}
				case 4: {
					b5.setText("X");
					b5.setEnabled(false);
					a[4] = 1;
					fun();
					b = true;
					break;
				}

				case 5: {
					b6.setText("X");
					b6.setEnabled(false);
					a[5] = 1;
					fun();
					b = true;
					break;
				}

				case 6: {
					b7.setText("X");
					b7.setEnabled(false);
					a[6] = 1;
					fun();
					b = true;
					break;
				}

				case 7: {
					b8.setText("X");
					b8.setEnabled(false);
					a[7] = 1;
					fun();
					b = true;
					break;
				}
				case 8: {
					b9.setText("X");
					b9.setEnabled(false);
					a[8] = 1;
					fun();
					b = true;
					break;
				}
				default:
				{

					return;
				}

			}
		}
	}

}






