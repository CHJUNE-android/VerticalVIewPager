package kr.chjdevelop.verticalviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter : MainPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun init(){
        adapter = MainPagerAdapter(this)
        adapter.addItem(PageItem("1"))
        adapter.addItem(PageItem("2"))
        adapter.addItem(PageItem("3"))
        adapter.addItem(PageItem("4"))
        viewPager.adapter = adapter
        viewPager.setPageTransformer(false,DefaultTransformer())
        viewPager.offscreenPageLimit=3
    }
}
