package c.testfcm;

import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by wildcoder on 08/08/16.
 */
public class MyFirebaseInstanceIdServices extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        //code to register gcm id on server if require
    }
}
