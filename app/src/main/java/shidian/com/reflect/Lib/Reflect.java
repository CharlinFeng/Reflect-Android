package shidian.com.reflect.Lib;

import com.google.gson.Gson;


/**
 * Created by Charlin on 2017/4/19.
 */

public class Reflect {

    public static Gson gson = new Gson();

    public static <T> T parse(String json_string, Class<T> classOfT){

        return Reflect.gson.fromJson(json_string, classOfT);
    }

}
