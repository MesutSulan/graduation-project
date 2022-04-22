package com.kidsapp.childplay.activity.video;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.kidsapp.childplay.R;
import com.kidsapp.childplay.adapter.VideoCategoryAdapter;
import com.kidsapp.childplay.utils.Utils;

public class VideoLearningActivity extends AppCompatActivity {

    String[] videocategory;
    int[] tumbnailList;

    Context context;
    RelativeLayout llAdView;
    LinearLayout llAdViewFacebook;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_video_learning);
        context = this;
        getSupportActionBar().hide();
        initDefine();
        videocategory = new String[]{"ABC Videolar", "Rakam Videoları"};
        tumbnailList = new int[]{R.drawable.vt_abc, R.drawable.vt_number};
        setRvAdapter();

        llAdView = findViewById(R.id.llAdView);
        llAdViewFacebook = findViewById(R.id.llAdViewFacebook);
        Utils.loadBannerAd(this,llAdView,llAdViewFacebook);
    }



    private void initDefine() {
        rvVideoCategory = findViewById(R.id.rvVideoCategory);
    }

    VideoCategoryAdapter videoCategoryAdapter;
    RecyclerView rvVideoCategory;

    private void setRvAdapter() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2, LinearLayoutManager.VERTICAL, false);
        rvVideoCategory.setLayoutManager(gridLayoutManager);
        videoCategoryAdapter = new VideoCategoryAdapter(context, videocategory, tumbnailList);
        rvVideoCategory.setAdapter(videoCategoryAdapter);
    }

    public void onClickBack(View view) {
        finish();
    }
}
