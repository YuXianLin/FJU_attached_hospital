package first.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class userlist extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userlist);

        Button nextPageBtn = (Button)findViewById(R.id.reservation);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(userlist.this , reservation.class);
                startActivity(intent);
            }
        });

        Button nextPageBtn1 = (Button)findViewById(R.id.viewclinicnumber);
        nextPageBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(userlist.this , viewclinicnumber.class);
                startActivity(intent);
            }
        });
    }
}