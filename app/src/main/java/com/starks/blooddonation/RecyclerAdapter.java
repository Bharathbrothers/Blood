package com.starks.blooddonation;

/**
 * Created by RCP on 5/8/2018.
 */


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyHoder>{

    List<FireModel> list;
    Context context;

    public RecyclerAdapter(List<FireModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public MyHoder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.card,parent,false);
        MyHoder myHoder = new MyHoder(view);


        return myHoder;
    }

    @Override
    public void onBindViewHolder(MyHoder holder, int position) {
        FireModel mylist = list.get(position);
        holder.name.setText(mylist.getName());
        holder.email.setText(mylist.getEmail());
        holder.address.setText(mylist.getAddress());
    }

    @Override
    public int getItemCount() {

        int arr = 0;

        try{
            if(list.size()==0){

                arr = 0;

            }
            else{

                arr=list.size();
            }



        }catch (Exception e){



        }

        return arr;

    }

    class MyHoder extends RecyclerView.ViewHolder{
        TextView name,email,address;


        public MyHoder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.vname);
            email= (TextView) itemView.findViewById(R.id.vemail);
            address= (TextView) itemView.findViewById(R.id.vaddress);

        }
    }

}
