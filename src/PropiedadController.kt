class PropiedadController {
    private val propiedadesDisponibles = mutableListOf<Propiedad>()

    fun agregarPropiedad(propiedad: Propiedad) {
        propiedadesDisponibles.add(propiedad)
    }
}