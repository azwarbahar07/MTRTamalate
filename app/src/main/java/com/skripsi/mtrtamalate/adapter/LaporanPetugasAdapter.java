package com.skripsi.mtrtamalate.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.skripsi.mtrtamalate.R;
import com.skripsi.mtrtamalate.models.laporan.Laporan;

import java.util.ArrayList;

public class LaporanPetugasAdapter extends RecyclerView.Adapter<LaporanPetugasAdapter.MyHolderView> {

    private Context context;
    private ArrayList<Laporan> laporans;

    public LaporanPetugasAdapter(Context context, ArrayList<Laporan> laporans) {
        this.context = context;
        this.laporans = laporans;
    }

    @NonNull
    @Override
    public LaporanPetugasAdapter.MyHolderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.item_laporan_pekerja, parent, false);
        LaporanPetugasAdapter.MyHolderView myHolderView = new LaporanPetugasAdapter.MyHolderView(view);
        return myHolderView;
    }

    @Override
    public void onBindViewHolder(@NonNull LaporanPetugasAdapter.MyHolderView holder, int position) {

        holder.tv_alamat.setText(laporans.get(position).getAlamatLaporan());
        holder.tv_keterangan.setText(laporans.get(position).getKeteranganLaporan());
        holder.tv_tanggal.setText(laporans.get(position).getCreatedAt());

    }

    @Override
    public int getItemCount() {
        return laporans.size();
    }

    public class MyHolderView extends RecyclerView.ViewHolder {

        private TextView tv_alamat;
        private TextView tv_keterangan;
        private TextView tv_tanggal;

        public MyHolderView(@NonNull View itemView) {
            super(itemView);

            tv_alamat = itemView.findViewById(R.id.tv_alamat);
            tv_keterangan = itemView.findViewById(R.id.tv_keterangan);
            tv_tanggal = itemView.findViewById(R.id.tv_tanggal);

        }
    }
}