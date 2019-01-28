package com.nagesagi.troper;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public abstract class DefaultMenuActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        Intent intent;

        //noinspection SimplifiableIfStatement
        switch(id){
            case R.id.action_settings:
                return true;
            case R.id.test_page:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tvtropes.org/pmwiki/pmwiki.php/Main/NotWearingTights"));
                startActivity(intent);
                break;
            case R.id.random:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tvtropes.org/pmwiki/randomitem.php"));
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
