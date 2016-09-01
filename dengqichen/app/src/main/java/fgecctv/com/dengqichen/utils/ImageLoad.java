package fgecctv.com.dengqichen.utils;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * @author denghang
 * @version V1.0
 * @Package fgecctv.com.dengqichen.utils
 * @Description: (用一句话描述该文件做什么)
 * @date 2016/8/31 17
 */
public class ImageLoad {

    private ImageLoad(){

    }

    public static void display(Context context, ImageView imageView, String url) {
        Glide.with(context).load(url).into(imageView);
    }

    public static void display(Fragment fragment,ImageView imageView,String url) {
        Glide.with(fragment).load(url).into(imageView);
    }

}
