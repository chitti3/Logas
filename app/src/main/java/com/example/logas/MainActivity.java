package com.example.logas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.graphics.Color;
import android.os.Bundle;
import android.service.autofill.FieldClassification;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.logas.Model.Datum;
import com.example.logas.Model.Home;
import com.example.logas.Model.Listdatum;
import com.example.logas.Model.MyListData;
import com.example.logas.Model.SliderItem;
import com.example.logas.Retrofit.Apiinterface;
import com.example.logas.Retrofit.Client;
import com.google.android.material.slider.Slider;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SliderView sliderView;
    private SliderAdapterExample adapter;
    CardView cardView,sp;
    ImageView reward,offimg,soffer;
    RecyclerView recyclerView;
    List<Listdatum> listdata;
    RelativeLayout constraintLayout;
    TextView walte,offtexts;
    ConstraintLayout offfers;
    ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderView = findViewById(R.id.imageSlider);
        cardView=findViewById(R.id.cv_slider_mainActivity);
        reward=findViewById(R.id.wallet);
        constraintLayout=findViewById(R.id.rlayout);
        walte=findViewById(R.id.waltext);
        offfers=findViewById(R.id.offer);
        offimg=findViewById(R.id.off);
        offtexts=findViewById(R.id.offtext);
        soffer=findViewById(R.id.specialoofer);
        sp=findViewById(R.id.sofferslider_mainActivity);
        progressBar=findViewById(R.id.progress_circular);

        ApiCalling();
    }



    private void ApiCalling() {

        Apiinterface apiinterface = Client.getRetrofit().create(Apiinterface.class);
        Call<Home> call =apiinterface.getHome("restapi/v2/app/home");
        progressBar.setVisibility(View.VISIBLE);

        call.enqueue(new Callback<Home>() {
            @Override
            public void onResponse(Call<Home> call, Response<Home> response) {

                if(response.isSuccessful() && response.body().getListdata()!=null)
                {
                    progressBar.setVisibility(View.INVISIBLE);
                    listdata=response.body().getListdata();
                    walte.setText(response.body().getListdata().get(1).getTitle());
                    Slide(listdata);
                    Reward(response.body().getListdata().get(1).getData());
                    Recycler(response.body().getListdata().get(2).getData());
                    offer(response.body().getListdata().get(3).getData());
                    specialoffer(response.body().getListdata());
                    System.out.println(response.body().getListdata().toString()+"Response");


                }


            }

            @Override
            public void onFailure(Call<Home> call, Throwable t) {
                progressBar.setVisibility(View.INVISIBLE);
                System.out.println(t.toString()+"error");
                ApiCalling();

            }
        });
    }

    private void specialoffer(List<Listdatum> listdata) {

        System.out.println(listdata.get(4).getImage()+"njjnjnj");
        Glide.with(this)
                .load(listdata.get(4).getImage())
                .fitCenter()
                .into(soffer);
        soffer.setMaxHeight(listdata.get(4).getStyle().getHeight());
    /*    CardView.LayoutParams layoutParams= (CardView.LayoutParams) sp.getLayoutParams();
       layoutParams.height=listdata.get(4).getStyle().getHeight();
    layoutParams.width=ConstraintLayout.LayoutParams.MATCH_PARENT;
    sp.setLayoutParams(layoutParams);*/
    }


    private void offer(List<Datum> data) {
        offfers.setBackgroundColor(Color.parseColor(data.get(0).getStyle().getBgColor()));
            Glide.with(this)
                    .load(data.get(0).getIcon())
                    .fitCenter()
                    .into(offimg);
        System.out.println(data.get(0).getIcon()+"uhuhu");
        offtexts.setText(Html.fromHtml(data.get(0).getTitle()));

    }

    private void Recycler(List<Datum> data) {
        MyListData[] myListData = new MyListData[] {
                new MyListData("Email", R.drawable.gg),
                new MyListData("Email", R.drawable.gg),
                new MyListData("Email", R.drawable.gg),
                new MyListData("Email", R.drawable.gg),
                new MyListData("Email", R.drawable.gg),
                new MyListData("Email", R.drawable.gg),
                new MyListData("Email", R.drawable.gg),
                new MyListData("Email", R.drawable.gg),


        };
        recyclerView=findViewById(R.id.recycler);
        Adapter adapter = new Adapter(myListData,data);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),3);

        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);

    }


    private void Slide(List<Listdatum> listdata) {

        adapter = new SliderAdapterExample(this);
        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(3);
        sliderView.setAutoCycle(true);
        sliderView.setMinimumHeight(200);
        sliderView.startAutoCycle();
        final float scale = getApplicationContext().getResources().getDisplayMetrics().density;
        int pixels = (int) (listdata.get(0).getData().get(0).getStyle().getHeight() * scale + 0.5f);



        SliderView.LayoutParams layoutParams= (SliderView.LayoutParams) sliderView.getLayoutParams();
        layoutParams.height=pixels;
        layoutParams.width= RelativeLayout.LayoutParams.MATCH_PARENT;
        sliderView.setLayoutParams(layoutParams);



        List<SliderItem> sliderItemList = new ArrayList<>();

        int length = listdata.get(0).getData().size();

        for (int i = 0; i <length; i++) {
            SliderItem sliderItem = new SliderItem();
            sliderItem.setDescription(listdata.get(0).getData().get(i).getTitle());
            sliderItem.setImageUrl(listdata.get(0).getData().get(i).getImage());
            sliderItemList.add(sliderItem);
        }
        adapter.renewItems(sliderItemList);

    }

    private void Reward(List<Datum> data) {
//        RelativeLayout.LayoutParams layoutParams= (RelativeLayout.LayoutParams) constraintLayout.getLayoutParams();
//        layoutParams.height=data.get(0).getStyle().getHeight();
//        layoutParams.width=ConstraintLayout.LayoutParams.MATCH_PARENT;


       // walte.setText(data.get(0).getTitle());
        reward.setMaxHeight(data.get(0).getStyle().getHeight());
String color =data.get(0).getStyle().getBgColor();
  constraintLayout.setBackgroundColor(Color.parseColor(color));
        Glide.with(this)
                .load(data.get(1).getIcon())
                .fitCenter()
                .into(reward);
    }

}