package tampdph33277.fpoly.lab8_application.Serives;


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import tampdph33277.fpoly.lab8_application.Models.District;
import tampdph33277.fpoly.lab8_application.Models.DistrictRequest;
import tampdph33277.fpoly.lab8_application.Models.Province;
import tampdph33277.fpoly.lab8_application.Models.ResponseGHN;
import tampdph33277.fpoly.lab8_application.Models.Ward;

public interface GHNServices {
    public static String GHN_URL = "https://dev-online-gateway.ghn.vn/";

    @GET("/shiip/public-api/master-data/province")
    Call<ResponseGHN<ArrayList<Province>>> getListProvince();

    @POST("/shiip/public-api/master-data/district")
    Call<ResponseGHN<ArrayList<District>>> getListDistrict(@Body DistrictRequest districtRequest);

    @GET("/shiip/public-api/master-data/ward")
    Call<ResponseGHN<ArrayList<Ward>>> getListWard(@Query("district_id") int district_id);
}
