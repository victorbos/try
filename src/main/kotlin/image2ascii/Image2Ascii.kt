package image2ascii

import java.awt.Color

class Image2Ascii {

    companion object {

        private val CHARS = listOf<String>("@", "#", "+", "\\", ";", ":", ",", ".", "`", " ")

        fun convert(image: String, file: String) {
            val bufferedImage = image.toFile().toBufferedImage()

            1.rangeTo(bufferedImage.width).forEach { x ->
                1.rangeTo(bufferedImage.height).forEach { y ->

                    val luminance = bufferedImage.getRGB(x - 1, y - 1).toLuminance()
//                    val char = CHARS[(luminance / 255).toInt()]

                }
                println()
            }
        }

    }


}