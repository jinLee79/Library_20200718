package kr.co.tjoeun.library_20200718

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpEvents()
        setValues()
    }

    override fun setUpEvents() {

        callBtn.setOnClickListener {
//            안드로이드 전화 연결 기능 사용
            val phoneNumUri = Uri.parse("tel:${phoneNumTxt.text}")
            val phoneIntent = Intent(Intent.ACTION_CALL, phoneNumUri)
            startActivity(phoneIntent)

        }

        goToPhotoViewBtn.setOnClickListener {
            val myIntent = Intent(mContext, ProfilePhotoActivity::class.java)
            startActivity(myIntent)


        }
    }

    override fun setValues() {
        val imageUrl = "https://dimg.donga.com/wps/NEWS/IMAGE/2019/07/16/96510280.3.jpg"  //https 로 시작하는 주소 찾아야 됨

        Glide.with(mContext).load(imageUrl).into(profileImg)
    }
}