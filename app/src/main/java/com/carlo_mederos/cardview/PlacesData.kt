package com.carlo_mederos.cardview

data class Place(
    val id: Int,
    val title: String,
    val subtitle: String,
    val description: String,
    val imageRes: Int
)

object PlacesData {
    val places = listOf(
        Place(
            id = 1,
            title = "Bosque Encantado",
            subtitle = "Naturaleza y aventura",
            description = "Sumérgete en un bosque lleno de vida, donde los árboles altos crean un dosel verde y los senderos invitan a explorar. Ideal para caminatas, observación de aves y desconectarte de la ciudad.",
            imageRes = R.drawable.place_1
        ),
        Place(
            id = 2,
            title = "Valle Sereno",
            subtitle = "Montañas y ríos",
            description = "Un valle tranquilo rodeado de montañas y cruzado por ríos cristalinos. Perfecto para acampar, pescar y disfrutar de paisajes que parecen sacados de una postal.",
            imageRes = R.drawable.place_2
        ),
        Place(
            id = 3,
            title = "Playa Escondida",
            subtitle = "Arena y mar",
            description = "Una playa de arena dorada y aguas tranquilas, alejada del bullicio. Ideal para relajarse, tomar el sol y nadar en un entorno paradisíaco.",
            imageRes = R.drawable.place_3
        ),
        Place(
            id = 4,
            title = "Costa Brisa",
            subtitle = "Acantilados y olas",
            description = "Recorre una costa salvaje donde el mar golpea las rocas y la brisa marina refresca el día. Un destino ideal para los amantes de la fotografía y los atardeceres.",
            imageRes = R.drawable.place_4
        )
    )
}
