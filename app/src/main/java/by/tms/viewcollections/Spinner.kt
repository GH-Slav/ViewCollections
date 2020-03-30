package by.tms.viewcollections

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_spinner.*

class Spinner : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        val adapter = ArrayAdapter<String>(this, R.layout.name_item, NameCollections.instance.names)
        spinnerWidget.adapter = adapter
        spinnerWidget.onItemSelectedListener = this
    }


    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(this, "Hello, ${parent?.selectedItem}", Toast.LENGTH_SHORT).show()
    }
}
