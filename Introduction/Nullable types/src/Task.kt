fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    // ?. helps to return whatever a call returns on the variable if it is not null and null otherwise!!
    val email =  client?.personalInfo?.email
    if (email != null && message != null)
        { mailer.sendMessage(email, message)}
}



class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
