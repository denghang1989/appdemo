package fgecctv.com.dengqichen.splash;

import fgecctv.com.dengqichen.base.MvpPresenter;
import fgecctv.com.dengqichen.base.MvpView;

/**
 * @author denghang
 * @version V1.0
 * @Package fgecctv.com.daughter.splash
 * @Description: (用一句话描述该文件做什么)
 * @date 2016/8/31 16
 */
public interface SplashContract {
    interface View extends MvpView {
        void showAd(String url);
        void showProgress();
    }

    interface presenter extends MvpPresenter {

    }

}
