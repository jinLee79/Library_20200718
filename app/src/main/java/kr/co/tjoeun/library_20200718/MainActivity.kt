package kr.co.tjoeun.library_20200718

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : BaseActivity() {
    override fun setUpEvents() {
    }

    override fun setValues() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpEvents()
        setValues()
    }
}