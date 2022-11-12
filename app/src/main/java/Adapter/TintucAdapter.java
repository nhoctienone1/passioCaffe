package Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.passio_caffee.R;
import com.example.passio_caffee.TinTucDetailActivity;

import java.util.List;

public class TintucAdapter extends BaseAdapter {

    private Context context;
    private List<Tintuc> tintucList304;

    public TintucAdapter(Context context, List<Tintuc> tintucList304){
        this.context = context;
        this.tintucList304 = tintucList304;
    }
    @Override
    public int getCount() {
        return tintucList304.size();
    }

    @Override
    public Object getItem(int i) {
        return tintucList304.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView mImage304;
        TextView mLangTitle304, mLangCmt304;

        public ViewHolder(View itemView){
            super(itemView);
        }
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.grid_item_tintuc, null);
            holder = new ViewHolder(view);
            holder.mImage304 = (ImageView) view.findViewById(R.id.tt_image);
            holder.mLangTitle304 = (TextView) view.findViewById(R.id.tt_title);
            holder.mLangCmt304 = (TextView) view.findViewById(R.id.tt_descript);

            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }
        try{
            Tintuc p304 = tintucList304.get(i);
            String image = p304.getImage();
            int resId = ((Activity)context).getResources().getIdentifier(image, "drawable", ((Activity)context).getPackageName());
            holder.mImage304.setImageResource(resId);
            holder.mLangTitle304.setText(p304.getTitle());
            holder.mLangCmt304.setText(p304.getCmt());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, TinTucDetailActivity.class);
                    intent.putExtra("title",tintucList304.get(i).getTitle());
                    context.startActivity(intent);
                }
            });
        } catch (Exception ẽx){
        }
        return view;
    }
}
