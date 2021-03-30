package com.zhangqian.xyzandroidtool

import android.widget.ImageView
import androidx.core.content.ContextCompat

class XYZImage {
}

fun ImageView.setdrawableImageWithName(imageName: String) {
    this.setImageDrawable(
        ContextCompat.getDrawable(this.context, resources.getIdentifier(imageName, "drawable", context.getPackageName())
        )
    )
}


////扩展方便使用imageName调用图片
//fun RoundedImageView.setdrawableImageWithName(imageName: String) {
//    this.setImageDrawable(
//            ContextCompat.getDrawable(this.context, resources.getIdentifier(imageName, "drawable", context.getPackageName())
//            )
//    )
//}
////扩展方便使用imageName调用图片
//fun RoundedImageView.setCircle(imageViewWidth:Int) {
//    this.setCornerRadius(imageViewWidth/2)
//}