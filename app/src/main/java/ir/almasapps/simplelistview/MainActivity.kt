package ir.almasapps.simplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.almasapps.simplelistview.Data.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listview.adapter = MyAdapter(this,DataService.data)
    }
}