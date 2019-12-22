package kr.chjdevelop.verticalviewpager

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.PagerAdapter

class MainPagerAdapter(private val context : Context) : PagerAdapter(){
    val datas = mutableListOf<PageItem>()
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    fun addItem(item : PageItem){
        datas.add(item)
    }

    override fun getCount(): Int {
        return datas.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view : View = LayoutInflater.from(container.context).inflate(R.layout.item,container,false)
        container.addView(view)
        bind(datas.get(position),view)
        return view
    }
    private fun bind(textItem : PageItem,view : View){
        val ll_item = view.findViewById<LinearLayout>(R.id.ll_item)
        when(textItem.text){
            "1" -> {ll_item.setBackgroundColor(ContextCompat.getColor(context,R.color.colorPastelPink))}
            "2" -> {ll_item.setBackgroundColor(ContextCompat.getColor(context,R.color.colorRym))}
            "3" -> {ll_item.setBackgroundColor(ContextCompat.getColor(context,R.color.colorSky))}
            "4" -> {ll_item.setBackgroundColor(ContextCompat.getColor(context,R.color.colorPrimary))}
        }
    }
}