package org.sddtu.engifest2017;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;

import org.sddtu.engifest2017.Adapters.SponsorAdapter;
import org.sddtu.engifest2017.DataProviders.SponsorData;

import java.util.ArrayList;

import me.anwarshahriar.calligrapher.Calligrapher;

public class SponsorsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<SponsorData> arrayList = new ArrayList<SponsorData>();
    SponsorAdapter adapter;
    RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);

        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/OpenSans-Regular.ttf", true);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initCollapsingToolbar();


        adapter = new SponsorAdapter(SponsorsActivity.this,arrayList);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_sponsors);
        layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(15), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareAlbums();

    }

    private void initCollapsingToolbar() {
        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
       // collapsingToolbar.setTitle(" ");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.app_bar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
            }
        });
    }

    private void prepareAlbums() {
        int[] covers = new int[]{
                R.drawable.pepsico,
                R.drawable.logo,
                R.drawable.NTPC_Logo,
                R.drawable.Intex_logo,
                R.drawable.logo_fadf8cd3950729a681c61d003f6a63be6fc2b2556bd037d85fb3ed9cba49c621,
                R.drawable.pokerbaazi_logo,
                R.drawable.slap
        };


        SponsorData a = new SponsorData("Pepsi",covers[0]);
        arrayList.add(a);

        a = new SponsorData("Pepsi",covers[1]);
        arrayList.add(a);

        a = new SponsorData("Pepsi",covers[2]);
        arrayList.add(a);

        a = new SponsorData("Pepsi",covers[3]);
        arrayList.add(a);

        a = new SponsorData("Pepsi",covers[4]);
        arrayList.add(a);

        a = new SponsorData("Pepsi",covers[5]);
        arrayList.add(a);

        a = new SponsorData("Pepsi",covers[6]);
        arrayList.add(a);

        a = new SponsorData("Pepsi",covers[7]);
        arrayList.add(a);

        a = new SponsorData("Pepsi",covers[8]);
        arrayList.add(a);

        a = new SponsorData("Pepsi",covers[9]);
        arrayList.add(a);

        adapter.notifyDataSetChanged();
    }

    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

}
