package tw.com.pcschool.t090404;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by teacher on 2016/9/4.
 */
public class MyUtils {
    public static String getRawData(Context context, int ResID)
    {
        InputStream is = null;
        is = context.getResources().openRawResource(ResID);

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String inputLine = "";
        try {
            while ((inputLine = br.readLine()) != null) {
                sb.append(inputLine);
                sb.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

}
