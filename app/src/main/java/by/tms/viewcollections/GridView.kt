package by.tms.viewcollections

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_grid_view.*

class GridView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_view)

        val adapter = ArrayAdapter<String>(this, R.layout.name_item, NameCollections.instance.names)
        gridViewWidget.adapter = adapter
    }
}
