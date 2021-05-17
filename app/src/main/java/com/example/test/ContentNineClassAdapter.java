package com.example.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContentNineClassAdapter extends RecyclerView.Adapter<ContentNineClassAdapter.ContentNineViewHolder> {

    private static int viewHolderContent;
    private int contentItems; //количество элементов списка

    public ContentNineClassAdapter(int contentOfItem) {
        contentItems = contentOfItem;
        viewHolderContent = 0;
    }

    @NonNull
    @Override
    public ContentNineViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdOfContentItem = R.layout.content_list_item_nine_class;

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdOfContentItem, parent, false);


        ContentNineViewHolder viewHolder = new ContentNineViewHolder(view);
        viewHolder.listItemContent1.setText("foo" + contentItems);
        viewHolderContent++;
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ContentNineViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ContentNineViewHolder extends RecyclerView.ViewHolder {

        TextView listItemContent1;
        TextView listItemContent2;

        public ContentNineViewHolder(@NonNull View itemView) {
            super(itemView);

            listItemContent1 = itemView.findViewById(R.id.btn_syntax_content_1);
            listItemContent2 = itemView.findViewById(R.id.btn_syntax_content_2);
        }

        void bind(int listContent) {
            listItemContent1.setText(listContent);
        }
    }
}

