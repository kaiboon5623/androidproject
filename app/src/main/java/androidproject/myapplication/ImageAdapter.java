package androidproject.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Kai Boon on 20/7/2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context context;

    public Integer[] images = {
            R.drawable.gallery1, R.drawable.gallery2,
            R.drawable.gallery3, R.drawable.gallery4,
            R.drawable.gallery5, R.drawable.gallery6,
            R.drawable.gallery7, R.drawable.gallery8,
            R.drawable.gallery9, R.drawable.gallery10,
            R.drawable.gallery11, R.drawable.gallery12,
            R.drawable.gallery13, R.drawable.gallery14,
            R.drawable.gallery15, R.drawable.gallery16,
            R.drawable.gallery17, R.drawable.gallery18,
            R.drawable.gallery19, R.drawable.gallery21,
            R.drawable.gallery20, R.drawable.gallery22,
            R.drawable.gallery23, R.drawable.gallery24,
            R.drawable.gallery25, R.drawable.gallery26,
            R.drawable.gallery27, R.drawable.gallery28,
            R.drawable.gallery29, R.drawable.gallery30,
    };

    public ImageAdapter(Context c){
        context = c;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(500, 700));
        return imageView;
    }
}
