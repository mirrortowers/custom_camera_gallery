package mirrortowers.beautiful_bag.android.custom_camera.custom_gallery;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by Tower on 08/10/2015.
 */
public class DonateActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_donate);

        Button mBtnDonate = (Button) findViewById(R.id.btn_donate_via_paypal);
        mBtnDonate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.paypal.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

//                PayPalPayment payPalPayment = new PayPalPayment();
//                char val[] = { '1', '0' };
//                BigDecimal obj_0 = new BigDecimal(val);
//
//                payPalPayment.setSubtotal(obj_0);
//                payPalPayment.setCurrencyType("USD");
//                payPalPayment.setRecipient("huytower1990@gmail.com");
//                payPalPayment.setMerchantName("Mirror Towers - Beautiful Bag store");
//                payPalPayment.setPaymentType(PayPal.PAYMENT_TYPE_PERSONAL);
//
//                Log.i("", "payPalPayment " + payPalPayment);
//                Log.i("", "PayPal.getInstance() " + PayPal.getInstance());
//
//                PayPal pp = PayPal.getInstance();
//                if (pp == null) {
//                    // Test to see if the library is already initialized
//
//                    // This main initialization call takes your Context, AppID, and target server
//                    pp = PayPal.initWithAppID(
//                            DonateActivity.this, "APP-80W284485P519543T", PayPal.ENV_NONE);
//
//                    // Required settings:
//
//                    // Set the language for the library
//                    pp.setLanguage("en_US");
//
//                    // Some Optional settings:
//
//                    // Sets who pays any transaction fees. Possible values are:
//                    // FEEPAYER_SENDER, FEEPAYER_PRIMARYRECEIVER,
//                    // FEEPAYER_EACHRECEIVER, and FEEPAYER_SECONDARYONLY
//                    pp.setFeesPayer(PayPal.FEEPAYER_EACHRECEIVER);
//
//                    // true = transaction requires shipping
//                    pp.setShippingEnabled(false);
//
//                    Log.i("", "pp " + pp);
//
//                    Intent mIntentPaypal = pp.checkout(
//                            payPalPayment, DonateActivity.this);
//
//                    Log.i("", "mIntentPaypal " + mIntentPaypal);
//
//                    startActivityForResult(mIntentPaypal, 1);
//                }
            }
        });
    }

//    @SuppressWarnings("unused")
//    @Override
//    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//        switch (resultCode) {
//            case Activity.RESULT_OK:
//                // The payment succeeded
//                String payKey = data.getStringExtra(PayPalActivity.EXTRA_PAY_KEY);
//
//                // Tell the user their payment succeeded
//                Toast.makeText(DonateActivity.this, "Succeeded Payment", Toast.LENGTH_LONG).show();
//                break;
//            case Activity.RESULT_CANCELED:
//                // The payment was canceled
//                // Tell the user their payment was canceled
//                break;
//            case PayPalActivity.RESULT_FAILURE:
//                // The payment failed -- we get the error from the EXTRA_ERROR_ID
//                // and EXTRA_ERROR_MESSAGE
//                String errorID = data.getStringExtra(PayPalActivity.EXTRA_ERROR_ID);
//                String errorMessage = data.getStringExtra(PayPalActivity.EXTRA_ERROR_MESSAGE);
//
//                // Tell the user their payment was failed.
//                Toast.makeText(this, errorID + " " + errorMessage, Toast.LENGTH_LONG).show();
//                break;
//        }
//    }

}
