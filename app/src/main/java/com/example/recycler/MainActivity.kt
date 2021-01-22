package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycleView)

        val productList = ArrayList<Product>()
        productList.add(Product(1, "SUPRA", "2JZ TWIN TURBO", R.drawable.supra1, true ))
        productList.add(Product(2,"SUPRA2", "TRD 3000GT", R.drawable.supra2, true))
        productList.add(Product(3,"SUPRA3", "TOYOTA SUPRA", R.drawable.supra3, true))
        productList.add(Product(1, "SUPRA", "2JZ TWIN TURBO", R.drawable.supra1, true ))
        productList.add(Product(2,"SUPRA2", "TRD 3000GT", R.drawable.supra2, true))
        productList.add(Product(3,"SUPRA3", "TOYOTA SUPRA", R.drawable.supra3, true))
        productList.add(Product(1, "SUPRA", "2JZ TWIN TURBO", R.drawable.supra1, true ))
        productList.add(Product(2,"SUPRA2", "TRD 3000GT", R.drawable.supra2, true))
        productList.add(Product(3,"SUPRA3", "TOYOTA SUPRA", R.drawable.supra3, true))
        productList.add(Product(1, "SUPRA", "2JZ TWIN TURBO", R.drawable.supra1, true ))
        productList.add(Product(2,"SUPRA2", "TRD 3000GT", R.drawable.supra2, true))
        productList.add(Product(3,"SUPRA3", "TOYOTA SUPRA", R.drawable.supra3, true))
        productList.add(Product(1, "SUPRA", "2JZ TWIN TURBO", R.drawable.supra1, true ))
        productList.add(Product(2,"SUPRA2", "TRD 3000GT", R.drawable.supra2, true))
        productList.add(Product(3,"SUPRA3", "TOYOTA SUPRA", R.drawable.supra3, true))
        productList.add(Product(1, "SUPRA", "2JZ TWIN TURBO", R.drawable.supra1, true ))
        productList.add(Product(2,"SUPRA2", "TRD 3000GT", R.drawable.supra2, true))
        productList.add(Product(3,"SUPRA3", "TOYOTA SUPRA", R.drawable.supra3, true))
        productList.add(Product(1, "SUPRA", "2JZ TWIN TURBO", R.drawable.supra1, true ))
        productList.add(Product(2,"SUPRA2", "TRD 3000GT", R.drawable.supra2, true))
        productList.add(Product(3,"SUPRA3", "TOYOTA SUPRA", R.drawable.supra3, true))
        productList.add(Product(1, "SUPRA", "2JZ TWIN TURBO", R.drawable.supra1, true ))
        productList.add(Product(2,"SUPRA2", "TRD 3000GT", R.drawable.supra2, true))
        productList.add(Product(3,"SUPRA3", "TOYOTA SUPRA", R.drawable.supra3, true))



        val productAdapter = ProductAdapter(productList)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = productAdapter
    }
}
