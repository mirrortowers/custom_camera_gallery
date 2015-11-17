package mirrortowers.beautiful_bag.android.custom_camera.custom_gallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import define.Receiver;
import ui.activity.custom.camera.CustomCamera;
import ui.activity.custom.gallery.CustomGallery;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnCustomAbout;
    private Button mBtnCustomCamera;
    private Button mBtnCustomGallery;

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_about:
                // Show Dialog Activity
                startActivity(new Intent(this, DonateActivity.class));
                break;
            case R.id.btn_custom_camera:
                // Open Custom Camera activity
                Intent mIntentCamera = new Intent(this, CustomCamera.class);

                mIntentCamera.putExtra(
                        Receiver.EXTRAS_ACTION, Receiver.ACTION_CHOSE_SINGLE_FILE);
//                mIntentCamera.putExtra(
//                        Receiver.EXTRAS_CASE_RECEIVER, Receiver.case_camera_in_setting);

                startActivity(mIntentCamera);

                // Finish activity
//                finish();
                break;
            case R.id.btn_custom_gallery:
                // Open Custom Gallery activity
                Intent mIntent = new Intent(this, CustomGallery.class);
                mIntent.putExtra(
                        Receiver.EXTRAS_ACTION, Receiver.ACTION_CHOSE_MULTIPLE_FILE);
//                mIntent.putExtra(
//                        Receiver.EXTRAS_CASE_RECEIVER, Receiver.case_camera_in_setting);

                startActivity(mIntent);

                // Finish activity
//                finish();
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initial views
        mBtnCustomAbout = (Button) findViewById(R.id.btn_about);
        mBtnCustomCamera = (Button) findViewById(R.id.btn_custom_camera);
        mBtnCustomGallery = (Button) findViewById(R.id.btn_custom_gallery);

        // Initial data
        mBtnCustomAbout.setOnClickListener(this);
        mBtnCustomCamera.setOnClickListener(this);
        mBtnCustomGallery.setOnClickListener(this);
    }

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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            // Show Dialog Activity
            startActivity(new Intent(this, DonateActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
