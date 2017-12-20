package com.example.android.englishfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView ( R.layout.activity_main );

        // Find the View that shows the numbers category
        TextView firstunittextview = (TextView) findViewById ( R.id.Firstunit );

        // Set a click listener on that View
        firstunittextview.setOnClickListener ( new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent firstunitintent= new Intent ( MainActivity.this, Firstunit.class );

                // Start the new activity
                startActivity ( firstunitintent);
            }
        } );

        // Find the View that shows the family category
        TextView secondunittextview = (TextView) findViewById ( R.id.Secondunit );

        // Set a click listener on that View
        secondunittextview.setOnClickListener ( new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent secondunitintent = new Intent ( MainActivity.this, Secondunit.class );

                // Start the new activity
                startActivity ( secondunitintent );
            }
        } );

        // Find the View that shows the colors category
        TextView thirdunittextview = (TextView) findViewById ( R.id.Thirdunit );

        // Set a click listener on that View
        thirdunittextview.setOnClickListener ( new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent thirdunitintent = new Intent ( MainActivity.this, Thirdunit.class );

                // Start the new activity
                startActivity ( thirdunitintent );
            }
        } );

        // Find the View that shows the phrases category
        TextView phrases = (TextView) findViewById ( R.id.Fourthunit);

        // Set a click listener on that View
        phrases.setOnClickListener ( new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent fourthunitIntent= new Intent ( MainActivity.this, Fourthunit.class );

                // Start the new activity
                startActivity ( fourthunitIntent );
            }
        } );

        // Find the View that shows the phrases category
        TextView aa = (TextView) findViewById ( R.id.Fiftunit);

        // Set a click listener on that View
        aa.setOnClickListener ( new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent fifthunitIntent= new Intent ( MainActivity.this, Fifthunit.class );

                // Start the new activity
                startActivity ( fifthunitIntent );
            }
        } );
        // Find the View that shows the phrases category
        TextView ab = (TextView) findViewById ( R.id.Sixthunit);

        // Set a click listener on that View
        ab.setOnClickListener ( new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent SififthunitIntent= new Intent ( MainActivity.this, Sixthunit.class );

                // Start the new activity
                startActivity ( SififthunitIntent );
            }
        } );
        TextView contact = (TextView) findViewById ( R.id.contactus);

        // Set a click listener on that View
        contact.setOnClickListener ( new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent ContactIntent= new Intent ( MainActivity.this, ContactUs.class );

                // Start the new activity
                startActivity ( ContactIntent );
            }
        } );
    }
}