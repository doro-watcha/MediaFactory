package doro.media.image

import android.graphics.Bitmap
import android.media.MediaMetadataRetriever

object ThumbnailFactory {

    fun extractVideoThumbnail(path: String, position: Long = 0): Bitmap? {
        val mediaMetadataRetriever = MediaMetadataRetriever()
        mediaMetadataRetriever.setDataSource(path)

        return mediaMetadataRetriever.getFrameAtTime(position)
    }

}