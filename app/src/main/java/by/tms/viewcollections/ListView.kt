package by.tms.viewcollections

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list_view.*

class ListView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val adapter = ArrayAdapter<String>(this, R.layout.name_item, NameCollections.instance.names)
        listViewWidget.adapter = adapter

        listViewWidget.onItemClickListener = object: AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val intent = Intent(view?.context, Details::class.java)
                intent.putExtra("NAME", parent?.getItemAtPosition(position).toString())
                startActivity(intent)
            }
        }
    }
}
