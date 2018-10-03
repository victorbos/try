import java.nio.charset.Charset
import java.util.*

fun String.base64Encode() = Base64.getEncoder().encodeToString(this.toByteArray(Charset.defaultCharset()))

fun String.base64Decode() = String(Base64.getDecoder().decode(this))