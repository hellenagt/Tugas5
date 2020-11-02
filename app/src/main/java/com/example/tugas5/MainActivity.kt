package com.example.tugas5

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listBooks = listOf(
            Book(name = "Laskar Pelangi", image = "https://upload.wikimedia.org/wikipedia/id/thumb/8/8e/Laskar_pelangi_sampul.jpg/220px-Laskar_pelangi_sampul.jpg"),
            Book(name = "Negeri 5 Menara", image = "https://thinkthethings.files.wordpress.com/2010/07/negeri-5-menara.jpg"),
            Book(name = "Sang Pemimpi", image = "https://upload.wikimedia.org/wikipedia/id/8/89/Sang_Pemimpi_sampul.jpg"),
            Book(name = "5 CM", image = "http://3.bp.blogspot.com/-jkHO3-AEw3I/UoC9ivGOqLI/AAAAAAAABKA/5sQQEd4iu_I/s1600/novel+5+cm.jpg"),
            Book(name = "Dilan", image = "https://s2.bukalapak.com/img/724922694/w-1000/Dilan__Dia_Adalah_Dilanku_Tahun_1990_New__Cover_Baru____ID__.jpg"),
            Book(name = "Matahari", image = "https://rahmiayunda.files.wordpress.com/2016/08/sinopsis-novel-matahari-karya-tere-liye.jpg?w=634"),
            Book(name = "Hujan", image = "https://3.bp.blogspot.com/-BA7mxFv3onw/V5XKWK0M0HI/AAAAAAAAAWU/KG1n_y0qxG4IpRCHthx-eWn2VrfSabP0QCLcB/s1600/jual-novel-hujan-karya-tere-liye.jpg"),
            Book(name = "Garis Waktu", image = "https://cdn.gramedia.com/uploads/items/9789797945251_garis_waktu_sebuah_perjalanan_menghapus_lupa.jpg"),
            Book(name = "11 : 11", image = "https://mizanstore.com/admin718/assets/img/com_cart/produk/11_11_albuk_2_thumb.jpg")
        )

        val booksAdapter = BookAdapter(listBooks) {book ->
            Toast.makeText(this, "Novel ini berjudul ${book.name}", Toast.LENGTH_SHORT).show()
        }
        mRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = booksAdapter
        }
    }
}