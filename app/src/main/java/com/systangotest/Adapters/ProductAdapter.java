package com.systangotest.Adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.systangotest.Bean.ProductBean;
import com.systangotest.R;

import java.util.List;

public class ProductAdapter extends RealmRecyclerViewAdapter<ProductBean> {

    final Context context;

    private List<ProductBean> apiObjectList;


    public ProductAdapter(Context context,List<ProductBean> aApiObjectList) {

        this.context = context;
        this.apiObjectList = aApiObjectList;
    }

    // create new views (invoked by the layout manager)
    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // inflate a new card view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new CardViewHolder(view);
    }

    // replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int position) {


        // get the article
        //final ProductBean book = getItem(position);
        final ProductBean book = apiObjectList.get(position);
        // cast the generic view holder to our specific one
        final CardViewHolder holder = (CardViewHolder) viewHolder;

        // set the title and the snippet
        holder.textTitle.setText(book.getStrProductName());
        holder.textAuthor.setText(book.getStrProductPrice());
        holder.textDescription.setText(book.getStrProductCategory());

        // load the background image
        if (book.getStrProductImage() != null) {
            Picasso.with(context)
                    .load(book.getStrProductImage())
                    .into(holder.imageBackground);
        }

    }

    @Override
    public int getItemCount() {
        return apiObjectList.size();
    }

    // return the size of your data set (invoked by the layout manager)
  /*  public int getItemCount() {

        if (getRealmAdapter() != null) {
            return getRealmAdapter().getCount();
        }
        return 0;
    }
*/
    public static class CardViewHolder extends RecyclerView.ViewHolder {

        public CardView card;
        public TextView textTitle;
        public TextView textAuthor;
        public TextView textDescription;
        public ImageView imageBackground;

        public CardViewHolder(View itemView) {
            // standard view holder pattern with Butterknife view injection
            super(itemView);

            card = (CardView) itemView.findViewById(R.id.card_books);
            textTitle = (TextView) itemView.findViewById(R.id.text_books_title);
            textAuthor = (TextView) itemView.findViewById(R.id.text_books_author);
            textDescription = (TextView) itemView.findViewById(R.id.text_books_description);
            imageBackground = (ImageView) itemView.findViewById(R.id.image_background);
        }
    }
}
