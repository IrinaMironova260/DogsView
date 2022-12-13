package com.example.dogs;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface ApiSrv {

   @GET("image/random")
   Single <DogImage> loadDogImage();
}
