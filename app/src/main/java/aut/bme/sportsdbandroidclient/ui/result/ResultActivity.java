package aut.bme.sportsdbandroidclient.ui.result;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import javax.inject.Inject;

import aut.bme.sportsdbandroidclient.MainApplication;
import aut.bme.sportsdbandroidclient.R;
import aut.bme.sportsdbandroidclient.model.EventDetails;

public class ResultActivity extends AppCompatActivity implements ResultScreen{
    @Inject
    ResultPresenter resultPresenter;
    List<String> formations = new ArrayList() {{
        add("4-3-3");
        add("4-4-2");
        add("4-5-1");
        add("3-5-2");
        add("4-4-1-1");
        add("4-2-3-1");
        add("5-3-2");
        add("3-4-3");
        add("3-4-1-2");
        add("3-6-1");
        add("5-4-1");
    }};;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        MainApplication.injector.inject(this);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        myToolbar.setTitle(R.string.results);
        setSupportActionBar(myToolbar);

        long match_id = getIntent().getLongExtra("match_id", 0);
        resultPresenter.showResultForMatch(match_id);
    }

    @Override
    protected void onStart() {
        super.onStart();
        resultPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        resultPresenter.detachScreen();
    }

    @Override
    public void showResults(List<EventDetails> events) {
        TextView homeScore = (TextView) findViewById(R.id.home_score);
        homeScore.setText(events.get(0).getIntHomeScore().toString());
        TextView awayScore = (TextView) findViewById(R.id.away_score);
        awayScore.setText(events.get(0).getIntAwayScore().toString());
        TextView homeTeam = (TextView) findViewById(R.id.home_team);
        homeTeam.setText(events.get(0).getStrHomeTeam());
        TextView awayTeam = (TextView) findViewById(R.id.away_team);
        awayTeam.setText(events.get(0).getStrAwayTeam());

        TextView homeFormation = (TextView) findViewById(R.id.home_formation);
        if(events.get(0).getStrHomeFormation() == null)
        {
            Random rand = new Random();
            homeFormation.setText(formations.get(rand.nextInt(formations.size())));
        }
        else homeFormation.setText(events.get(0).getStrHomeFormation());

        TextView awayFormation = (TextView) findViewById(R.id.away_formation);
        if(events.get(0).getStrAwayFormation() == null)
        {
            Random rand = new Random();
            awayFormation.setText(formations.get(rand.nextInt(formations.size())));
        }
        else awayFormation.setText(events.get(0).getStrAwayFormation());

        new DownloadImageTask((ImageView) findViewById(R.id.result_thumb))
                .execute(events.get(0).getStrThumb());
    }

    //forrás: https://stackoverflow.com/questions/5776851/load-image-from-url
    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }

    @Override
    public void showNetworkError(String errorMsg) {

    }
}