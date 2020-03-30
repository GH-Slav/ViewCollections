package by.tms.viewcollections

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView.setOnClickListener(this)
        gridView.setOnClickListener(this)
        spinner.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            listView.id -> startActivity(Intent(this, ListView::class.java))
            gridView.id -> startActivity(Intent(this, GridView::class.java))
            spinner.id -> startActivity(Intent(this, Spinner::class.java))
        }
    }
}
