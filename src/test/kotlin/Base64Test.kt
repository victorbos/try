import org.junit.Assert
import org.junit.Test
import java.nio.charset.Charset
import java.util.*

class Base64Test {

    @Test
    fun `encode and decode`() {
        val testString = """
            een,
            twee!
            Driëeę
        """.trimIndent()

        val encode = testString.base64Encode()
        val decode = encode.base64Decode()

        Assert.assertEquals(decode, testString)
    }


}