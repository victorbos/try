import org.jasypt.exceptions.EncryptionOperationNotPossibleException
import org.junit.Assert
import org.junit.Test

class EncryptorTest {

    @Test
    fun `encrypt and decrypt`() {

        val testString = "dit!is#een&Test"
        val encrypted = testString.encrypt("secret-key")

        Assert.assertEquals(testString, encrypted.decrypt("secret-key"))

        try {
            encrypted.decrypt("wrong-key")
            Assert.assertEquals(true, false)
        } catch (e: EncryptionOperationNotPossibleException) {
            Assert.assertNotNull(e)
        }
    }
}