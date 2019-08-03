package course.inter.timeline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MyProducts extends AppCompatActivity implements View.OnClickListener {

    Button banner,website,landingpage,facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_products);
        defineButtons ();
    }
public void defineButtons (){
        banner=(Button)findViewById(R.id.banner);
        website=(Button)findViewById(R.id.web_site);
        landingpage=(Button)findViewById(R.id.landing_page);
        facebook=(Button)findViewById(R.id.facebook);
        banner.setOnClickListener(this);
        website.setOnClickListener(this);
        landingpage.setOnClickListener(this);
        facebook.setOnClickListener(this);

}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater  inflater= getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.item1:
                Intent intent1=new Intent(this, RepresentorDetails.class );
                startActivity(intent1);
                return true;
            case R.id.item2:
                Intent intent2=new Intent(this, RepresentorDetails.class);
                startActivity(intent2);

                return true;
            case R.id.item3:

                return true;
            case R.id.item4:

                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.web_site:
                Intent in=new Intent(this, StepsView.class);
                startActivity(in);

                break;
            case R.id.facebook:
                Intent in1=new Intent(this, StepsView.class);
                startActivity(in1);
                break;
            case R.id.banner:
                Intent in2=new Intent(this, StepsView.class);
                startActivity(in2);
                break;
            case R.id.landing_page:
                Intent in3=new Intent(this, StepsView.class);
                startActivity(in3);
             break;
        }

    }
}
