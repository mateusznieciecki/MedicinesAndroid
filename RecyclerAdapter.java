package com.example.aplikacjaleki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static final int TYPE = 1;
    private final Context context;
    private final List<Object> listRecyclerItem;

    public RecyclerAdapter(Context context, List<Object> listRecyclerItem) {
        this.context = context;
        this.listRecyclerItem = listRecyclerItem;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView type;
        private TextView quantity;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            type = (TextView) itemView.findViewById(R.id.type);
            quantity = (TextView) itemView.findViewById(R.id.quantity);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        switch (i) {
            case TYPE:
                default:
                    View layoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.medicines_list, viewGroup, false);
                    return new ItemViewHolder((layoutView));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int viewType = getItemViewType(i);
        switch (viewType){
            case TYPE:
                default:
                    ItemViewHolder itemViewHolder = (ItemViewHolder) viewHolder;
                    Medicines medicines = (Medicines) listRecyclerItem.get(i);
                    itemViewHolder.name.setText(medicines.getName());
                    itemViewHolder.type.setText(medicines.getType());
                    itemViewHolder.quantity.setText(medicines.getQuantity());
        }
    }

    @Override
    public int getItemCount() {
        return listRecyclerItem.size();
    }
}
