import org.jasypt.encryption.pbe.StandardPBEStringEncryptor


fun String.encrypt(key: String): String = encryptor(key).encrypt(this)

fun String.decrypt(key: String): String = encryptor(key).decrypt(this)

private fun encryptor(key: String): StandardPBEStringEncryptor {
    val encryptor = StandardPBEStringEncryptor()
    encryptor.setAlgorithm("PBEWithMD5AndTripleDES")
    encryptor.setPassword(key)
    return encryptor
}