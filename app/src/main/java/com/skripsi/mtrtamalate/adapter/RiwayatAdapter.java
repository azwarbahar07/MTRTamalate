package com.skripsi.mtrtamalate.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.skripsi.mtrtamalate.R;
import com.skripsi.mtrtamalate.models.laporan.Laporan;

import java.util.ArrayList;

public class RiwayatAdapter extends RecyclerView.Adapter<RiwayatAdapter.MyHolderView> {

    private Context context;
    private ArrayList<Laporan> laporans;

    public RiwayatAdapter(Context context, ArrayList<Laporan> laporans) {
        this.context = context;
        this.laporans = laporans;
    }

    @NonNull
    @Override
    public RiwayatAdapter.MyHolderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        view = LayoutInflater.from(context).inflate(R.layout.item_laporan, parent, false);
        RiwayatAdapter.MyHolderView myHolderView = new RiwayatAdapter.MyHolderView(view);
        return myHolderView;
    }

    @Override
    public void onBindViewHolder(@NonNull RiwayatAdapter.MyHolderView holder, int position) {

    }

    @Override
    public int getItemCount() {
        return laporans.size();
    }

    public class MyHolderView extends RecyclerView.ViewHolder {
        public MyHolderView(@NonNull View itemView) {
            super(itemView);
        }
    }
}
