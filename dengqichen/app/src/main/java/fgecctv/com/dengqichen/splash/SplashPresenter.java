package fgecctv.com.dengqichen.splash;

import java.lang.ref.WeakReference;

/**
 * @author denghang
 * @version V1.0
 * @Package fgecctv.com.dengqichen.splash
 * @Description: (用一句话描述该文件做什么)
 * @date 2016/8/31 17
 */
public class SplashPresenter implements SplashContract.presenter {

    private WeakReference mView;

    public SplashPresenter(SplashContract.View view) {
        mView = new WeakReference<>(view);
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unSubscribe() {

    }
}
