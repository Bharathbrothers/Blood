package com.starks.blooddonation;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PostActivity extends AppCompatActivity {

    EditText editText1,editText2,editText3,editText4,editText5;
    Button submit;

    DatabaseReference db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        editText1 = (EditText) findViewById(R.id.btype);
        editText2 = (EditText) findViewById(R.id.hosp);
        editText3 = (EditText) findViewById(R.id.city);
        editText4 = (EditText) findViewById(R.id.desc);
        editText5 = (EditText) findViewById(R.id.contact);
        submit = (Button) findViewById(R.id.submit);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        db = FirebaseDatabase.getInstance().getReference();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    post();
            }
        });
    }

    private void post() {
        String bloodtype = editText1.getText().toString();
        String location = editText2.getText().toString();
        String city = editText3.getText().toString();
        String desc = editText4.getText().toString();
        String cinfo = editText5.getText().toString();

        if (!TextUtils.isEmpty(bloodtype) && !TextUtils.isEmpty(location) && !TextUtils.isEmpty(city)) {

            //getting a unique id using push().getKey() method

            String id = db.push().getKey();


            Postfeed pf = new Postfeed(id,bloodtype,location,city,desc,cinfo);


            db.child(id).setValue(pf);



            //displaying a success toast
            Toast.makeText(this, "Post Submitted Succesfully", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();

        } else {
            //if the value is not given displaying a toast
            Toast.makeText(this, "Please enter correct Details", Toast.LENGTH_LONG).show();
        }
    }

}
