package receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

import define.Receiver;

/**
 * Created by Mirror Towers on 9/3/2015.
 */
public class BroadcastReceiverFileList extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        /**
         * Receive file path list in here
         */
        if (intent.getAction().equals(Receiver.ACTION_CHOSE_SINGLE_FILE)) {
            /**
             * Single file
             */
            String FILE_PATH = intent.getExtras().getString(Receiver.EXTRAS_FILE_PATH);

            Log.i("", "FILE_PATH " + FILE_PATH);

            Toast.makeText(context, "FILE_PATH " + FILE_PATH, Toast.LENGTH_SHORT).show();

            /**
             * Check in :
             * - Setting page
             * - Upload Photo & Video page in group feed
             * to get file correctly
             */
            switch (intent.getIntExtra(Receiver.EXTRAS_CASE_RECEIVER, 0)) {
                case Receiver.case_camera_in_group_feed:
                    // todo Upload file from camera
                    break;
                case Receiver.case_camera_in_setting:
                    break;
            }
        } else if (intent.getAction().equals(Receiver.ACTION_CHOSE_MULTIPLE_FILE)) {
            /**
             * Multiple files
             */

            /**
             * Check in :
             * - Upload Photo & Video page
             */
            ArrayList<String> mAlFilePath =
                    intent.getStringArrayListExtra(Receiver.EXTRAS_FILE_PATH);

            Log.i("", "mAlFilePath.size " + mAlFilePath.size());

            Toast.makeText(context,
                    "mAlFilePath.size " + mAlFilePath.size(), Toast.LENGTH_SHORT).show();

            for (int i = 0; i < mAlFilePath.size(); i++) {
                Log.i("", "get i " + mAlFilePath.get(i));

            }
        }
    }

    /**
     * Update avatar in here
     */

}
