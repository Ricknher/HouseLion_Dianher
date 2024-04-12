class MenuController {
    private val usuarioController = UsuarioController()

    fun showMenu() {
        println("Bienvenido a House Lion")
        println("(1.) Crear cuenta")
        println("(2.) Iniciar Sesión")

        val opcion = readLine()?.toIntOrNull() ?: return

        when (opcion) {
            1 -> usuarioController.agregarUsuario()
            2 -> iniciarSesion()
            else -> println("Opción no válida.")
        }
    }

    private fun iniciarSesion() {
        println("Ingrese su nombre de usuario:")
        val nombreUsuario = readLine() ?: ""
        println("Ingrese su contraseña:")
        val contrasena = readLine() ?: ""

        val inicioSesionExitoso = usuarioController.validarCredenciales(nombreUsuario, contrasena)
        if (inicioSesionExitoso) {
            println("Inicio de sesión exitoso.")
            // Aquí podrías realizar acciones adicionales después del inicio de sesión exitoso
        } else {
            println("Nombre de usuario o contraseña incorrectos.")
        }
    }
}
