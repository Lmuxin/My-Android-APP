package com.example.muzi.myui4listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.muzi.myui4listview.Fruit;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourseId;
    public FruitAdapter(Context context, int textViewResourseId, List<Fruit> objects){
        super(context,textViewResourseId,objects);
        resourseId=textViewResourseId;
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        Fruit fruit=getItem(position);//获取当前项的Fruit实例
        View view;
        ViewHolder viewHolder;
        if(convertView==null){
            view=LayoutInflater.from(getContext()).inflate(resourseId,null);
            viewHolder=new ViewHolder();
            viewHolder.fruitImage=(ImageView)view.findViewById(R.id.fruit_image);
            viewHolder.fruitName=(TextView)view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);//将viewHolder存储在view中
        }
        else{
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();//重新获取viewHolder
            
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getNmae());
     return view;
       /* ImageView fruitImage=(ImageView)((View) view).findViewById(R.id.fruit_image);
        TextView fruitName=(TextView)view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageId());
        fruitName.setText(fruit.getNmae());
        return view;*/
    }
class ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
}
}
