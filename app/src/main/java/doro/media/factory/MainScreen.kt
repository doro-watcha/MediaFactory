package doro.media.factory

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.asImageBitmap
import doro.media.image.ThumbnailFactory

@Composable
fun DemoScreen() {

    Box {
        ThumbnailFactory.extractVideoThumbnail(
            path = "https://storage.googleapis.com/atv-reference-app-videos/clips-misc/crome-dev-summit-promo.mp4",
            position = 10700
        )?.asImageBitmap()?.let {
            Image(
                bitmap = it, contentDescription = "image"
            )
        }
    }
}
