class UsuarioController {
    private val usuariosRegistrados = mutableListOf<Usuario>()

    fun agregarUsuario() {
        println("Ingrese su nombre")
        val nombreUsuario = readln()
        println("Ingrese su contraseña")
        val contrasena = readln()

        val user = Usuario(nombreUsuario,contrasena)

        usuariosRegistrados.add(user)
    }
    fun showUsuario(){
        if (usuariosRegistrados.isEmpty()){
            println("No hay usuarios registrados")
        } else {
            var contador=1
            for (usuario in usuariosRegistrados){
                println("$contador"+  usuario.getusuariodata())
                contador ++
            }
        }

    }

    fun validarCredenciales(
        nombreUsuario: String = readln(),
        contrasena: String = readln()
    ): Boolean
    {
        return usuariosRegistrados.any { it.nombreUsuario == nombreUsuario && it.contrasena == contrasena }
    }
}