package com.skillbranch.sb_got_mvp.data.network;


import com.skillbranch.sb_got_mvp.data.network.res.HeroModelResponse;
import com.skillbranch.sb_got_mvp.data.network.res.HouseModelResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Zver on 17.10.2016.
 */

public interface RestService {

    @GET("characters/{heroId}")
    Call<HeroModelResponse> getHero(@Path("heroId") String heroId);

    @GET("houses/{houseId}")
    Call<HouseModelResponse> getHouse(@Path("houseId") String houseId);
}
