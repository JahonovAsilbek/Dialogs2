package uz.revolution.dialogstask2

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_error_dialog.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        show_dialog.setOnClickListener {

            val beginTransaction=supportFragmentManager.beginTransaction()

            val fragment = ErrorDialog.newInstance("Dialog","Dialog1")

            fragment.show(beginTransaction,"Dialog")

            fragment.setOnClick(object : ErrorDialog.OnClick {
                override fun onClick(str: String) {
                    Toast.makeText(this@MainActivity, "$str button clicked", Toast.LENGTH_SHORT).show()
                }

            })
        }
    }
}