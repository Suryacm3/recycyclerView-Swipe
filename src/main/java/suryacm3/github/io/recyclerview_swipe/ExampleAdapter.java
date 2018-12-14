package suryacm3.github.io.recyclerview_swipe;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>{
    private ArrayList<ExampleItem> mExampleList;

    public class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView mimageView;
        public TextView mtextView1;
        public TextView mtextView2;
        public ExampleViewHolder(View itemView) {
            super(itemView);
            mimageView=itemView.findViewById(R.id.imageView);
            mtextView1 = itemView.findViewById(R.id.textView1);
            mtextView2 = itemView.findViewById(R.id.textView2);
        }
    }
    public ExampleAdapter(ArrayList<ExampleItem> exampleList) {
        mExampleList = exampleList;
    }
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }
    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        ExampleItem currentItem = mExampleList.get(position);
        holder.mimageView.setImageResource(currentItem.getImage());
        holder.mtextView1.setText(currentItem.getText1());
        holder.mtextView2.setText(currentItem.getText2());

    }
    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}
