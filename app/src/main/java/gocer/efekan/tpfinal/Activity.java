//package gocer.efekan.tpfinal;
//
//import android.os.Bundle;
//import android.util.Log;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.SortedList;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import gocer.efekan.tpfinal.Model.Country;
//
//public class Activity extends AppCompatActivity {
//    private String API_BASE_URL = "https://restcountries.eu/rest/v2/all";
//    private ArrayList<Country> countries = new ArrayList<>();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
////        callWithAsyncTask();
//        callWithRetrofit();
//    }
//
////    private void callWithAsyncTask(){
//////Some url endpoint that you may have
////        String myUrl = API_BASE_URL + "products";
//////String to place our result in
////        String result;
//////Instantiate new instance of our class
////        MyRequest getRequest = new MyRequest();
//////Perform the doInBackground method, passing in our url
////        try{
////            result = getRequest.execute(myUrl).get();
////        }catch (Exception e){
////            Log.e("joyPAD","error in request " + e.getLocalizedMessage());
////        }
////    }
//
//    private void callWithRetrofit(){
//        Retrofit retrofit = new Retrofit.Builder().baseUrl(API_BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        MyService service = retrofit.create(MyService.class);
//        Call<List<Country>> listeCountries = service.getCountries();
//        listeCountries.enqueue(new SortedList.Callback<List<Country>>()
//        {
//            @Override
//            public void onResponse(Call<List<Country>> call, Response<List<Country>>
//                    response) {
//                countries.addAll(response.body());
//                Log.d("joyPAD","on a retrouvé " + countries.size() + " pays");
//            }
//            @Override
//            public void onFailure(Call<List<Country>> call, Throwable t) {
//            }
//        });
//        Call<List<Country>> listProductsFromCat = service.getCountriesFromCategory(1);
//        listProductsFromCat.enqueue(new Callback<List<Country>>() {
//            @Override
//            public void onResponse(Call<List<Country>> call, Response<List<Country>>
//                    response) {
//                Log.d("joyPAD","Réponse requête pays : " +
//                        response.toString());
//            }
//            @Override
//            public void onFailure(Call<List<Country>> call, Throwable t) {
//            }
//        });
//    }
//}