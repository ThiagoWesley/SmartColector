package br.com.systechtecnologia.smartcolector.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import br.com.systechtecnologia.smartcolector.R;

public class AdapterConferencia extends RecyclerView.Adapter<AdapterConferencia.MyViewHolder> {
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemConferencia = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_conferencia, parent, false);
        return new MyViewHolder(itemConferencia);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.descricao.setText("Apagador Compactor Azul");
        holder.codBarras.setText("7895623589632");
        holder.qtdCaixa.setText("12");
        holder.local.setText("P3");
        holder.volumes.setText("20");
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView descricao;
        TextView codBarras;
        TextView qtdCaixa;
        TextView local;
        TextView volumes;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            descricao = itemView.findViewById(R.id.txtDescricao);
            codBarras = itemView.findViewById(R.id.txtCodBarras);
            qtdCaixa = itemView.findViewById(R.id.txtQtdCx);
            local = itemView.findViewById(R.id.txtLocal);
            volumes = itemView.findViewById(R.id.txtVolumes);
        }
    }
}
