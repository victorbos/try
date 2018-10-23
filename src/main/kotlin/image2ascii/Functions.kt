package image2ascii

import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun String.toFile(): File = File(this)

fun File.toBufferedImage() = ImageIO.read(this)

fun BufferedImage.toGrey(): BufferedImage = BufferedImage(this.width, this.height, BufferedImage.TYPE_BYTE_GRAY)

fun Int.toLuminance(): Double {
    val color = Color(this)

    return (0.33 * color.red + 0.50 * color.green + 0.16 * color.blue) / 255
}