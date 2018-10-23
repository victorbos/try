package image2ascii

import image2ascii.Image2Ascii
import org.junit.Test

class Image2AsciiTest {

    @Test
    fun test() {

        Image2Ascii.convert(ClassLoader.getSystemResource("vangogh.jpg").file, "/Users/victorbos/test.txt")
    }
}