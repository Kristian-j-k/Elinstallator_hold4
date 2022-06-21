package com.elinstallator_hold4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class QARecyclerViewAdapter extends RecyclerView.Adapter<QARecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<VerificationChartModel> verificationChartModel;

    public QARecyclerViewAdapter(Context context, ArrayList<VerificationChartModel> verificationChartModel){
        this.context = context;
        this.verificationChartModel = verificationChartModel;
    }

    @NonNull
    @Override
    //here we inflate the layout on the row
    public QARecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent,false);

        return new QARecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    //assigning values to each row when they come back on the screen
    //depending on the position on the recycler view
    public void onBindViewHolder(@NonNull QARecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.tvQuestion.setText(verificationChartModel.get(position).getQuestionText());
      //  holder.tvAnswer.setText(verificationChartModel.get(position).getAnswer());
    }

    @Override
    //how many items do you have in total
    public int getItemCount() {
        return verificationChartModel.size();
    }

    //inner class for  getting the vievs from recycler view row layout
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvQuestion, tvAnswer;
        RadioButton radioYes,radioNo;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvQuestion = itemView.findViewById(R.id.textView1);

            radioYes = itemView.findViewById(R.id.radioButton_Yes);
            radioNo = itemView.findViewById(R.id.radioButton_No);


        }
    }

}
