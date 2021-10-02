package com.learn.recyclerviewsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private val itemsList = ArrayList<String>()

    /*
    * variabel adapter menggunakan lateinit agar dapat mengakomodir
    * pendefinisian variabel tanpe inisialisasi data terlebih
    * dahulu */
    private lateinit var buahAdapter: BuahAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Informasi pada bagian header recycler view
        title = "RecyclerView sederhana"

        // menghubungkan recyclerview dari xml layout menjadi variabel
        val recyclerView: RecyclerView = findViewById(R.id.rv_main)

        buahAdapter = BuahAdapter(itemsList)

        // menggunakan viewgroup linearlayout untuk menampulkan data
        // secara vertical
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = buahAdapter
        prepareItems()
    }

    /*
    * Fungsi untuk menyiapkan data yang akan ditampilkan di recyclerview
    * */
    private fun prepareItems() {
        itemsList.add("Apel")
        itemsList.add("Belimbing")
        itemsList.add("Cempedak")
        itemsList.add("Durian")
        itemsList.add("Delima")
        itemsList.add("Jeruk")
        itemsList.add("Kedondong")
        itemsList.add("Leci")
        itemsList.add("Mangga")
        itemsList.add("Nanas")
        itemsList.add("Pepaya")
        itemsList.add("Pisang")
        itemsList.add("Rambutan")
        buahAdapter.notifyDataSetChanged()
    }
}