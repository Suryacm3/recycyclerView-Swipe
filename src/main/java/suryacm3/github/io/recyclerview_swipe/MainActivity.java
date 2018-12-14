package suryacm3.github.io.recyclerview_swipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ExampleItem> exampleList;
    private RecyclerView               mRecyclerView;
    private RecyclerView.Adapter       mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.banner,"Line1", "Line2"));
        exampleList.add(new ExampleItem(R.drawable.bat,"Line3", "Line4"));
        exampleList.add(new ExampleItem(R.drawable.chy,"Line5", "Line6"));
        exampleList.add(new ExampleItem(R.drawable.de,"Line7", "Line8"));
        exampleList.add(new ExampleItem(R.drawable.hy,"Line9", "Line10"));
        exampleList.add(new ExampleItem(R.drawable.je,"Line11", "Line12"));
        exampleList.add(new ExampleItem(R.drawable.ko,"Line13", "Line14"));
        exampleList.add(new ExampleItem(R.drawable.li,"Line15", "Line16"));
        exampleList.add(new ExampleItem(R.drawable.mail,"Line17", "Line18"));
        exampleList.add(new ExampleItem(R.drawable.pen,"Line19", "Line20"));
        exampleList.add(new ExampleItem(R.drawable.tu,"Line21", "Line22"));
        exampleList.add(new ExampleItem(R.drawable.chy,"Line23", "Line24"));
        exampleList.add(new ExampleItem(R.drawable.hy,"Line25", "Line26"));
        exampleList.add(new ExampleItem(R.drawable.li,"Line27", "Line28"));
        exampleList.add(new ExampleItem(R.drawable.ko,"Line29", "Line30"));
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        ItemTouchHelper.SimpleCallback itemTouchHelperCallBack = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                int pos = viewHolder.getAdapterPosition();
                exampleList.remove(pos);
                mAdapter.notifyItemRemoved(pos);
            }
        };
        new ItemTouchHelper(itemTouchHelperCallBack).attachToRecyclerView(mRecyclerView);
    }
}
