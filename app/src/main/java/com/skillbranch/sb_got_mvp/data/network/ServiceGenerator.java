package com.skillbranch.sb_got_mvp.data.network;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.skillbranch.sb_got_mvp.data.network.interceptors.HeaderInterceptor;
import com.skillbranch.sb_got_mvp.utils.AppConfig;
import com.skillbranch.sb_got_mvp.utils.SkillBranchGOTApplication;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {

    public static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    public static Retrofit.Builder sBuilder = new Retrofit.Builder()
            .baseUrl(AppConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());
    public static <S> S createService(Class<S> serviceClass){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        httpClient.addInterceptor(new HeaderInterceptor());
        httpClient.addInterceptor(logging);
        httpClient.cache(new Cache(SkillBranchGOTApplication.getContext().getCacheDir(), Integer.MAX_VALUE));
        httpClient.addNetworkInterceptor(new StethoInterceptor()).build();
        Retrofit retrofit = sBuilder.client(httpClient.build()).build();
        return retrofit.create(serviceClass);

    }
}
