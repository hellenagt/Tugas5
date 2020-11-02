package com.example.tugas5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list.view.*


class BookAdapter(private val books: List<Book>,
                  private val adapterOnClick: (Book) -> Unit) : RecyclerView.Adapter<BookAdapter.BookHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookHolder {
        return BookHolder(LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false))
    }

    override fun getItemCount(): Int = books.size

    override fun onBindViewHolder(holder: BookHolder, position: Int) {
        holder.bindBook(books[position])
    }

    inner class BookHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindBook(book: Book) {
            itemView.apply {
                lbList.text = book.name
                Picasso.get().load(book.image).into(imgbook)

                setOnClickListener {
                    adapterOnClick(book)
                }
            }
        }
    }
}