package com.example.shivam.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;
import java.lang.String;

import es.dmoral.toasty.Toasty;

import static android.R.attr.background;
import static android.R.attr.colorAccent;
import static android.R.attr.colorPrimary;
import static android.R.attr.colorPrimaryDark;
import static android.R.attr.duration;
import static android.R.attr.icon;
import static android.R.attr.typeface;
import static com.example.shivam.tictactoe.R.drawable.background1;
import static com.example.shivam.tictactoe.R.drawable.background2;
import static com.example.shivam.tictactoe.R.drawable.background3;
import static com.example.shivam.tictactoe.R.drawable.colorbutton;
import static com.example.shivam.tictactoe.R.drawable.download;
import static com.example.shivam.tictactoe.R.drawable.images;
import static com.example.shivam.tictactoe.R.drawable.images1;

public class Part2 extends AppCompatActivity {

	Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    EditText e2,e3,e4;


	Integer[] a;
	Boolean b = true,c=true;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_part2);

		e2=(EditText)findViewById(R.id.stats);
		e2.setText("0");

		e3=(EditText)findViewById(R.id.edittext2);
		e3.setText("0");

		e4=(EditText)findViewById(R.id.edittext3);
		e4.setText("0");


		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		a = new Integer[18];
		Arrays.fill(a, 0);
		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b3 = (Button) findViewById(R.id.button3);
		b4 = (Button) findViewById(R.id.button4);
		b5 = (Button) findViewById(R.id.button5);
		b6 = (Button) findViewById(R.id.button6);
		b7 = (Button) findViewById(R.id.button7);
		b8 = (Button) findViewById(R.id.button8);
		b9 = (Button) findViewById(R.id.button9);

		final EditText e1=(EditText)findViewById(R.id.edittextturn);


		b1.setOnClickListener(new View.OnClickListener() {
								  @Override
								  public void onClick(View view) {
									  if (b == true) {
										  b1.setText("0");
										  b = false;
										  b1.setEnabled(false);
										  a[0] = 1;
										  fun();

										  e1.setText("X");


									  } else {
										  b1.setText("X");
										  b = true;
										  b1.setEnabled(false);
										  a[9] = 1;
										  fun();

										  e1.setText("0");
									  }
								  }
		}
		);


		b2.setOnClickListener(new View.OnClickListener() {
								  @Override
								  public void onClick(View view) {
									  if (b == true) {
										  b2.setText("0");
										  b = false;
										  b2.setEnabled(false);
										  a[1] = 1;
										  fun();
										  e1.setText("X");


									  } else {
										  b2.setText("X");
										  b = true;
										  b2.setEnabled(false);
										  a[10] = 1;
										  fun();
										  e1.setText("0");
									  }
								  }


							  }


		);

		b3.setOnClickListener(new View.OnClickListener() {
								  @Override
								  public void onClick(View view) {
									  if (b == true) {
										  b3.setText("0");
										  b = false;
										  b3.setEnabled(false);
										  a[2] = 1;
										  fun();
										  e1.setText("X");

									  } else {
										  b3.setText("X");
										  b = true;
										  b3.setEnabled(false);
										  a[11] = 1;
										  fun();
										  e1.setText("0");
									  }
								  }


							  }


		);

		b4.setOnClickListener(new View.OnClickListener() {
								  @Override
								  public void onClick(View view) {
									  if (b == true) {
										  b4.setText("0");
										  b = false;
										  b4.setEnabled(false);
										  a[3] = 1;
										  fun();
										  e1.setText("X");

									  } else {
										  b4.setText("X");
										  b = true;
										  b4.setEnabled(false);
										  a[12] = 1;
										  fun();
										  e1.setText("0");
									  }
								  }


							  }


		);

		b5.setOnClickListener(new View.OnClickListener() {
								  @Override
								  public void onClick(View view) {
									  if (b == true) {
										  b5.setText("0");
										  b = false;
										  b5.setEnabled(false);
										  a[4] = 1;
										  fun();
										  e1.setText("X");

									  } else {
										  b5.setText("X");
										  b = true;
										  b5.setEnabled(false);
										  a[13] = 1;
										  fun();
										  e1.setText("0");
									  }

								  }


							  }


		);

		b6.setOnClickListener(new View.OnClickListener() {
								  @Override
								  public void onClick(View view) {
									  if (b == true) {
										  b6.setText("0");
										  b = false;
										  b6.setEnabled(false);
										  a[5] = 1;
										  fun();
										  e1.setText("X");

									  } else {
										  b6.setText("X");
										  b = true;
										  b6.setEnabled(false);
										  a[14] = 1;
										  fun();
										  e1.setText("0");
									  }
								  }


							  }


		);

		b7.setOnClickListener(new View.OnClickListener() {
								  @Override
								  public void onClick(View view) {
									  if (b == true) {
										  b7.setText("0");
										  b = false;
										  b7.setEnabled(false);
										  a[6] = 1;
										  fun();
										  e1.setText("x");

									  } else {
										  b7.setText("X");
										  b = true;
										  b7.setEnabled(false);
										  a[15] = 1;
										  fun();
										  e1.setText("0");
									  }
								  }


							  }


		);

		b8.setOnClickListener(new View.OnClickListener() {
								  @Override
								  public void onClick(View view) {
									  if (b == true) {
										  b8.setText("0");
										  b = false;
										  b8.setEnabled(false);
										  a[7] = 1;
										  fun();
										  e1.setText("X");

									  } else {
										  b8.setText("X");
										  b = true;
										  b8.setEnabled(false);
										  a[16] = 1;
										  fun();
										  e1.setText("0");
									  }
								  }


							  }


		);

		b9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if (b == true) {
					b9.setText("0");
					b = false;
					b9.setEnabled(false);
					a[8] = 1;
					fun();
					e1.setText("X");

				} else {
					b9.setText("X");
					b = true;
					b9.setEnabled(false);
					a[17] = 1;
					fun();
					e1.setText("0");
				}
			}
		});


		Button b10 = (Button) findViewById(R.id.playagain); //play again for reset
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

			}
		});


	}


	public void fun() {
		String s;
		if (a[0].equals(1) && a[1].equals(1) && a[2].equals(1)) {


			Toasty.success(getApplicationContext(), "Player 0 Win", Toast.LENGTH_SHORT, true).show();


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

		} else if (a[3].equals(1) && a[4].equals(1) && a[5].equals(1)) {

			Toasty.success(getApplicationContext(), "Player 0 Win", Toast.LENGTH_SHORT, true).show();

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


		} else if (a[6].equals(1) && a[7].equals(1) && a[8].equals(1)) {

			Toasty.success(getApplicationContext(), "Player 0 Win", Toast.LENGTH_SHORT, true).show();

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

			s=String.valueOf(e2.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e2.setText(s);

			c=false;


		} else if (a[0].equals(1) && a[3].equals(1) && a[6].equals(1)) {

			Toasty.success(getApplicationContext(), "Player 0 Win", Toast.LENGTH_SHORT, true).show();

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

		} else if (a[1].equals(1) && a[4].equals(1) && a[7].equals(1)) {

			Toasty.success(getApplicationContext(), "Player 0 Win", Toast.LENGTH_SHORT, true).show();

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

		} else if (a[2].equals(1) && a[5].equals(1) && a[8].equals(1)) {

			Toasty.success(getApplicationContext(), "Player 0 Win", Toast.LENGTH_SHORT, true).show();

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

		} else if (a[0].equals(1) && a[4].equals(1) && a[8].equals(1)) {


			Toasty.success(getApplicationContext(), "Player 0 Win", Toast.LENGTH_SHORT, true).show();

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

		} else if (a[2].equals(1) && a[4].equals(1) && a[6].equals(1)) {



			Toasty.success(getApplicationContext(), "Player 0 Win", Toast.LENGTH_SHORT, true).show();

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

	if (a[9] == 1 && a[10] == 1 && a[11] == 1) {


		Toasty.success(getApplicationContext(), "Player X Win", Toast.LENGTH_SHORT, true).show();


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

			s=String.valueOf(e3.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e3.setText(s);

		c=false;

		} else if (a[12] == 1 && a[13] == 1 && a[14] == 1) {



		Toasty.success(getApplicationContext(), "Player X Win", Toast.LENGTH_SHORT, true).show();

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

			s=String.valueOf(e3.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e3.setText(s);

		c=false;

	} else if (a[15] == 1 && a[16] == 1 && a[17] == 1) {



		Toasty.success(getApplicationContext(), "Player X Win", Toast.LENGTH_SHORT, true).show();

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

			s=String.valueOf(e3.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e3.setText(s);

		c=false;

	} else if (a[9] == 1 && a[12] == 1 && a[15] == 1) {



		Toasty.success(getApplicationContext(), "Player X Win", Toast.LENGTH_SHORT, true).show();

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

			s=String.valueOf(e3.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e3.setText(s);

		c=false;

	} else if (a[10] == 1 && a[13] == 1 && a[16] == 1) {



		Toasty.success(getApplicationContext(), "Player X Win", Toast.LENGTH_SHORT, true).show();

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

			s=String.valueOf(e3.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e3.setText(s);


		c=false;

		} else if (a[11] == 1 && a[14] == 1 && a[17] == 1) {


		Toasty.success(getApplicationContext(), "Player X Win", Toast.LENGTH_SHORT, true).show();

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

			s=String.valueOf(e3.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e3.setText(s);

		c=false;

		} else if (a[9] == 1 && a[13] == 1 && a[17] == 1) {


		Toasty.success(getApplicationContext(), "Player X Win", Toast.LENGTH_SHORT, true).show();

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

			s=String.valueOf(e3.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e3.setText(s);

		c=false;

	} else if (a[11] == 1 && a[13] == 1 && a[15] == 1) {


		Toasty.success(getApplicationContext(), "Player X Win", Toast.LENGTH_SHORT, true).show();

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


			s=String.valueOf(e3.getText());
			int n=Integer.valueOf(s);
			n+=1;
			s=String.valueOf(n);
			e3.setText(s);

		c=false;

	}
		 if((c.equals(true))&&(a[0]==1  || a[9]==1)&&(a[1]==1  || a[10]==1)&&(a[2]==1 || a[11]==1)&&(a[3]==1  || a[12]==1)&&(a[4]==1  || a[13]==1)&&(a[5]==1 || a[14]==1)&&(a[6]==1 || a[15]==1)&&(a[7]==1  || a[16]==1)&&(a[8]==1 || a[17]==1))
		 {

			 Toasty.success(getApplicationContext(), "This is a Draw", Toast.LENGTH_SHORT, true).show();
			 s=String.valueOf(e4.getText());
			 int n=Integer.valueOf(s);
			 n+=1;
			 s=String.valueOf(n);
			 e4.setText(s);
		}

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

}