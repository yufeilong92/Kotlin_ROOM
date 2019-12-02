package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

/**
 * @Author : YFL  is Creating a porject in My Application
 * @Package com.example.myapplication
 * @Email : yufeilong92@163.com
 * @Time :2019/11/29 9:09
 * @Purpose :图片适配器
 */
class ImagerAdapter(var mContext: Context,var list: MutableList<String>) :
    RecyclerView.Adapter<ImagerAdapter.ImagerViewHodler>() {
    private var mInflater: LayoutInflater? = null

    init {
        mInflater = LayoutInflater.from(mContext)
    }


    class ImagerViewHodler(var item: View) : RecyclerView.ViewHolder(item) {
         val img=item.findViewById<ImageView>(R.id.iv_item_text)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ImagerAdapter.ImagerViewHodler {
        val inflate = mInflater!!.inflate(R.layout.item_imga,null)
        return ImagerViewHodler(inflate)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ImagerAdapter.ImagerViewHodler, position: Int) {
        Glide.with(mContext.applicationContext)
            .load(list[position])
            .skipMemoryCache(false)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(holder.img)

    }
}


