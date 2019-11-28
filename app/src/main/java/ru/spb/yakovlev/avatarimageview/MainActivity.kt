package ru.spb.yakovlev.avatarimageview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*
import ru.spb.yakovlev.avatarimageview.ui.AvatarImageView

class MainActivity : AppCompatActivity() {
    //private val stId = 10
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val view = AvatarImageView(this).apply {
//            id = stId
//            layoutParams = LinearLayout.LayoutParams(120,120)
//            setImageResource(R.drawable.pikachu)
//        }
//        container.addView(view)

        btn_change_border_color.setOnClickListener {
            aiv.setBorderColor(AvatarImageView.bgColors.random())
        }

        btn_change_border_width.setOnClickListener {
            aiv.setBorderWidth((1..15).random())
        }

        et_initials.addTextChangedListener { watcher ->
            val updatedString = if (watcher.toString().isNotEmpty()) watcher.toString() else "??"
            aiv.setInitials(updatedString)
        }
    }
}
